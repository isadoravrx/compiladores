// Generated from /home/isadoravrx/compiladores/Projeto_2/grammar_file.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class grammar_fileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
			"'('", "')'", "','", "'[]'", "'...'", "'{'", "'}'", "'//'", "'\\r'", 
			"'\\n'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", "'||='", "'if'", 
			"'else'", "'while'", "'for'", "'switch'", "'break'", "'continue'", "'return'", 
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719509752L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719509752L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009213497342L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammar_fileParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayinicializacaoContext extends ParserRuleContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ArrayinicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayinicializacao; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoListaContext extends ParserRuleContext {
		public ExpressaoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLista; }
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

	@SuppressWarnings("CheckReturnValue")
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
		"\u0004\u0001<\u0185\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005[\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006h\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007l\b\u0007\n\u0007\f\u0007o\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bu\b\b\n\b\f\bx\t\b\u0001"+
		"\b\u0003\b{\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0081\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00b3\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00e1\b\u000b\u0001\f\u0005\f\u00e4\b\f\n\f\f\f\u00e7\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f1\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00f7\b\u000e\n"+
		"\u000e\f\u000e\u00fa\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0106\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0110"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0118\b\u0011\n\u0011\f\u0011\u011b\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0136\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0141\b\u0013\n\u0013\f\u0013\u0144\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0152\b\u0014\n"+
		"\u0014\f\u0014\u0155\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u015e\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0173\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0177"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0183"+
		"\b\u0019\u0001\u0019\u0000\u0003\"&(\u001a\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000"+
		"\u0002\u0001\u0000\u0003\u0007\u0001\u0000\u0010\u0011\u01aa\u00007\u0001"+
		"\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000"+
		"\u0000\u0006L\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nZ\u0001"+
		"\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000"+
		"\u0000\u0010r\u0001\u0000\u0000\u0000\u0012\u0080\u0001\u0000\u0000\u0000"+
		"\u0014\u00b2\u0001\u0000\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000"+
		"\u0018\u00e5\u0001\u0000\u0000\u0000\u001a\u00f0\u0001\u0000\u0000\u0000"+
		"\u001c\u00f2\u0001\u0000\u0000\u0000\u001e\u0105\u0001\u0000\u0000\u0000"+
		" \u0107\u0001\u0000\u0000\u0000\"\u010f\u0001\u0000\u0000\u0000$\u0135"+
		"\u0001\u0000\u0000\u0000&\u0137\u0001\u0000\u0000\u0000(\u0145\u0001\u0000"+
		"\u0000\u0000*\u015d\u0001\u0000\u0000\u0000,\u0172\u0001\u0000\u0000\u0000"+
		".\u0176\u0001\u0000\u0000\u00000\u0178\u0001\u0000\u0000\u00002\u0182"+
		"\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008\u0001\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":?\u0003\u0004\u0002\u0000;?\u0003\b\u0004\u0000<?\u0003\u001c\u000e\u0000"+
		"=?\u0003\u0010\b\u0000>:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\u0003\u0001\u0000"+
		"\u0000\u0000@A\u0003\u0006\u0003\u0000AB\u0005<\u0000\u0000BC\u0005\u0001"+
		"\u0000\u0000CK\u0001\u0000\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0005"+
		"<\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0003\u0012\t\u0000HI\u0005"+
		"\u0001\u0000\u0000IK\u0001\u0000\u0000\u0000J@\u0001\u0000\u0000\u0000"+
		"JD\u0001\u0000\u0000\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0007\u0000"+
		"\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0003\u0006\u0003\u0000"+
		"OP\u0005<\u0000\u0000PQ\u0005\b\u0000\u0000QR\u0003\n\u0005\u0000RS\u0005"+
		"\t\u0000\u0000ST\u0003\u000e\u0007\u0000T\t\u0001\u0000\u0000\u0000U["+
		"\u0003\f\u0006\u0000VW\u0003\f\u0006\u0000WX\u0005\n\u0000\u0000XY\u0003"+
		"\n\u0005\u0000Y[\u0001\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000ZV\u0001"+
		"\u0000\u0000\u0000[\u000b\u0001\u0000\u0000\u0000\\]\u0003\u0006\u0003"+
		"\u0000]^\u0005<\u0000\u0000^h\u0001\u0000\u0000\u0000_`\u0003\u0006\u0003"+
		"\u0000`a\u0005<\u0000\u0000ab\u0005\u000b\u0000\u0000bh\u0001\u0000\u0000"+
		"\u0000cd\u0003\u0006\u0003\u0000de\u0005\f\u0000\u0000ef\u0005<\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000g\\\u0001\u0000\u0000\u0000g_\u0001\u0000"+
		"\u0000\u0000gc\u0001\u0000\u0000\u0000h\r\u0001\u0000\u0000\u0000im\u0005"+
		"\r\u0000\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u000e\u0000"+
		"\u0000q\u000f\u0001\u0000\u0000\u0000rv\u0005\u000f\u0000\u0000su\b\u0001"+
		"\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000y{\u0005\u0010\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0011"+
		"\u0000\u0000}\u0011\u0001\u0000\u0000\u0000~\u0081\u0003\u0014\n\u0000"+
		"\u007f\u0081\u0003\"\u0011\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005<\u0000\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u00b3"+
		"\u0003\u0012\t\u0000\u0085\u0086\u0005<\u0000\u0000\u0086\u0087\u0005"+
		"\u0012\u0000\u0000\u0087\u00b3\u0003\u0012\t\u0000\u0088\u0089\u0005<"+
		"\u0000\u0000\u0089\u008a\u0005\u0013\u0000\u0000\u008a\u00b3\u0003\u0012"+
		"\t\u0000\u008b\u008c\u0005<\u0000\u0000\u008c\u008d\u0005\u0014\u0000"+
		"\u0000\u008d\u00b3\u0003\u0012\t\u0000\u008e\u008f\u0005<\u0000\u0000"+
		"\u008f\u0090\u0005\u0015\u0000\u0000\u0090\u00b3\u0003\u0012\t\u0000\u0091"+
		"\u0092\u0005<\u0000\u0000\u0092\u0093\u0005\u0016\u0000\u0000\u0093\u00b3"+
		"\u0003\u0012\t\u0000\u0094\u0095\u0005<\u0000\u0000\u0095\u0096\u0005"+
		"\u0017\u0000\u0000\u0096\u00b3\u0003\u0012\t\u0000\u0097\u0098\u0005<"+
		"\u0000\u0000\u0098\u0099\u0005\u0018\u0000\u0000\u0099\u00b3\u0003\u0012"+
		"\t\u0000\u009a\u009b\u0005<\u0000\u0000\u009b\u009c\u0005\u0002\u0000"+
		"\u0000\u009c\u00b3\u0005<\u0000\u0000\u009d\u009e\u0005<\u0000\u0000\u009e"+
		"\u009f\u0005\u0012\u0000\u0000\u009f\u00b3\u0005<\u0000\u0000\u00a0\u00a1"+
		"\u0005<\u0000\u0000\u00a1\u00a2\u0005\u0013\u0000\u0000\u00a2\u00b3\u0005"+
		"<\u0000\u0000\u00a3\u00a4\u0005<\u0000\u0000\u00a4\u00a5\u0005\u0014\u0000"+
		"\u0000\u00a5\u00b3\u0005<\u0000\u0000\u00a6\u00a7\u0005<\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0015\u0000\u0000\u00a8\u00b3\u0005<\u0000\u0000\u00a9\u00aa"+
		"\u0005<\u0000\u0000\u00aa\u00ab\u0005\u0016\u0000\u0000\u00ab\u00b3\u0005"+
		"<\u0000\u0000\u00ac\u00ad\u0005<\u0000\u0000\u00ad\u00ae\u0005\u0017\u0000"+
		"\u0000\u00ae\u00b3\u0005<\u0000\u0000\u00af\u00b0\u0005<\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0018\u0000\u0000\u00b1\u00b3\u0005<\u0000\u0000\u00b2\u0082"+
		"\u0001\u0000\u0000\u0000\u00b2\u0085\u0001\u0000\u0000\u0000\u00b2\u0088"+
		"\u0001\u0000\u0000\u0000\u00b2\u008b\u0001\u0000\u0000\u0000\u00b2\u008e"+
		"\u0001\u0000\u0000\u0000\u00b2\u0091\u0001\u0000\u0000\u0000\u00b2\u0094"+
		"\u0001\u0000\u0000\u0000\u00b2\u0097\u0001\u0000\u0000\u0000\u00b2\u009a"+
		"\u0001\u0000\u0000\u0000\u00b2\u009d\u0001\u0000\u0000\u0000\u00b2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00a3\u0001\u0000\u0000\u0000\u00b2\u00a6"+
		"\u0001\u0000\u0000\u0000\u00b2\u00a9\u0001\u0000\u0000\u0000\u00b2\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3\u0015"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0019\u0000\u0000\u00b5\u00b6"+
		"\u0005\b\u0000\u0000\u00b6\u00b7\u0003\u0012\t\u0000\u00b7\u00b8\u0005"+
		"\t\u0000\u0000\u00b8\u00b9\u0003\u000e\u0007\u0000\u00b9\u00e1\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0019\u0000\u0000\u00bb\u00bc\u0005\b\u0000"+
		"\u0000\u00bc\u00bd\u0003\u0012\t\u0000\u00bd\u00be\u0005\t\u0000\u0000"+
		"\u00be\u00bf\u0003\u000e\u0007\u0000\u00bf\u00c0\u0005\u001a\u0000\u0000"+
		"\u00c0\u00c1\u0003\u000e\u0007\u0000\u00c1\u00e1\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u001b\u0000\u0000\u00c3\u00c4\u0005\b\u0000\u0000\u00c4"+
		"\u00c5\u0003\u0012\t\u0000\u00c5\u00c6\u0005\t\u0000\u0000\u00c6\u00c7"+
		"\u0003\u000e\u0007\u0000\u00c7\u00e1\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0005\u001c\u0000\u0000\u00c9\u00ca\u0005\b\u0000\u0000\u00ca\u00cb\u0003"+
		"\u0012\t\u0000\u00cb\u00cc\u0005\u0001\u0000\u0000\u00cc\u00cd\u0003\u0012"+
		"\t\u0000\u00cd\u00ce\u0005\u0001\u0000\u0000\u00ce\u00cf\u0003\u0012\t"+
		"\u0000\u00cf\u00d0\u0005\t\u0000\u0000\u00d0\u00d1\u0003\u000e\u0007\u0000"+
		"\u00d1\u00e1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001d\u0000\u0000"+
		"\u00d3\u00d4\u0005\b\u0000\u0000\u00d4\u00d5\u0003\u0012\t\u0000\u00d5"+
		"\u00d6\u0005\t\u0000\u0000\u00d6\u00d7\u0003\u0018\f\u0000\u00d7\u00e1"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u001e\u0000\u0000\u00d9\u00e1"+
		"\u0005\u0001\u0000\u0000\u00da\u00db\u0005\u001f\u0000\u0000\u00db\u00e1"+
		"\u0005\u0001\u0000\u0000\u00dc\u00dd\u0005 \u0000\u0000\u00dd\u00de\u0003"+
		"\u0012\t\u0000\u00de\u00df\u0005\u0001\u0000\u0000\u00df\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e0\u00b4\u0001\u0000\u0000\u0000\u00e0\u00ba\u0001\u0000"+
		"\u0000\u0000\u00e0\u00c2\u0001\u0000\u0000\u0000\u00e0\u00c8\u0001\u0000"+
		"\u0000\u0000\u00e0\u00d2\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000"+
		"\u0000\u0000\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000"+
		"\u0000\u0000\u00e1\u0017\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\u001a"+
		"\r\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u0019\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005!\u0000\u0000\u00e9\u00ea\u0003\u0012\t\u0000"+
		"\u00ea\u00eb\u0005\"\u0000\u0000\u00eb\u00ec\u0003\u000e\u0007\u0000\u00ec"+
		"\u00f1\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005#\u0000\u0000\u00ee\u00ef"+
		"\u0005\"\u0000\u0000\u00ef\u00f1\u0003\u000e\u0007\u0000\u00f0\u00e8\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f1\u001b\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005$\u0000\u0000\u00f3\u00f4\u0005<\u0000"+
		"\u0000\u00f4\u00f8\u0005\r\u0000\u0000\u00f5\u00f7\u0003\u0004\u0002\u0000"+
		"\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005\u000e\u0000\u0000\u00fc\u001d\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005<\u0000\u0000\u00fe\u00ff\u0005%\u0000\u0000\u00ff\u0100"+
		"\u0003\u0012\t\u0000\u0100\u0101\u0005&\u0000\u0000\u0101\u0106\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005<\u0000\u0000\u0103\u0104\u0005%\u0000"+
		"\u0000\u0104\u0106\u0005&\u0000\u0000\u0105\u00fd\u0001\u0000\u0000\u0000"+
		"\u0105\u0102\u0001\u0000\u0000\u0000\u0106\u001f\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0005\r\u0000\u0000\u0108\u0109\u00030\u0018\u0000\u0109"+
		"\u010a\u0005\u000e\u0000\u0000\u010a!\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0006\u0011\uffff\uffff\u0000\u010c\u0110\u0003$\u0012\u0000\u010d\u010e"+
		"\u0005)\u0000\u0000\u010e\u0110\u0003$\u0012\u0000\u010f\u010b\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0119\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\n\u0003\u0000\u0000\u0112\u0113\u0005\'\u0000"+
		"\u0000\u0113\u0118\u0003$\u0012\u0000\u0114\u0115\n\u0002\u0000\u0000"+
		"\u0115\u0116\u0005(\u0000\u0000\u0116\u0118\u0003$\u0012\u0000\u0117\u0111"+
		"\u0001\u0000\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0118\u011b"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a#\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011c\u0136\u0003&\u0013\u0000\u011d\u011e\u0003&\u0013"+
		"\u0000\u011e\u011f\u0005*\u0000\u0000\u011f\u0120\u0003&\u0013\u0000\u0120"+
		"\u0136\u0001\u0000\u0000\u0000\u0121\u0122\u0003&\u0013\u0000\u0122\u0123"+
		"\u0005+\u0000\u0000\u0123\u0124\u0003&\u0013\u0000\u0124\u0136\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0003&\u0013\u0000\u0126\u0127\u0005,\u0000\u0000"+
		"\u0127\u0128\u0003&\u0013\u0000\u0128\u0136\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0003&\u0013\u0000\u012a\u012b\u0005-\u0000\u0000\u012b\u012c\u0003"+
		"&\u0013\u0000\u012c\u0136\u0001\u0000\u0000\u0000\u012d\u012e\u0003&\u0013"+
		"\u0000\u012e\u012f\u0005.\u0000\u0000\u012f\u0130\u0003&\u0013\u0000\u0130"+
		"\u0136\u0001\u0000\u0000\u0000\u0131\u0132\u0003&\u0013\u0000\u0132\u0133"+
		"\u0005/\u0000\u0000\u0133\u0134\u0003&\u0013\u0000\u0134\u0136\u0001\u0000"+
		"\u0000\u0000\u0135\u011c\u0001\u0000\u0000\u0000\u0135\u011d\u0001\u0000"+
		"\u0000\u0000\u0135\u0121\u0001\u0000\u0000\u0000\u0135\u0125\u0001\u0000"+
		"\u0000\u0000\u0135\u0129\u0001\u0000\u0000\u0000\u0135\u012d\u0001\u0000"+
		"\u0000\u0000\u0135\u0131\u0001\u0000\u0000\u0000\u0136%\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0006\u0013\uffff\uffff\u0000\u0138\u0139\u0003(\u0014"+
		"\u0000\u0139\u0142\u0001\u0000\u0000\u0000\u013a\u013b\n\u0002\u0000\u0000"+
		"\u013b\u013c\u00050\u0000\u0000\u013c\u0141\u0003(\u0014\u0000\u013d\u013e"+
		"\n\u0001\u0000\u0000\u013e\u013f\u00051\u0000\u0000\u013f\u0141\u0003"+
		"(\u0014\u0000\u0140\u013a\u0001\u0000\u0000\u0000\u0140\u013d\u0001\u0000"+
		"\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\'\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0006\u0014\uffff"+
		"\uffff\u0000\u0146\u0147\u0003*\u0015\u0000\u0147\u0153\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\n\u0003\u0000\u0000\u0149\u014a\u00052\u0000\u0000"+
		"\u014a\u0152\u0003*\u0015\u0000\u014b\u014c\n\u0002\u0000\u0000\u014c"+
		"\u014d\u00053\u0000\u0000\u014d\u0152\u0003*\u0015\u0000\u014e\u014f\n"+
		"\u0001\u0000\u0000\u014f\u0150\u00054\u0000\u0000\u0150\u0152\u0003*\u0015"+
		"\u0000\u0151\u0148\u0001\u0000\u0000\u0000\u0151\u014b\u0001\u0000\u0000"+
		"\u0000\u0151\u014e\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154)\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0156\u015e\u0003,\u0016\u0000\u0157\u0158\u00051\u0000\u0000\u0158\u015e"+
		"\u0003*\u0015\u0000\u0159\u015a\u00055\u0000\u0000\u015a\u015e\u0003,"+
		"\u0016\u0000\u015b\u015c\u00056\u0000\u0000\u015c\u015e\u0003,\u0016\u0000"+
		"\u015d\u0156\u0001\u0000\u0000\u0000\u015d\u0157\u0001\u0000\u0000\u0000"+
		"\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015e+\u0001\u0000\u0000\u0000\u015f\u0173\u00032\u0019\u0000\u0160\u0161"+
		"\u00032\u0019\u0000\u0161\u0162\u0005%\u0000\u0000\u0162\u0163\u0003\u0012"+
		"\t\u0000\u0163\u0164\u0005&\u0000\u0000\u0164\u0173\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u00032\u0019\u0000\u0166\u0167\u0005\b\u0000\u0000"+
		"\u0167\u0168\u0003.\u0017\u0000\u0168\u0169\u0005\t\u0000\u0000\u0169"+
		"\u0173\u0001\u0000\u0000\u0000\u016a\u016b\u00032\u0019\u0000\u016b\u016c"+
		"\u00057\u0000\u0000\u016c\u016d\u0005<\u0000\u0000\u016d\u0173\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u00032\u0019\u0000\u016f\u0170\u00058\u0000\u0000"+
		"\u0170\u0171\u0005<\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172"+
		"\u015f\u0001\u0000\u0000\u0000\u0172\u0160\u0001\u0000\u0000\u0000\u0172"+
		"\u0165\u0001\u0000\u0000\u0000\u0172\u016a\u0001\u0000\u0000\u0000\u0172"+
		"\u016e\u0001\u0000\u0000\u0000\u0173-\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u00030\u0018\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174\u0001"+
		"\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177/\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u01791\u0001\u0000\u0000"+
		"\u0000\u017a\u0183\u0005<\u0000\u0000\u017b\u0183\u00059\u0000\u0000\u017c"+
		"\u0183\u0005:\u0000\u0000\u017d\u0183\u0005;\u0000\u0000\u017e\u017f\u0005"+
		"\b\u0000\u0000\u017f\u0180\u0003\u0012\t\u0000\u0180\u0181\u0005\t\u0000"+
		"\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u017a\u0001\u0000\u0000"+
		"\u0000\u0182\u017b\u0001\u0000\u0000\u0000\u0182\u017c\u0001\u0000\u0000"+
		"\u0000\u0182\u017d\u0001\u0000\u0000\u0000\u0182\u017e\u0001\u0000\u0000"+
		"\u0000\u01833\u0001\u0000\u0000\u0000\u001b7>JZgmvz\u0080\u00b2\u00e0"+
		"\u00e5\u00f0\u00f8\u0105\u010f\u0117\u0119\u0135\u0140\u0142\u0151\u0153"+
		"\u015d\u0172\u0176\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}