// Generated from deodar.g4 by ANTLR 4.13.1

    package com.rbacpro.deodar.parser;
    import java.util.HashMap;
    import com.rbacpro.deodar.model.Statement;
    import com.rbacpro.deodar.model.Principal;
    import com.rbacpro.deodar.model.Action;
    import com.rbacpro.deodar.model.Resource;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class deodarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, SPACE=11;
	public static final int
		RULE_policy = 0, RULE_stmts = 1, RULE_more_stmts = 2, RULE_stmt = 3, RULE_principal = 4, 
		RULE_action = 5, RULE_resource = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"policy", "stmts", "more_stmts", "stmt", "principal", "action", "resource"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{\"Statement\":['", "']}'", "','", "'{'", "'}'", "'\"principal\":\"'", 
			"'\"'", "'\"action\":\"'", "'\"resource\":\"'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "SPACE"
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
	public String getGrammarFileName() { return "deodar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public deodarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PolicyContext extends ParserRuleContext {
		public StmtsContext stmts;
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public PolicyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).enterPolicy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).exitPolicy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deodarVisitor ) return ((deodarVisitor<? extends T>)visitor).visitPolicy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolicyContext policy() throws RecognitionException {
		PolicyContext _localctx = new PolicyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_policy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			((PolicyContext)_localctx).stmts = stmts();
			setState(16);
			match(T__1);
			System.out.println(((PolicyContext)_localctx).stmts.statements.size());
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
	public static class StmtsContext extends ParserRuleContext {
		public List<Statement> statements;
		public StmtContext stmt;
		public More_stmtsContext more_stmts;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public More_stmtsContext more_stmts() {
			return getRuleContext(More_stmtsContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deodarVisitor ) return ((deodarVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		((StmtsContext)_localctx).statements =  new ArrayList<Statement>();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			((StmtsContext)_localctx).stmt = stmt();
			Statement s = new Statement(((StmtsContext)_localctx).stmt.p, ((StmtsContext)_localctx).stmt.r, ((StmtsContext)_localctx).stmt.a); _localctx.statements.add(s);
			setState(21);
			((StmtsContext)_localctx).more_stmts = more_stmts();
			_localctx.statements.addAll(((StmtsContext)_localctx).more_stmts.statements);
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
	public static class More_stmtsContext extends ParserRuleContext {
		public List<Statement> statements;
		public StmtContext stmt;
		public More_stmtsContext more_stmts;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public More_stmtsContext more_stmts() {
			return getRuleContext(More_stmtsContext.class,0);
		}
		public More_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).enterMore_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).exitMore_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deodarVisitor ) return ((deodarVisitor<? extends T>)visitor).visitMore_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_stmtsContext more_stmts() throws RecognitionException {
		More_stmtsContext _localctx = new More_stmtsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_more_stmts);
		((More_stmtsContext)_localctx).statements =  new ArrayList<Statement>();
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(T__2);
				setState(26);
				((More_stmtsContext)_localctx).stmt = stmt();
				Statement s = new Statement(((More_stmtsContext)_localctx).stmt.p, ((More_stmtsContext)_localctx).stmt.r, ((More_stmtsContext)_localctx).stmt.a); _localctx.statements.add(s);
				setState(28);
				((More_stmtsContext)_localctx).more_stmts = more_stmts();
				_localctx.statements.addAll(((More_stmtsContext)_localctx).more_stmts.statements);
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
	public static class StmtContext extends ParserRuleContext {
		public Principal p;
		public Action a;
		public Resource r;
		public PrincipalContext principal;
		public ActionContext action;
		public ResourceContext resource;
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deodarVisitor ) return ((deodarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);

		    ((StmtContext)_localctx).p =  new Principal();
		    ((StmtContext)_localctx).r =  new Resource();
		    ((StmtContext)_localctx).a =  new Action();
		 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__3);
			setState(34);
			((StmtContext)_localctx).principal = principal();
			setState(35);
			match(T__2);
			setState(36);
			((StmtContext)_localctx).action = action();
			setState(37);
			match(T__2);
			setState(38);
			((StmtContext)_localctx).resource = resource();
			setState(39);
			match(T__4);

			    System.out.println("In parsing principal and its name is "+ ((StmtContext)_localctx).principal.name);
			    _localctx.p.setName(((StmtContext)_localctx).principal.name);
			    _localctx.r.setName(((StmtContext)_localctx).resource.name);
			    _localctx.a.setName(((StmtContext)_localctx).action.name);
			 
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
	public static class PrincipalContext extends ParserRuleContext {
		public String name;
		public Token ID;
		public TerminalNode ID() { return getToken(deodarParser.ID, 0); }
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deodarVisitor ) return ((deodarVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__5);
			setState(43);
			((PrincipalContext)_localctx).ID = match(ID);
			setState(44);
			match(T__6);
			((PrincipalContext)_localctx).name =  (((PrincipalContext)_localctx).ID!=null?((PrincipalContext)_localctx).ID.getText():null);
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
	public static class ActionContext extends ParserRuleContext {
		public String name;
		public Token ID;
		public TerminalNode ID() { return getToken(deodarParser.ID, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deodarVisitor ) return ((deodarVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__7);
			setState(48);
			((ActionContext)_localctx).ID = match(ID);
			setState(49);
			match(T__6);
			((ActionContext)_localctx).name =  (((ActionContext)_localctx).ID!=null?((ActionContext)_localctx).ID.getText():null);
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
	public static class ResourceContext extends ParserRuleContext {
		public String name;
		public Token ID;
		public TerminalNode ID() { return getToken(deodarParser.ID, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deodarListener ) ((deodarListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deodarVisitor ) return ((deodarVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__8);
			setState(53);
			((ResourceContext)_localctx).ID = match(ID);
			setState(54);
			match(T__6);
			((ResourceContext)_localctx).name =  (((ResourceContext)_localctx).ID!=null?((ResourceContext)_localctx).ID.getText():null);
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
		"\u0004\u0001\u000b:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000"+
		"\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u00003\u0000\u000e\u0001"+
		"\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u001f\u0001"+
		"\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000"+
		"\u0000\n/\u0001\u0000\u0000\u0000\f4\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0005\u0001\u0000\u0000\u000f\u0010\u0003\u0002\u0001\u0000\u0010\u0011"+
		"\u0005\u0002\u0000\u0000\u0011\u0012\u0006\u0000\uffff\uffff\u0000\u0012"+
		"\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0006\u0003\u0000\u0014"+
		"\u0015\u0006\u0001\uffff\uffff\u0000\u0015\u0016\u0003\u0004\u0002\u0000"+
		"\u0016\u0017\u0006\u0001\uffff\uffff\u0000\u0017\u0003\u0001\u0000\u0000"+
		"\u0000\u0018 \u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0003\u0000\u0000"+
		"\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u001c\u0006\u0002\uffff\uffff"+
		"\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0006\u0002\uffff"+
		"\uffff\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u0018\u0001\u0000\u0000"+
		"\u0000\u001f\u0019\u0001\u0000\u0000\u0000 \u0005\u0001\u0000\u0000\u0000"+
		"!\"\u0005\u0004\u0000\u0000\"#\u0003\b\u0004\u0000#$\u0005\u0003\u0000"+
		"\u0000$%\u0003\n\u0005\u0000%&\u0005\u0003\u0000\u0000&\'\u0003\f\u0006"+
		"\u0000\'(\u0005\u0005\u0000\u0000()\u0006\u0003\uffff\uffff\u0000)\u0007"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0006\u0000\u0000+,\u0005\n\u0000\u0000"+
		",-\u0005\u0007\u0000\u0000-.\u0006\u0004\uffff\uffff\u0000.\t\u0001\u0000"+
		"\u0000\u0000/0\u0005\b\u0000\u000001\u0005\n\u0000\u000012\u0005\u0007"+
		"\u0000\u000023\u0006\u0005\uffff\uffff\u00003\u000b\u0001\u0000\u0000"+
		"\u000045\u0005\t\u0000\u000056\u0005\n\u0000\u000067\u0005\u0007\u0000"+
		"\u000078\u0006\u0006\uffff\uffff\u00008\r\u0001\u0000\u0000\u0000\u0001"+
		"\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}