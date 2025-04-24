package gamelang;
import gamelang.AST.Program;
import java.io.IOException;

/**
 * This main class implements the Read-Eval-Print-Loop of the interpreter with
 * the help of Reader, Evaluator, and Printer classes. 
 * 
 * @author hridesh
 *
 */
public class Interpreter {
	public static void main(String[] args) {
		System.out.println("Welcome and thank you for using GameLang! You can refer to the super-amazing handbook guide for our language here: https://docs.google.com/document/d/1s8d7fqp6QnAy_vDaZrc39SZdUS8IP_KKnbYzo1lXtZ4/edit?usp=sharing");
		Reader reader = new Reader();
		Evaluator eval = new Evaluator();
		Printer printer = new Printer();
		REPL: while (true) { 
			Program p = null;
			try {
				p = reader.read();
				if(p._e == null) continue REPL;
				Value val = eval.valueOf(p);
				printer.print(val);
			} catch (Env.LookupException e) {
				printer.print(e);
			} catch (IOException e) {
				System.out.println("Error reading input:" + e.getMessage());
			} catch (NullPointerException e) {
			
			}
		}
	}
}
