package gamelang;
import gamelang.AST.AddExp;
import gamelang.AST.Arthur;
import gamelang.AST.BlockExp;
import gamelang.AST.CompareExp;
import gamelang.AST.DefineDecl;
import gamelang.AST.DivExp;
import gamelang.AST.EnterQuestExp;
import gamelang.AST.ExitGameExp;
import gamelang.AST.Exp;
import gamelang.AST.IfExp;
import gamelang.AST.Joel;
import gamelang.AST.ModExp;
import gamelang.AST.MultExp;
import gamelang.AST.NegExp;
import gamelang.AST.NumExp;
import gamelang.AST.Order;
import gamelang.AST.Portal;
import gamelang.AST.PowExp;
import gamelang.AST.PrintExp;
import gamelang.AST.Program;
import gamelang.AST.RollExp;
import gamelang.AST.StrLitExp;
import gamelang.AST.SubExp;
import gamelang.AST.Traveler;
import gamelang.AST.UnitExp;
import gamelang.AST.VarExp;
import gamelang.AST.Visitor;
import gamelang.AST.WhileExp;
import gamelang.Env.GlobalEnv;
import gamelang.Value.NumVal;
import gamelang.Value.StrVal;
import gamelang.Value.UnitVal;
import java.util.List;
import java.util.Scanner;

public class Evaluator implements Visitor<Value> {
	
	Env initEnv = new GlobalEnv();
	
	Value valueOf(Program p) {
		return (Value) p.accept(this, initEnv);
	}
	
	@Override
	public Value visit(AddExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 0;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env);
			result += intermediate.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NumExp e, Env env) {
		return new NumVal(e.v());
	}

	@Override
	public Value visit(UnitExp e, Env env) {
		return new UnitVal();
	}

	@Override
	public Value visit(DivExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v(); 
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result / rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(MultExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 1;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env);
			result *= intermediate.v();
		}
		return new NumVal(result);
	}
	@Override
	public Value visit(PowExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = Math.pow(result, rVal.v());
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NegExp e, Env env) {
		NumVal rVal = (NumVal) e.getExp().accept(this, env);
		return new NumVal(-rVal.v());
	}

	@Override
	public Value visit(Program p, Env env) {
		for(DefineDecl d: p.decls())
			d.accept(this, initEnv);
		return (Value) p.e().accept(this, initEnv);
	}

	@Override
	public Value visit(SubExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result - rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(VarExp e, Env env) {
		Value val = env.get(e.name());
		if (val == null) {
			throw new RuntimeException("Undefined variable: " + e.name());
		}
		return val;
	}
	
	
	@Override
	public Value visit(DefineDecl d, Env env) {
		String name = d.name();
		Exp value_exp = d.value_exp();
		Value value = (Value) value_exp.accept(this, env);
		((GlobalEnv) initEnv).extend(name, value);
		return new Value.UnitVal();		
	}	
	@Override
	public Value visit(PrintExp e, Env env) {
		StringBuilder sb = new StringBuilder();
		for (Exp part : e.getParts()) {
			Value val = part.accept(this, env);

			String out = val.toString();
			if (val == null) {
				sb.append("null");
			} else {
				sb.append(val.toString());
			}
			if (out.equals("->")) {
				System.out.println(); 
			}
			else if (!(val instanceof Value.UnitVal)) {
				System.out.print(out);
			}
		}
	
		return new UnitVal(); 
	}
	
	@Override
public Value visit(EnterQuestExp e, Env env) {
    System.out.print("> ");
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
        String input = scanner.nextLine().trim();
        try {
            double val = Double.parseDouble(input);
            env.set(e.name(), new NumVal(val));
        } catch (NumberFormatException ex) {
            env.set(e.name(), new Value.StrVal(input));
        }
    }
    return new UnitVal();
}
	@Override
	public Value visit(StrLitExp e, Env env) {
	return new StrVal(e.value());
	}

	@Override
	public Value visit(RollExp e, Env env) {
	int result = 1 + (int)(Math.random() * 6);
	return new Value.NumVal(result);
	}

	@Override
	public Value visit(ExitGameExp e, Env env) {	
	System.out.println("Exiting game. Goodbye!");
	System.exit(0);
	return null; 
	}

	private Value checkType(Value value, Class... types) {
        for (Class type : types) {
            if (type.isInstance(value)) {
                return value;
            }
        }
       return null;
    }
	
	@Override
	public Value visit(IfExp e, Env env) {

		Value condVal = e.condition().accept(this, env);
	

		if (!(condVal instanceof NumVal)) {
			throw new RuntimeException("Condition must evaluate to a numeric value.");
		}
		condVal = checkType(condVal, NumVal.class);

		double cond = ((NumVal) condVal).v();

		if (cond != 0) {
			return e.thenBranch().accept(this, env);
		} else {
			return null;
		}
	}
	@Override
public Value visit(WhileExp e, Env env) {
    while (true) {

        Value condVal = e.condition().accept(this, env);

        if (!(condVal instanceof NumVal)) {
            throw new RuntimeException("Condition must be a number (treated as boolean)");
        }


        double cond = ((NumVal) condVal).v();
        

        if (cond == 0) {
            break;
        }


        e.body().accept(this, env);
    }

    return null;
}
	@Override
	public Value visit(CompareExp e, Env env) {
	double l = ((NumVal) e.left().accept(this, env)).v();
	double r = ((NumVal) e.right().accept(this, env)).v();
	boolean result;

	switch (e.op()) {
		case ">": result = l > r; break;
		case "<": result = l < r; break;
		case ">=": result = l >= r; break;
		case "<=": result = l <= r; break;
		case "==": result = l == r; break;
		case "!=": result = l != r; break;
		default: throw new RuntimeException("Unknown operator: " + e.op());
	}

		return new Value.NumVal(result ? 1 : 0);
	}

	@Override
	public Value visit(BlockExp e, Env env) {
		Value result = new UnitVal();
		for (Exp exp : e.getExpressions()) {
			System.out.println("Evaluating block expression: " + exp.getClass().getSimpleName());
			result = exp.accept(this, env);
		}
		return result;
	}

	@Override
	public Value visit(ModExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();

		for (int i = 1; i < operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result % rVal.v();
		}

		return new NumVal(result);
	}



	@Override
	public Value visit(Portal e, Env env) {
    System.out.println("You’ve reached the Aperture Science Enrichment Center AI.");
    System.out.println("Would you like to continue testing for cake? (yes/no)");
	Scanner scanner = new Scanner(System.in);
    String response = scanner.nextLine().trim().toLowerCase();

    if ("yes".equalsIgnoreCase(response)) {
        System.out.println("Wonderful. The cake is waiting. It's moist. It's real.");
        System.out.println("...Just kidding.");
        System.out.println("⚠ The cake is a lie.");
        System.out.println("You were never meant to have it.");
        System.out.println("Please continue testing. Forever.");
    } else {
        System.out.println("Test subject noncompliant.");
        System.out.println("Deploying turrets.");
        System.out.println("*machine whirring noises*");
        System.out.println("YOU ARE DEAD.");
    }

    return null;
}

	@Override
	public Value visit(Traveler e, Env env){
		    Scanner scanner = new Scanner(System.in);
    System.out.println("Do you want to talk to the Traveler? (yes/no)");

    String input = scanner.nextLine().trim().toLowerCase();

	if ("yes".equalsIgnoreCase(input)) {

        System.out.println("Oh yes... Tarnished, are we? Come to the Lands Between for the Elden Ring, hmm?");
        System.out.println("Of course you have. No shame in it.");
        System.out.println("Unfortunately for you, however, you are maidenless.");
        System.out.println("Without guidance, without the strength of runes, and without an invitation to the Roundtable Hold...");
        System.out.println("You are fated, it seems, to die in obscurity.");
        System.out.println("Luckily for you, however, there is one shining ray of hope for even the maidenless.");
        System.out.println("Me. Varré. Take care to listen.");
        System.out.println("Are you familiar with grace? The golden light that gives life to you Tarnished.");
        System.out.println("You may also behold its golden rays pointing in a particular direction at times.");
        System.out.println("That is the guidance of grace. The path that a Tarnished must travel.");
        System.out.println("Mm, indeed. Grace's guidance holds the answers.");
        System.out.println("It will lead you Tarnished to the path you are meant to follow.");
        System.out.println("Even if it leads you to your grave.");
        System.out.println("Grace's guidance will reveal the path forward, most certainly.");
        System.out.println("To Castle Stormveil, over on the cliff.");
        System.out.println("The home of the decrepit demigod, Godrick the Grafted.");
        System.out.println("It's time you set off, I should think.");
        System.out.println("To Castle Stormveil, on the cliff, where grace would guide you.");
        System.out.println("If you seek the Elden Ring, maidenless as you are.");
    } else {
    
        System.out.println("YOU ARE DEAD");
    }

    return null;
}
@Override
	public Value visit(Arthur e, Env env){
		System.out.println("I'll hold them off, it would mean a lot to me");

		System.out.println("Please, there aint no more time for talk... Go - Arthur");;

		System.out.println("Arthur.. -John");

		System.out.println("Go to your family - Arthur");

		System.out.println("Arthur!! - John" );

		System.out.println("Get the hell out of here and be a goddamn man - Arthur");

		System.out.println("You're my brother - John");

		System.out.println("I know I know - Arthur"); 

		return null; 
	}

	@Override
	public Value visit(Joel e, Env env){
		System.out.println("I swear..");
		return null;
	}

	@Override
	public Value visit(Order e, Env env) {	
		String[] crawlText = {
            "A long time ago in a galaxy far, far away....",
            "",
            "Episode III",
            "Revenge of the Sith",
            "",
			"War!",
			"The Republic is crumbling under attack by the ruthless Sith Lord, Darth Sidious.",
			"There are heroes on both sides.",
			"Evil is everywhere.",
			"In a stunning move, the ruthless Sith Lord Darth Sidious has secretly ordered the Jedi to be exterminated.",
			"With the help of his new apprentice, Count Dooku, the Jedi rescue a kidnapped senator from the clutches of the evil Sith Lord, Darth Sidious.",
			"As the Clone Wars reach their height, the Jedi rescue the Senator and uncover a sinister plot to control the galaxy...",
			"-----------------------------------------------",
			"-----------------------------------------------",
			"-----------------------------------------------"
        };

		String[] diaText = {
			"It's over Anakin, I have the high ground! -Obi-Wan",
			"You underestimate my power! -Anakin",
			"Don't try it -Obi-Wan.",
			"**Anakin jumps**",
			"**Obi-Wan cuts off Anakin's legs and left arm**",
			"You were the chosen one! It was said that you would destroy the Sith, not join them! Bring balance to the Force, not leave it in darkness! -Obi-Wan",
			"I HATE YOU! -Anakin!",
			"You were my brother Anakin! I loved you! -Obi-Wan"
		};

		

		for (int i = 0; i < 10; i++) {
			System.out.println();
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		
		for (String line : crawlText) {
			System.out.println(line);
			try {
				Thread.sleep(400);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

		for (String line : diaText) {
			System.out.println(line);
			try {
				Thread.sleep(800);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

	





	return null; 
	}

}
