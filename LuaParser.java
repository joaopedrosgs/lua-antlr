// Generated from Lua.g4 by ANTLR 4.7.2
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, NUMERAL=56, LITERAL_STRING=57, NAME=58, 
		EscapedLITERAL_STRING=59, INT=60, HEX=61, FLOAT=62, COMMENT=63, LINE_COMMENT=64, 
		WHITESPACE=65;
	public static final int
		RULE_eval = 0, RULE_codigo = 1, RULE_stat = 2, RULE_retorno = 3, RULE_label = 4, 
		RULE_funcname = 5, RULE_varlist = 6, RULE_namelist = 7, RULE_listaExpr = 8, 
		RULE_exp = 9, RULE_opLogica = 10, RULE_opComparacao = 11, RULE_opBin = 12, 
		RULE_opSomaSub = 13, RULE_opDivMult = 14, RULE_opConcat = 15, RULE_opUnario = 16, 
		RULE_opPower = 17, RULE_prefixexp = 18, RULE_functioncall = 19, RULE_varOrExp = 20, 
		RULE_var = 21, RULE_varSuffix = 22, RULE_nameAndArgs = 23, RULE_args = 24, 
		RULE_functiondef = 25, RULE_funcbody = 26, RULE_parlist = 27, RULE_tableconstructor = 28, 
		RULE_fieldlist = 29, RULE_field = 30, RULE_fieldsep = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"eval", "codigo", "stat", "retorno", "label", "funcname", "varlist", 
			"namelist", "listaExpr", "exp", "opLogica", "opComparacao", "opBin", 
			"opSomaSub", "opDivMult", "opConcat", "opUnario", "opPower", "prefixexp", 
			"functioncall", "varOrExp", "var", "varSuffix", "nameAndArgs", "args", 
			"functiondef", "funcbody", "parlist", "tableconstructor", "fieldlist", 
			"field", "fieldsep"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'break'", "'goto'", "'do'", "'end'", "'while'", 
			"'repeat'", "'until'", "'if'", "'then'", "'elseif'", "'else'", "'for'", 
			"','", "'in'", "'function'", "'local'", "'return'", "'::'", "'.'", "':'", 
			"'nil'", "'false'", "'true'", "'...'", "'or'", "'and'", "'<'", "'>'", 
			"'<='", "'>='", "'~='", "'=='", "'|'", "'~'", "'&'", "'<<'", "'>>'", 
			"'+'", "'-'", "'*'", "'/'", "'//'", "'%'", "'..'", "'not'", "'#'", "'^'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUMERAL", "LITERAL_STRING", 
			"NAME", "EscapedLITERAL_STRING", "INT", "HEX", "FLOAT", "COMMENT", "LINE_COMMENT", 
			"WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<RAs dos membros do grupo>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EvalContext extends ParserRuleContext {
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LuaParser.EOF, 0); }
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			codigo();
			setState(65);
			match(EOF);
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

	public static class CodigoContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__49) | (1L << NAME))) != 0)) {
				{
				{
				setState(67);
				stat();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(73);
				retorno();
				}
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

	public static class StatContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ListaExprContext listaExpr() {
			return getRuleContext(ListaExprContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				varlist();
				setState(78);
				match(T__1);
				setState(79);
				listaExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				match(T__3);
				setState(85);
				match(NAME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				match(T__4);
				setState(87);
				codigo();
				setState(88);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				match(T__6);
				setState(91);
				exp(0);
				setState(92);
				match(T__4);
				setState(93);
				codigo();
				setState(94);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				match(T__7);
				setState(97);
				codigo();
				setState(98);
				match(T__8);
				setState(99);
				exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				match(T__9);
				setState(102);
				exp(0);
				setState(103);
				match(T__10);
				setState(104);
				codigo();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(105);
					match(T__11);
					setState(106);
					exp(0);
					setState(107);
					match(T__10);
					setState(108);
					codigo();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(115);
					match(T__12);
					setState(116);
					codigo();
					}
				}

				setState(119);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(121);
				match(T__13);
				setState(122);
				match(NAME);
				setState(123);
				match(T__1);
				setState(124);
				exp(0);
				setState(125);
				match(T__14);
				setState(126);
				exp(0);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(127);
					match(T__14);
					setState(128);
					exp(0);
					}
				}

				setState(131);
				match(T__4);
				setState(132);
				codigo();
				setState(133);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(135);
				match(T__13);
				setState(136);
				namelist();
				setState(137);
				match(T__15);
				setState(138);
				listaExpr();
				setState(139);
				match(T__4);
				setState(140);
				codigo();
				setState(141);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(143);
				match(T__16);
				setState(144);
				funcname();
				setState(145);
				funcbody();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(147);
				match(T__17);
				setState(148);
				match(T__16);
				setState(149);
				match(NAME);
				setState(150);
				funcbody();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(151);
				match(T__17);
				setState(152);
				namelist();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(153);
					match(T__1);
					setState(154);
					listaExpr();
					}
				}

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

	public static class RetornoContext extends ParserRuleContext {
		public ListaExprContext listaExpr() {
			return getRuleContext(ListaExprContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__18);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__35) | (1L << T__40) | (1L << T__46) | (1L << T__47) | (1L << T__49) | (1L << NUMERAL) | (1L << LITERAL_STRING) | (1L << NAME))) != 0)) {
				{
				setState(160);
				listaExpr();
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(163);
				match(T__0);
				}
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__19);
			setState(167);
			match(NAME);
			setState(168);
			match(T__19);
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

	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaParser.NAME, i);
		}
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncname(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(NAME);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(171);
				match(T__20);
				setState(172);
				match(NAME);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(178);
				match(T__21);
				setState(179);
				match(NAME);
				}
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			var();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(183);
				match(T__14);
				setState(184);
				var();
				}
				}
				setState(189);
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

	public static class NamelistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaParser.NAME, i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNamelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNamelist(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(NAME);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					match(T__14);
					setState(192);
					match(NAME);
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ListaExprContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaExpr(this);
		}
	}

	public final ListaExprContext listaExpr() throws RecognitionException {
		ListaExprContext _localctx = new ListaExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			exp(0);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(199);
				match(T__14);
				setState(200);
				exp(0);
				}
				}
				setState(205);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode NUMERAL() { return getToken(LuaParser.NUMERAL, 0); }
		public TerminalNode LITERAL_STRING() { return getToken(LuaParser.LITERAL_STRING, 0); }
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public OpUnarioContext opUnario() {
			return getRuleContext(OpUnarioContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpLogicaContext opLogica() {
			return getRuleContext(OpLogicaContext.class,0);
		}
		public OpComparacaoContext opComparacao() {
			return getRuleContext(OpComparacaoContext.class,0);
		}
		public OpBinContext opBin() {
			return getRuleContext(OpBinContext.class,0);
		}
		public OpConcatContext opConcat() {
			return getRuleContext(OpConcatContext.class,0);
		}
		public OpSomaSubContext opSomaSub() {
			return getRuleContext(OpSomaSubContext.class,0);
		}
		public OpDivMultContext opDivMult() {
			return getRuleContext(OpDivMultContext.class,0);
		}
		public OpPowerContext opPower() {
			return getRuleContext(OpPowerContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(207);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(208);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(209);
				match(T__24);
				}
				break;
			case NUMERAL:
				{
				setState(210);
				match(NUMERAL);
				}
				break;
			case LITERAL_STRING:
				{
				setState(211);
				match(LITERAL_STRING);
				}
				break;
			case T__16:
				{
				setState(212);
				functiondef();
				}
				break;
			case T__25:
				{
				setState(213);
				match(T__25);
				}
				break;
			case T__49:
			case NAME:
				{
				setState(214);
				prefixexp();
				}
				break;
			case T__35:
			case T__40:
			case T__46:
			case T__47:
				{
				setState(215);
				opUnario();
				setState(216);
				exp(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(220);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(221);
						opLogica();
						setState(222);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(224);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(225);
						opComparacao();
						setState(226);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(228);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(229);
						opBin();
						setState(230);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(232);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(233);
						opConcat();
						setState(234);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						opSomaSub();
						setState(238);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(240);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(241);
						opDivMult();
						setState(242);
						exp(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(244);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(245);
						opPower();
						setState(246);
						exp(1);
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpLogicaContext extends ParserRuleContext {
		public OpLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpLogica(this);
		}
	}

	public final OpLogicaContext opLogica() throws RecognitionException {
		OpLogicaContext _localctx = new OpLogicaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OpComparacaoContext extends ParserRuleContext {
		public OpComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opComparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpComparacao(this);
		}
	}

	public final OpComparacaoContext opComparacao() throws RecognitionException {
		OpComparacaoContext _localctx = new OpComparacaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opComparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OpBinContext extends ParserRuleContext {
		public OpBinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpBin(this);
		}
	}

	public final OpBinContext opBin() throws RecognitionException {
		OpBinContext _localctx = new OpBinContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opBin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OpSomaSubContext extends ParserRuleContext {
		public OpSomaSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSomaSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpSomaSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpSomaSub(this);
		}
	}

	public final OpSomaSubContext opSomaSub() throws RecognitionException {
		OpSomaSubContext _localctx = new OpSomaSubContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_opSomaSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OpDivMultContext extends ParserRuleContext {
		public OpDivMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opDivMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpDivMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpDivMult(this);
		}
	}

	public final OpDivMultContext opDivMult() throws RecognitionException {
		OpDivMultContext _localctx = new OpDivMultContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opDivMult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OpConcatContext extends ParserRuleContext {
		public OpConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opConcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpConcat(this);
		}
	}

	public final OpConcatContext opConcat() throws RecognitionException {
		OpConcatContext _localctx = new OpConcatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opConcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__45);
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

	public static class OpUnarioContext extends ParserRuleContext {
		public OpUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpUnario(this);
		}
	}

	public final OpUnarioContext opUnario() throws RecognitionException {
		OpUnarioContext _localctx = new OpUnarioContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_opUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__40) | (1L << T__46) | (1L << T__47))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OpPowerContext extends ParserRuleContext {
		public OpPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpPower(this);
		}
	}

	public final OpPowerContext opPower() throws RecognitionException {
		OpPowerContext _localctx = new OpPowerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__48);
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

	public static class PrefixexpContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixexp(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			varOrExp();
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					nameAndArgs();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			prefixexp();
			setState(278); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(277);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(280); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VarOrExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarOrExp(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varOrExp);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__49);
				setState(284);
				exp(0);
				setState(285);
				match(T__50);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(289);
				match(NAME);
				}
				break;
			case T__49:
				{
				setState(290);
				match(T__49);
				setState(291);
				exp(0);
				setState(292);
				match(T__50);
				setState(293);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					varSuffix();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class VarSuffixContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarSuffix(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__49) | (1L << T__53) | (1L << LITERAL_STRING))) != 0)) {
				{
				{
				setState(303);
				nameAndArgs();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				{
				setState(309);
				match(T__51);
				setState(310);
				exp(0);
				setState(311);
				match(T__52);
				}
				break;
			case T__20:
				{
				setState(313);
				match(T__20);
				setState(314);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NameAndArgsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public NameAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNameAndArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNameAndArgs(this);
		}
	}

	public final NameAndArgsContext nameAndArgs() throws RecognitionException {
		NameAndArgsContext _localctx = new NameAndArgsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(317);
				match(T__21);
				setState(318);
				match(NAME);
				}
			}

			setState(321);
			args();
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

	public static class ArgsContext extends ParserRuleContext {
		public ListaExprContext listaExpr() {
			return getRuleContext(ListaExprContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public TerminalNode LITERAL_STRING() { return getToken(LuaParser.LITERAL_STRING, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_args);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(T__49);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__35) | (1L << T__40) | (1L << T__46) | (1L << T__47) | (1L << T__49) | (1L << NUMERAL) | (1L << LITERAL_STRING) | (1L << NAME))) != 0)) {
					{
					setState(324);
					listaExpr();
					}
				}

				setState(327);
				match(T__50);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				tableconstructor();
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(LITERAL_STRING);
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

	public static class FunctiondefContext extends ParserRuleContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFunctiondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFunctiondef(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__16);
			setState(333);
			funcbody();
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

	public static class FuncbodyContext extends ParserRuleContext {
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncbody(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__49);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25 || _la==NAME) {
				{
				setState(336);
				parlist();
				}
			}

			setState(339);
			match(T__50);
			setState(340);
			codigo();
			setState(341);
			match(T__5);
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

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitParlist(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parlist);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				namelist();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(344);
					match(T__14);
					setState(345);
					match(T__25);
					}
				}

				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(T__25);
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

	public static class TableconstructorContext extends ParserRuleContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTableconstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTableconstructor(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__53);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__35) | (1L << T__40) | (1L << T__46) | (1L << T__47) | (1L << T__49) | (1L << T__51) | (1L << NUMERAL) | (1L << LITERAL_STRING) | (1L << NAME))) != 0)) {
				{
				setState(352);
				fieldlist();
				}
			}

			setState(355);
			match(T__54);
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

	public static class FieldlistContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFieldlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFieldlist(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			field();
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					fieldsep();
					setState(359);
					field();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__14) {
				{
				setState(366);
				fieldsep();
				}
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

	public static class FieldContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_field);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(T__51);
				setState(370);
				exp(0);
				setState(371);
				match(T__52);
				setState(372);
				match(T__1);
				setState(373);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(NAME);
				setState(376);
				match(T__1);
				setState(377);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				exp(0);
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

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFieldsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFieldsep(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u0182\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\5\3M\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4q\n\4\f\4\16\4"+
		"t\13\4\3\4\3\4\5\4x\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009e\n\4\5\4\u00a0\n\4\3\5\3\5\5\5"+
		"\u00a4\n\5\3\5\5\5\u00a7\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00b0\n\7"+
		"\f\7\16\7\u00b3\13\7\3\7\3\7\5\7\u00b7\n\7\3\b\3\b\3\b\7\b\u00bc\n\b\f"+
		"\b\16\b\u00bf\13\b\3\t\3\t\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7\13\t\3\n\3"+
		"\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00dd\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00fb\n\13\f\13\16"+
		"\13\u00fe\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\7\24\u0112\n\24\f\24\16\24\u0115\13\24"+
		"\3\25\3\25\6\25\u0119\n\25\r\25\16\25\u011a\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u0122\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012a\n\27\3\27\7\27"+
		"\u012d\n\27\f\27\16\27\u0130\13\27\3\30\7\30\u0133\n\30\f\30\16\30\u0136"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013e\n\30\3\31\3\31\5\31\u0142"+
		"\n\31\3\31\3\31\3\32\3\32\5\32\u0148\n\32\3\32\3\32\3\32\5\32\u014d\n"+
		"\32\3\33\3\33\3\33\3\34\3\34\5\34\u0154\n\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\5\35\u015d\n\35\3\35\5\35\u0160\n\35\3\36\3\36\5\36\u0164\n"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u016c\n\37\f\37\16\37\u016f\13"+
		"\37\3\37\5\37\u0172\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u017e\n \3!"+
		"\3!\3!\2\3\24\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@\2\t\3\2\35\36\3\2\37$\3\2%)\3\2*+\3\2,/\5\2&&++\61\62\4\2"+
		"\3\3\21\21\2\u019e\2B\3\2\2\2\4H\3\2\2\2\6\u009f\3\2\2\2\b\u00a1\3\2\2"+
		"\2\n\u00a8\3\2\2\2\f\u00ac\3\2\2\2\16\u00b8\3\2\2\2\20\u00c0\3\2\2\2\22"+
		"\u00c8\3\2\2\2\24\u00dc\3\2\2\2\26\u00ff\3\2\2\2\30\u0101\3\2\2\2\32\u0103"+
		"\3\2\2\2\34\u0105\3\2\2\2\36\u0107\3\2\2\2 \u0109\3\2\2\2\"\u010b\3\2"+
		"\2\2$\u010d\3\2\2\2&\u010f\3\2\2\2(\u0116\3\2\2\2*\u0121\3\2\2\2,\u0129"+
		"\3\2\2\2.\u0134\3\2\2\2\60\u0141\3\2\2\2\62\u014c\3\2\2\2\64\u014e\3\2"+
		"\2\2\66\u0151\3\2\2\28\u015f\3\2\2\2:\u0161\3\2\2\2<\u0167\3\2\2\2>\u017d"+
		"\3\2\2\2@\u017f\3\2\2\2BC\5\4\3\2CD\7\2\2\3D\3\3\2\2\2EG\5\6\4\2FE\3\2"+
		"\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KM\5\b\5\2LK\3\2"+
		"\2\2LM\3\2\2\2M\5\3\2\2\2N\u00a0\7\3\2\2OP\5\16\b\2PQ\7\4\2\2QR\5\22\n"+
		"\2R\u00a0\3\2\2\2S\u00a0\5(\25\2T\u00a0\5\n\6\2U\u00a0\7\5\2\2VW\7\6\2"+
		"\2W\u00a0\7<\2\2XY\7\7\2\2YZ\5\4\3\2Z[\7\b\2\2[\u00a0\3\2\2\2\\]\7\t\2"+
		"\2]^\5\24\13\2^_\7\7\2\2_`\5\4\3\2`a\7\b\2\2a\u00a0\3\2\2\2bc\7\n\2\2"+
		"cd\5\4\3\2de\7\13\2\2ef\5\24\13\2f\u00a0\3\2\2\2gh\7\f\2\2hi\5\24\13\2"+
		"ij\7\r\2\2jr\5\4\3\2kl\7\16\2\2lm\5\24\13\2mn\7\r\2\2no\5\4\3\2oq\3\2"+
		"\2\2pk\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sw\3\2\2\2tr\3\2\2\2uv\7\17"+
		"\2\2vx\5\4\3\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\b\2\2z\u00a0\3\2\2\2"+
		"{|\7\20\2\2|}\7<\2\2}~\7\4\2\2~\177\5\24\13\2\177\u0080\7\21\2\2\u0080"+
		"\u0083\5\24\13\2\u0081\u0082\7\21\2\2\u0082\u0084\5\24\13\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\7\2\2\u0086"+
		"\u0087\5\4\3\2\u0087\u0088\7\b\2\2\u0088\u00a0\3\2\2\2\u0089\u008a\7\20"+
		"\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\22\2\2\u008c\u008d\5\22\n\2\u008d"+
		"\u008e\7\7\2\2\u008e\u008f\5\4\3\2\u008f\u0090\7\b\2\2\u0090\u00a0\3\2"+
		"\2\2\u0091\u0092\7\23\2\2\u0092\u0093\5\f\7\2\u0093\u0094\5\66\34\2\u0094"+
		"\u00a0\3\2\2\2\u0095\u0096\7\24\2\2\u0096\u0097\7\23\2\2\u0097\u0098\7"+
		"<\2\2\u0098\u00a0\5\66\34\2\u0099\u009a\7\24\2\2\u009a\u009d\5\20\t\2"+
		"\u009b\u009c\7\4\2\2\u009c\u009e\5\22\n\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a0\3\2\2\2\u009fN\3\2\2\2\u009fO\3\2\2\2\u009fS\3\2"+
		"\2\2\u009fT\3\2\2\2\u009fU\3\2\2\2\u009fV\3\2\2\2\u009fX\3\2\2\2\u009f"+
		"\\\3\2\2\2\u009fb\3\2\2\2\u009fg\3\2\2\2\u009f{\3\2\2\2\u009f\u0089\3"+
		"\2\2\2\u009f\u0091\3\2\2\2\u009f\u0095\3\2\2\2\u009f\u0099\3\2\2\2\u00a0"+
		"\7\3\2\2\2\u00a1\u00a3\7\25\2\2\u00a2\u00a4\5\22\n\2\u00a3\u00a2\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\7\3\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\t\3\2\2\2\u00a8\u00a9\7\26\2\2\u00a9"+
		"\u00aa\7<\2\2\u00aa\u00ab\7\26\2\2\u00ab\13\3\2\2\2\u00ac\u00b1\7<\2\2"+
		"\u00ad\u00ae\7\27\2\2\u00ae\u00b0\7<\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b7\7<\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\r\3\2\2\2\u00b8\u00bd\5,\27\2\u00b9\u00ba"+
		"\7\21\2\2\u00ba\u00bc\5,\27\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\17\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c5\7<\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c4\7<\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\21\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cd\5\24\13\2\u00c9"+
		"\u00ca\7\21\2\2\u00ca\u00cc\5\24\13\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\23\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\b\13\1\2\u00d1\u00dd\7\31\2\2\u00d2\u00dd\7"+
		"\32\2\2\u00d3\u00dd\7\33\2\2\u00d4\u00dd\7:\2\2\u00d5\u00dd\7;\2\2\u00d6"+
		"\u00dd\5\64\33\2\u00d7\u00dd\7\34\2\2\u00d8\u00dd\5&\24\2\u00d9\u00da"+
		"\5\"\22\2\u00da\u00db\5\24\13\4\u00db\u00dd\3\2\2\2\u00dc\u00d0\3\2\2"+
		"\2\u00dc\u00d2\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d5"+
		"\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00d9\3\2\2\2\u00dd\u00fc\3\2\2\2\u00de\u00df\f\n\2\2\u00df\u00e0\5\26"+
		"\f\2\u00e0\u00e1\5\24\13\13\u00e1\u00fb\3\2\2\2\u00e2\u00e3\f\t\2\2\u00e3"+
		"\u00e4\5\30\r\2\u00e4\u00e5\5\24\13\n\u00e5\u00fb\3\2\2\2\u00e6\u00e7"+
		"\f\b\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\5\24\13\t\u00e9\u00fb\3\2\2"+
		"\2\u00ea\u00eb\f\7\2\2\u00eb\u00ec\5 \21\2\u00ec\u00ed\5\24\13\7\u00ed"+
		"\u00fb\3\2\2\2\u00ee\u00ef\f\6\2\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1\5"+
		"\24\13\7\u00f1\u00fb\3\2\2\2\u00f2\u00f3\f\5\2\2\u00f3\u00f4\5\36\20\2"+
		"\u00f4\u00f5\5\24\13\6\u00f5\u00fb\3\2\2\2\u00f6\u00f7\f\3\2\2\u00f7\u00f8"+
		"\5$\23\2\u00f8\u00f9\5\24\13\3\u00f9\u00fb\3\2\2\2\u00fa\u00de\3\2\2\2"+
		"\u00fa\u00e2\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00ee"+
		"\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\25\3\2\2\2\u00fe\u00fc\3\2\2"+
		"\2\u00ff\u0100\t\2\2\2\u0100\27\3\2\2\2\u0101\u0102\t\3\2\2\u0102\31\3"+
		"\2\2\2\u0103\u0104\t\4\2\2\u0104\33\3\2\2\2\u0105\u0106\t\5\2\2\u0106"+
		"\35\3\2\2\2\u0107\u0108\t\6\2\2\u0108\37\3\2\2\2\u0109\u010a\7\60\2\2"+
		"\u010a!\3\2\2\2\u010b\u010c\t\7\2\2\u010c#\3\2\2\2\u010d\u010e\7\63\2"+
		"\2\u010e%\3\2\2\2\u010f\u0113\5*\26\2\u0110\u0112\5\60\31\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\'\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\5&\24\2\u0117\u0119\5\60\31"+
		"\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b)\3\2\2\2\u011c\u0122\5,\27\2\u011d\u011e\7\64\2\2\u011e"+
		"\u011f\5\24\13\2\u011f\u0120\7\65\2\2\u0120\u0122\3\2\2\2\u0121\u011c"+
		"\3\2\2\2\u0121\u011d\3\2\2\2\u0122+\3\2\2\2\u0123\u012a\7<\2\2\u0124\u0125"+
		"\7\64\2\2\u0125\u0126\5\24\13\2\u0126\u0127\7\65\2\2\u0127\u0128\5.\30"+
		"\2\u0128\u012a\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u012a\u012e"+
		"\3\2\2\2\u012b\u012d\5.\30\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f-\3\2\2\2\u0130\u012e\3\2\2\2"+
		"\u0131\u0133\5\60\31\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013d\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0138\7\66\2\2\u0138\u0139\5\24\13\2\u0139\u013a\7\67\2\2\u013a\u013e"+
		"\3\2\2\2\u013b\u013c\7\27\2\2\u013c\u013e\7<\2\2\u013d\u0137\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e/\3\2\2\2\u013f\u0140\7\30\2\2\u0140\u0142\7<\2\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144"+
		"\5\62\32\2\u0144\61\3\2\2\2\u0145\u0147\7\64\2\2\u0146\u0148\5\22\n\2"+
		"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014d"+
		"\7\65\2\2\u014a\u014d\5:\36\2\u014b\u014d\7;\2\2\u014c\u0145\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\63\3\2\2\2\u014e\u014f\7\23\2"+
		"\2\u014f\u0150\5\66\34\2\u0150\65\3\2\2\2\u0151\u0153\7\64\2\2\u0152\u0154"+
		"\58\35\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\7\65\2\2\u0156\u0157\5\4\3\2\u0157\u0158\7\b\2\2\u0158\67\3\2\2"+
		"\2\u0159\u015c\5\20\t\2\u015a\u015b\7\21\2\2\u015b\u015d\7\34\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u0160\7\34"+
		"\2\2\u015f\u0159\3\2\2\2\u015f\u015e\3\2\2\2\u01609\3\2\2\2\u0161\u0163"+
		"\78\2\2\u0162\u0164\5<\37\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\79\2\2\u0166;\3\2\2\2\u0167\u016d\5> \2\u0168"+
		"\u0169\5@!\2\u0169\u016a\5> \2\u016a\u016c\3\2\2\2\u016b\u0168\3\2\2\2"+
		"\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\5@!\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172=\3\2\2\2\u0173\u0174\7\66\2\2\u0174\u0175\5\24\13"+
		"\2\u0175\u0176\7\67\2\2\u0176\u0177\7\4\2\2\u0177\u0178\5\24\13\2\u0178"+
		"\u017e\3\2\2\2\u0179\u017a\7<\2\2\u017a\u017b\7\4\2\2\u017b\u017e\5\24"+
		"\13\2\u017c\u017e\5\24\13\2\u017d\u0173\3\2\2\2\u017d\u0179\3\2\2\2\u017d"+
		"\u017c\3\2\2\2\u017e?\3\2\2\2\u017f\u0180\t\b\2\2\u0180A\3\2\2\2$HLrw"+
		"\u0083\u009d\u009f\u00a3\u00a6\u00b1\u00b6\u00bd\u00c5\u00cd\u00dc\u00fa"+
		"\u00fc\u0113\u011a\u0121\u0129\u012e\u0134\u013d\u0141\u0147\u014c\u0153"+
		"\u015c\u015f\u0163\u016d\u0171\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}