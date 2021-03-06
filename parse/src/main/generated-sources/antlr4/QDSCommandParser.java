// Generated from antlr4/QDSCommand.g4 by ANTLR 4.7
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QDSCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Q_SET=1, Q_ADD_JAR=2, Q_USE=3, Q_CREATE_FUNCTION=4, Q_INSERT_INTO=5, Q_INSERT_OVERWRITE=6, 
		Q_SELECT=7, Q_DROP_TABLE=8, Q_DROP_VIEW=9, Q_ALTER_TABLE=10, Q_CREATE_TABLE=11, 
		Q_CREATE_EXTERNAL_TABLE=12, Q_CTAS=13, Q_CREATE_VIEW=14, Q_CTE=15, TEXT=16, 
		Q_SEMI=17, SIMPLE_COMMENT=18, BRACKETED_EMPTY_COMMENT=19, BRACKETED_COMMENT=20, 
		WS=21, SPACES=22;
	public static final int
		RULE_parse = 0, RULE_sql_stmt = 1;
	public static final String[] ruleNames = {
		"parse", "sql_stmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Q_SET", "Q_ADD_JAR", "Q_USE", "Q_CREATE_FUNCTION", "Q_INSERT_INTO", 
		"Q_INSERT_OVERWRITE", "Q_SELECT", "Q_DROP_TABLE", "Q_DROP_VIEW", "Q_ALTER_TABLE", 
		"Q_CREATE_TABLE", "Q_CREATE_EXTERNAL_TABLE", "Q_CTAS", "Q_CREATE_VIEW", 
		"Q_CTE", "TEXT", "Q_SEMI", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "SPACES"
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
	public String getGrammarFileName() { return "QDSCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QDSCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QDSCommandParser.EOF, 0); }
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> Q_SEMI() { return getTokens(QDSCommandParser.Q_SEMI); }
		public TerminalNode Q_SEMI(int i) {
			return getToken(QDSCommandParser.Q_SEMI, i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QDSCommandListener ) ((QDSCommandListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QDSCommandListener ) ((QDSCommandListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QDSCommandVisitor ) return ((QDSCommandVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				match(EOF);
				}
				break;
			case Q_SET:
			case Q_ADD_JAR:
			case Q_USE:
			case Q_CREATE_FUNCTION:
			case Q_INSERT_INTO:
			case Q_INSERT_OVERWRITE:
			case Q_SELECT:
			case Q_DROP_TABLE:
			case Q_DROP_VIEW:
			case Q_ALTER_TABLE:
			case Q_CREATE_TABLE:
			case Q_CREATE_EXTERNAL_TABLE:
			case Q_CTAS:
			case Q_CREATE_VIEW:
			case Q_CTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(5);
					sql_stmt();
					setState(9);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Q_SEMI) {
						{
						{
						setState(6);
						match(Q_SEMI);
						}
						}
						setState(11);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(14); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_SET) | (1L << Q_ADD_JAR) | (1L << Q_USE) | (1L << Q_CREATE_FUNCTION) | (1L << Q_INSERT_INTO) | (1L << Q_INSERT_OVERWRITE) | (1L << Q_SELECT) | (1L << Q_DROP_TABLE) | (1L << Q_DROP_VIEW) | (1L << Q_ALTER_TABLE) | (1L << Q_CREATE_TABLE) | (1L << Q_CREATE_EXTERNAL_TABLE) | (1L << Q_CTAS) | (1L << Q_CREATE_VIEW) | (1L << Q_CTE))) != 0) );
				setState(16);
				match(EOF);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Q_SET() { return getToken(QDSCommandParser.Q_SET, 0); }
		public TerminalNode Q_ADD_JAR() { return getToken(QDSCommandParser.Q_ADD_JAR, 0); }
		public TerminalNode Q_USE() { return getToken(QDSCommandParser.Q_USE, 0); }
		public TerminalNode Q_CTE() { return getToken(QDSCommandParser.Q_CTE, 0); }
		public TerminalNode Q_CREATE_FUNCTION() { return getToken(QDSCommandParser.Q_CREATE_FUNCTION, 0); }
		public TerminalNode Q_INSERT_INTO() { return getToken(QDSCommandParser.Q_INSERT_INTO, 0); }
		public TerminalNode Q_INSERT_OVERWRITE() { return getToken(QDSCommandParser.Q_INSERT_OVERWRITE, 0); }
		public TerminalNode Q_SELECT() { return getToken(QDSCommandParser.Q_SELECT, 0); }
		public TerminalNode Q_DROP_TABLE() { return getToken(QDSCommandParser.Q_DROP_TABLE, 0); }
		public TerminalNode Q_DROP_VIEW() { return getToken(QDSCommandParser.Q_DROP_VIEW, 0); }
		public TerminalNode Q_ALTER_TABLE() { return getToken(QDSCommandParser.Q_ALTER_TABLE, 0); }
		public TerminalNode Q_CREATE_TABLE() { return getToken(QDSCommandParser.Q_CREATE_TABLE, 0); }
		public TerminalNode Q_CREATE_EXTERNAL_TABLE() { return getToken(QDSCommandParser.Q_CREATE_EXTERNAL_TABLE, 0); }
		public TerminalNode Q_CTAS() { return getToken(QDSCommandParser.Q_CTAS, 0); }
		public TerminalNode Q_CREATE_VIEW() { return getToken(QDSCommandParser.Q_CREATE_VIEW, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QDSCommandListener ) ((QDSCommandListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QDSCommandListener ) ((QDSCommandListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QDSCommandVisitor ) return ((QDSCommandVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((Sql_stmtContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_SET) | (1L << Q_ADD_JAR) | (1L << Q_USE) | (1L << Q_CREATE_FUNCTION) | (1L << Q_INSERT_INTO) | (1L << Q_INSERT_OVERWRITE) | (1L << Q_SELECT) | (1L << Q_DROP_TABLE) | (1L << Q_DROP_VIEW) | (1L << Q_ALTER_TABLE) | (1L << Q_CREATE_TABLE) | (1L << Q_CREATE_EXTERNAL_TABLE) | (1L << Q_CTAS) | (1L << Q_CREATE_VIEW) | (1L << Q_CTE))) != 0)) ) {
				((Sql_stmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\31\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\7\2\n\n\2\f\2\16\2\r\13\2\6\2\17\n\2\r\2\16\2\20\3\2"+
		"\3\2\5\2\25\n\2\3\3\3\3\3\3\2\2\4\2\4\2\3\3\2\3\21\2\31\2\24\3\2\2\2\4"+
		"\26\3\2\2\2\6\25\7\2\2\3\7\13\5\4\3\2\b\n\7\23\2\2\t\b\3\2\2\2\n\r\3\2"+
		"\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\16\7\3\2\2\2"+
		"\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22\23\7\2\2\3"+
		"\23\25\3\2\2\2\24\6\3\2\2\2\24\16\3\2\2\2\25\3\3\2\2\2\26\27\t\2\2\2\27"+
		"\5\3\2\2\2\5\13\20\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}