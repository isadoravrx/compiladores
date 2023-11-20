// Generated from grammar_file.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammar_fileParser extends Parser {
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
		T__52=53, T__53=54, T__54=55, T__55=56, NUM_INT=57, NUM_DEC=58, TEXTO=59, 
		ID=60;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_declaracaoVariavel = 2, RULE_tipo = 3, 
		RULE_declaracaoFuncao = 4, RULE_parametros = 5, RULE_parametro = 6, RULE_bloco = 7, 
		RULE_comentario = 8, RULE_expressao = 9, RULE_atribuicao = 10, RULE_estruturaControle = 11, 
		RULE_caseLista = 12, RULE_caseDecl = 13, RULE_declaracaoEstrutura = 14, 
		RULE_array = 15, RULE_arrayinicializacao = 16, RULE_expressaoLogica = 17, 
		RULE_expressaoRelacional = 18, RULE_expressaoAritmetica = 19, RULE_expressaoMultiplicativa = 20, 
		RULE_expressaoUnaria = 21, RULE_expressaoPostfix = 22, RULE_argumentos = 23, 
		RULE_expressaoLista = 24, RULE_primaria = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "declaracaoVariavel", "tipo", "declaracaoFuncao", 
			"parametros", "parametro", "bloco", "comentario", "expressao", "atribuicao", 
			"estruturaControle", "caseLista", "caseDecl", "declaracaoEstrutura", 
			"array", "arrayinicializacao", "expressaoLogica", "expressaoRelacional", 
			"expressaoAritmetica", "expressaoMultiplicativa", "expressaoUnaria", 
			"expressaoPostfix", "argumentos", "expressaoLista", "primaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'int'", "'float'", "'double'", "'char'", "'boolean'", 
			"'('", "')'", "','", "'[]'", "'...'", "'{'", "'}'", "'//'", "'\r'", "'\n'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", "'||='", "'if'", "'else'", 
			"'while'", "'for'", "'switch'", "'break'", "'continue'", "'return'", 
			"'case'", "':'", "'default'", "'struct'", "'['", "']'", "'&&'", "'||'", 
			"'!'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'++'", "'--'", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NUM_INT", "NUM_DEC", 
			"TEXTO", "ID"
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
	public String getGrammarFileName() { return "grammar_file.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammar_fileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__35))) != 0)) {
				{
				{
				setState(52);
				declaracao();
				}
				}
				setState(57);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public DeclaracaoEstruturaContext declaracaoEstrutura() {
			return getRuleContext(DeclaracaoEstruturaContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				declaracaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				declaracaoFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				declaracaoEstrutura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				comentario();
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

	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitDeclaracaoVariavel(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVariavel);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				tipo();
				setState(65);
				match(ID);
				setState(66);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				tipo();
				setState(69);
				match(ID);
				setState(70);
				match(T__1);
				setState(71);
				expressao();
				setState(72);
				match(T__0);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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

	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitDeclaracaoFuncao(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			tipo();
			setState(79);
			match(ID);
			setState(80);
			match(T__7);
			setState(81);
			parametros();
			setState(82);
			match(T__8);
			setState(83);
			bloco();
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

	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				parametro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				parametro();
				setState(87);
				match(T__9);
				setState(88);
				parametros();
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

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				tipo();
				setState(93);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				tipo();
				setState(96);
				match(ID);
				setState(97);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				tipo();
				setState(100);
				match(T__11);
				setState(101);
				match(ID);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__12);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__35))) != 0)) {
				{
				{
				setState(106);
				declaracao();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__13);
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

	public static class ComentarioContext extends ParserRuleContext {
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__14);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << NUM_INT) | (1L << NUM_DEC) | (1L << TEXTO) | (1L << ID))) != 0)) {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(121);
				match(T__15);
				}
			}

			setState(124);
			match(T__16);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				expressaoLogica(0);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(grammar_fileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammar_fileParser.ID, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ID);
				setState(131);
				match(T__1);
				setState(132);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(ID);
				setState(134);
				match(T__17);
				setState(135);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(ID);
				setState(137);
				match(T__18);
				setState(138);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(ID);
				setState(140);
				match(T__19);
				setState(141);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(ID);
				setState(143);
				match(T__20);
				setState(144);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(ID);
				setState(146);
				match(T__21);
				setState(147);
				expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__22);
				setState(150);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				match(ID);
				setState(152);
				match(T__23);
				setState(153);
				expressao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(154);
				match(ID);
				setState(155);
				match(T__1);
				setState(156);
				match(ID);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(157);
				match(ID);
				setState(158);
				match(T__17);
				setState(159);
				match(ID);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(160);
				match(ID);
				setState(161);
				match(T__18);
				setState(162);
				match(ID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(163);
				match(ID);
				setState(164);
				match(T__19);
				setState(165);
				match(ID);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(166);
				match(ID);
				setState(167);
				match(T__20);
				setState(168);
				match(ID);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(169);
				match(ID);
				setState(170);
				match(T__21);
				setState(171);
				match(ID);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(172);
				match(ID);
				setState(173);
				match(T__22);
				setState(174);
				match(ID);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(175);
				match(ID);
				setState(176);
				match(T__23);
				setState(177);
				match(ID);
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

	public static class EstruturaControleContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CaseListaContext caseLista() {
			return getRuleContext(CaseListaContext.class,0);
		}
		public EstruturaControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaControle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterEstruturaControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitEstruturaControle(this);
		}
	}

	public final EstruturaControleContext estruturaControle() throws RecognitionException {
		EstruturaControleContext _localctx = new EstruturaControleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_estruturaControle);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__24);
				setState(181);
				match(T__7);
				setState(182);
				expressao();
				setState(183);
				match(T__8);
				setState(184);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(T__24);
				setState(187);
				match(T__7);
				setState(188);
				expressao();
				setState(189);
				match(T__8);
				setState(190);
				bloco();
				setState(191);
				match(T__25);
				setState(192);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(T__26);
				setState(195);
				match(T__7);
				setState(196);
				expressao();
				setState(197);
				match(T__8);
				setState(198);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(T__27);
				setState(201);
				match(T__7);
				setState(202);
				expressao();
				setState(203);
				match(T__0);
				setState(204);
				expressao();
				setState(205);
				match(T__0);
				setState(206);
				expressao();
				setState(207);
				match(T__8);
				setState(208);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(T__28);
				setState(211);
				match(T__7);
				setState(212);
				expressao();
				setState(213);
				match(T__8);
				setState(214);
				caseLista();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(T__29);
				setState(217);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				match(T__30);
				setState(219);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(220);
				match(T__31);
				setState(221);
				expressao();
				setState(222);
				match(T__0);
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

	public static class CaseListaContext extends ParserRuleContext {
		public List<CaseDeclContext> caseDecl() {
			return getRuleContexts(CaseDeclContext.class);
		}
		public CaseDeclContext caseDecl(int i) {
			return getRuleContext(CaseDeclContext.class,i);
		}
		public CaseListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterCaseLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitCaseLista(this);
		}
	}

	public final CaseListaContext caseLista() throws RecognitionException {
		CaseListaContext _localctx = new CaseListaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__34) {
				{
				{
				setState(226);
				caseDecl();
				}
				}
				setState(231);
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

	public static class CaseDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterCaseDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitCaseDecl(this);
		}
	}

	public final CaseDeclContext caseDecl() throws RecognitionException {
		CaseDeclContext _localctx = new CaseDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseDecl);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__32);
				setState(233);
				expressao();
				setState(234);
				match(T__33);
				setState(235);
				bloco();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(T__34);
				setState(238);
				match(T__33);
				setState(239);
				bloco();
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

	public static class DeclaracaoEstruturaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public List<DeclaracaoVariavelContext> declaracaoVariavel() {
			return getRuleContexts(DeclaracaoVariavelContext.class);
		}
		public DeclaracaoVariavelContext declaracaoVariavel(int i) {
			return getRuleContext(DeclaracaoVariavelContext.class,i);
		}
		public DeclaracaoEstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoEstrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterDeclaracaoEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitDeclaracaoEstrutura(this);
		}
	}

	public final DeclaracaoEstruturaContext declaracaoEstrutura() throws RecognitionException {
		DeclaracaoEstruturaContext _localctx = new DeclaracaoEstruturaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracaoEstrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__35);
			setState(243);
			match(ID);
			setState(244);
			match(T__12);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
				{
				{
				setState(245);
				declaracaoVariavel();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(T__13);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ID);
				setState(254);
				match(T__36);
				setState(255);
				expressao();
				setState(256);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(ID);
				setState(259);
				match(T__36);
				setState(260);
				match(T__37);
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

	public static class ArrayinicializacaoContext extends ParserRuleContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ArrayinicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayinicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterArrayinicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitArrayinicializacao(this);
		}
	}

	public final ArrayinicializacaoContext arrayinicializacao() throws RecognitionException {
		ArrayinicializacaoContext _localctx = new ArrayinicializacaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayinicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__12);
			setState(264);
			expressaoLista();
			setState(265);
			match(T__13);
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

	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitExpressaoLogica(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		return expressaoLogica(0);
	}

	private ExpressaoLogicaContext expressaoLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, _parentState);
		ExpressaoLogicaContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressaoLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__48:
			case T__52:
			case T__53:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
			case ID:
				{
				setState(268);
				expressaoRelacional();
				}
				break;
			case T__40:
				{
				setState(269);
				match(T__40);
				setState(270);
				expressaoRelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(273);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(274);
						match(T__38);
						setState(275);
						expressaoRelacional();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(276);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(277);
						match(T__39);
						setState(278);
						expressaoRelacional();
						}
						break;
					}
					} 
				}
				setState(283);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoRelacional);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				expressaoAritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				expressaoAritmetica(0);
				setState(286);
				match(T__41);
				setState(287);
				expressaoAritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				expressaoAritmetica(0);
				setState(290);
				match(T__42);
				setState(291);
				expressaoAritmetica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				expressaoAritmetica(0);
				setState(294);
				match(T__43);
				setState(295);
				expressaoAritmetica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				expressaoAritmetica(0);
				setState(298);
				match(T__44);
				setState(299);
				expressaoAritmetica(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				expressaoAritmetica(0);
				setState(302);
				match(T__45);
				setState(303);
				expressaoAritmetica(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(305);
				expressaoAritmetica(0);
				setState(306);
				match(T__46);
				setState(307);
				expressaoAritmetica(0);
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

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		return expressaoAritmetica(0);
	}

	private ExpressaoAritmeticaContext expressaoAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, _parentState);
		ExpressaoAritmeticaContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expressaoAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(312);
			expressaoMultiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
						setState(314);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(315);
						match(T__47);
						setState(316);
						expressaoMultiplicativa(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
						setState(317);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(318);
						match(T__48);
						setState(319);
						expressaoMultiplicativa(0);
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ExpressaoMultiplicativaContext extends ParserRuleContext {
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterExpressaoMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitExpressaoMultiplicativa(this);
		}
	}

	public final ExpressaoMultiplicativaContext expressaoMultiplicativa() throws RecognitionException {
		return expressaoMultiplicativa(0);
	}

	private ExpressaoMultiplicativaContext expressaoMultiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoMultiplicativaContext _localctx = new ExpressaoMultiplicativaContext(_ctx, _parentState);
		ExpressaoMultiplicativaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressaoMultiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			expressaoUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(337);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(328);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(329);
						match(T__49);
						setState(330);
						expressaoUnaria();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(331);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(332);
						match(T__50);
						setState(333);
						expressaoUnaria();
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(334);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(335);
						match(T__51);
						setState(336);
						expressaoUnaria();
						}
						break;
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ExpressaoUnariaContext extends ParserRuleContext {
		public ExpressaoPostfixContext expressaoPostfix() {
			return getRuleContext(ExpressaoPostfixContext.class,0);
		}
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterExpressaoUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitExpressaoUnaria(this);
		}
	}

	public final ExpressaoUnariaContext expressaoUnaria() throws RecognitionException {
		ExpressaoUnariaContext _localctx = new ExpressaoUnariaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressaoUnaria);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				expressaoPostfix();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(T__48);
				setState(344);
				expressaoUnaria();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(T__52);
				setState(346);
				expressaoPostfix();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(T__53);
				setState(348);
				expressaoPostfix();
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

	public static class ExpressaoPostfixContext extends ParserRuleContext {
		public PrimariaContext primaria() {
			return getRuleContext(PrimariaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public ExpressaoPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterExpressaoPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitExpressaoPostfix(this);
		}
	}

	public final ExpressaoPostfixContext expressaoPostfix() throws RecognitionException {
		ExpressaoPostfixContext _localctx = new ExpressaoPostfixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressaoPostfix);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				primaria();
				setState(353);
				match(T__36);
				setState(354);
				expressao();
				setState(355);
				match(T__37);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				primaria();
				setState(358);
				match(T__7);
				setState(359);
				argumentos();
				setState(360);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				primaria();
				setState(363);
				match(T__54);
				setState(364);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				primaria();
				setState(367);
				match(T__55);
				setState(368);
				match(ID);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentos);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				expressaoLista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressaoListaContext extends ParserRuleContext {
		public ExpressaoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterExpressaoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitExpressaoLista(this);
		}
	}

	public final ExpressaoListaContext expressaoLista() throws RecognitionException {
		ExpressaoListaContext _localctx = new ExpressaoListaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressaoLista);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public TerminalNode NUM_INT() { return getToken(grammar_fileParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(grammar_fileParser.NUM_DEC, 0); }
		public TerminalNode TEXTO() { return getToken(grammar_fileParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).enterPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_fileListener ) ((grammar_fileListener)listener).exitPrimaria(this);
		}
	}

	public final PrimariaContext primaria() throws RecognitionException {
		PrimariaContext _localctx = new PrimariaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primaria);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(NUM_INT);
				}
				break;
			case NUM_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(NUM_DEC);
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(TEXTO);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				match(T__7);
				setState(383);
				expressao();
				setState(384);
				match(T__8);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expressaoLogica_sempred((ExpressaoLogicaContext)_localctx, predIndex);
		case 19:
			return expressaoAritmetica_sempred((ExpressaoAritmeticaContext)_localctx, predIndex);
		case 20:
			return expressaoMultiplicativa_sempred((ExpressaoMultiplicativaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoLogica_sempred(ExpressaoLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoAritmetica_sempred(ExpressaoAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressaoMultiplicativa_sempred(ExpressaoMultiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0187\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\5\3A"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bj\n\b\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t"+
		"\3\t\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\5\n}\n\n\3\n\3\n\3\13\3\13\5"+
		"\13\u0083\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00b5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3\16\7\16"+
		"\u00e6\n\16\f\16\16\16\u00e9\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00f3\n\17\3\20\3\20\3\20\3\20\7\20\u00f9\n\20\f\20\16\20\u00fc"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0108\n"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0112\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u011a\n\23\f\23\16\23\u011d\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0138\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0143\n\25\f\25\16\25\u0146\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0154"+
		"\n\26\f\26\16\26\u0157\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0160"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0175\n\30\3\31\3\31\5\31\u0179\n"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0185\n\33"+
		"\3\33\2\5$(*\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\4\3\2\5\t\3\2\22\23\2\u01ac\29\3\2\2\2\4@\3\2\2\2\6L\3\2\2\2\bN"+
		"\3\2\2\2\nP\3\2\2\2\f\\\3\2\2\2\16i\3\2\2\2\20k\3\2\2\2\22t\3\2\2\2\24"+
		"\u0082\3\2\2\2\26\u00b4\3\2\2\2\30\u00e2\3\2\2\2\32\u00e7\3\2\2\2\34\u00f2"+
		"\3\2\2\2\36\u00f4\3\2\2\2 \u0107\3\2\2\2\"\u0109\3\2\2\2$\u0111\3\2\2"+
		"\2&\u0137\3\2\2\2(\u0139\3\2\2\2*\u0147\3\2\2\2,\u015f\3\2\2\2.\u0174"+
		"\3\2\2\2\60\u0178\3\2\2\2\62\u017a\3\2\2\2\64\u0184\3\2\2\2\668\5\4\3"+
		"\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2"+
		"<A\5\6\4\2=A\5\n\6\2>A\5\36\20\2?A\5\22\n\2@<\3\2\2\2@=\3\2\2\2@>\3\2"+
		"\2\2@?\3\2\2\2A\5\3\2\2\2BC\5\b\5\2CD\7>\2\2DE\7\3\2\2EM\3\2\2\2FG\5\b"+
		"\5\2GH\7>\2\2HI\7\4\2\2IJ\5\24\13\2JK\7\3\2\2KM\3\2\2\2LB\3\2\2\2LF\3"+
		"\2\2\2M\7\3\2\2\2NO\t\2\2\2O\t\3\2\2\2PQ\5\b\5\2QR\7>\2\2RS\7\n\2\2ST"+
		"\5\f\7\2TU\7\13\2\2UV\5\20\t\2V\13\3\2\2\2W]\5\16\b\2XY\5\16\b\2YZ\7\f"+
		"\2\2Z[\5\f\7\2[]\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2]\r\3\2\2\2^_\5\b\5\2_`"+
		"\7>\2\2`j\3\2\2\2ab\5\b\5\2bc\7>\2\2cd\7\r\2\2dj\3\2\2\2ef\5\b\5\2fg\7"+
		"\16\2\2gh\7>\2\2hj\3\2\2\2i^\3\2\2\2ia\3\2\2\2ie\3\2\2\2j\17\3\2\2\2k"+
		"o\7\17\2\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2"+
		"qo\3\2\2\2rs\7\20\2\2s\21\3\2\2\2tx\7\21\2\2uw\n\3\2\2vu\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\7\22\2\2|{\3\2\2\2|}\3"+
		"\2\2\2}~\3\2\2\2~\177\7\23\2\2\177\23\3\2\2\2\u0080\u0083\5\26\f\2\u0081"+
		"\u0083\5$\23\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\25\3\2\2"+
		"\2\u0084\u0085\7>\2\2\u0085\u0086\7\4\2\2\u0086\u00b5\5\24\13\2\u0087"+
		"\u0088\7>\2\2\u0088\u0089\7\24\2\2\u0089\u00b5\5\24\13\2\u008a\u008b\7"+
		">\2\2\u008b\u008c\7\25\2\2\u008c\u00b5\5\24\13\2\u008d\u008e\7>\2\2\u008e"+
		"\u008f\7\26\2\2\u008f\u00b5\5\24\13\2\u0090\u0091\7>\2\2\u0091\u0092\7"+
		"\27\2\2\u0092\u00b5\5\24\13\2\u0093\u0094\7>\2\2\u0094\u0095\7\30\2\2"+
		"\u0095\u00b5\5\24\13\2\u0096\u0097\7>\2\2\u0097\u0098\7\31\2\2\u0098\u00b5"+
		"\5\24\13\2\u0099\u009a\7>\2\2\u009a\u009b\7\32\2\2\u009b\u00b5\5\24\13"+
		"\2\u009c\u009d\7>\2\2\u009d\u009e\7\4\2\2\u009e\u00b5\7>\2\2\u009f\u00a0"+
		"\7>\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00b5\7>\2\2\u00a2\u00a3\7>\2\2\u00a3"+
		"\u00a4\7\25\2\2\u00a4\u00b5\7>\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7\26"+
		"\2\2\u00a7\u00b5\7>\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7\27\2\2\u00aa"+
		"\u00b5\7>\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00b5\7>\2"+
		"\2\u00ae\u00af\7>\2\2\u00af\u00b0\7\31\2\2\u00b0\u00b5\7>\2\2\u00b1\u00b2"+
		"\7>\2\2\u00b2\u00b3\7\32\2\2\u00b3\u00b5\7>\2\2\u00b4\u0084\3\2\2\2\u00b4"+
		"\u0087\3\2\2\2\u00b4\u008a\3\2\2\2\u00b4\u008d\3\2\2\2\u00b4\u0090\3\2"+
		"\2\2\u00b4\u0093\3\2\2\2\u00b4\u0096\3\2\2\2\u00b4\u0099\3\2\2\2\u00b4"+
		"\u009c\3\2\2\2\u00b4\u009f\3\2\2\2\u00b4\u00a2\3\2\2\2\u00b4\u00a5\3\2"+
		"\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4"+
		"\u00b1\3\2\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\7\33\2\2\u00b7\u00b8\7\n\2"+
		"\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\13\2\2\u00ba\u00bb\5\20\t\2\u00bb"+
		"\u00e3\3\2\2\2\u00bc\u00bd\7\33\2\2\u00bd\u00be\7\n\2\2\u00be\u00bf\5"+
		"\24\13\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1\5\20\t\2\u00c1\u00c2\7\34\2"+
		"\2\u00c2\u00c3\5\20\t\2\u00c3\u00e3\3\2\2\2\u00c4\u00c5\7\35\2\2\u00c5"+
		"\u00c6\7\n\2\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9"+
		"\5\20\t\2\u00c9\u00e3\3\2\2\2\u00ca\u00cb\7\36\2\2\u00cb\u00cc\7\n\2\2"+
		"\u00cc\u00cd\5\24\13\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5\24\13\2\u00cf"+
		"\u00d0\7\3\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7\13\2\2\u00d2\u00d3"+
		"\5\20\t\2\u00d3\u00e3\3\2\2\2\u00d4\u00d5\7\37\2\2\u00d5\u00d6\7\n\2\2"+
		"\u00d6\u00d7\5\24\13\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\5\32\16\2\u00d9"+
		"\u00e3\3\2\2\2\u00da\u00db\7 \2\2\u00db\u00e3\7\3\2\2\u00dc\u00dd\7!\2"+
		"\2\u00dd\u00e3\7\3\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\5\24\13\2\u00e0"+
		"\u00e1\7\3\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00b6\3\2\2\2\u00e2\u00bc\3\2"+
		"\2\2\u00e2\u00c4\3\2\2\2\u00e2\u00ca\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2"+
		"\u00da\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\31\3\2\2"+
		"\2\u00e4\u00e6\5\34\17\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\33\3\2\2\2\u00e9\u00e7\3\2\2"+
		"\2\u00ea\u00eb\7#\2\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed\7$\2\2\u00ed\u00ee"+
		"\5\20\t\2\u00ee\u00f3\3\2\2\2\u00ef\u00f0\7%\2\2\u00f0\u00f1\7$\2\2\u00f1"+
		"\u00f3\5\20\t\2\u00f2\u00ea\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\35\3\2\2"+
		"\2\u00f4\u00f5\7&\2\2\u00f5\u00f6\7>\2\2\u00f6\u00fa\7\17\2\2\u00f7\u00f9"+
		"\5\6\4\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\20"+
		"\2\2\u00fe\37\3\2\2\2\u00ff\u0100\7>\2\2\u0100\u0101\7\'\2\2\u0101\u0102"+
		"\5\24\13\2\u0102\u0103\7(\2\2\u0103\u0108\3\2\2\2\u0104\u0105\7>\2\2\u0105"+
		"\u0106\7\'\2\2\u0106\u0108\7(\2\2\u0107\u00ff\3\2\2\2\u0107\u0104\3\2"+
		"\2\2\u0108!\3\2\2\2\u0109\u010a\7\17\2\2\u010a\u010b\5\62\32\2\u010b\u010c"+
		"\7\20\2\2\u010c#\3\2\2\2\u010d\u010e\b\23\1\2\u010e\u0112\5&\24\2\u010f"+
		"\u0110\7+\2\2\u0110\u0112\5&\24\2\u0111\u010d\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u011b\3\2\2\2\u0113\u0114\f\5\2\2\u0114\u0115\7)\2\2\u0115"+
		"\u011a\5&\24\2\u0116\u0117\f\4\2\2\u0117\u0118\7*\2\2\u0118\u011a\5&\24"+
		"\2\u0119\u0113\3\2\2\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c%\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0138\5(\25\2\u011f\u0120\5(\25\2\u0120\u0121\7,\2\2\u0121\u0122\5(\25"+
		"\2\u0122\u0138\3\2\2\2\u0123\u0124\5(\25\2\u0124\u0125\7-\2\2\u0125\u0126"+
		"\5(\25\2\u0126\u0138\3\2\2\2\u0127\u0128\5(\25\2\u0128\u0129\7.\2\2\u0129"+
		"\u012a\5(\25\2\u012a\u0138\3\2\2\2\u012b\u012c\5(\25\2\u012c\u012d\7/"+
		"\2\2\u012d\u012e\5(\25\2\u012e\u0138\3\2\2\2\u012f\u0130\5(\25\2\u0130"+
		"\u0131\7\60\2\2\u0131\u0132\5(\25\2\u0132\u0138\3\2\2\2\u0133\u0134\5"+
		"(\25\2\u0134\u0135\7\61\2\2\u0135\u0136\5(\25\2\u0136\u0138\3\2\2\2\u0137"+
		"\u011e\3\2\2\2\u0137\u011f\3\2\2\2\u0137\u0123\3\2\2\2\u0137\u0127\3\2"+
		"\2\2\u0137\u012b\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0133\3\2\2\2\u0138"+
		"\'\3\2\2\2\u0139\u013a\b\25\1\2\u013a\u013b\5*\26\2\u013b\u0144\3\2\2"+
		"\2\u013c\u013d\f\4\2\2\u013d\u013e\7\62\2\2\u013e\u0143\5*\26\2\u013f"+
		"\u0140\f\3\2\2\u0140\u0141\7\63\2\2\u0141\u0143\5*\26\2\u0142\u013c\3"+
		"\2\2\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145)\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\b\26\1\2"+
		"\u0148\u0149\5,\27\2\u0149\u0155\3\2\2\2\u014a\u014b\f\5\2\2\u014b\u014c"+
		"\7\64\2\2\u014c\u0154\5,\27\2\u014d\u014e\f\4\2\2\u014e\u014f\7\65\2\2"+
		"\u014f\u0154\5,\27\2\u0150\u0151\f\3\2\2\u0151\u0152\7\66\2\2\u0152\u0154"+
		"\5,\27\2\u0153\u014a\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0150\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156+\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0158\u0160\5.\30\2\u0159\u015a\7\63\2\2\u015a\u0160"+
		"\5,\27\2\u015b\u015c\7\67\2\2\u015c\u0160\5.\30\2\u015d\u015e\78\2\2\u015e"+
		"\u0160\5.\30\2\u015f\u0158\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015b\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160-\3\2\2\2\u0161\u0175\5\64\33\2\u0162\u0163"+
		"\5\64\33\2\u0163\u0164\7\'\2\2\u0164\u0165\5\24\13\2\u0165\u0166\7(\2"+
		"\2\u0166\u0175\3\2\2\2\u0167\u0168\5\64\33\2\u0168\u0169\7\n\2\2\u0169"+
		"\u016a\5\60\31\2\u016a\u016b\7\13\2\2\u016b\u0175\3\2\2\2\u016c\u016d"+
		"\5\64\33\2\u016d\u016e\79\2\2\u016e\u016f\7>\2\2\u016f\u0175\3\2\2\2\u0170"+
		"\u0171\5\64\33\2\u0171\u0172\7:\2\2\u0172\u0173\7>\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0161\3\2\2\2\u0174\u0162\3\2\2\2\u0174\u0167\3\2\2\2\u0174"+
		"\u016c\3\2\2\2\u0174\u0170\3\2\2\2\u0175/\3\2\2\2\u0176\u0179\5\62\32"+
		"\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\61"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\63\3\2\2\2\u017c\u0185\7>\2\2\u017d"+
		"\u0185\7;\2\2\u017e\u0185\7<\2\2\u017f\u0185\7=\2\2\u0180\u0181\7\n\2"+
		"\2\u0181\u0182\5\24\13\2\u0182\u0183\7\13\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u017c\3\2\2\2\u0184\u017d\3\2\2\2\u0184\u017e\3\2\2\2\u0184\u017f\3\2"+
		"\2\2\u0184\u0180\3\2\2\2\u0185\65\3\2\2\2\359@L\\iox|\u0082\u00b4\u00e2"+
		"\u00e7\u00f2\u00fa\u0107\u0111\u0119\u011b\u0137\u0142\u0144\u0153\u0155"+
		"\u015f\u0174\u0178\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}