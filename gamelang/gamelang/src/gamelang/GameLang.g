grammar GameLang;


program returns [Program ast]
    locals [ArrayList<DefineDecl> defs, ArrayList<Exp> exprs]
    @init { 
        $defs = new ArrayList<DefineDecl>(); 
        $exprs = new ArrayList<Exp>();
    } :
    (def=definedecl { $defs.add($def.ast); })*
    (e=exp { $exprs.add($e.ast); })+ 
    {
        $ast = new Program($defs, new BlockExp($exprs));
    }
;


definedecl returns [DefineDecl ast] :
    'STAT' id=Identifier '=' e=exp
    { $ast = new DefineDecl($id.text, $e.ast); }
    ;
 
 exp returns [Exp ast]:
        '(' e=exp ')' { $ast = $e.ast; }
        | stat=definedecl {$ast = $stat.ast;} 
        | v=varexp { $ast = $v.ast; }
        | n=numexp { $ast = $n.ast; }
        | in=infixaddsubt { $ast = $in.ast;}
        | inm=infixmuldiv { $ast = $inm.ast;}
        | inp = infixpower { $ast = $inp.ast; }
        | p=printexp { $ast = $p.ast; }
        | r=rollexp { $ast = $r.ast; }
        | x=exitexp { $ast = $x.ast; }
        | o=orderexp { $ast = $o.ast; }
        | i=ifexp { $ast = $i.ast; }
        | wh=whileexp { $ast = $wh.ast; }
        | b=block { $ast = $b.ast; }
        | eq=enterexp { $ast = $eq.ast; }
        | tr=travelerexp { $ast = $tr.ast; }
        | ar=arthurexp { $ast = $ar.ast; }
        | po=portalexp { $ast = $po.ast; }
        | sad=joelexp { $ast = $sad.ast; }

        ;


 numexp returns [NumExp ast]:
 		n0=Number { $ast = new NumExp(Integer.parseInt($n0.text)); } 
  		| '-' n0=Number { $ast = new NumExp(-Integer.parseInt($n0.text)); }
  		| n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble($n0.text+"."+$n1.text)); }
  		| '-' n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble("-" + $n0.text+"."+$n1.text)); }
  		;		


infixaddsubt returns [Exp ast]
    @init { $ast = null; ArrayList<Exp> list = new ArrayList<Exp>(); }
    :
    l=infixmuldiv { $ast = $l.ast; }
    (('+' r=infixmuldiv { 
                          list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($r.ast);
                          $ast = new AddExp(list);
                        })
    | ('#' r=infixmuldiv { 
                          list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($r.ast);
                          $ast = new SubExp(list);
                        })
    )*
    ;


infixmuldiv returns [Exp ast]
    @init { $ast = null; ArrayList<Exp> list = new ArrayList<Exp>(); }
    :
    l=infixpower { $ast = $l.ast; } 
    (
        ('*' r=infixpower {
            list = new ArrayList<Exp>();
            list.add($ast);
            list.add($r.ast);
            $ast = new MultExp(list);
        })
      | ('/' r=infixpower {
            list = new ArrayList<Exp>();
            list.add($ast);
            list.add($r.ast);
            $ast = new DivExp(list);
        })
      | ('%' r=infixpower {
            list = new ArrayList<Exp>();
            list.add($ast);
            list.add($r.ast);
            $ast = new ModExp(list);
        })
    )*
    ;


infixpower returns [Exp ast]
    :
    l=varexp { $ast = $l.ast; }
    ('^' exponent=infixpower {  
                          ArrayList<Exp> list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($exponent.ast);
                          $ast = new PowExp(list);
                        }
    )*
    ;


varexp returns [Exp ast] : 
    id=Identifier { $ast = new VarExp($id.text); }          
    | n=numexp { $ast = $n.ast; }                            
    ;


printexp returns [Exp ast]
@init {
    List<Exp> parts = new ArrayList<Exp>();
}
    : 'DETECTION-METER' '|'
      (
          (s=STRING {
              String raw = $s.text;
              parts.add(new StrLitExp(raw.substring(1, raw.length() - 1)));
          }
          | e=exp { parts.add($e.ast); }
          )
      )+ 
      {
          $ast = new PrintExp(parts);
      }
      '|'
    ;

    rollexp returns [Exp ast]
    : 'ROLL' { $ast = new RollExp(); }
    ;

    exitexp returns [Exp ast]
    : 'DESPAWN' 'GAME' { $ast = new ExitGameExp(); }
    ;

    orderexp returns [Exp ast]
    : 'ORDER66' { $ast = new Order(); }
    ;

    travelerexp returns [Exp ast]
    : 'TRAVELER' { $ast = new Traveler(); }
    ;

    arthurexp returns [Exp ast]
    : 'ARTHUR' { $ast = new Arthur(); }
    ;

    portalexp returns [Exp ast]
    : 'PORTAL' { $ast = new Portal(); }
    ;

    joelexp returns [Exp ast]
    : 'JOEL' { $ast = new Joel(); }
    ;

     boolexp returns [Exp ast]
    : l=exp op=('>' | '<' | '>=' | '<=' | '==' | '!=') r=exp {
        $ast = new CompareExp($l.ast, $r.ast, $op.text);
    }
    ;

enterexp returns [Exp ast]
    : 'ENTER-QUEST' id=Identifier { $ast = new EnterQuestExp($id.text); }
    ;

ifexp returns [Exp ast]
    : 'SHOOT-IF' '(' cond=boolexp ')' '{' stmts+=exp+ '}' {
        List<Exp> expressions = new ArrayList<>();
        for (ExpContext expCtx : $stmts) {
            expressions.add(expCtx.ast);  
        }
        $ast = new IfExp($cond.ast, new BlockExp(expressions));
    }
    ;
whileexp returns [Exp ast]
    : 'RESPAWN-WHILE' '(' cond=boolexp ')' '{' stmts+=exp+ '}' {
        List<Exp> expressions = new ArrayList<>();
        for (ExpContext expCtx : $stmts) {
            expressions.add(expCtx.ast);  
        }
        $ast = new WhileExp($cond.ast, new BlockExp(expressions));
    }
;
block returns [Exp ast]
    : '{' exps+=exp+ '}' {  
        List<Exp> exprs = new ArrayList<>();
        for (ExpContext e : $exps) {
            exprs.add(e.ast);
        }
        $ast = new BlockExp(exprs);
    }
    ;
 
 
 Define : 'define' ;
 Print : 'PRINT';
 Roll : 'ROLL';
 CALL : 'CALL';
 EXIT_GAME : 'EXIT_GAME';
 Let : 'let' ;
 Dot : '.' ;
ENTER_QUEST : 'ENTER-QUEST';


 Number : DIGIT+ ;

 Identifier :   Letter LetterOrDigit*;

 Letter :   [a-zA-Z$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|   [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}? ;

 LetterOrDigit: [a-zA-Z0-9$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|    [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?;

 fragment DIGIT: ('0'..'9');

 AT : '@';
 ELLIPSIS : '...';
 WS  :  [ \t\r\n\u000C]+ -> skip;
 Comment :   '/*' .*? '*/' -> skip;
 Line_Comment :   '//' ~[\r\n]* -> skip;
 STRING : '"' (~["\\] | '\\' .)* '"' ;
 