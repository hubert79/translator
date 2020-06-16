// Generated from gramatyka.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramatykaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, ModyfikatorKlasy=33, INT=34, ID=35, WS=36;
	public static final int
		RULE_kompilacja = 0, RULE_deklaracjiaPaczki = 1, RULE_deklaracjaImportu = 2, 
		RULE_typDeklaracji = 3, RULE_deklaracjaKlasy = 4, RULE_cialoKlasy = 5, 
		RULE_wnetrze = 6, RULE_deklaracjaMetody = 7, RULE_deklaracjaSkladowych = 8, 
		RULE_modyfikator = 9, RULE_stala = 10, RULE_parametrMetody = 11, RULE_deklaracjaParametrowMetod = 12, 
		RULE_cialoMetody = 13, RULE_deklaracjaZmiennej = 14, RULE_instrukcja = 15, 
		RULE_inicjalizaacjaZmiennej = 16, RULE_typ = 17, RULE_komunikat = 18, 
		RULE_wyrazenie = 19, RULE_dubwyrazenie = 20, RULE_literal = 21, RULE_typPrymitywny = 22, 
		RULE_nazwaKlasy = 23, RULE_nazwaMetody = 24, RULE_nazwa = 25, RULE_nazwaZmiennej = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"kompilacja", "deklaracjiaPaczki", "deklaracjaImportu", "typDeklaracji", 
			"deklaracjaKlasy", "cialoKlasy", "wnetrze", "deklaracjaMetody", "deklaracjaSkladowych", 
			"modyfikator", "stala", "parametrMetody", "deklaracjaParametrowMetod", 
			"cialoMetody", "deklaracjaZmiennej", "instrukcja", "inicjalizaacjaZmiennej", 
			"typ", "komunikat", "wyrazenie", "dubwyrazenie", "literal", "typPrymitywny", 
			"nazwaKlasy", "nazwaMetody", "nazwa", "nazwaZmiennej"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "';'", "'import'", "'static'", "'.'", "'*'", "'class'", 
			"'{'", "'}'", "'['", "']'", "'private'", "'static final'", "'final static'", 
			"'('", "')'", "','", "'='", "'''", "'void'", "'return'", "'if'", "'else {'", 
			"'+'", "'-'", "'/'", "'=='", "'!='", "'null'", "'char'", "'int'", "'float'", 
			"'public'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ModyfikatorKlasy", 
			"INT", "ID", "WS"
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
	public String getGrammarFileName() { return "gramatyka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramatykaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class KompilacjaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gramatykaParser.EOF, 0); }
		public DeklaracjiaPaczkiContext deklaracjiaPaczki() {
			return getRuleContext(DeklaracjiaPaczkiContext.class,0);
		}
		public List<DeklaracjaImportuContext> deklaracjaImportu() {
			return getRuleContexts(DeklaracjaImportuContext.class);
		}
		public DeklaracjaImportuContext deklaracjaImportu(int i) {
			return getRuleContext(DeklaracjaImportuContext.class,i);
		}
		public List<TypDeklaracjiContext> typDeklaracji() {
			return getRuleContexts(TypDeklaracjiContext.class);
		}
		public TypDeklaracjiContext typDeklaracji(int i) {
			return getRuleContext(TypDeklaracjiContext.class,i);
		}
		public KompilacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kompilacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterKompilacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitKompilacja(this);
		}
	}

	public final KompilacjaContext kompilacja() throws RecognitionException {
		KompilacjaContext _localctx = new KompilacjaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kompilacja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(54);
				deklaracjiaPaczki();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(57);
				deklaracjaImportu();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << ModyfikatorKlasy))) != 0)) {
				{
				{
				setState(63);
				typDeklaracji();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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

	public static class DeklaracjiaPaczkiContext extends ParserRuleContext {
		public NazwaContext nazwa() {
			return getRuleContext(NazwaContext.class,0);
		}
		public DeklaracjiaPaczkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracjiaPaczki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDeklaracjiaPaczki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDeklaracjiaPaczki(this);
		}
	}

	public final DeklaracjiaPaczkiContext deklaracjiaPaczki() throws RecognitionException {
		DeklaracjiaPaczkiContext _localctx = new DeklaracjiaPaczkiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_deklaracjiaPaczki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			nazwa();
			setState(73);
			match(T__1);
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

	public static class DeklaracjaImportuContext extends ParserRuleContext {
		public NazwaContext nazwa() {
			return getRuleContext(NazwaContext.class,0);
		}
		public DeklaracjaImportuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracjaImportu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDeklaracjaImportu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDeklaracjaImportu(this);
		}
	}

	public final DeklaracjaImportuContext deklaracjaImportu() throws RecognitionException {
		DeklaracjaImportuContext _localctx = new DeklaracjaImportuContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_deklaracjaImportu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__2);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(76);
				match(T__3);
				}
			}

			setState(79);
			nazwa();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(80);
				match(T__4);
				setState(81);
				match(T__5);
				}
			}

			setState(84);
			match(T__1);
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

	public static class TypDeklaracjiContext extends ParserRuleContext {
		public DeklaracjaKlasyContext deklaracjaKlasy() {
			return getRuleContext(DeklaracjaKlasyContext.class,0);
		}
		public List<TerminalNode> ModyfikatorKlasy() { return getTokens(gramatykaParser.ModyfikatorKlasy); }
		public TerminalNode ModyfikatorKlasy(int i) {
			return getToken(gramatykaParser.ModyfikatorKlasy, i);
		}
		public TypDeklaracjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typDeklaracji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterTypDeklaracji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitTypDeklaracji(this);
		}
	}

	public final TypDeklaracjiContext typDeklaracji() throws RecognitionException {
		TypDeklaracjiContext _localctx = new TypDeklaracjiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typDeklaracji);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case ModyfikatorKlasy:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ModyfikatorKlasy) {
					{
					{
					setState(86);
					match(ModyfikatorKlasy);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(92);
				deklaracjaKlasy();
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__1);
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

	public static class DeklaracjaKlasyContext extends ParserRuleContext {
		public NazwaKlasyContext nazwaKlasy() {
			return getRuleContext(NazwaKlasyContext.class,0);
		}
		public CialoKlasyContext cialoKlasy() {
			return getRuleContext(CialoKlasyContext.class,0);
		}
		public DeklaracjaKlasyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracjaKlasy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDeklaracjaKlasy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDeklaracjaKlasy(this);
		}
	}

	public final DeklaracjaKlasyContext deklaracjaKlasy() throws RecognitionException {
		DeklaracjaKlasyContext _localctx = new DeklaracjaKlasyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deklaracjaKlasy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__6);
			setState(97);
			nazwaKlasy();
			setState(98);
			match(T__7);
			setState(99);
			cialoKlasy();
			setState(100);
			match(T__8);
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

	public static class CialoKlasyContext extends ParserRuleContext {
		public List<WnetrzeContext> wnetrze() {
			return getRuleContexts(WnetrzeContext.class);
		}
		public WnetrzeContext wnetrze(int i) {
			return getRuleContext(WnetrzeContext.class,i);
		}
		public CialoKlasyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cialoKlasy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterCialoKlasy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitCialoKlasy(this);
		}
	}

	public final CialoKlasyContext cialoKlasy() throws RecognitionException {
		CialoKlasyContext _localctx = new CialoKlasyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cialoKlasy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << ModyfikatorKlasy))) != 0)) {
				{
				{
				setState(102);
				wnetrze();
				}
				}
				setState(107);
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

	public static class WnetrzeContext extends ParserRuleContext {
		public DeklaracjaMetodyContext deklaracjaMetody() {
			return getRuleContext(DeklaracjaMetodyContext.class,0);
		}
		public DeklaracjaSkladowychContext deklaracjaSkladowych() {
			return getRuleContext(DeklaracjaSkladowychContext.class,0);
		}
		public WnetrzeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wnetrze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterWnetrze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitWnetrze(this);
		}
	}

	public final WnetrzeContext wnetrze() throws RecognitionException {
		WnetrzeContext _localctx = new WnetrzeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_wnetrze);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				deklaracjaMetody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				deklaracjaSkladowych();
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

	public static class DeklaracjaMetodyContext extends ParserRuleContext {
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public NazwaMetodyContext nazwaMetody() {
			return getRuleContext(NazwaMetodyContext.class,0);
		}
		public ParametrMetodyContext parametrMetody() {
			return getRuleContext(ParametrMetodyContext.class,0);
		}
		public CialoMetodyContext cialoMetody() {
			return getRuleContext(CialoMetodyContext.class,0);
		}
		public ModyfikatorContext modyfikator() {
			return getRuleContext(ModyfikatorContext.class,0);
		}
		public DeklaracjaMetodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracjaMetody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDeklaracjaMetody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDeklaracjaMetody(this);
		}
	}

	public final DeklaracjaMetodyContext deklaracjaMetody() throws RecognitionException {
		DeklaracjaMetodyContext _localctx = new DeklaracjaMetodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deklaracjaMetody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==ModyfikatorKlasy) {
				{
				setState(112);
				modyfikator();
				}
			}

			setState(115);
			typ();
			setState(116);
			nazwaMetody();
			setState(117);
			parametrMetody();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(118);
				match(T__9);
				setState(119);
				match(T__10);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			cialoMetody();
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

	public static class DeklaracjaSkladowychContext extends ParserRuleContext {
		public DeklaracjaZmiennejContext deklaracjaZmiennej() {
			return getRuleContext(DeklaracjaZmiennejContext.class,0);
		}
		public ModyfikatorContext modyfikator() {
			return getRuleContext(ModyfikatorContext.class,0);
		}
		public StalaContext stala() {
			return getRuleContext(StalaContext.class,0);
		}
		public DeklaracjaSkladowychContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracjaSkladowych; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDeklaracjaSkladowych(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDeklaracjaSkladowych(this);
		}
	}

	public final DeklaracjaSkladowychContext deklaracjaSkladowych() throws RecognitionException {
		DeklaracjaSkladowychContext _localctx = new DeklaracjaSkladowychContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_deklaracjaSkladowych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==ModyfikatorKlasy) {
				{
				setState(127);
				modyfikator();
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(130);
				stala();
				}
			}

			setState(133);
			deklaracjaZmiennej();
			setState(134);
			match(T__1);
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

	public static class ModyfikatorContext extends ParserRuleContext {
		public TerminalNode ModyfikatorKlasy() { return getToken(gramatykaParser.ModyfikatorKlasy, 0); }
		public ModyfikatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modyfikator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterModyfikator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitModyfikator(this);
		}
	}

	public final ModyfikatorContext modyfikator() throws RecognitionException {
		ModyfikatorContext _localctx = new ModyfikatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modyfikator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==ModyfikatorKlasy) ) {
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

	public static class StalaContext extends ParserRuleContext {
		public StalaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stala; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterStala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitStala(this);
		}
	}

	public final StalaContext stala() throws RecognitionException {
		StalaContext _localctx = new StalaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stala);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static class ParametrMetodyContext extends ParserRuleContext {
		public DeklaracjaParametrowMetodContext deklaracjaParametrowMetod() {
			return getRuleContext(DeklaracjaParametrowMetodContext.class,0);
		}
		public ParametrMetodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrMetody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterParametrMetody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitParametrMetody(this);
		}
	}

	public final ParametrMetodyContext parametrMetody() throws RecognitionException {
		ParametrMetodyContext _localctx = new ParametrMetodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametrMetody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__14);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				setState(141);
				deklaracjaParametrowMetod();
				}
			}

			setState(144);
			match(T__15);
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

	public static class DeklaracjaParametrowMetodContext extends ParserRuleContext {
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public NazwaZmiennejContext nazwaZmiennej() {
			return getRuleContext(NazwaZmiennejContext.class,0);
		}
		public DeklaracjaParametrowMetodContext deklaracjaParametrowMetod() {
			return getRuleContext(DeklaracjaParametrowMetodContext.class,0);
		}
		public DeklaracjaParametrowMetodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracjaParametrowMetod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDeklaracjaParametrowMetod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDeklaracjaParametrowMetod(this);
		}
	}

	public final DeklaracjaParametrowMetodContext deklaracjaParametrowMetod() throws RecognitionException {
		DeklaracjaParametrowMetodContext _localctx = new DeklaracjaParametrowMetodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_deklaracjaParametrowMetod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			typ();
			setState(147);
			nazwaZmiennej();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(148);
				match(T__16);
				setState(149);
				deklaracjaParametrowMetod();
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

	public static class CialoMetodyContext extends ParserRuleContext {
		public List<InstrukcjaContext> instrukcja() {
			return getRuleContexts(InstrukcjaContext.class);
		}
		public InstrukcjaContext instrukcja(int i) {
			return getRuleContext(InstrukcjaContext.class,i);
		}
		public CialoMetodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cialoMetody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterCialoMetody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitCialoMetody(this);
		}
	}

	public final CialoMetodyContext cialoMetody() throws RecognitionException {
		CialoMetodyContext _localctx = new CialoMetodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cialoMetody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__7);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				instrukcja();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << INT) | (1L << ID))) != 0) );
			setState(158);
			match(T__8);
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

	public static class DeklaracjaZmiennejContext extends ParserRuleContext {
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public NazwaZmiennejContext nazwaZmiennej() {
			return getRuleContext(NazwaZmiennejContext.class,0);
		}
		public InicjalizaacjaZmiennejContext inicjalizaacjaZmiennej() {
			return getRuleContext(InicjalizaacjaZmiennejContext.class,0);
		}
		public DeklaracjaZmiennejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracjaZmiennej; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDeklaracjaZmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDeklaracjaZmiennej(this);
		}
	}

	public final DeklaracjaZmiennejContext deklaracjaZmiennej() throws RecognitionException {
		DeklaracjaZmiennejContext _localctx = new DeklaracjaZmiennejContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deklaracjaZmiennej);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			typ();
			setState(161);
			nazwaZmiennej();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(162);
				match(T__17);
				setState(163);
				inicjalizaacjaZmiennej();
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

	public static class InstrukcjaContext extends ParserRuleContext {
		public DeklaracjaZmiennejContext deklaracjaZmiennej() {
			return getRuleContext(DeklaracjaZmiennejContext.class,0);
		}
		public KomunikatContext komunikat() {
			return getRuleContext(KomunikatContext.class,0);
		}
		public InstrukcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInstrukcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInstrukcja(this);
		}
	}

	public final InstrukcjaContext instrukcja() throws RecognitionException {
		InstrukcjaContext _localctx = new InstrukcjaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instrukcja);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				deklaracjaZmiennej();
				setState(167);
				match(T__1);
				}
				break;
			case T__20:
			case T__21:
			case T__28:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				komunikat();
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

	public static class InicjalizaacjaZmiennejContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public InicjalizaacjaZmiennejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicjalizaacjaZmiennej; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInicjalizaacjaZmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInicjalizaacjaZmiennej(this);
		}
	}

	public final InicjalizaacjaZmiennejContext inicjalizaacjaZmiennej() throws RecognitionException {
		InicjalizaacjaZmiennejContext _localctx = new InicjalizaacjaZmiennejContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inicjalizaacjaZmiennej);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				wyrazenie(0);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__18);
				setState(174);
				wyrazenie(0);
				setState(175);
				match(T__18);
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

	public static class TypContext extends ParserRuleContext {
		public TypPrymitywnyContext typPrymitywny() {
			return getRuleContext(TypPrymitywnyContext.class,0);
		}
		public TypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterTyp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitTyp(this);
		}
	}

	public final TypContext typ() throws RecognitionException {
		TypContext _localctx = new TypContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typ);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				typPrymitywny();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(180);
					match(T__9);
					setState(181);
					match(T__10);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__19);
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

	public static class KomunikatContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public DubwyrazenieContext dubwyrazenie() {
			return getRuleContext(DubwyrazenieContext.class,0);
		}
		public List<KomunikatContext> komunikat() {
			return getRuleContexts(KomunikatContext.class);
		}
		public KomunikatContext komunikat(int i) {
			return getRuleContext(KomunikatContext.class,i);
		}
		public KomunikatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komunikat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterKomunikat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitKomunikat(this);
		}
	}

	public final KomunikatContext komunikat() throws RecognitionException {
		KomunikatContext _localctx = new KomunikatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_komunikat);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__20);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(191);
					wyrazenie(0);
					}
				}

				setState(194);
				match(T__1);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__21);
				setState(196);
				dubwyrazenie();
				setState(197);
				match(T__7);
				setState(198);
				komunikat();
				setState(199);
				match(T__8);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(200);
					match(T__22);
					setState(201);
					komunikat();
					setState(202);
					match(T__8);
					}
				}

				}
				break;
			case T__28:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				wyrazenie(0);
				setState(207);
				match(T__1);
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

	public static class WyrazenieContext extends ParserRuleContext {
		public Token op;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterWyrazenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitWyrazenie(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		return wyrazenie(0);
	}

	private WyrazenieContext wyrazenie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, _parentState);
		WyrazenieContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(212);
			literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(214);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(215);
						((WyrazenieContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((WyrazenieContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						wyrazenie(3);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(217);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(218);
						((WyrazenieContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((WyrazenieContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						wyrazenie(2);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class DubwyrazenieContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public DubwyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dubwyrazenie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDubwyrazenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDubwyrazenie(this);
		}
	}

	public final DubwyrazenieContext dubwyrazenie() throws RecognitionException {
		DubwyrazenieContext _localctx = new DubwyrazenieContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dubwyrazenie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__14);
			setState(226);
			wyrazenie(0);
			setState(227);
			match(T__15);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramatykaParser.INT, 0); }
		public NazwaZmiennejContext nazwaZmiennej() {
			return getRuleContext(NazwaZmiennejContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				nazwaZmiennej();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__28);
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

	public static class TypPrymitywnyContext extends ParserRuleContext {
		public TypPrymitywnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typPrymitywny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterTypPrymitywny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitTypPrymitywny(this);
		}
	}

	public final TypPrymitywnyContext typPrymitywny() throws RecognitionException {
		TypPrymitywnyContext _localctx = new TypPrymitywnyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typPrymitywny);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

	public static class NazwaKlasyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public NazwaKlasyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwaKlasy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterNazwaKlasy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitNazwaKlasy(this);
		}
	}

	public final NazwaKlasyContext nazwaKlasy() throws RecognitionException {
		NazwaKlasyContext _localctx = new NazwaKlasyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nazwaKlasy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ID);
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

	public static class NazwaMetodyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public NazwaMetodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwaMetody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterNazwaMetody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitNazwaMetody(this);
		}
	}

	public final NazwaMetodyContext nazwaMetody() throws RecognitionException {
		NazwaMetodyContext _localctx = new NazwaMetodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nazwaMetody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ID);
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

	public static class NazwaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public NazwaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterNazwa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitNazwa(this);
		}
	}

	public final NazwaContext nazwa() throws RecognitionException {
		NazwaContext _localctx = new NazwaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nazwa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
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

	public static class NazwaZmiennejContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public NazwaZmiennejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwaZmiennej; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterNazwaZmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitNazwaZmiennej(this);
		}
	}

	public final NazwaZmiennejContext nazwaZmiennej() throws RecognitionException {
		NazwaZmiennejContext _localctx = new NazwaZmiennejContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nazwaZmiennej);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(ID);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243);
					match(T__9);
					setState(244);
					match(T__10);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		case 19:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\5\2:\n\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4P\n"+
		"\4\3\4\3\4\3\4\5\4U\n\4\3\4\3\4\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\5"+
		"\5a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7j\n\7\f\7\16\7m\13\7\3\b\3\b\5"+
		"\bq\n\b\3\t\5\tt\n\t\3\t\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3"+
		"\t\3\n\5\n\u0083\n\n\3\n\5\n\u0086\n\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\5\r\u0091\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\17"+
		"\3\17\6\17\u009d\n\17\r\17\16\17\u009e\3\17\3\17\3\20\3\20\3\20\3\20\5"+
		"\20\u00a7\n\20\3\21\3\21\3\21\3\21\5\21\u00ad\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00b4\n\22\3\23\3\23\3\23\7\23\u00b9\n\23\f\23\16\23\u00bc"+
		"\13\23\3\23\5\23\u00bf\n\23\3\24\3\24\5\24\u00c3\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cf\n\24\3\24\3\24\3\24\5\24"+
		"\u00d4\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00df\n"+
		"\25\f\25\16\25\u00e2\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00eb"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u00f8"+
		"\n\34\f\34\16\34\u00fb\13\34\3\34\2\3(\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\7\4\2\16\16##\3\2\17\20\4\2\b\b\32\34"+
		"\3\2\35\36\3\2 \"\2\u00ff\29\3\2\2\2\4I\3\2\2\2\6M\3\2\2\2\b`\3\2\2\2"+
		"\nb\3\2\2\2\fk\3\2\2\2\16p\3\2\2\2\20s\3\2\2\2\22\u0082\3\2\2\2\24\u008a"+
		"\3\2\2\2\26\u008c\3\2\2\2\30\u008e\3\2\2\2\32\u0094\3\2\2\2\34\u009a\3"+
		"\2\2\2\36\u00a2\3\2\2\2 \u00ac\3\2\2\2\"\u00b3\3\2\2\2$\u00be\3\2\2\2"+
		"&\u00d3\3\2\2\2(\u00d5\3\2\2\2*\u00e3\3\2\2\2,\u00ea\3\2\2\2.\u00ec\3"+
		"\2\2\2\60\u00ee\3\2\2\2\62\u00f0\3\2\2\2\64\u00f2\3\2\2\2\66\u00f4\3\2"+
		"\2\28:\5\4\3\298\3\2\2\29:\3\2\2\2:>\3\2\2\2;=\5\6\4\2<;\3\2\2\2=@\3\2"+
		"\2\2><\3\2\2\2>?\3\2\2\2?D\3\2\2\2@>\3\2\2\2AC\5\b\5\2BA\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\2\2\3H\3\3\2\2\2IJ\7"+
		"\3\2\2JK\5\64\33\2KL\7\4\2\2L\5\3\2\2\2MO\7\5\2\2NP\7\6\2\2ON\3\2\2\2"+
		"OP\3\2\2\2PQ\3\2\2\2QT\5\64\33\2RS\7\7\2\2SU\7\b\2\2TR\3\2\2\2TU\3\2\2"+
		"\2UV\3\2\2\2VW\7\4\2\2W\7\3\2\2\2XZ\7#\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^a\5\n\6\2_a\7\4\2\2`[\3\2\2\2`_\3\2"+
		"\2\2a\t\3\2\2\2bc\7\t\2\2cd\5\60\31\2de\7\n\2\2ef\5\f\7\2fg\7\13\2\2g"+
		"\13\3\2\2\2hj\5\16\b\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\r\3\2"+
		"\2\2mk\3\2\2\2nq\5\20\t\2oq\5\22\n\2pn\3\2\2\2po\3\2\2\2q\17\3\2\2\2r"+
		"t\5\24\13\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\5$\23\2vw\5\62\32\2w|\5\30"+
		"\r\2xy\7\f\2\2y{\7\r\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~|\3\2\2\2\177\u0080\5\34\17\2\u0080\21\3\2\2\2\u0081\u0083\5"+
		"\24\13\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0086\5\26\f\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\5\36\20\2\u0088\u0089\7\4\2\2\u0089\23\3\2\2\2\u008a"+
		"\u008b\t\2\2\2\u008b\25\3\2\2\2\u008c\u008d\t\3\2\2\u008d\27\3\2\2\2\u008e"+
		"\u0090\7\21\2\2\u008f\u0091\5\32\16\2\u0090\u008f\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\22\2\2\u0093\31\3\2\2\2\u0094"+
		"\u0095\5$\23\2\u0095\u0098\5\66\34\2\u0096\u0097\7\23\2\2\u0097\u0099"+
		"\5\32\16\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\33\3\2\2\2\u009a"+
		"\u009c\7\n\2\2\u009b\u009d\5 \21\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\7\13\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a6\5\66"+
		"\34\2\u00a4\u00a5\7\24\2\2\u00a5\u00a7\5\"\22\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\4"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\5&\24\2\u00ac\u00a8\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad!\3\2\2\2\u00ae\u00b4\5(\25\2\u00af\u00b0\7\25\2\2"+
		"\u00b0\u00b1\5(\25\2\u00b1\u00b2\7\25\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4#\3\2\2\2\u00b5\u00ba\5.\30\2\u00b6"+
		"\u00b7\7\f\2\2\u00b7\u00b9\7\r\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bf\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00bf\7\26\2\2\u00be\u00b5\3\2\2\2\u00be\u00bd\3"+
		"\2\2\2\u00bf%\3\2\2\2\u00c0\u00c2\7\27\2\2\u00c1\u00c3\5(\25\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00d4\7\4\2\2\u00c5"+
		"\u00c6\7\30\2\2\u00c6\u00c7\5*\26\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\5"+
		"&\24\2\u00c9\u00ce\7\13\2\2\u00ca\u00cb\7\31\2\2\u00cb\u00cc\5&\24\2\u00cc"+
		"\u00cd\7\13\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\5(\25\2\u00d1\u00d2\7\4\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00c0\3\2\2\2\u00d3\u00c5\3\2\2\2\u00d3\u00d0\3\2"+
		"\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\b\25\1\2\u00d6\u00d7\5,\27\2\u00d7\u00e0"+
		"\3\2\2\2\u00d8\u00d9\f\4\2\2\u00d9\u00da\t\4\2\2\u00da\u00df\5(\25\5\u00db"+
		"\u00dc\f\3\2\2\u00dc\u00dd\t\5\2\2\u00dd\u00df\5(\25\4\u00de\u00d8\3\2"+
		"\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\21\2\2"+
		"\u00e4\u00e5\5(\25\2\u00e5\u00e6\7\22\2\2\u00e6+\3\2\2\2\u00e7\u00eb\7"+
		"$\2\2\u00e8\u00eb\5\66\34\2\u00e9\u00eb\7\37\2\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb-\3\2\2\2\u00ec\u00ed\t\6\2\2"+
		"\u00ed/\3\2\2\2\u00ee\u00ef\7%\2\2\u00ef\61\3\2\2\2\u00f0\u00f1\7%\2\2"+
		"\u00f1\63\3\2\2\2\u00f2\u00f3\7%\2\2\u00f3\65\3\2\2\2\u00f4\u00f9\7%\2"+
		"\2\u00f5\u00f6\7\f\2\2\u00f6\u00f8\7\r\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\67\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\369>DOT[`kps|\u0082\u0085\u0090\u0098\u009e\u00a6\u00ac"+
		"\u00b3\u00ba\u00be\u00c2\u00ce\u00d3\u00de\u00e0\u00ea\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}