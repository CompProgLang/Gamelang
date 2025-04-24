// Generated from GameLang.g by ANTLR 4.5
package gamelang.parser; import static gamelang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, Define=31, 
		Print=32, Roll=33, CALL=34, EXIT_GAME=35, Let=36, Dot=37, ENTER_QUEST=38, 
		Number=39, Identifier=40, Letter=41, LetterOrDigit=42, AT=43, ELLIPSIS=44, 
		WS=45, Comment=46, Line_Comment=47, STRING=48;
	public static final int
		RULE_program = 0, RULE_definedecl = 1, RULE_exp = 2, RULE_numexp = 3, 
		RULE_infixaddsubt = 4, RULE_infixmuldiv = 5, RULE_infixpower = 6, RULE_varexp = 7, 
		RULE_printexp = 8, RULE_rollexp = 9, RULE_exitexp = 10, RULE_orderexp = 11, 
		RULE_travelerexp = 12, RULE_arthurexp = 13, RULE_portalexp = 14, RULE_joelexp = 15, 
		RULE_boolexp = 16, RULE_enterexp = 17, RULE_ifexp = 18, RULE_whileexp = 19, 
		RULE_block = 20;
	public static final String[] ruleNames = {
		"program", "definedecl", "exp", "numexp", "infixaddsubt", "infixmuldiv", 
		"infixpower", "varexp", "printexp", "rollexp", "exitexp", "orderexp", 
		"travelerexp", "arthurexp", "portalexp", "joelexp", "boolexp", "enterexp", 
		"ifexp", "whileexp", "block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'#'", "'*'", "'/'", 
		"'%'", "'^'", "'DETECTION-METER'", "'|'", "'DESPAWN'", "'GAME'", "'ORDER66'", 
		"'TRAVELER'", "'ARTHUR'", "'PORTAL'", "'JOEL'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'SHOOT-IF'", "'{'", "'}'", "'RESPAWN-WHILE'", 
		"'define'", "'PRINT'", "'ROLL'", "'CALL'", "'EXIT_GAME'", "'let'", "'.'", 
		"'ENTER-QUEST'", null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Define", "Print", "Roll", "CALL", 
		"EXIT_GAME", "Let", "Dot", "ENTER_QUEST", "Number", "Identifier", "Letter", 
		"LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment", "STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GameLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ArrayList<DefineDecl> defs;
		public ArrayList<Exp> exprs;
		public DefinedeclContext def;
		public ExpContext e;
		public List<DefinedeclContext> definedecl() {
			return getRuleContexts(DefinedeclContext.class);
		}
		public DefinedeclContext definedecl(int i) {
			return getRuleContext(DefinedeclContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		 
		        ((ProgramContext)_localctx).defs =  new ArrayList<DefineDecl>(); 
		        ((ProgramContext)_localctx).exprs =  new ArrayList<Exp>();
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					((ProgramContext)_localctx).def = definedecl();
					 _localctx.defs.add(((ProgramContext)_localctx).def.ast); 
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				((ProgramContext)_localctx).e = exp();
				 _localctx.exprs.add(((ProgramContext)_localctx).e.ast); 
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << Roll) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier))) != 0) );

			        ((ProgramContext)_localctx).ast =  new Program(_localctx.defs, new BlockExp(_localctx.exprs));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinedeclContext extends ParserRuleContext {
		public DefineDecl ast;
		public Token id;
		public ExpContext e;
		public TerminalNode Identifier() { return getToken(GameLangParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedecl; }
	}

	public final DefinedeclContext definedecl() throws RecognitionException {
		DefinedeclContext _localctx = new DefinedeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			((DefinedeclContext)_localctx).id = match(Identifier);
			setState(61);
			match(T__1);
			setState(62);
			((DefinedeclContext)_localctx).e = exp();
			 ((DefinedeclContext)_localctx).ast =  new DefineDecl((((DefinedeclContext)_localctx).id!=null?((DefinedeclContext)_localctx).id.getText():null), ((DefinedeclContext)_localctx).e.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext e;
		public DefinedeclContext stat;
		public VarexpContext v;
		public NumexpContext n;
		public InfixaddsubtContext in;
		public InfixmuldivContext inm;
		public InfixpowerContext inp;
		public PrintexpContext p;
		public RollexpContext r;
		public ExitexpContext x;
		public OrderexpContext o;
		public IfexpContext i;
		public WhileexpContext wh;
		public BlockContext b;
		public EnterexpContext eq;
		public TravelerexpContext tr;
		public ArthurexpContext ar;
		public PortalexpContext po;
		public JoelexpContext sad;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinedeclContext definedecl() {
			return getRuleContext(DefinedeclContext.class,0);
		}
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public InfixaddsubtContext infixaddsubt() {
			return getRuleContext(InfixaddsubtContext.class,0);
		}
		public InfixmuldivContext infixmuldiv() {
			return getRuleContext(InfixmuldivContext.class,0);
		}
		public InfixpowerContext infixpower() {
			return getRuleContext(InfixpowerContext.class,0);
		}
		public PrintexpContext printexp() {
			return getRuleContext(PrintexpContext.class,0);
		}
		public RollexpContext rollexp() {
			return getRuleContext(RollexpContext.class,0);
		}
		public ExitexpContext exitexp() {
			return getRuleContext(ExitexpContext.class,0);
		}
		public OrderexpContext orderexp() {
			return getRuleContext(OrderexpContext.class,0);
		}
		public IfexpContext ifexp() {
			return getRuleContext(IfexpContext.class,0);
		}
		public WhileexpContext whileexp() {
			return getRuleContext(WhileexpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EnterexpContext enterexp() {
			return getRuleContext(EnterexpContext.class,0);
		}
		public TravelerexpContext travelerexp() {
			return getRuleContext(TravelerexpContext.class,0);
		}
		public ArthurexpContext arthurexp() {
			return getRuleContext(ArthurexpContext.class,0);
		}
		public PortalexpContext portalexp() {
			return getRuleContext(PortalexpContext.class,0);
		}
		public JoelexpContext joelexp() {
			return getRuleContext(JoelexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__2);
				setState(66);
				((ExpContext)_localctx).e = exp();
				setState(67);
				match(T__3);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).e.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((ExpContext)_localctx).stat = definedecl();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).stat.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				((ExpContext)_localctx).in = infixaddsubt();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).in.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				((ExpContext)_localctx).inm = infixmuldiv();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inm.ast;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				((ExpContext)_localctx).inp = infixpower();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inp.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				((ExpContext)_localctx).p = printexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				((ExpContext)_localctx).r = rollexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).r.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				((ExpContext)_localctx).x = exitexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).x.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				((ExpContext)_localctx).o = orderexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).o.ast; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(100);
				((ExpContext)_localctx).i = ifexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).i.ast; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(103);
				((ExpContext)_localctx).wh = whileexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).wh.ast; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(106);
				((ExpContext)_localctx).b = block();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).b.ast; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(109);
				((ExpContext)_localctx).eq = enterexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).eq.ast; 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(112);
				((ExpContext)_localctx).tr = travelerexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).tr.ast; 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(115);
				((ExpContext)_localctx).ar = arthurexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).ar.ast; 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(118);
				((ExpContext)_localctx).po = portalexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).po.ast; 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(121);
				((ExpContext)_localctx).sad = joelexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).sad.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(GameLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GameLangParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(GameLangParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numexp);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__4);
				setState(129);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(132);
				match(Dot);
				setState(133);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(T__4);
				setState(136);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(137);
				match(Dot);
				setState(138);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble("-" + (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixaddsubtContext extends ParserRuleContext {
		public Exp ast;
		public InfixmuldivContext l;
		public InfixmuldivContext r;
		public List<InfixmuldivContext> infixmuldiv() {
			return getRuleContexts(InfixmuldivContext.class);
		}
		public InfixmuldivContext infixmuldiv(int i) {
			return getRuleContext(InfixmuldivContext.class,i);
		}
		public InfixaddsubtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixaddsubt; }
	}

	public final InfixaddsubtContext infixaddsubt() throws RecognitionException {
		InfixaddsubtContext _localctx = new InfixaddsubtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_infixaddsubt);
		 ((InfixaddsubtContext)_localctx).ast =  null; ArrayList<Exp> list = new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((InfixaddsubtContext)_localctx).l = infixmuldiv();
			 ((InfixaddsubtContext)_localctx).ast =  ((InfixaddsubtContext)_localctx).l.ast; 
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				setState(152);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(144);
					match(T__5);
					setState(145);
					((InfixaddsubtContext)_localctx).r = infixmuldiv();
					 
					                          list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixaddsubtContext)_localctx).r.ast);
					                          ((InfixaddsubtContext)_localctx).ast =  new AddExp(list);
					                        
					}
					}
					break;
				case T__6:
					{
					{
					setState(148);
					match(T__6);
					setState(149);
					((InfixaddsubtContext)_localctx).r = infixmuldiv();
					 
					                          list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixaddsubtContext)_localctx).r.ast);
					                          ((InfixaddsubtContext)_localctx).ast =  new SubExp(list);
					                        
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixmuldivContext extends ParserRuleContext {
		public Exp ast;
		public InfixpowerContext l;
		public InfixpowerContext r;
		public List<InfixpowerContext> infixpower() {
			return getRuleContexts(InfixpowerContext.class);
		}
		public InfixpowerContext infixpower(int i) {
			return getRuleContext(InfixpowerContext.class,i);
		}
		public InfixmuldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixmuldiv; }
	}

	public final InfixmuldivContext infixmuldiv() throws RecognitionException {
		InfixmuldivContext _localctx = new InfixmuldivContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_infixmuldiv);
		 ((InfixmuldivContext)_localctx).ast =  null; ArrayList<Exp> list = new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((InfixmuldivContext)_localctx).l = infixpower();
			 ((InfixmuldivContext)_localctx).ast =  ((InfixmuldivContext)_localctx).l.ast; 
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(171);
				switch (_input.LA(1)) {
				case T__7:
					{
					{
					setState(159);
					match(T__7);
					setState(160);
					((InfixmuldivContext)_localctx).r = infixpower();

					            list = new ArrayList<Exp>();
					            list.add(_localctx.ast);
					            list.add(((InfixmuldivContext)_localctx).r.ast);
					            ((InfixmuldivContext)_localctx).ast =  new MultExp(list);
					        
					}
					}
					break;
				case T__8:
					{
					{
					setState(163);
					match(T__8);
					setState(164);
					((InfixmuldivContext)_localctx).r = infixpower();

					            list = new ArrayList<Exp>();
					            list.add(_localctx.ast);
					            list.add(((InfixmuldivContext)_localctx).r.ast);
					            ((InfixmuldivContext)_localctx).ast =  new DivExp(list);
					        
					}
					}
					break;
				case T__9:
					{
					{
					setState(167);
					match(T__9);
					setState(168);
					((InfixmuldivContext)_localctx).r = infixpower();

					            list = new ArrayList<Exp>();
					            list.add(_localctx.ast);
					            list.add(((InfixmuldivContext)_localctx).r.ast);
					            ((InfixmuldivContext)_localctx).ast =  new ModExp(list);
					        
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixpowerContext extends ParserRuleContext {
		public Exp ast;
		public VarexpContext l;
		public InfixpowerContext exponent;
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public List<InfixpowerContext> infixpower() {
			return getRuleContexts(InfixpowerContext.class);
		}
		public InfixpowerContext infixpower(int i) {
			return getRuleContext(InfixpowerContext.class,i);
		}
		public InfixpowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixpower; }
	}

	public final InfixpowerContext infixpower() throws RecognitionException {
		InfixpowerContext _localctx = new InfixpowerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_infixpower);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((InfixpowerContext)_localctx).l = varexp();
			 ((InfixpowerContext)_localctx).ast =  ((InfixpowerContext)_localctx).l.ast; 
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					match(T__10);
					setState(179);
					((InfixpowerContext)_localctx).exponent = infixpower();
					  
					                          ArrayList<Exp> list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixpowerContext)_localctx).exponent.ast);
					                          ((InfixpowerContext)_localctx).ast =  new PowExp(list);
					                        
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarexpContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public NumexpContext n;
		public TerminalNode Identifier() { return getToken(GameLangParser.Identifier, 0); }
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public VarexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varexp; }
	}

	public final VarexpContext varexp() throws RecognitionException {
		VarexpContext _localctx = new VarexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varexp);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				((VarexpContext)_localctx).id = match(Identifier);
				 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
				}
				break;
			case T__4:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((VarexpContext)_localctx).n = numexp();
				 ((VarexpContext)_localctx).ast =  ((VarexpContext)_localctx).n.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintexpContext extends ParserRuleContext {
		public Exp ast;
		public Token s;
		public ExpContext e;
		public List<TerminalNode> STRING() { return getTokens(GameLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GameLangParser.STRING, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PrintexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printexp; }
	}

	public final PrintexpContext printexp() throws RecognitionException {
		PrintexpContext _localctx = new PrintexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printexp);

		    List<Exp> parts = new ArrayList<Exp>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__11);
			setState(195);
			match(T__12);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(196);
					((PrintexpContext)_localctx).s = match(STRING);

					              String raw = (((PrintexpContext)_localctx).s!=null?((PrintexpContext)_localctx).s.getText():null);
					              parts.add(new StrLitExp(raw.substring(1, raw.length() - 1)));
					          
					}
					break;
				case T__0:
				case T__2:
				case T__4:
				case T__11:
				case T__13:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__26:
				case T__27:
				case T__29:
				case Roll:
				case ENTER_QUEST:
				case Number:
				case Identifier:
					{
					setState(198);
					((PrintexpContext)_localctx).e = exp();
					 parts.add(((PrintexpContext)_localctx).e.ast); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << Roll) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier) | (1L << STRING))) != 0) );

			          ((PrintexpContext)_localctx).ast =  new PrintExp(parts);
			      
			setState(208);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollexpContext extends ParserRuleContext {
		public Exp ast;
		public RollexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollexp; }
	}

	public final RollexpContext rollexp() throws RecognitionException {
		RollexpContext _localctx = new RollexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rollexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Roll);
			 ((RollexpContext)_localctx).ast =  new RollExp(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitexpContext extends ParserRuleContext {
		public Exp ast;
		public ExitexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitexp; }
	}

	public final ExitexpContext exitexp() throws RecognitionException {
		ExitexpContext _localctx = new ExitexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exitexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__13);
			setState(214);
			match(T__14);
			 ((ExitexpContext)_localctx).ast =  new ExitGameExp(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderexpContext extends ParserRuleContext {
		public Exp ast;
		public OrderexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderexp; }
	}

	public final OrderexpContext orderexp() throws RecognitionException {
		OrderexpContext _localctx = new OrderexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__15);
			 ((OrderexpContext)_localctx).ast =  new Order(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TravelerexpContext extends ParserRuleContext {
		public Exp ast;
		public TravelerexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travelerexp; }
	}

	public final TravelerexpContext travelerexp() throws RecognitionException {
		TravelerexpContext _localctx = new TravelerexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_travelerexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__16);
			 ((TravelerexpContext)_localctx).ast =  new Traveler(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArthurexpContext extends ParserRuleContext {
		public Exp ast;
		public ArthurexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arthurexp; }
	}

	public final ArthurexpContext arthurexp() throws RecognitionException {
		ArthurexpContext _localctx = new ArthurexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arthurexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__17);
			 ((ArthurexpContext)_localctx).ast =  new Arthur(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PortalexpContext extends ParserRuleContext {
		public Exp ast;
		public PortalexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_portalexp; }
	}

	public final PortalexpContext portalexp() throws RecognitionException {
		PortalexpContext _localctx = new PortalexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_portalexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__18);
			 ((PortalexpContext)_localctx).ast =  new Portal(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoelexpContext extends ParserRuleContext {
		public Exp ast;
		public JoelexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joelexp; }
	}

	public final JoelexpContext joelexp() throws RecognitionException {
		JoelexpContext _localctx = new JoelexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_joelexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__19);
			 ((JoelexpContext)_localctx).ast =  new Joel(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolexpContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext l;
		public Token op;
		public ExpContext r;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BoolexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexp; }
	}

	public final BoolexpContext boolexp() throws RecognitionException {
		BoolexpContext _localctx = new BoolexpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((BoolexpContext)_localctx).l = exp();
			setState(233);
			((BoolexpContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
				((BoolexpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(234);
			((BoolexpContext)_localctx).r = exp();

			        ((BoolexpContext)_localctx).ast =  new CompareExp(((BoolexpContext)_localctx).l.ast, ((BoolexpContext)_localctx).r.ast, (((BoolexpContext)_localctx).op!=null?((BoolexpContext)_localctx).op.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnterexpContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public TerminalNode Identifier() { return getToken(GameLangParser.Identifier, 0); }
		public EnterexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterexp; }
	}

	public final EnterexpContext enterexp() throws RecognitionException {
		EnterexpContext _localctx = new EnterexpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enterexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ENTER_QUEST);
			setState(238);
			((EnterexpContext)_localctx).id = match(Identifier);
			 ((EnterexpContext)_localctx).ast =  new EnterQuestExp((((EnterexpContext)_localctx).id!=null?((EnterexpContext)_localctx).id.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfexpContext extends ParserRuleContext {
		public Exp ast;
		public BoolexpContext cond;
		public ExpContext exp;
		public List<ExpContext> stmts = new ArrayList<ExpContext>();
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexp; }
	}

	public final IfexpContext ifexp() throws RecognitionException {
		IfexpContext _localctx = new IfexpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__26);
			setState(242);
			match(T__2);
			setState(243);
			((IfexpContext)_localctx).cond = boolexp();
			setState(244);
			match(T__3);
			setState(245);
			match(T__27);
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				((IfexpContext)_localctx).exp = exp();
				((IfexpContext)_localctx).stmts.add(((IfexpContext)_localctx).exp);
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << Roll) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(251);
			match(T__28);

			        List<Exp> expressions = new ArrayList<>();
			        for (ExpContext expCtx : ((IfexpContext)_localctx).stmts) {
			            expressions.add(expCtx.ast);  
			        }
			        ((IfexpContext)_localctx).ast =  new IfExp(((IfexpContext)_localctx).cond.ast, new BlockExp(expressions));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileexpContext extends ParserRuleContext {
		public Exp ast;
		public BoolexpContext cond;
		public ExpContext exp;
		public List<ExpContext> stmts = new ArrayList<ExpContext>();
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public WhileexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileexp; }
	}

	public final WhileexpContext whileexp() throws RecognitionException {
		WhileexpContext _localctx = new WhileexpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__29);
			setState(255);
			match(T__2);
			setState(256);
			((WhileexpContext)_localctx).cond = boolexp();
			setState(257);
			match(T__3);
			setState(258);
			match(T__27);
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				((WhileexpContext)_localctx).exp = exp();
				((WhileexpContext)_localctx).stmts.add(((WhileexpContext)_localctx).exp);
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << Roll) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(264);
			match(T__28);

			        List<Exp> expressions = new ArrayList<>();
			        for (ExpContext expCtx : ((WhileexpContext)_localctx).stmts) {
			            expressions.add(expCtx.ast);  
			        }
			        ((WhileexpContext)_localctx).ast =  new WhileExp(((WhileexpContext)_localctx).cond.ast, new BlockExp(expressions));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext exp;
		public List<ExpContext> exps = new ArrayList<ExpContext>();
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__27);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				((BlockContext)_localctx).exp = exp();
				((BlockContext)_localctx).exps.add(((BlockContext)_localctx).exp);
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << Roll) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(273);
			match(T__28);
			  
			        List<Exp> exprs = new ArrayList<>();
			        for (ExpContext e : ((BlockContext)_localctx).exps) {
			            exprs.add(e.ast);
			        }
			        ((BlockContext)_localctx).ast =  new BlockExp(exprs);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0117\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\2\6\28\n\2\r\2\16\29\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00c3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cc\n\n\6\n\u00ce"+
		"\n\n\r\n\16\n\u00cf\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\6\24\u00fa\n\24\r\24\16\24\u00fb\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\6\25\u0107\n\25\r\25\16\25\u0108\3\25\3\25\3\25\3\26\3\26\6\26"+
		"\u0110\n\26\r\26\16\26\u0111\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\27\34\u0124\2\61\3\2\2\2\4=\3"+
		"\2\2\2\6~\3\2\2\2\b\u008e\3\2\2\2\n\u0090\3\2\2\2\f\u009f\3\2\2\2\16\u00b2"+
		"\3\2\2\2\20\u00c2\3\2\2\2\22\u00c4\3\2\2\2\24\u00d4\3\2\2\2\26\u00d7\3"+
		"\2\2\2\30\u00db\3\2\2\2\32\u00de\3\2\2\2\34\u00e1\3\2\2\2\36\u00e4\3\2"+
		"\2\2 \u00e7\3\2\2\2\"\u00ea\3\2\2\2$\u00ef\3\2\2\2&\u00f3\3\2\2\2(\u0100"+
		"\3\2\2\2*\u010d\3\2\2\2,-\5\4\3\2-.\b\2\1\2.\60\3\2\2\2/,\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63\61\3\2\2\2\64\65\5"+
		"\6\4\2\65\66\b\2\1\2\668\3\2\2\2\67\64\3\2\2\289\3\2\2\29\67\3\2\2\29"+
		":\3\2\2\2:;\3\2\2\2;<\b\2\1\2<\3\3\2\2\2=>\7\3\2\2>?\7*\2\2?@\7\4\2\2"+
		"@A\5\6\4\2AB\b\3\1\2B\5\3\2\2\2CD\7\5\2\2DE\5\6\4\2EF\7\6\2\2FG\b\4\1"+
		"\2G\177\3\2\2\2HI\5\4\3\2IJ\b\4\1\2J\177\3\2\2\2KL\5\20\t\2LM\b\4\1\2"+
		"M\177\3\2\2\2NO\5\b\5\2OP\b\4\1\2P\177\3\2\2\2QR\5\n\6\2RS\b\4\1\2S\177"+
		"\3\2\2\2TU\5\f\7\2UV\b\4\1\2V\177\3\2\2\2WX\5\16\b\2XY\b\4\1\2Y\177\3"+
		"\2\2\2Z[\5\22\n\2[\\\b\4\1\2\\\177\3\2\2\2]^\5\24\13\2^_\b\4\1\2_\177"+
		"\3\2\2\2`a\5\26\f\2ab\b\4\1\2b\177\3\2\2\2cd\5\30\r\2de\b\4\1\2e\177\3"+
		"\2\2\2fg\5&\24\2gh\b\4\1\2h\177\3\2\2\2ij\5(\25\2jk\b\4\1\2k\177\3\2\2"+
		"\2lm\5*\26\2mn\b\4\1\2n\177\3\2\2\2op\5$\23\2pq\b\4\1\2q\177\3\2\2\2r"+
		"s\5\32\16\2st\b\4\1\2t\177\3\2\2\2uv\5\34\17\2vw\b\4\1\2w\177\3\2\2\2"+
		"xy\5\36\20\2yz\b\4\1\2z\177\3\2\2\2{|\5 \21\2|}\b\4\1\2}\177\3\2\2\2~"+
		"C\3\2\2\2~H\3\2\2\2~K\3\2\2\2~N\3\2\2\2~Q\3\2\2\2~T\3\2\2\2~W\3\2\2\2"+
		"~Z\3\2\2\2~]\3\2\2\2~`\3\2\2\2~c\3\2\2\2~f\3\2\2\2~i\3\2\2\2~l\3\2\2\2"+
		"~o\3\2\2\2~r\3\2\2\2~u\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\7\3\2\2\2\u0080"+
		"\u0081\7)\2\2\u0081\u008f\b\5\1\2\u0082\u0083\7\7\2\2\u0083\u0084\7)\2"+
		"\2\u0084\u008f\b\5\1\2\u0085\u0086\7)\2\2\u0086\u0087\7\'\2\2\u0087\u0088"+
		"\7)\2\2\u0088\u008f\b\5\1\2\u0089\u008a\7\7\2\2\u008a\u008b\7)\2\2\u008b"+
		"\u008c\7\'\2\2\u008c\u008d\7)\2\2\u008d\u008f\b\5\1\2\u008e\u0080\3\2"+
		"\2\2\u008e\u0082\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008f"+
		"\t\3\2\2\2\u0090\u0091\5\f\7\2\u0091\u009c\b\6\1\2\u0092\u0093\7\b\2\2"+
		"\u0093\u0094\5\f\7\2\u0094\u0095\b\6\1\2\u0095\u009b\3\2\2\2\u0096\u0097"+
		"\7\t\2\2\u0097\u0098\5\f\7\2\u0098\u0099\b\6\1\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0092\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\13\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0"+
		"\5\16\b\2\u00a0\u00af\b\7\1\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\5\16\b\2"+
		"\u00a3\u00a4\b\7\1\2\u00a4\u00ae\3\2\2\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7"+
		"\5\16\b\2\u00a7\u00a8\b\7\1\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\7\f\2\2"+
		"\u00aa\u00ab\5\16\b\2\u00ab\u00ac\b\7\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00a1"+
		"\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\r\3\2\2\2\u00b1\u00af\3\2\2\2"+
		"\u00b2\u00b3\5\20\t\2\u00b3\u00ba\b\b\1\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6"+
		"\5\16\b\2\u00b6\u00b7\b\b\1\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\17"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7*\2\2\u00be\u00c3\b\t\1\2\u00bf"+
		"\u00c0\5\b\5\2\u00c0\u00c1\b\t\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00bd\3\2"+
		"\2\2\u00c2\u00bf\3\2\2\2\u00c3\21\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00cd"+
		"\7\17\2\2\u00c6\u00c7\7\62\2\2\u00c7\u00cc\b\n\1\2\u00c8\u00c9\5\6\4\2"+
		"\u00c9\u00ca\b\n\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c8"+
		"\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\n"+
		"\1\2\u00d2\u00d3\7\17\2\2\u00d3\23\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6"+
		"\b\13\1\2\u00d6\25\3\2\2\2\u00d7\u00d8\7\20\2\2\u00d8\u00d9\7\21\2\2\u00d9"+
		"\u00da\b\f\1\2\u00da\27\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\b\r\1"+
		"\2\u00dd\31\3\2\2\2\u00de\u00df\7\23\2\2\u00df\u00e0\b\16\1\2\u00e0\33"+
		"\3\2\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\b\17\1\2\u00e3\35\3\2\2\2\u00e4"+
		"\u00e5\7\25\2\2\u00e5\u00e6\b\20\1\2\u00e6\37\3\2\2\2\u00e7\u00e8\7\26"+
		"\2\2\u00e8\u00e9\b\21\1\2\u00e9!\3\2\2\2\u00ea\u00eb\5\6\4\2\u00eb\u00ec"+
		"\t\2\2\2\u00ec\u00ed\5\6\4\2\u00ed\u00ee\b\22\1\2\u00ee#\3\2\2\2\u00ef"+
		"\u00f0\7(\2\2\u00f0\u00f1\7*\2\2\u00f1\u00f2\b\23\1\2\u00f2%\3\2\2\2\u00f3"+
		"\u00f4\7\35\2\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7\7"+
		"\6\2\2\u00f7\u00f9\7\36\2\2\u00f8\u00fa\5\6\4\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fe\7\37\2\2\u00fe\u00ff\b\24\1\2\u00ff\'\3\2\2\2\u0100\u0101"+
		"\7 \2\2\u0101\u0102\7\5\2\2\u0102\u0103\5\"\22\2\u0103\u0104\7\6\2\2\u0104"+
		"\u0106\7\36\2\2\u0105\u0107\5\6\4\2\u0106\u0105\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\7\37\2\2\u010b\u010c\b\25\1\2\u010c)\3\2\2\2\u010d\u010f\7\36\2"+
		"\2\u010e\u0110\5\6\4\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\37\2\2"+
		"\u0114\u0115\b\26\1\2\u0115+\3\2\2\2\21\619~\u008e\u009a\u009c\u00ad\u00af"+
		"\u00ba\u00c2\u00cb\u00cf\u00fb\u0108\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}