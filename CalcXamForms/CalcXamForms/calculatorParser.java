// Generated from calculator.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, NEW_LINE=2, WHITESPACE=3, ABSTRACT=4, ADD=5, ALIAS=6, 
		ARGLIST=7, AS=8, ASCENDING=9, BASE=10, BOOL=11, BREAK=12, BY=13, BYTE=14, 
		CASE=15, CATCH=16, CHAR=17, CHECKED=18, CLASS=19, CONST=20, CONTINUE=21, 
		DECIMAL=22, DEFAULT=23, DELEGATE=24, DESCENDING=25, DO=26, DOUBLE=27, 
		DYNAMIC=28, ELSE=29, ENUM=30, EQUALS=31, EVENT=32, EXPLICIT=33, EXTERN=34, 
		FALSE=35, FINALLY=36, FIXED=37, FLOAT=38, FOR=39, FOREACH=40, FROM=41, 
		GET=42, GOTO=43, GROUP=44, IF=45, IMPLICIT=46, IN=47, INT=48, INTERFACE=49, 
		INTERNAL=50, INTO=51, IS=52, JOIN=53, LET=54, LOCK=55, LONG=56, NAMESPACE=57, 
		NEW=58, NULL=59, OBJECT=60, ON=61, OPERATOR=62, ORDERBY=63, OUT=64, OVERRIDE=65, 
		PARAMS=66, PARTIAL=67, PRIVATE=68, PROTECTED=69, PUBLIC=70, READONLY=71, 
		REF=72, REMOVE=73, RETURN=74, SBYTE=75, SEALED=76, SELECT=77, SET=78, 
		SHORT=79, SIZEOF=80, STACKALLOC=81, STATIC=82, STRING=83, STRUCT=84, SWITCH=85, 
		THIS=86, THROW=87, TRUE=88, TRY=89, TYPEOF=90, UINT=91, ULONG=92, UNCHECKED=93, 
		UNSAFE=94, USHORT=95, USING=96, VIRTUAL=97, VOID=98, VOLATILE=99, WHERE=100, 
		WHILE=101, YIELD=102, IDENTIFIER=103, INTEGER_LITERAL=104, REAL_LITERAL=105, 
		CHARACTER_LITERAL=106, STRING_LITERAL=107, OPEN_BRACE=108, CLOSE_BRACE=109, 
		OPEN_BRACKET=110, CLOSE_BRACKET=111, OPEN_PARENS=112, CLOSE_PARENS=113, 
		DOT=114, COMMA=115, COLON=116, SEMICOLON=117, PLUS=118, MINUS=119, STAR=120, 
		DIV=121, PERCENT=122, AMP=123, BITWISE_OR=124, CARET=125, BANG=126, TILDE=127, 
		ASSIGNMENT=128, LT=129, GT=130, INTERR=131, DOUBLE_COLON=132, OP_COALESCING=133, 
		OP_INC=134, OP_DEC=135, OP_AND=136, OP_OR=137, OP_PTR=138, OP_EQ=139, 
		OP_NE=140, OP_LE=141, OP_GE=142, OP_ADD_ASSIGNMENT=143, OP_SUB_ASSIGNMENT=144, 
		OP_MULT_ASSIGNMENT=145, OP_DIV_ASSIGNMENT=146, OP_MOD_ASSIGNMENT=147, 
		OP_AND_ASSIGNMENT=148, OP_OR_ASSIGNMENT=149, OP_XOR_ASSIGNMENT=150, OP_LEFT_SHIFT=151, 
		OP_LEFT_SHIFT_ASSIGNMENT=152, QUOTE=153, DOUBLE_QUOTE=154, BACK_SLASH=155, 
		DOUBLE_BACK_SLASH=156, SHARP=157;
	public static final int
		RULE_expressionResult = 0, RULE_identifier = 1, RULE_type_argument_list_opt = 2, 
		RULE_variable_reference = 3, RULE_argument_list = 4, RULE_argument = 5, 
		RULE_argument_name = 6, RULE_argument_value = 7, RULE_primary_expression = 8, 
		RULE_primary_expression_start = 9, RULE_bracket_expression = 10, RULE_simple_name = 11, 
		RULE_parenthesized_expression = 12, RULE_member_access = 13, RULE_predefined_type = 14, 
		RULE_expression_list = 15, RULE_this_access = 16, RULE_object_or_collection_initializer = 17, 
		RULE_object_initializer = 18, RULE_member_initializer_list = 19, RULE_member_initializer = 20, 
		RULE_initializer_value = 21, RULE_collection_initializer = 22, RULE_element_initializer_list = 23, 
		RULE_element_initializer = 24, RULE_member_declarator_list = 25, RULE_member_declarator = 26, 
		RULE_unbound_type_name = 27, RULE_generic_dimension_specifier = 28, RULE_commas = 29, 
		RULE_checked_expression = 30, RULE_unchecked_expression = 31, RULE_unary_expression = 32, 
		RULE_cast_disambiguation_token = 33, RULE_pre_increment_expression = 34, 
		RULE_pre_decrement_expression = 35, RULE_multiplicative_expression = 36, 
		RULE_additive_expression = 37, RULE_shift_expression = 38, RULE_relational_expression = 39, 
		RULE_shift_disambiguation_token = 40, RULE_is_disambiguation_token = 41, 
		RULE_equality_expression = 42, RULE_and_expression = 43, RULE_exclusive_or_expression = 44, 
		RULE_inclusive_or_expression = 45, RULE_conditional_and_expression = 46, 
		RULE_conditional_or_expression = 47, RULE_null_coalescing_expression = 48, 
		RULE_conditional_expression = 49, RULE_assignment = 50, RULE_assignment_operator = 51, 
		RULE_expression = 52, RULE_non_assignment_expression = 53, RULE_constant_expression = 54, 
		RULE_boolean_expression = 55, RULE_variable_declarators = 56, RULE_variable_declarator = 57, 
		RULE_variable_initializer = 58, RULE_rank_specifiers = 59, RULE_rank_specifier = 60, 
		RULE_dim_separators = 61, RULE_array_initializer = 62, RULE_variable_initializer_list = 63, 
		RULE_from_contextual_keyword = 64, RULE_let_contextual_keyword = 65, RULE_where_contextual_keyword = 66, 
		RULE_join_contextual_keyword = 67, RULE_on_contextual_keyword = 68, RULE_equals_contextual_keyword = 69, 
		RULE_into_contextual_keyword = 70, RULE_orderby_contextual_keyword = 71, 
		RULE_ascending_contextual_keyword = 72, RULE_descending_contextual_keyword = 73, 
		RULE_select_contextual_keyword = 74, RULE_group_contextual_keyword = 75, 
		RULE_by_contextual_keyword = 76, RULE_partial_contextual_keyword = 77, 
		RULE_alias_contextual_keyword = 78, RULE_yield_contextual_keyword = 79, 
		RULE_get_contextual_keyword = 80, RULE_set_contextual_keyword = 81, RULE_add_contextual_keyword = 82, 
		RULE_remove_contextual_keyword = 83, RULE_dynamic_contextual_keyword = 84, 
		RULE_arglist = 85, RULE_right_arrow = 86, RULE_right_shift = 87, RULE_right_shift_assignment = 88, 
		RULE_literal = 89, RULE_boolean_literal = 90, RULE_keyword = 91, RULE_method_invocation2 = 92, 
		RULE_object_creation_expression2 = 93;
	public static final String[] ruleNames = {
		"expressionResult", "identifier", "type_argument_list_opt", "variable_reference", 
		"argument_list", "argument", "argument_name", "argument_value", "primary_expression", 
		"primary_expression_start", "bracket_expression", "simple_name", "parenthesized_expression", 
		"member_access", "predefined_type", "expression_list", "this_access", 
		"object_or_collection_initializer", "object_initializer", "member_initializer_list", 
		"member_initializer", "initializer_value", "collection_initializer", "element_initializer_list", 
		"element_initializer", "member_declarator_list", "member_declarator", 
		"unbound_type_name", "generic_dimension_specifier", "commas", "checked_expression", 
		"unchecked_expression", "unary_expression", "cast_disambiguation_token", 
		"pre_increment_expression", "pre_decrement_expression", "multiplicative_expression", 
		"additive_expression", "shift_expression", "relational_expression", "shift_disambiguation_token", 
		"is_disambiguation_token", "equality_expression", "and_expression", "exclusive_or_expression", 
		"inclusive_or_expression", "conditional_and_expression", "conditional_or_expression", 
		"null_coalescing_expression", "conditional_expression", "assignment", 
		"assignment_operator", "expression", "non_assignment_expression", "constant_expression", 
		"boolean_expression", "variable_declarators", "variable_declarator", "variable_initializer", 
		"rank_specifiers", "rank_specifier", "dim_separators", "array_initializer", 
		"variable_initializer_list", "from_contextual_keyword", "let_contextual_keyword", 
		"where_contextual_keyword", "join_contextual_keyword", "on_contextual_keyword", 
		"equals_contextual_keyword", "into_contextual_keyword", "orderby_contextual_keyword", 
		"ascending_contextual_keyword", "descending_contextual_keyword", "select_contextual_keyword", 
		"group_contextual_keyword", "by_contextual_keyword", "partial_contextual_keyword", 
		"alias_contextual_keyword", "yield_contextual_keyword", "get_contextual_keyword", 
		"set_contextual_keyword", "add_contextual_keyword", "remove_contextual_keyword", 
		"dynamic_contextual_keyword", "arglist", "right_arrow", "right_shift", 
		"right_shift_assignment", "literal", "boolean_literal", "keyword", "method_invocation2", 
		"object_creation_expression2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\u00EF\\u00BB\\u00BF'", null, null, "'abstract'", "'add'", "'alias'", 
		"'__arglist'", "'as'", "'ascending'", "'base'", "'bool'", "'break'", "'by'", 
		"'byte'", "'case'", "'catch'", "'char'", "'checked'", "'class'", "'const'", 
		"'continue'", "'decimal'", "'default'", "'delegate'", "'descending'", 
		"'do'", "'double'", "'dynamic'", "'else'", "'enum'", "'equals'", "'event'", 
		"'explicit'", "'extern'", "'false'", "'finally'", "'fixed'", "'float'", 
		"'for'", "'foreach'", "'from'", "'get'", "'goto'", "'group'", "'if'", 
		"'implicit'", "'in'", "'int'", "'interface'", "'internal'", "'into'", 
		"'is'", "'join'", "'let'", "'lock'", "'long'", "'namespace'", "'new'", 
		"'null'", "'object'", "'on'", "'operator'", "'orderby'", "'out'", "'override'", 
		"'params'", "'partial'", "'private'", "'protected'", "'public'", "'readonly'", 
		"'ref'", "'remove'", "'return'", "'sbyte'", "'sealed'", "'select'", "'set'", 
		"'short'", "'sizeof'", "'stackalloc'", "'static'", "'string'", "'struct'", 
		"'switch'", "'this'", "'throw'", "'true'", "'try'", "'typeof'", "'uint'", 
		"'ulong'", "'unchecked'", "'unsafe'", "'ushort'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'where'", "'while'", "'yield'", null, null, null, 
		null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", 
		"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", 
		"'~'", "'='", "'<'", "'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", 
		"'||'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'&='", "'|='", "'^='", "'<<'", "'<<='", "'''", "'\"'", 
		"'\\'", "'\\\\'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE_ORDER_MARK", "NEW_LINE", "WHITESPACE", "ABSTRACT", "ADD", 
		"ALIAS", "ARGLIST", "AS", "ASCENDING", "BASE", "BOOL", "BREAK", "BY", 
		"BYTE", "CASE", "CATCH", "CHAR", "CHECKED", "CLASS", "CONST", "CONTINUE", 
		"DECIMAL", "DEFAULT", "DELEGATE", "DESCENDING", "DO", "DOUBLE", "DYNAMIC", 
		"ELSE", "ENUM", "EQUALS", "EVENT", "EXPLICIT", "EXTERN", "FALSE", "FINALLY", 
		"FIXED", "FLOAT", "FOR", "FOREACH", "FROM", "GET", "GOTO", "GROUP", "IF", 
		"IMPLICIT", "IN", "INT", "INTERFACE", "INTERNAL", "INTO", "IS", "JOIN", 
		"LET", "LOCK", "LONG", "NAMESPACE", "NEW", "NULL", "OBJECT", "ON", "OPERATOR", 
		"ORDERBY", "OUT", "OVERRIDE", "PARAMS", "PARTIAL", "PRIVATE", "PROTECTED", 
		"PUBLIC", "READONLY", "REF", "REMOVE", "RETURN", "SBYTE", "SEALED", "SELECT", 
		"SET", "SHORT", "SIZEOF", "STACKALLOC", "STATIC", "STRING", "STRUCT", 
		"SWITCH", "THIS", "THROW", "TRUE", "TRY", "TYPEOF", "UINT", "ULONG", "UNCHECKED", 
		"UNSAFE", "USHORT", "USING", "VIRTUAL", "VOID", "VOLATILE", "WHERE", "WHILE", 
		"YIELD", "IDENTIFIER", "INTEGER_LITERAL", "REAL_LITERAL", "CHARACTER_LITERAL", 
		"STRING_LITERAL", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"OPEN_PARENS", "CLOSE_PARENS", "DOT", "COMMA", "COLON", "SEMICOLON", "PLUS", 
		"MINUS", "STAR", "DIV", "PERCENT", "AMP", "BITWISE_OR", "CARET", "BANG", 
		"TILDE", "ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", "OP_COALESCING", 
		"OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", 
		"OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", 
		"OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", 
		"OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "QUOTE", 
		"DOUBLE_QUOTE", "BACK_SLASH", "DOUBLE_BACK_SLASH", "SHARP"
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
	public String getGrammarFileName() { return "calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionResultContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(calculatorParser.ASSIGNMENT, 0); }
		public TerminalNode EOF() { return getToken(calculatorParser.EOF, 0); }
		public ExpressionResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterExpressionResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitExpressionResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExpressionResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionResultContext expressionResult() throws RecognitionException {
		ExpressionResultContext _localctx = new ExpressionResultContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expressionResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expression();
			setState(189);
			match(ASSIGNMENT);
			setState(190);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(calculatorParser.IDENTIFIER, 0); }
		public TerminalNode FROM() { return getToken(calculatorParser.FROM, 0); }
		public TerminalNode LET() { return getToken(calculatorParser.LET, 0); }
		public TerminalNode WHERE() { return getToken(calculatorParser.WHERE, 0); }
		public TerminalNode JOIN() { return getToken(calculatorParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(calculatorParser.ON, 0); }
		public TerminalNode EQUALS() { return getToken(calculatorParser.EQUALS, 0); }
		public TerminalNode INTO() { return getToken(calculatorParser.INTO, 0); }
		public TerminalNode ORDERBY() { return getToken(calculatorParser.ORDERBY, 0); }
		public TerminalNode ASCENDING() { return getToken(calculatorParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(calculatorParser.DESCENDING, 0); }
		public TerminalNode SELECT() { return getToken(calculatorParser.SELECT, 0); }
		public TerminalNode GROUP() { return getToken(calculatorParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(calculatorParser.BY, 0); }
		public TerminalNode PARTIAL() { return getToken(calculatorParser.PARTIAL, 0); }
		public TerminalNode ALIAS() { return getToken(calculatorParser.ALIAS, 0); }
		public TerminalNode YIELD() { return getToken(calculatorParser.YIELD, 0); }
		public TerminalNode GET() { return getToken(calculatorParser.GET, 0); }
		public TerminalNode SET() { return getToken(calculatorParser.SET, 0); }
		public TerminalNode ADD() { return getToken(calculatorParser.ADD, 0); }
		public TerminalNode REMOVE() { return getToken(calculatorParser.REMOVE, 0); }
		public TerminalNode DYNAMIC() { return getToken(calculatorParser.DYNAMIC, 0); }
		public TerminalNode ARGLIST() { return getToken(calculatorParser.ARGLIST, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << ON) | (1L << ORDERBY))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PARTIAL - 67)) | (1L << (REMOVE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Type_argument_list_optContext extends ParserRuleContext {
		public Type_argument_list_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterType_argument_list_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitType_argument_list_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitType_argument_list_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_argument_list_optContext type_argument_list_opt() throws RecognitionException {
		Type_argument_list_optContext _localctx = new Type_argument_list_optContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_argument_list_opt);
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

	public static class Variable_referenceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterVariable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitVariable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitVariable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_referenceContext variable_reference() throws RecognitionException {
		Variable_referenceContext _localctx = new Variable_referenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			expression();
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

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			argument();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(199);
				match(COMMA);
				setState(200);
				argument();
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

	public static class ArgumentContext extends ParserRuleContext {
		public Argument_valueContext argument_value() {
			return getRuleContext(Argument_valueContext.class,0);
		}
		public Argument_nameContext argument_name() {
			return getRuleContext(Argument_nameContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(206);
				argument_name();
				}
				break;
			}
			setState(209);
			argument_value();
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

	public static class Argument_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(calculatorParser.COLON, 0); }
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterArgument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitArgument_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitArgument_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			identifier();
			setState(212);
			match(COLON);
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

	public static class Argument_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Argument_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterArgument_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitArgument_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitArgument_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_valueContext argument_value() throws RecognitionException {
		Argument_valueContext _localctx = new Argument_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expression();
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<Bracket_expressionContext> bracket_expression() {
			return getRuleContexts(Bracket_expressionContext.class);
		}
		public Bracket_expressionContext bracket_expression(int i) {
			return getRuleContext(Bracket_expressionContext.class,i);
		}
		public List<Method_invocation2Context> method_invocation2() {
			return getRuleContexts(Method_invocation2Context.class);
		}
		public Method_invocation2Context method_invocation2(int i) {
			return getRuleContext(Method_invocation2Context.class,i);
		}
		public List<TerminalNode> OP_INC() { return getTokens(calculatorParser.OP_INC); }
		public TerminalNode OP_INC(int i) {
			return getToken(calculatorParser.OP_INC, i);
		}
		public List<TerminalNode> OP_DEC() { return getTokens(calculatorParser.OP_DEC); }
		public TerminalNode OP_DEC(int i) {
			return getToken(calculatorParser.OP_DEC, i);
		}
		public List<TerminalNode> OP_PTR() { return getTokens(calculatorParser.OP_PTR); }
		public TerminalNode OP_PTR(int i) {
			return getToken(calculatorParser.OP_PTR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((Primary_expressionContext)_localctx).pe = primary_expression_start();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET) {
				{
				{
				setState(217);
				bracket_expression();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NULL) | (1L << OBJECT) | (1L << ON) | (1L << ORDERBY))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PARTIAL - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (TRUE - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (UNCHECKED - 67)) | (1L << (USHORT - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (INTEGER_LITERAL - 67)) | (1L << (REAL_LITERAL - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (OPEN_PARENS - 67)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OP_INC - 134)) | (1L << (OP_DEC - 134)) | (1L << (OP_PTR - 134)))) != 0)) {
				{
				{
				setState(228);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case CHECKED:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FALSE:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NULL:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case THIS:
				case TRUE:
				case UINT:
				case ULONG:
				case UNCHECKED:
				case USHORT:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case INTEGER_LITERAL:
				case REAL_LITERAL:
				case CHARACTER_LITERAL:
				case STRING_LITERAL:
				case OPEN_PARENS:
					{
					setState(223);
					method_invocation2();
					}
					break;
				case OP_INC:
					{
					setState(224);
					match(OP_INC);
					}
					break;
				case OP_DEC:
					{
					setState(225);
					match(OP_DEC);
					}
					break;
				case OP_PTR:
					{
					setState(226);
					match(OP_PTR);
					setState(227);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET) {
					{
					{
					setState(230);
					bracket_expression();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(240);
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

	public static class Primary_expression_startContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public This_accessContext this_access() {
			return getRuleContext(This_accessContext.class,0);
		}
		public Checked_expressionContext checked_expression() {
			return getRuleContext(Checked_expressionContext.class,0);
		}
		public Unchecked_expressionContext unchecked_expression() {
			return getRuleContext(Unchecked_expressionContext.class,0);
		}
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPrimary_expression_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPrimary_expression_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPrimary_expression_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primary_expression_start);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case FALSE:
			case NULL:
			case TRUE:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				literal();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				simple_name();
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				parenthesized_expression();
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case OBJECT:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				predefined_type();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				this_access();
				}
				break;
			case CHECKED:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				checked_expression();
				}
				break;
			case UNCHECKED:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				unchecked_expression();
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

	public static class Bracket_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(calculatorParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(calculatorParser.CLOSE_BRACKET, 0); }
		public Bracket_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitBracket_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitBracket_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_expressionContext bracket_expression() throws RecognitionException {
		Bracket_expressionContext _localctx = new Bracket_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bracket_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(OPEN_BRACKET);
			setState(251);
			expression_list();
			setState(252);
			match(CLOSE_BRACKET);
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

	public static class Simple_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_list_optContext type_argument_list_opt() {
			return getRuleContext(Type_argument_list_optContext.class,0);
		}
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterSimple_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitSimple_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSimple_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			identifier();
			setState(255);
			type_argument_list_opt();
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

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(calculatorParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(calculatorParser.CLOSE_PARENS, 0); }
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(OPEN_PARENS);
			setState(258);
			expression();
			setState(259);
			match(CLOSE_PARENS);
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

	public static class Member_accessContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMember_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMember_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMember_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_member_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			primary_expression();
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

	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(calculatorParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(calculatorParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(calculatorParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(calculatorParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(calculatorParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(calculatorParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(calculatorParser.INT, 0); }
		public TerminalNode LONG() { return getToken(calculatorParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(calculatorParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(calculatorParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(calculatorParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(calculatorParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(calculatorParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(calculatorParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(calculatorParser.USHORT, 0); }
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPredefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPredefined_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPredefined_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_predefined_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << OBJECT))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (SBYTE - 75)) | (1L << (SHORT - 75)) | (1L << (STRING - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (USHORT - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			expression();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				expression();
				}
				}
				setState(272);
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

	public static class This_accessContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(calculatorParser.THIS, 0); }
		public This_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterThis_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitThis_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitThis_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final This_accessContext this_access() throws RecognitionException {
		This_accessContext _localctx = new This_accessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_this_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(THIS);
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

	public static class Object_or_collection_initializerContext extends ParserRuleContext {
		public Object_initializerContext object_initializer() {
			return getRuleContext(Object_initializerContext.class,0);
		}
		public Collection_initializerContext collection_initializer() {
			return getRuleContext(Collection_initializerContext.class,0);
		}
		public Object_or_collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_or_collection_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterObject_or_collection_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitObject_or_collection_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitObject_or_collection_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_or_collection_initializerContext object_or_collection_initializer() throws RecognitionException {
		Object_or_collection_initializerContext _localctx = new Object_or_collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_object_or_collection_initializer);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				object_initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				collection_initializer();
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

	public static class Object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(calculatorParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(calculatorParser.CLOSE_BRACE, 0); }
		public Member_initializer_listContext member_initializer_list() {
			return getRuleContext(Member_initializer_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(calculatorParser.COMMA, 0); }
		public Object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterObject_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitObject_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitObject_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_initializerContext object_initializer() throws RecognitionException {
		Object_initializerContext _localctx = new Object_initializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_object_initializer);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(OPEN_BRACE);
				setState(280);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(OPEN_BRACE);
				setState(282);
				member_initializer_list();
				setState(284);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(283);
					match(COMMA);
					}
				}

				setState(286);
				match(CLOSE_BRACE);
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

	public static class Member_initializer_listContext extends ParserRuleContext {
		public List<Member_initializerContext> member_initializer() {
			return getRuleContexts(Member_initializerContext.class);
		}
		public Member_initializerContext member_initializer(int i) {
			return getRuleContext(Member_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public Member_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMember_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMember_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMember_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_initializer_listContext member_initializer_list() throws RecognitionException {
		Member_initializer_listContext _localctx = new Member_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_member_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			member_initializer();
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					match(COMMA);
					setState(292);
					member_initializer();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Member_initializerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(calculatorParser.ASSIGNMENT, 0); }
		public Initializer_valueContext initializer_value() {
			return getRuleContext(Initializer_valueContext.class,0);
		}
		public Member_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMember_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMember_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMember_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_initializerContext member_initializer() throws RecognitionException {
		Member_initializerContext _localctx = new Member_initializerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			identifier();
			setState(299);
			match(ASSIGNMENT);
			setState(300);
			initializer_value();
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

	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterInitializer_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitInitializer_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitInitializer_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_initializer_value);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case THIS:
			case TRUE:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				object_or_collection_initializer();
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

	public static class Collection_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(calculatorParser.OPEN_BRACE, 0); }
		public Element_initializer_listContext element_initializer_list() {
			return getRuleContext(Element_initializer_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(calculatorParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(calculatorParser.COMMA, 0); }
		public Collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterCollection_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitCollection_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitCollection_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_initializerContext collection_initializer() throws RecognitionException {
		Collection_initializerContext _localctx = new Collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_collection_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(OPEN_BRACE);
			setState(307);
			element_initializer_list();
			setState(309);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(308);
				match(COMMA);
				}
			}

			setState(311);
			match(CLOSE_BRACE);
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

	public static class Element_initializer_listContext extends ParserRuleContext {
		public List<Element_initializerContext> element_initializer() {
			return getRuleContexts(Element_initializerContext.class);
		}
		public Element_initializerContext element_initializer(int i) {
			return getRuleContext(Element_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public Element_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterElement_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitElement_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitElement_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_initializer_listContext element_initializer_list() throws RecognitionException {
		Element_initializer_listContext _localctx = new Element_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_element_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			element_initializer();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314);
					match(COMMA);
					setState(315);
					element_initializer();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Element_initializerContext extends ParserRuleContext {
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(calculatorParser.OPEN_BRACE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(calculatorParser.CLOSE_BRACE, 0); }
		public Element_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterElement_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitElement_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitElement_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_initializerContext element_initializer() throws RecognitionException {
		Element_initializerContext _localctx = new Element_initializerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_element_initializer);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case THIS:
			case TRUE:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				non_assignment_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(OPEN_BRACE);
				setState(323);
				expression_list();
				setState(324);
				match(CLOSE_BRACE);
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

	public static class Member_declarator_listContext extends ParserRuleContext {
		public List<Member_declaratorContext> member_declarator() {
			return getRuleContexts(Member_declaratorContext.class);
		}
		public Member_declaratorContext member_declarator(int i) {
			return getRuleContext(Member_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMember_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMember_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMember_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declarator_listContext member_declarator_list() throws RecognitionException {
		Member_declarator_listContext _localctx = new Member_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_member_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			member_declarator();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				member_declarator();
				}
				}
				setState(335);
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

	public static class Member_declaratorContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(calculatorParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMember_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMember_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMember_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_member_declarator);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				identifier();
				setState(338);
				match(ASSIGNMENT);
				setState(339);
				expression();
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

	public static class Unbound_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(calculatorParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(calculatorParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(calculatorParser.DOT, i);
		}
		public List<Generic_dimension_specifierContext> generic_dimension_specifier() {
			return getRuleContexts(Generic_dimension_specifierContext.class);
		}
		public Generic_dimension_specifierContext generic_dimension_specifier(int i) {
			return getRuleContext(Generic_dimension_specifierContext.class,i);
		}
		public Unbound_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbound_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterUnbound_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitUnbound_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitUnbound_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unbound_type_nameContext unbound_type_name() throws RecognitionException {
		Unbound_type_nameContext _localctx = new Unbound_type_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unbound_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			identifier();
			setState(352);
			switch (_input.LA(1)) {
			case EOF:
			case DOT:
			case LT:
				{
				setState(345);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(344);
					generic_dimension_specifier();
					}
				}

				}
				break;
			case DOUBLE_COLON:
				{
				setState(347);
				match(DOUBLE_COLON);
				setState(348);
				identifier();
				setState(350);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(349);
					generic_dimension_specifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(354);
				match(DOT);
				setState(355);
				identifier();
				setState(357);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(356);
					generic_dimension_specifier();
					}
				}

				}
				}
				setState(363);
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

	public static class Generic_dimension_specifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(calculatorParser.LT, 0); }
		public TerminalNode GT() { return getToken(calculatorParser.GT, 0); }
		public CommasContext commas() {
			return getRuleContext(CommasContext.class,0);
		}
		public Generic_dimension_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_dimension_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterGeneric_dimension_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitGeneric_dimension_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitGeneric_dimension_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_dimension_specifierContext generic_dimension_specifier() throws RecognitionException {
		Generic_dimension_specifierContext _localctx = new Generic_dimension_specifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_generic_dimension_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LT);
			setState(366);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(365);
				commas();
				}
			}

			setState(368);
			match(GT);
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

	public static class CommasContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public CommasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterCommas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitCommas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitCommas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommasContext commas() throws RecognitionException {
		CommasContext _localctx = new CommasContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_commas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(COMMA);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				}
				}
				setState(376);
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

	public static class Checked_expressionContext extends ParserRuleContext {
		public TerminalNode CHECKED() { return getToken(calculatorParser.CHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(calculatorParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(calculatorParser.CLOSE_PARENS, 0); }
		public Checked_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checked_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterChecked_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitChecked_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitChecked_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Checked_expressionContext checked_expression() throws RecognitionException {
		Checked_expressionContext _localctx = new Checked_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_checked_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(CHECKED);
			setState(378);
			match(OPEN_PARENS);
			setState(379);
			expression();
			setState(380);
			match(CLOSE_PARENS);
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

	public static class Unchecked_expressionContext extends ParserRuleContext {
		public TerminalNode UNCHECKED() { return getToken(calculatorParser.UNCHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(calculatorParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(calculatorParser.CLOSE_PARENS, 0); }
		public Unchecked_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unchecked_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterUnchecked_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitUnchecked_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitUnchecked_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unchecked_expressionContext unchecked_expression() throws RecognitionException {
		Unchecked_expressionContext _localctx = new Unchecked_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unchecked_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(UNCHECKED);
			setState(383);
			match(OPEN_PARENS);
			setState(384);
			expression();
			setState(385);
			match(CLOSE_PARENS);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(calculatorParser.PLUS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(calculatorParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(calculatorParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(calculatorParser.TILDE, 0); }
		public Pre_increment_expressionContext pre_increment_expression() {
			return getRuleContext(Pre_increment_expressionContext.class,0);
		}
		public Pre_decrement_expressionContext pre_decrement_expression() {
			return getRuleContext(Pre_decrement_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unary_expression);
		try {
			setState(398);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case THIS:
			case TRUE:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				primary_expression();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(PLUS);
				setState(389);
				unary_expression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(MINUS);
				setState(391);
				unary_expression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				match(BANG);
				setState(393);
				unary_expression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				match(TILDE);
				setState(395);
				unary_expression();
				}
				break;
			case OP_INC:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
				pre_increment_expression();
				}
				break;
			case OP_DEC:
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
				pre_decrement_expression();
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

	public static class Cast_disambiguation_tokenContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(calculatorParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(calculatorParser.BANG, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(calculatorParser.OPEN_PARENS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(calculatorParser.ABSTRACT, 0); }
		public TerminalNode BASE() { return getToken(calculatorParser.BASE, 0); }
		public TerminalNode BOOL() { return getToken(calculatorParser.BOOL, 0); }
		public TerminalNode BREAK() { return getToken(calculatorParser.BREAK, 0); }
		public TerminalNode BYTE() { return getToken(calculatorParser.BYTE, 0); }
		public TerminalNode CASE() { return getToken(calculatorParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(calculatorParser.CATCH, 0); }
		public TerminalNode CHAR() { return getToken(calculatorParser.CHAR, 0); }
		public TerminalNode CHECKED() { return getToken(calculatorParser.CHECKED, 0); }
		public TerminalNode CLASS() { return getToken(calculatorParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(calculatorParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(calculatorParser.CONTINUE, 0); }
		public TerminalNode DECIMAL() { return getToken(calculatorParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(calculatorParser.DEFAULT, 0); }
		public TerminalNode DELEGATE() { return getToken(calculatorParser.DELEGATE, 0); }
		public TerminalNode DO() { return getToken(calculatorParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(calculatorParser.DOUBLE, 0); }
		public TerminalNode ELSE() { return getToken(calculatorParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(calculatorParser.ENUM, 0); }
		public TerminalNode EVENT() { return getToken(calculatorParser.EVENT, 0); }
		public TerminalNode EXPLICIT() { return getToken(calculatorParser.EXPLICIT, 0); }
		public TerminalNode EXTERN() { return getToken(calculatorParser.EXTERN, 0); }
		public TerminalNode FINALLY() { return getToken(calculatorParser.FINALLY, 0); }
		public TerminalNode FIXED() { return getToken(calculatorParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(calculatorParser.FLOAT, 0); }
		public TerminalNode FOR() { return getToken(calculatorParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(calculatorParser.FOREACH, 0); }
		public TerminalNode GOTO() { return getToken(calculatorParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(calculatorParser.IF, 0); }
		public TerminalNode IMPLICIT() { return getToken(calculatorParser.IMPLICIT, 0); }
		public TerminalNode IN() { return getToken(calculatorParser.IN, 0); }
		public TerminalNode INT() { return getToken(calculatorParser.INT, 0); }
		public TerminalNode INTERFACE() { return getToken(calculatorParser.INTERFACE, 0); }
		public TerminalNode INTERNAL() { return getToken(calculatorParser.INTERNAL, 0); }
		public TerminalNode LOCK() { return getToken(calculatorParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(calculatorParser.LONG, 0); }
		public TerminalNode NAMESPACE() { return getToken(calculatorParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(calculatorParser.NEW, 0); }
		public TerminalNode OBJECT() { return getToken(calculatorParser.OBJECT, 0); }
		public TerminalNode OPERATOR() { return getToken(calculatorParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(calculatorParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(calculatorParser.OVERRIDE, 0); }
		public TerminalNode PARAMS() { return getToken(calculatorParser.PARAMS, 0); }
		public TerminalNode PRIVATE() { return getToken(calculatorParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(calculatorParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(calculatorParser.PUBLIC, 0); }
		public TerminalNode READONLY() { return getToken(calculatorParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(calculatorParser.REF, 0); }
		public TerminalNode RETURN() { return getToken(calculatorParser.RETURN, 0); }
		public TerminalNode SBYTE() { return getToken(calculatorParser.SBYTE, 0); }
		public TerminalNode SEALED() { return getToken(calculatorParser.SEALED, 0); }
		public TerminalNode SHORT() { return getToken(calculatorParser.SHORT, 0); }
		public TerminalNode SIZEOF() { return getToken(calculatorParser.SIZEOF, 0); }
		public TerminalNode STACKALLOC() { return getToken(calculatorParser.STACKALLOC, 0); }
		public TerminalNode STATIC() { return getToken(calculatorParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(calculatorParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(calculatorParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(calculatorParser.SWITCH, 0); }
		public TerminalNode THIS() { return getToken(calculatorParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(calculatorParser.THROW, 0); }
		public TerminalNode TRY() { return getToken(calculatorParser.TRY, 0); }
		public TerminalNode TYPEOF() { return getToken(calculatorParser.TYPEOF, 0); }
		public TerminalNode UINT() { return getToken(calculatorParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(calculatorParser.ULONG, 0); }
		public TerminalNode UNCHECKED() { return getToken(calculatorParser.UNCHECKED, 0); }
		public TerminalNode UNSAFE() { return getToken(calculatorParser.UNSAFE, 0); }
		public TerminalNode USHORT() { return getToken(calculatorParser.USHORT, 0); }
		public TerminalNode USING() { return getToken(calculatorParser.USING, 0); }
		public TerminalNode VIRTUAL() { return getToken(calculatorParser.VIRTUAL, 0); }
		public TerminalNode VOID() { return getToken(calculatorParser.VOID, 0); }
		public TerminalNode VOLATILE() { return getToken(calculatorParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(calculatorParser.WHILE, 0); }
		public Cast_disambiguation_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_disambiguation_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterCast_disambiguation_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitCast_disambiguation_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitCast_disambiguation_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_disambiguation_tokenContext cast_disambiguation_token() throws RecognitionException {
		Cast_disambiguation_tokenContext _localctx = new Cast_disambiguation_tokenContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cast_disambiguation_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			switch (_input.LA(1)) {
			case TILDE:
				{
				setState(400);
				match(TILDE);
				}
				break;
			case BANG:
				{
				setState(401);
				match(BANG);
				}
				break;
			case OPEN_PARENS:
				{
				setState(402);
				match(OPEN_PARENS);
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(403);
				identifier();
				}
				break;
			case FALSE:
			case NULL:
			case TRUE:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				{
				setState(404);
				literal();
				}
				break;
			case ABSTRACT:
				{
				setState(405);
				match(ABSTRACT);
				}
				break;
			case BASE:
				{
				setState(406);
				match(BASE);
				}
				break;
			case BOOL:
				{
				setState(407);
				match(BOOL);
				}
				break;
			case BREAK:
				{
				setState(408);
				match(BREAK);
				}
				break;
			case BYTE:
				{
				setState(409);
				match(BYTE);
				}
				break;
			case CASE:
				{
				setState(410);
				match(CASE);
				}
				break;
			case CATCH:
				{
				setState(411);
				match(CATCH);
				}
				break;
			case CHAR:
				{
				setState(412);
				match(CHAR);
				}
				break;
			case CHECKED:
				{
				setState(413);
				match(CHECKED);
				}
				break;
			case CLASS:
				{
				setState(414);
				match(CLASS);
				}
				break;
			case CONST:
				{
				setState(415);
				match(CONST);
				}
				break;
			case CONTINUE:
				{
				setState(416);
				match(CONTINUE);
				}
				break;
			case DECIMAL:
				{
				setState(417);
				match(DECIMAL);
				}
				break;
			case DEFAULT:
				{
				setState(418);
				match(DEFAULT);
				}
				break;
			case DELEGATE:
				{
				setState(419);
				match(DELEGATE);
				}
				break;
			case DO:
				{
				setState(420);
				match(DO);
				}
				break;
			case DOUBLE:
				{
				setState(421);
				match(DOUBLE);
				}
				break;
			case ELSE:
				{
				setState(422);
				match(ELSE);
				}
				break;
			case ENUM:
				{
				setState(423);
				match(ENUM);
				}
				break;
			case EVENT:
				{
				setState(424);
				match(EVENT);
				}
				break;
			case EXPLICIT:
				{
				setState(425);
				match(EXPLICIT);
				}
				break;
			case EXTERN:
				{
				setState(426);
				match(EXTERN);
				}
				break;
			case FINALLY:
				{
				setState(427);
				match(FINALLY);
				}
				break;
			case FIXED:
				{
				setState(428);
				match(FIXED);
				}
				break;
			case FLOAT:
				{
				setState(429);
				match(FLOAT);
				}
				break;
			case FOR:
				{
				setState(430);
				match(FOR);
				}
				break;
			case FOREACH:
				{
				setState(431);
				match(FOREACH);
				}
				break;
			case GOTO:
				{
				setState(432);
				match(GOTO);
				}
				break;
			case IF:
				{
				setState(433);
				match(IF);
				}
				break;
			case IMPLICIT:
				{
				setState(434);
				match(IMPLICIT);
				}
				break;
			case IN:
				{
				setState(435);
				match(IN);
				}
				break;
			case INT:
				{
				setState(436);
				match(INT);
				}
				break;
			case INTERFACE:
				{
				setState(437);
				match(INTERFACE);
				}
				break;
			case INTERNAL:
				{
				setState(438);
				match(INTERNAL);
				}
				break;
			case LOCK:
				{
				setState(439);
				match(LOCK);
				}
				break;
			case LONG:
				{
				setState(440);
				match(LONG);
				}
				break;
			case NAMESPACE:
				{
				setState(441);
				match(NAMESPACE);
				}
				break;
			case NEW:
				{
				setState(442);
				match(NEW);
				}
				break;
			case OBJECT:
				{
				setState(443);
				match(OBJECT);
				}
				break;
			case OPERATOR:
				{
				setState(444);
				match(OPERATOR);
				}
				break;
			case OUT:
				{
				setState(445);
				match(OUT);
				}
				break;
			case OVERRIDE:
				{
				setState(446);
				match(OVERRIDE);
				}
				break;
			case PARAMS:
				{
				setState(447);
				match(PARAMS);
				}
				break;
			case PRIVATE:
				{
				setState(448);
				match(PRIVATE);
				}
				break;
			case PROTECTED:
				{
				setState(449);
				match(PROTECTED);
				}
				break;
			case PUBLIC:
				{
				setState(450);
				match(PUBLIC);
				}
				break;
			case READONLY:
				{
				setState(451);
				match(READONLY);
				}
				break;
			case REF:
				{
				setState(452);
				match(REF);
				}
				break;
			case RETURN:
				{
				setState(453);
				match(RETURN);
				}
				break;
			case SBYTE:
				{
				setState(454);
				match(SBYTE);
				}
				break;
			case SEALED:
				{
				setState(455);
				match(SEALED);
				}
				break;
			case SHORT:
				{
				setState(456);
				match(SHORT);
				}
				break;
			case SIZEOF:
				{
				setState(457);
				match(SIZEOF);
				}
				break;
			case STACKALLOC:
				{
				setState(458);
				match(STACKALLOC);
				}
				break;
			case STATIC:
				{
				setState(459);
				match(STATIC);
				}
				break;
			case STRING:
				{
				setState(460);
				match(STRING);
				}
				break;
			case STRUCT:
				{
				setState(461);
				match(STRUCT);
				}
				break;
			case SWITCH:
				{
				setState(462);
				match(SWITCH);
				}
				break;
			case THIS:
				{
				setState(463);
				match(THIS);
				}
				break;
			case THROW:
				{
				setState(464);
				match(THROW);
				}
				break;
			case TRY:
				{
				setState(465);
				match(TRY);
				}
				break;
			case TYPEOF:
				{
				setState(466);
				match(TYPEOF);
				}
				break;
			case UINT:
				{
				setState(467);
				match(UINT);
				}
				break;
			case ULONG:
				{
				setState(468);
				match(ULONG);
				}
				break;
			case UNCHECKED:
				{
				setState(469);
				match(UNCHECKED);
				}
				break;
			case UNSAFE:
				{
				setState(470);
				match(UNSAFE);
				}
				break;
			case USHORT:
				{
				setState(471);
				match(USHORT);
				}
				break;
			case USING:
				{
				setState(472);
				match(USING);
				}
				break;
			case VIRTUAL:
				{
				setState(473);
				match(VIRTUAL);
				}
				break;
			case VOID:
				{
				setState(474);
				match(VOID);
				}
				break;
			case VOLATILE:
				{
				setState(475);
				match(VOLATILE);
				}
				break;
			case WHILE:
				{
				setState(476);
				match(WHILE);
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

	public static class Pre_increment_expressionContext extends ParserRuleContext {
		public TerminalNode OP_INC() { return getToken(calculatorParser.OP_INC, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Pre_increment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_increment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPre_increment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPre_increment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPre_increment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_increment_expressionContext pre_increment_expression() throws RecognitionException {
		Pre_increment_expressionContext _localctx = new Pre_increment_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pre_increment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(OP_INC);
			setState(480);
			unary_expression();
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

	public static class Pre_decrement_expressionContext extends ParserRuleContext {
		public TerminalNode OP_DEC() { return getToken(calculatorParser.OP_DEC, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Pre_decrement_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_decrement_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPre_decrement_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPre_decrement_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPre_decrement_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_decrement_expressionContext pre_decrement_expression() throws RecognitionException {
		Pre_decrement_expressionContext _localctx = new Pre_decrement_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pre_decrement_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(OP_DEC);
			setState(483);
			unary_expression();
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(calculatorParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(calculatorParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(calculatorParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(calculatorParser.DIV, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(calculatorParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(calculatorParser.PERCENT, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			unary_expression();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (STAR - 120)) | (1L << (DIV - 120)) | (1L << (PERCENT - 120)))) != 0)) {
				{
				setState(492);
				switch (_input.LA(1)) {
				case STAR:
					{
					{
					setState(486);
					match(STAR);
					setState(487);
					unary_expression();
					}
					}
					break;
				case DIV:
					{
					{
					setState(488);
					match(DIV);
					setState(489);
					unary_expression();
					}
					}
					break;
				case PERCENT:
					{
					{
					setState(490);
					match(PERCENT);
					setState(491);
					unary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(496);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(calculatorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(calculatorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(calculatorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(calculatorParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			multiplicative_expression();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(502);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(498);
					match(PLUS);
					setState(499);
					multiplicative_expression();
					}
					}
					break;
				case MINUS:
					{
					{
					setState(500);
					match(MINUS);
					setState(501);
					multiplicative_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(506);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> OP_LEFT_SHIFT() { return getTokens(calculatorParser.OP_LEFT_SHIFT); }
		public TerminalNode OP_LEFT_SHIFT(int i) {
			return getToken(calculatorParser.OP_LEFT_SHIFT, i);
		}
		public List<Right_shiftContext> right_shift() {
			return getRuleContexts(Right_shiftContext.class);
		}
		public Right_shiftContext right_shift(int i) {
			return getRuleContext(Right_shiftContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			additive_expression();
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(513);
					switch (_input.LA(1)) {
					case OP_LEFT_SHIFT:
						{
						{
						setState(508);
						match(OP_LEFT_SHIFT);
						setState(509);
						additive_expression();
						}
						}
						break;
					case GT:
						{
						{
						setState(510);
						right_shift();
						setState(511);
						additive_expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(calculatorParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(calculatorParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(calculatorParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(calculatorParser.GT, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(calculatorParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(calculatorParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(calculatorParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(calculatorParser.OP_GE, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			shift_expression();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (LT - 129)) | (1L << (GT - 129)) | (1L << (OP_LE - 129)) | (1L << (OP_GE - 129)))) != 0)) {
				{
				setState(527);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(519);
					match(LT);
					setState(520);
					shift_expression();
					}
					break;
				case GT:
					{
					setState(521);
					match(GT);
					setState(522);
					shift_expression();
					}
					break;
				case OP_LE:
					{
					setState(523);
					match(OP_LE);
					setState(524);
					shift_expression();
					}
					break;
				case OP_GE:
					{
					setState(525);
					match(OP_GE);
					setState(526);
					shift_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(531);
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

	public static class Shift_disambiguation_tokenContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(calculatorParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(calculatorParser.CLOSE_PARENS, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(calculatorParser.CLOSE_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(calculatorParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(calculatorParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(calculatorParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(calculatorParser.DOT, 0); }
		public TerminalNode INTERR() { return getToken(calculatorParser.INTERR, 0); }
		public TerminalNode OP_EQ() { return getToken(calculatorParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(calculatorParser.OP_NE, 0); }
		public TerminalNode GT() { return getToken(calculatorParser.GT, 0); }
		public Shift_disambiguation_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_disambiguation_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterShift_disambiguation_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitShift_disambiguation_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitShift_disambiguation_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_disambiguation_tokenContext shift_disambiguation_token() throws RecognitionException {
		Shift_disambiguation_tokenContext _localctx = new Shift_disambiguation_tokenContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_shift_disambiguation_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (CLOSE_BRACKET - 111)) | (1L << (OPEN_PARENS - 111)) | (1L << (CLOSE_PARENS - 111)) | (1L << (DOT - 111)) | (1L << (COMMA - 111)) | (1L << (COLON - 111)) | (1L << (SEMICOLON - 111)) | (1L << (GT - 111)) | (1L << (INTERR - 111)) | (1L << (OP_EQ - 111)) | (1L << (OP_NE - 111)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Is_disambiguation_tokenContext extends ParserRuleContext {
		public TerminalNode CLOSE_PARENS() { return getToken(calculatorParser.CLOSE_PARENS, 0); }
		public TerminalNode OP_AND() { return getToken(calculatorParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(calculatorParser.OP_OR, 0); }
		public TerminalNode INTERR() { return getToken(calculatorParser.INTERR, 0); }
		public Is_disambiguation_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_disambiguation_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterIs_disambiguation_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitIs_disambiguation_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitIs_disambiguation_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_disambiguation_tokenContext is_disambiguation_token() throws RecognitionException {
		Is_disambiguation_tokenContext _localctx = new Is_disambiguation_tokenContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_is_disambiguation_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (CLOSE_PARENS - 113)) | (1L << (INTERR - 113)) | (1L << (OP_AND - 113)) | (1L << (OP_OR - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(calculatorParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(calculatorParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(calculatorParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(calculatorParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			relational_expression();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ || _la==OP_NE) {
				{
				setState(541);
				switch (_input.LA(1)) {
				case OP_EQ:
					{
					{
					setState(537);
					match(OP_EQ);
					setState(538);
					relational_expression();
					}
					}
					break;
				case OP_NE:
					{
					{
					setState(539);
					match(OP_NE);
					setState(540);
					relational_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(545);
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

	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(calculatorParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(calculatorParser.AMP, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			equality_expression();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(547);
				match(AMP);
				setState(548);
				equality_expression();
				}
				}
				setState(553);
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(calculatorParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(calculatorParser.CARET, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			and_expression();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(555);
				match(CARET);
				setState(556);
				and_expression();
				}
				}
				setState(561);
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> BITWISE_OR() { return getTokens(calculatorParser.BITWISE_OR); }
		public TerminalNode BITWISE_OR(int i) {
			return getToken(calculatorParser.BITWISE_OR, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			exclusive_or_expression();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITWISE_OR) {
				{
				{
				setState(563);
				match(BITWISE_OR);
				setState(564);
				exclusive_or_expression();
				}
				}
				setState(569);
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

	public static class Conditional_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(calculatorParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(calculatorParser.OP_AND, i);
		}
		public Conditional_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterConditional_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitConditional_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitConditional_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_and_expressionContext conditional_and_expression() throws RecognitionException {
		Conditional_and_expressionContext _localctx = new Conditional_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conditional_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			inclusive_or_expression();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(571);
				match(OP_AND);
				setState(572);
				inclusive_or_expression();
				}
				}
				setState(577);
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

	public static class Conditional_or_expressionContext extends ParserRuleContext {
		public List<Conditional_and_expressionContext> conditional_and_expression() {
			return getRuleContexts(Conditional_and_expressionContext.class);
		}
		public Conditional_and_expressionContext conditional_and_expression(int i) {
			return getRuleContext(Conditional_and_expressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(calculatorParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(calculatorParser.OP_OR, i);
		}
		public Conditional_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterConditional_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitConditional_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitConditional_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_or_expressionContext conditional_or_expression() throws RecognitionException {
		Conditional_or_expressionContext _localctx = new Conditional_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_conditional_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			conditional_and_expression();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(579);
				match(OP_OR);
				setState(580);
				conditional_and_expression();
				}
				}
				setState(585);
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

	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Conditional_or_expressionContext conditional_or_expression() {
			return getRuleContext(Conditional_or_expressionContext.class,0);
		}
		public TerminalNode OP_COALESCING() { return getToken(calculatorParser.OP_COALESCING, 0); }
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_coalescing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterNull_coalescing_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitNull_coalescing_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitNull_coalescing_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		Null_coalescing_expressionContext _localctx = new Null_coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_null_coalescing_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			conditional_or_expression();
			setState(589);
			_la = _input.LA(1);
			if (_la==OP_COALESCING) {
				{
				setState(587);
				match(OP_COALESCING);
				setState(588);
				null_coalescing_expression();
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(calculatorParser.INTERR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(calculatorParser.COLON, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			null_coalescing_expression();
			setState(597);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(592);
				match(INTERR);
				setState(593);
				expression();
				setState(594);
				match(COLON);
				setState(595);
				expression();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			unary_expression();
			setState(600);
			assignment_operator();
			setState(601);
			expression();
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(calculatorParser.ASSIGNMENT, 0); }
		public TerminalNode OP_ADD_ASSIGNMENT() { return getToken(calculatorParser.OP_ADD_ASSIGNMENT, 0); }
		public TerminalNode OP_SUB_ASSIGNMENT() { return getToken(calculatorParser.OP_SUB_ASSIGNMENT, 0); }
		public TerminalNode OP_MULT_ASSIGNMENT() { return getToken(calculatorParser.OP_MULT_ASSIGNMENT, 0); }
		public TerminalNode OP_DIV_ASSIGNMENT() { return getToken(calculatorParser.OP_DIV_ASSIGNMENT, 0); }
		public TerminalNode OP_MOD_ASSIGNMENT() { return getToken(calculatorParser.OP_MOD_ASSIGNMENT, 0); }
		public TerminalNode OP_AND_ASSIGNMENT() { return getToken(calculatorParser.OP_AND_ASSIGNMENT, 0); }
		public TerminalNode OP_OR_ASSIGNMENT() { return getToken(calculatorParser.OP_OR_ASSIGNMENT, 0); }
		public TerminalNode OP_XOR_ASSIGNMENT() { return getToken(calculatorParser.OP_XOR_ASSIGNMENT, 0); }
		public TerminalNode OP_LEFT_SHIFT_ASSIGNMENT() { return getToken(calculatorParser.OP_LEFT_SHIFT_ASSIGNMENT, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ASSIGNMENT - 128)) | (1L << (OP_ADD_ASSIGNMENT - 128)) | (1L << (OP_SUB_ASSIGNMENT - 128)) | (1L << (OP_MULT_ASSIGNMENT - 128)) | (1L << (OP_DIV_ASSIGNMENT - 128)) | (1L << (OP_MOD_ASSIGNMENT - 128)) | (1L << (OP_AND_ASSIGNMENT - 128)) | (1L << (OP_OR_ASSIGNMENT - 128)) | (1L << (OP_XOR_ASSIGNMENT - 128)) | (1L << (OP_LEFT_SHIFT_ASSIGNMENT - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expression);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				non_assignment_expression();
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

	public static class Non_assignment_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Non_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterNon_assignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitNon_assignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitNon_assignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_assignment_expressionContext non_assignment_expression() throws RecognitionException {
		Non_assignment_expressionContext _localctx = new Non_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_non_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			conditional_expression();
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			expression();
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_boolean_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			expression();
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

	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterVariable_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitVariable_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitVariable_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			variable_declarator();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(616);
				match(COMMA);
				setState(617);
				variable_declarator();
				}
				}
				setState(622);
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

	public static class Variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(calculatorParser.ASSIGNMENT, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterVariable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitVariable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitVariable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variable_declarator);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				identifier();
				setState(625);
				match(ASSIGNMENT);
				setState(626);
				variable_initializer();
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

	public static class Variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterVariable_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitVariable_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitVariable_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initializerContext variable_initializer() throws RecognitionException {
		Variable_initializerContext _localctx = new Variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variable_initializer);
		try {
			setState(632);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case THIS:
			case TRUE:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				array_initializer();
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

	public static class Rank_specifiersContext extends ParserRuleContext {
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Rank_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterRank_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitRank_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRank_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rank_specifiersContext rank_specifiers() throws RecognitionException {
		Rank_specifiersContext _localctx = new Rank_specifiersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_rank_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(634);
				rank_specifier();
				}
				}
				setState(637); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
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

	public static class Rank_specifierContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(calculatorParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(calculatorParser.CLOSE_BRACKET, 0); }
		public Dim_separatorsContext dim_separators() {
			return getRuleContext(Dim_separatorsContext.class,0);
		}
		public Rank_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterRank_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitRank_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRank_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rank_specifierContext rank_specifier() throws RecognitionException {
		Rank_specifierContext _localctx = new Rank_specifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(OPEN_BRACKET);
			setState(641);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(640);
				dim_separators();
				}
			}

			setState(643);
			match(CLOSE_BRACKET);
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

	public static class Dim_separatorsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public Dim_separatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_separators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterDim_separators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitDim_separators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitDim_separators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_separatorsContext dim_separators() throws RecognitionException {
		Dim_separatorsContext _localctx = new Dim_separatorsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dim_separators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(COMMA);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(646);
				match(COMMA);
				}
				}
				setState(651);
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

	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(calculatorParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(calculatorParser.CLOSE_BRACE, 0); }
		public Variable_initializer_listContext variable_initializer_list() {
			return getRuleContext(Variable_initializer_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(calculatorParser.COMMA, 0); }
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterArray_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitArray_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitArray_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_array_initializer);
		int _la;
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(OPEN_BRACE);
				setState(653);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(OPEN_BRACE);
				setState(655);
				variable_initializer_list();
				setState(657);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(656);
					match(COMMA);
					}
				}

				setState(659);
				match(CLOSE_BRACE);
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

	public static class Variable_initializer_listContext extends ParserRuleContext {
		public List<Variable_initializerContext> variable_initializer() {
			return getRuleContexts(Variable_initializerContext.class);
		}
		public Variable_initializerContext variable_initializer(int i) {
			return getRuleContext(Variable_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(calculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calculatorParser.COMMA, i);
		}
		public Variable_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterVariable_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitVariable_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitVariable_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initializer_listContext variable_initializer_list() throws RecognitionException {
		Variable_initializer_listContext _localctx = new Variable_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_variable_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			variable_initializer();
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(664);
					match(COMMA);
					setState(665);
					variable_initializer();
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class From_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(calculatorParser.FROM, 0); }
		public From_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterFrom_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitFrom_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitFrom_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_contextual_keywordContext from_contextual_keyword() throws RecognitionException {
		From_contextual_keywordContext _localctx = new From_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_from_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(FROM);
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

	public static class Let_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(calculatorParser.LET, 0); }
		public Let_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterLet_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitLet_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitLet_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_contextual_keywordContext let_contextual_keyword() throws RecognitionException {
		Let_contextual_keywordContext _localctx = new Let_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_let_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(LET);
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

	public static class Where_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(calculatorParser.WHERE, 0); }
		public Where_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterWhere_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitWhere_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitWhere_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_contextual_keywordContext where_contextual_keyword() throws RecognitionException {
		Where_contextual_keywordContext _localctx = new Where_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_where_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(WHERE);
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

	public static class Join_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(calculatorParser.JOIN, 0); }
		public Join_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterJoin_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitJoin_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitJoin_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_contextual_keywordContext join_contextual_keyword() throws RecognitionException {
		Join_contextual_keywordContext _localctx = new Join_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_join_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(JOIN);
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

	public static class On_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(calculatorParser.ON, 0); }
		public On_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterOn_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitOn_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitOn_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_contextual_keywordContext on_contextual_keyword() throws RecognitionException {
		On_contextual_keywordContext _localctx = new On_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_on_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(ON);
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

	public static class Equals_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(calculatorParser.EQUALS, 0); }
		public Equals_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterEquals_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitEquals_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitEquals_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equals_contextual_keywordContext equals_contextual_keyword() throws RecognitionException {
		Equals_contextual_keywordContext _localctx = new Equals_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_equals_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(EQUALS);
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

	public static class Into_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(calculatorParser.INTO, 0); }
		public Into_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterInto_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitInto_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitInto_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_contextual_keywordContext into_contextual_keyword() throws RecognitionException {
		Into_contextual_keywordContext _localctx = new Into_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_into_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(INTO);
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

	public static class Orderby_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(calculatorParser.ORDERBY, 0); }
		public Orderby_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterOrderby_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitOrderby_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitOrderby_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_contextual_keywordContext orderby_contextual_keyword() throws RecognitionException {
		Orderby_contextual_keywordContext _localctx = new Orderby_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_orderby_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(ORDERBY);
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

	public static class Ascending_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode ASCENDING() { return getToken(calculatorParser.ASCENDING, 0); }
		public Ascending_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascending_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAscending_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAscending_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAscending_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ascending_contextual_keywordContext ascending_contextual_keyword() throws RecognitionException {
		Ascending_contextual_keywordContext _localctx = new Ascending_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ascending_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(ASCENDING);
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

	public static class Descending_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode DESCENDING() { return getToken(calculatorParser.DESCENDING, 0); }
		public Descending_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descending_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterDescending_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitDescending_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitDescending_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Descending_contextual_keywordContext descending_contextual_keyword() throws RecognitionException {
		Descending_contextual_keywordContext _localctx = new Descending_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_descending_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(DESCENDING);
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

	public static class Select_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(calculatorParser.SELECT, 0); }
		public Select_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterSelect_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitSelect_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSelect_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_contextual_keywordContext select_contextual_keyword() throws RecognitionException {
		Select_contextual_keywordContext _localctx = new Select_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_select_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(SELECT);
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

	public static class Group_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(calculatorParser.GROUP, 0); }
		public Group_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterGroup_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitGroup_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitGroup_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_contextual_keywordContext group_contextual_keyword() throws RecognitionException {
		Group_contextual_keywordContext _localctx = new Group_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_group_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(GROUP);
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

	public static class By_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(calculatorParser.BY, 0); }
		public By_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterBy_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitBy_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitBy_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final By_contextual_keywordContext by_contextual_keyword() throws RecognitionException {
		By_contextual_keywordContext _localctx = new By_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_by_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(BY);
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

	public static class Partial_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode PARTIAL() { return getToken(calculatorParser.PARTIAL, 0); }
		public Partial_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPartial_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPartial_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPartial_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partial_contextual_keywordContext partial_contextual_keyword() throws RecognitionException {
		Partial_contextual_keywordContext _localctx = new Partial_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_partial_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(PARTIAL);
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

	public static class Alias_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(calculatorParser.ALIAS, 0); }
		public Alias_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAlias_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAlias_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAlias_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_contextual_keywordContext alias_contextual_keyword() throws RecognitionException {
		Alias_contextual_keywordContext _localctx = new Alias_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_alias_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(ALIAS);
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

	public static class Yield_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(calculatorParser.YIELD, 0); }
		public Yield_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterYield_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitYield_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitYield_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_contextual_keywordContext yield_contextual_keyword() throws RecognitionException {
		Yield_contextual_keywordContext _localctx = new Yield_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_yield_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(YIELD);
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

	public static class Get_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(calculatorParser.GET, 0); }
		public Get_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterGet_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitGet_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitGet_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_contextual_keywordContext get_contextual_keyword() throws RecognitionException {
		Get_contextual_keywordContext _localctx = new Get_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_get_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(GET);
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

	public static class Set_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(calculatorParser.SET, 0); }
		public Set_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterSet_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitSet_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSet_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_contextual_keywordContext set_contextual_keyword() throws RecognitionException {
		Set_contextual_keywordContext _localctx = new Set_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_set_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(SET);
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

	public static class Add_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(calculatorParser.ADD, 0); }
		public Add_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAdd_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAdd_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAdd_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_contextual_keywordContext add_contextual_keyword() throws RecognitionException {
		Add_contextual_keywordContext _localctx = new Add_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_add_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(ADD);
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

	public static class Remove_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(calculatorParser.REMOVE, 0); }
		public Remove_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterRemove_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitRemove_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRemove_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Remove_contextual_keywordContext remove_contextual_keyword() throws RecognitionException {
		Remove_contextual_keywordContext _localctx = new Remove_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_remove_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(REMOVE);
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

	public static class Dynamic_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode DYNAMIC() { return getToken(calculatorParser.DYNAMIC, 0); }
		public Dynamic_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterDynamic_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitDynamic_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitDynamic_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_contextual_keywordContext dynamic_contextual_keyword() throws RecognitionException {
		Dynamic_contextual_keywordContext _localctx = new Dynamic_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dynamic_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(DYNAMIC);
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

	public static class ArglistContext extends ParserRuleContext {
		public TerminalNode ARGLIST() { return getToken(calculatorParser.ARGLIST, 0); }
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_arglist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(ARGLIST);
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

	public static class Right_arrowContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode ASSIGNMENT() { return getToken(calculatorParser.ASSIGNMENT, 0); }
		public TerminalNode GT() { return getToken(calculatorParser.GT, 0); }
		public Right_arrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterRight_arrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitRight_arrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRight_arrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_arrowContext right_arrow() throws RecognitionException {
		Right_arrowContext _localctx = new Right_arrowContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_right_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			((Right_arrowContext)_localctx).first = match(ASSIGNMENT);
			setState(716);
			((Right_arrowContext)_localctx).second = match(GT);
			setState(717);
			if (!((((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
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

	public static class Right_shiftContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public List<TerminalNode> GT() { return getTokens(calculatorParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(calculatorParser.GT, i);
		}
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterRight_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitRight_shift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRight_shift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			((Right_shiftContext)_localctx).first = match(GT);
			setState(720);
			((Right_shiftContext)_localctx).second = match(GT);
			setState(721);
			if (!((((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
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

	public static class Right_shift_assignmentContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode GT() { return getToken(calculatorParser.GT, 0); }
		public TerminalNode OP_GE() { return getToken(calculatorParser.OP_GE, 0); }
		public Right_shift_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterRight_shift_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitRight_shift_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRight_shift_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_shift_assignmentContext right_shift_assignment() throws RecognitionException {
		Right_shift_assignmentContext _localctx = new Right_shift_assignmentContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_right_shift_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			((Right_shift_assignmentContext)_localctx).first = match(GT);
			setState(724);
			((Right_shift_assignmentContext)_localctx).second = match(OP_GE);
			setState(725);
			if (!((((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
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
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(calculatorParser.INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(calculatorParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(calculatorParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(calculatorParser.STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(calculatorParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_literal);
		try {
			setState(733);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				boolean_literal();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(729);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(730);
				match(CHARACTER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(731);
				match(STRING_LITERAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(732);
				match(NULL);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(calculatorParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(calculatorParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(calculatorParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(calculatorParser.AS, 0); }
		public TerminalNode BASE() { return getToken(calculatorParser.BASE, 0); }
		public TerminalNode BOOL() { return getToken(calculatorParser.BOOL, 0); }
		public TerminalNode BREAK() { return getToken(calculatorParser.BREAK, 0); }
		public TerminalNode BYTE() { return getToken(calculatorParser.BYTE, 0); }
		public TerminalNode CASE() { return getToken(calculatorParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(calculatorParser.CATCH, 0); }
		public TerminalNode CHAR() { return getToken(calculatorParser.CHAR, 0); }
		public TerminalNode CHECKED() { return getToken(calculatorParser.CHECKED, 0); }
		public TerminalNode CLASS() { return getToken(calculatorParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(calculatorParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(calculatorParser.CONTINUE, 0); }
		public TerminalNode DECIMAL() { return getToken(calculatorParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(calculatorParser.DEFAULT, 0); }
		public TerminalNode DELEGATE() { return getToken(calculatorParser.DELEGATE, 0); }
		public TerminalNode DO() { return getToken(calculatorParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(calculatorParser.DOUBLE, 0); }
		public TerminalNode ELSE() { return getToken(calculatorParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(calculatorParser.ENUM, 0); }
		public TerminalNode EVENT() { return getToken(calculatorParser.EVENT, 0); }
		public TerminalNode EXPLICIT() { return getToken(calculatorParser.EXPLICIT, 0); }
		public TerminalNode EXTERN() { return getToken(calculatorParser.EXTERN, 0); }
		public TerminalNode FALSE() { return getToken(calculatorParser.FALSE, 0); }
		public TerminalNode FINALLY() { return getToken(calculatorParser.FINALLY, 0); }
		public TerminalNode FIXED() { return getToken(calculatorParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(calculatorParser.FLOAT, 0); }
		public TerminalNode FOR() { return getToken(calculatorParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(calculatorParser.FOREACH, 0); }
		public TerminalNode GOTO() { return getToken(calculatorParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(calculatorParser.IF, 0); }
		public TerminalNode IMPLICIT() { return getToken(calculatorParser.IMPLICIT, 0); }
		public TerminalNode IN() { return getToken(calculatorParser.IN, 0); }
		public TerminalNode INT() { return getToken(calculatorParser.INT, 0); }
		public TerminalNode INTERFACE() { return getToken(calculatorParser.INTERFACE, 0); }
		public TerminalNode INTERNAL() { return getToken(calculatorParser.INTERNAL, 0); }
		public TerminalNode IS() { return getToken(calculatorParser.IS, 0); }
		public TerminalNode LOCK() { return getToken(calculatorParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(calculatorParser.LONG, 0); }
		public TerminalNode NAMESPACE() { return getToken(calculatorParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(calculatorParser.NEW, 0); }
		public TerminalNode NULL() { return getToken(calculatorParser.NULL, 0); }
		public TerminalNode OBJECT() { return getToken(calculatorParser.OBJECT, 0); }
		public TerminalNode OPERATOR() { return getToken(calculatorParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(calculatorParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(calculatorParser.OVERRIDE, 0); }
		public TerminalNode PARAMS() { return getToken(calculatorParser.PARAMS, 0); }
		public TerminalNode PRIVATE() { return getToken(calculatorParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(calculatorParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(calculatorParser.PUBLIC, 0); }
		public TerminalNode READONLY() { return getToken(calculatorParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(calculatorParser.REF, 0); }
		public TerminalNode RETURN() { return getToken(calculatorParser.RETURN, 0); }
		public TerminalNode SBYTE() { return getToken(calculatorParser.SBYTE, 0); }
		public TerminalNode SEALED() { return getToken(calculatorParser.SEALED, 0); }
		public TerminalNode SHORT() { return getToken(calculatorParser.SHORT, 0); }
		public TerminalNode SIZEOF() { return getToken(calculatorParser.SIZEOF, 0); }
		public TerminalNode STACKALLOC() { return getToken(calculatorParser.STACKALLOC, 0); }
		public TerminalNode STATIC() { return getToken(calculatorParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(calculatorParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(calculatorParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(calculatorParser.SWITCH, 0); }
		public TerminalNode THIS() { return getToken(calculatorParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(calculatorParser.THROW, 0); }
		public TerminalNode TRUE() { return getToken(calculatorParser.TRUE, 0); }
		public TerminalNode TRY() { return getToken(calculatorParser.TRY, 0); }
		public TerminalNode TYPEOF() { return getToken(calculatorParser.TYPEOF, 0); }
		public TerminalNode UINT() { return getToken(calculatorParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(calculatorParser.ULONG, 0); }
		public TerminalNode UNCHECKED() { return getToken(calculatorParser.UNCHECKED, 0); }
		public TerminalNode UNSAFE() { return getToken(calculatorParser.UNSAFE, 0); }
		public TerminalNode USHORT() { return getToken(calculatorParser.USHORT, 0); }
		public TerminalNode USING() { return getToken(calculatorParser.USING, 0); }
		public TerminalNode VIRTUAL() { return getToken(calculatorParser.VIRTUAL, 0); }
		public TerminalNode VOID() { return getToken(calculatorParser.VOID, 0); }
		public TerminalNode VOLATILE() { return getToken(calculatorParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(calculatorParser.WHILE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << AS) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CASE) | (1L << CATCH) | (1L << CHAR) | (1L << CHECKED) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DO) | (1L << DOUBLE) | (1L << ELSE) | (1L << ENUM) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FALSE) | (1L << FINALLY) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << GOTO) | (1L << IF) | (1L << IMPLICIT) | (1L << IN) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IS) | (1L << LOCK) | (1L << LONG) | (1L << NAMESPACE) | (1L << NEW) | (1L << NULL) | (1L << OBJECT) | (1L << OPERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OUT - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARAMS - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (REF - 64)) | (1L << (RETURN - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCT - 64)) | (1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (THROW - 64)) | (1L << (TRUE - 64)) | (1L << (TRY - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (USING - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Method_invocation2Context extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(calculatorParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(calculatorParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public Method_invocation2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMethod_invocation2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMethod_invocation2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMethod_invocation2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invocation2Context method_invocation2() throws RecognitionException {
		Method_invocation2Context _localctx = new Method_invocation2Context(_ctx, getState());
		enterRule(_localctx, 184, RULE_method_invocation2);
		int _la;
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(OPEN_PARENS);
				setState(741);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (ADD - 5)) | (1L << (ALIAS - 5)) | (1L << (ARGLIST - 5)) | (1L << (ASCENDING - 5)) | (1L << (BOOL - 5)) | (1L << (BY - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (CHECKED - 5)) | (1L << (DECIMAL - 5)) | (1L << (DESCENDING - 5)) | (1L << (DOUBLE - 5)) | (1L << (DYNAMIC - 5)) | (1L << (EQUALS - 5)) | (1L << (FALSE - 5)) | (1L << (FLOAT - 5)) | (1L << (FROM - 5)) | (1L << (GET - 5)) | (1L << (GROUP - 5)) | (1L << (INT - 5)) | (1L << (INTO - 5)) | (1L << (JOIN - 5)) | (1L << (LET - 5)) | (1L << (LONG - 5)) | (1L << (NULL - 5)) | (1L << (OBJECT - 5)) | (1L << (ON - 5)) | (1L << (ORDERBY - 5)) | (1L << (PARTIAL - 5)))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (REMOVE - 73)) | (1L << (SBYTE - 73)) | (1L << (SELECT - 73)) | (1L << (SET - 73)) | (1L << (SHORT - 73)) | (1L << (STRING - 73)) | (1L << (THIS - 73)) | (1L << (TRUE - 73)) | (1L << (UINT - 73)) | (1L << (ULONG - 73)) | (1L << (UNCHECKED - 73)) | (1L << (USHORT - 73)) | (1L << (WHERE - 73)) | (1L << (YIELD - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (INTEGER_LITERAL - 73)) | (1L << (REAL_LITERAL - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (OPEN_PARENS - 73)) | (1L << (PLUS - 73)) | (1L << (MINUS - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (OP_INC - 73)) | (1L << (OP_DEC - 73)))) != 0)) {
					{
					setState(740);
					argument_list();
					}
				}

				setState(743);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				primary_expression_start();
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

	public static class Object_creation_expression2Context extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(calculatorParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(calculatorParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Object_creation_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_creation_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterObject_creation_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitObject_creation_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitObject_creation_expression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_creation_expression2Context object_creation_expression2() throws RecognitionException {
		Object_creation_expression2Context _localctx = new Object_creation_expression2Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_object_creation_expression2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(OPEN_PARENS);
			setState(749);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (ADD - 5)) | (1L << (ALIAS - 5)) | (1L << (ARGLIST - 5)) | (1L << (ASCENDING - 5)) | (1L << (BOOL - 5)) | (1L << (BY - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (CHECKED - 5)) | (1L << (DECIMAL - 5)) | (1L << (DESCENDING - 5)) | (1L << (DOUBLE - 5)) | (1L << (DYNAMIC - 5)) | (1L << (EQUALS - 5)) | (1L << (FALSE - 5)) | (1L << (FLOAT - 5)) | (1L << (FROM - 5)) | (1L << (GET - 5)) | (1L << (GROUP - 5)) | (1L << (INT - 5)) | (1L << (INTO - 5)) | (1L << (JOIN - 5)) | (1L << (LET - 5)) | (1L << (LONG - 5)) | (1L << (NULL - 5)) | (1L << (OBJECT - 5)) | (1L << (ON - 5)) | (1L << (ORDERBY - 5)) | (1L << (PARTIAL - 5)))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (REMOVE - 73)) | (1L << (SBYTE - 73)) | (1L << (SELECT - 73)) | (1L << (SET - 73)) | (1L << (SHORT - 73)) | (1L << (STRING - 73)) | (1L << (THIS - 73)) | (1L << (TRUE - 73)) | (1L << (UINT - 73)) | (1L << (ULONG - 73)) | (1L << (UNCHECKED - 73)) | (1L << (USHORT - 73)) | (1L << (WHERE - 73)) | (1L << (YIELD - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (INTEGER_LITERAL - 73)) | (1L << (REAL_LITERAL - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (OPEN_PARENS - 73)) | (1L << (PLUS - 73)) | (1L << (MINUS - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (OP_INC - 73)) | (1L << (OP_DEC - 73)))) != 0)) {
				{
				setState(748);
				argument_list();
				}
			}

			setState(751);
			match(CLOSE_PARENS);
			setState(753);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(752);
				object_or_collection_initializer();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 86:
			return right_arrow_sempred((Right_arrowContext)_localctx, predIndex);
		case 87:
			return right_shift_sempred((Right_shiftContext)_localctx, predIndex);
		case 88:
			return right_shift_assignment_sempred((Right_shift_assignmentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean right_arrow_sempred(Right_arrowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return (((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_sempred(Right_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return (((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_assignment_sempred(Right_shift_assignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return (((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u02f6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6\u00cc\n\6\f\6\16"+
		"\6\u00cf\13\6\3\7\5\7\u00d2\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\7"+
		"\n\u00dd\n\n\f\n\16\n\u00e0\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e7\n\n\3\n"+
		"\7\n\u00ea\n\n\f\n\16\n\u00ed\13\n\7\n\u00ef\n\n\f\n\16\n\u00f2\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fb\n\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u010f"+
		"\n\21\f\21\16\21\u0112\13\21\3\22\3\22\3\23\3\23\5\23\u0118\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u011f\n\24\3\24\3\24\5\24\u0123\n\24\3\25\3"+
		"\25\3\25\7\25\u0128\n\25\f\25\16\25\u012b\13\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\5\27\u0133\n\27\3\30\3\30\3\30\5\30\u0138\n\30\3\30\3\30\3\31"+
		"\3\31\3\31\7\31\u013f\n\31\f\31\16\31\u0142\13\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0149\n\32\3\33\3\33\3\33\7\33\u014e\n\33\f\33\16\33\u0151"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u0158\n\34\3\35\3\35\5\35\u015c\n"+
		"\35\3\35\3\35\3\35\5\35\u0161\n\35\5\35\u0163\n\35\3\35\3\35\3\35\5\35"+
		"\u0168\n\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35\3\36\3\36\5\36\u0171"+
		"\n\36\3\36\3\36\3\37\3\37\7\37\u0177\n\37\f\37\16\37\u017a\13\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0191\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01e0\n#\3$\3$\3$\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\7&\u01ef\n&\f&\16&\u01f2\13&\3\'\3\'\3\'\3\'\3\'\7"+
		"\'\u01f9\n\'\f\'\16\'\u01fc\13\'\3(\3(\3(\3(\3(\3(\7(\u0204\n(\f(\16("+
		"\u0207\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0212\n)\f)\16)\u0215\13)\3*"+
		"\3*\3+\3+\3,\3,\3,\3,\3,\7,\u0220\n,\f,\16,\u0223\13,\3-\3-\3-\7-\u0228"+
		"\n-\f-\16-\u022b\13-\3.\3.\3.\7.\u0230\n.\f.\16.\u0233\13.\3/\3/\3/\7"+
		"/\u0238\n/\f/\16/\u023b\13/\3\60\3\60\3\60\7\60\u0240\n\60\f\60\16\60"+
		"\u0243\13\60\3\61\3\61\3\61\7\61\u0248\n\61\f\61\16\61\u024b\13\61\3\62"+
		"\3\62\3\62\5\62\u0250\n\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0258\n"+
		"\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u0262\n\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3:\7:\u026d\n:\f:\16:\u0270\13:\3;\3;\3;\3;\3;\5;\u0277"+
		"\n;\3<\3<\5<\u027b\n<\3=\6=\u027e\n=\r=\16=\u027f\3>\3>\5>\u0284\n>\3"+
		">\3>\3?\3?\7?\u028a\n?\f?\16?\u028d\13?\3@\3@\3@\3@\3@\5@\u0294\n@\3@"+
		"\3@\5@\u0298\n@\3A\3A\3A\7A\u029d\nA\fA\16A\u02a0\13A\3B\3B\3C\3C\3D\3"+
		"D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3"+
		"P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3"+
		"Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\5[\u02e0\n[\3\\\3\\\3]\3]\3^\3^\5^\u02e8"+
		"\n^\3^\3^\5^\u02ec\n^\3_\3_\5_\u02f0\n_\3_\3_\5_\u02f4\n_\3_\2\2`\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\2\t"+
		"\23\2\7\t\13\13\17\17\33\33\36\36!!+,..\65\65\678??AAEEKKOPffhi\20\2\r"+
		"\r\20\20\23\23\30\30\35\35((\62\62::>>MMQQUU]^aa\5\2qw\u0084\u0085\u008d"+
		"\u008e\5\2ss\u0085\u0085\u008a\u008b\5\2\u0082\u0082\u0091\u0098\u009a"+
		"\u009a\4\2%%ZZ\23\2\6\6\n\n\f\16\20\32\34\35\37 \"*--/\64\66\669>@@BD"+
		"FJLNQegg\u0330\2\u00be\3\2\2\2\4\u00c2\3\2\2\2\6\u00c4\3\2\2\2\b\u00c6"+
		"\3\2\2\2\n\u00c8\3\2\2\2\f\u00d1\3\2\2\2\16\u00d5\3\2\2\2\20\u00d8\3\2"+
		"\2\2\22\u00da\3\2\2\2\24\u00fa\3\2\2\2\26\u00fc\3\2\2\2\30\u0100\3\2\2"+
		"\2\32\u0103\3\2\2\2\34\u0107\3\2\2\2\36\u0109\3\2\2\2 \u010b\3\2\2\2\""+
		"\u0113\3\2\2\2$\u0117\3\2\2\2&\u0122\3\2\2\2(\u0124\3\2\2\2*\u012c\3\2"+
		"\2\2,\u0132\3\2\2\2.\u0134\3\2\2\2\60\u013b\3\2\2\2\62\u0148\3\2\2\2\64"+
		"\u014a\3\2\2\2\66\u0157\3\2\2\28\u0159\3\2\2\2:\u016e\3\2\2\2<\u0174\3"+
		"\2\2\2>\u017b\3\2\2\2@\u0180\3\2\2\2B\u0190\3\2\2\2D\u01df\3\2\2\2F\u01e1"+
		"\3\2\2\2H\u01e4\3\2\2\2J\u01e7\3\2\2\2L\u01f3\3\2\2\2N\u01fd\3\2\2\2P"+
		"\u0208\3\2\2\2R\u0216\3\2\2\2T\u0218\3\2\2\2V\u021a\3\2\2\2X\u0224\3\2"+
		"\2\2Z\u022c\3\2\2\2\\\u0234\3\2\2\2^\u023c\3\2\2\2`\u0244\3\2\2\2b\u024c"+
		"\3\2\2\2d\u0251\3\2\2\2f\u0259\3\2\2\2h\u025d\3\2\2\2j\u0261\3\2\2\2l"+
		"\u0263\3\2\2\2n\u0265\3\2\2\2p\u0267\3\2\2\2r\u0269\3\2\2\2t\u0276\3\2"+
		"\2\2v\u027a\3\2\2\2x\u027d\3\2\2\2z\u0281\3\2\2\2|\u0287\3\2\2\2~\u0297"+
		"\3\2\2\2\u0080\u0299\3\2\2\2\u0082\u02a1\3\2\2\2\u0084\u02a3\3\2\2\2\u0086"+
		"\u02a5\3\2\2\2\u0088\u02a7\3\2\2\2\u008a\u02a9\3\2\2\2\u008c\u02ab\3\2"+
		"\2\2\u008e\u02ad\3\2\2\2\u0090\u02af\3\2\2\2\u0092\u02b1\3\2\2\2\u0094"+
		"\u02b3\3\2\2\2\u0096\u02b5\3\2\2\2\u0098\u02b7\3\2\2\2\u009a\u02b9\3\2"+
		"\2\2\u009c\u02bb\3\2\2\2\u009e\u02bd\3\2\2\2\u00a0\u02bf\3\2\2\2\u00a2"+
		"\u02c1\3\2\2\2\u00a4\u02c3\3\2\2\2\u00a6\u02c5\3\2\2\2\u00a8\u02c7\3\2"+
		"\2\2\u00aa\u02c9\3\2\2\2\u00ac\u02cb\3\2\2\2\u00ae\u02cd\3\2\2\2\u00b0"+
		"\u02d1\3\2\2\2\u00b2\u02d5\3\2\2\2\u00b4\u02df\3\2\2\2\u00b6\u02e1\3\2"+
		"\2\2\u00b8\u02e3\3\2\2\2\u00ba\u02eb\3\2\2\2\u00bc\u02ed\3\2\2\2\u00be"+
		"\u00bf\5j\66\2\u00bf\u00c0\7\u0082\2\2\u00c0\u00c1\7\2\2\3\u00c1\3\3\2"+
		"\2\2\u00c2\u00c3\t\2\2\2\u00c3\5\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\7\3"+
		"\2\2\2\u00c6\u00c7\5j\66\2\u00c7\t\3\2\2\2\u00c8\u00cd\5\f\7\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cc\5\f\7\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\13\3\2\2\2\u00cf\u00cd\3\2\2"+
		"\2\u00d0\u00d2\5\16\b\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\5\20\t\2\u00d4\r\3\2\2\2\u00d5\u00d6\5\4\3"+
		"\2\u00d6\u00d7\7v\2\2\u00d7\17\3\2\2\2\u00d8\u00d9\5j\66\2\u00d9\21\3"+
		"\2\2\2\u00da\u00de\5\24\13\2\u00db\u00dd\5\26\f\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00f0"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e7\5\u00ba^\2\u00e2\u00e7\7\u0088"+
		"\2\2\u00e3\u00e7\7\u0089\2\2\u00e4\u00e5\7\u008c\2\2\u00e5\u00e7\5\4\3"+
		"\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea\5\26\f\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\23\3\2\2\2\u00f2\u00f0\3\2\2"+
		"\2\u00f3\u00fb\5\u00b4[\2\u00f4\u00fb\5\30\r\2\u00f5\u00fb\5\32\16\2\u00f6"+
		"\u00fb\5\36\20\2\u00f7\u00fb\5\"\22\2\u00f8\u00fb\5> \2\u00f9\u00fb\5"+
		"@!\2\u00fa\u00f3\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa"+
		"\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb\25\3\2\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\5 \21\2\u00fe\u00ff"+
		"\7q\2\2\u00ff\27\3\2\2\2\u0100\u0101\5\4\3\2\u0101\u0102\5\6\4\2\u0102"+
		"\31\3\2\2\2\u0103\u0104\7r\2\2\u0104\u0105\5j\66\2\u0105\u0106\7s\2\2"+
		"\u0106\33\3\2\2\2\u0107\u0108\5\22\n\2\u0108\35\3\2\2\2\u0109\u010a\t"+
		"\3\2\2\u010a\37\3\2\2\2\u010b\u0110\5j\66\2\u010c\u010d\7u\2\2\u010d\u010f"+
		"\5j\66\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111!\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7X\2\2\u0114"+
		"#\3\2\2\2\u0115\u0118\5&\24\2\u0116\u0118\5.\30\2\u0117\u0115\3\2\2\2"+
		"\u0117\u0116\3\2\2\2\u0118%\3\2\2\2\u0119\u011a\7n\2\2\u011a\u0123\7o"+
		"\2\2\u011b\u011c\7n\2\2\u011c\u011e\5(\25\2\u011d\u011f\7u\2\2\u011e\u011d"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7o\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011b\3\2\2\2\u0123\'\3\2\2\2"+
		"\u0124\u0129\5*\26\2\u0125\u0126\7u\2\2\u0126\u0128\5*\26\2\u0127\u0125"+
		"\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		")\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\5\4\3\2\u012d\u012e\7\u0082"+
		"\2\2\u012e\u012f\5,\27\2\u012f+\3\2\2\2\u0130\u0133\5j\66\2\u0131\u0133"+
		"\5$\23\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133-\3\2\2\2\u0134"+
		"\u0135\7n\2\2\u0135\u0137\5\60\31\2\u0136\u0138\7u\2\2\u0137\u0136\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7o\2\2\u013a"+
		"/\3\2\2\2\u013b\u0140\5\62\32\2\u013c\u013d\7u\2\2\u013d\u013f\5\62\32"+
		"\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\61\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0149\5l\67\2\u0144"+
		"\u0145\7n\2\2\u0145\u0146\5 \21\2\u0146\u0147\7o\2\2\u0147\u0149\3\2\2"+
		"\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0149\63\3\2\2\2\u014a\u014f"+
		"\5\66\34\2\u014b\u014c\7u\2\2\u014c\u014e\5\66\34\2\u014d\u014b\3\2\2"+
		"\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\65"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0158\5\22\n\2\u0153\u0154\5\4\3\2"+
		"\u0154\u0155\7\u0082\2\2\u0155\u0156\5j\66\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0158\67\3\2\2\2\u0159\u0162\5\4\3"+
		"\2\u015a\u015c\5:\36\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0163"+
		"\3\2\2\2\u015d\u015e\7\u0086\2\2\u015e\u0160\5\4\3\2\u015f\u0161\5:\36"+
		"\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015b"+
		"\3\2\2\2\u0162\u015d\3\2\2\2\u0163\u016b\3\2\2\2\u0164\u0165\7t\2\2\u0165"+
		"\u0167\5\4\3\2\u0166\u0168\5:\36\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016a\3\2\2\2\u0169\u0164\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c9\3\2\2\2\u016d\u016b\3\2\2\2"+
		"\u016e\u0170\7\u0083\2\2\u016f\u0171\5<\37\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\u0084\2\2\u0173;\3\2"+
		"\2\2\u0174\u0178\7u\2\2\u0175\u0177\7u\2\2\u0176\u0175\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179=\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017c\7\24\2\2\u017c\u017d\7r\2\2\u017d\u017e\5j"+
		"\66\2\u017e\u017f\7s\2\2\u017f?\3\2\2\2\u0180\u0181\7_\2\2\u0181\u0182"+
		"\7r\2\2\u0182\u0183\5j\66\2\u0183\u0184\7s\2\2\u0184A\3\2\2\2\u0185\u0191"+
		"\5\22\n\2\u0186\u0187\7x\2\2\u0187\u0191\5B\"\2\u0188\u0189\7y\2\2\u0189"+
		"\u0191\5B\"\2\u018a\u018b\7\u0080\2\2\u018b\u0191\5B\"\2\u018c\u018d\7"+
		"\u0081\2\2\u018d\u0191\5B\"\2\u018e\u0191\5F$\2\u018f\u0191\5H%\2\u0190"+
		"\u0185\3\2\2\2\u0190\u0186\3\2\2\2\u0190\u0188\3\2\2\2\u0190\u018a\3\2"+
		"\2\2\u0190\u018c\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191"+
		"C\3\2\2\2\u0192\u01e0\7\u0081\2\2\u0193\u01e0\7\u0080\2\2\u0194\u01e0"+
		"\7r\2\2\u0195\u01e0\5\4\3\2\u0196\u01e0\5\u00b4[\2\u0197\u01e0\7\6\2\2"+
		"\u0198\u01e0\7\f\2\2\u0199\u01e0\7\r\2\2\u019a\u01e0\7\16\2\2\u019b\u01e0"+
		"\7\20\2\2\u019c\u01e0\7\21\2\2\u019d\u01e0\7\22\2\2\u019e\u01e0\7\23\2"+
		"\2\u019f\u01e0\7\24\2\2\u01a0\u01e0\7\25\2\2\u01a1\u01e0\7\26\2\2\u01a2"+
		"\u01e0\7\27\2\2\u01a3\u01e0\7\30\2\2\u01a4\u01e0\7\31\2\2\u01a5\u01e0"+
		"\7\32\2\2\u01a6\u01e0\7\34\2\2\u01a7\u01e0\7\35\2\2\u01a8\u01e0\7\37\2"+
		"\2\u01a9\u01e0\7 \2\2\u01aa\u01e0\7\"\2\2\u01ab\u01e0\7#\2\2\u01ac\u01e0"+
		"\7$\2\2\u01ad\u01e0\7&\2\2\u01ae\u01e0\7\'\2\2\u01af\u01e0\7(\2\2\u01b0"+
		"\u01e0\7)\2\2\u01b1\u01e0\7*\2\2\u01b2\u01e0\7-\2\2\u01b3\u01e0\7/\2\2"+
		"\u01b4\u01e0\7\60\2\2\u01b5\u01e0\7\61\2\2\u01b6\u01e0\7\62\2\2\u01b7"+
		"\u01e0\7\63\2\2\u01b8\u01e0\7\64\2\2\u01b9\u01e0\79\2\2\u01ba\u01e0\7"+
		":\2\2\u01bb\u01e0\7;\2\2\u01bc\u01e0\7<\2\2\u01bd\u01e0\7>\2\2\u01be\u01e0"+
		"\7@\2\2\u01bf\u01e0\7B\2\2\u01c0\u01e0\7C\2\2\u01c1\u01e0\7D\2\2\u01c2"+
		"\u01e0\7F\2\2\u01c3\u01e0\7G\2\2\u01c4\u01e0\7H\2\2\u01c5\u01e0\7I\2\2"+
		"\u01c6\u01e0\7J\2\2\u01c7\u01e0\7L\2\2\u01c8\u01e0\7M\2\2\u01c9\u01e0"+
		"\7N\2\2\u01ca\u01e0\7Q\2\2\u01cb\u01e0\7R\2\2\u01cc\u01e0\7S\2\2\u01cd"+
		"\u01e0\7T\2\2\u01ce\u01e0\7U\2\2\u01cf\u01e0\7V\2\2\u01d0\u01e0\7W\2\2"+
		"\u01d1\u01e0\7X\2\2\u01d2\u01e0\7Y\2\2\u01d3\u01e0\7[\2\2\u01d4\u01e0"+
		"\7\\\2\2\u01d5\u01e0\7]\2\2\u01d6\u01e0\7^\2\2\u01d7\u01e0\7_\2\2\u01d8"+
		"\u01e0\7`\2\2\u01d9\u01e0\7a\2\2\u01da\u01e0\7b\2\2\u01db\u01e0\7c\2\2"+
		"\u01dc\u01e0\7d\2\2\u01dd\u01e0\7e\2\2\u01de\u01e0\7g\2\2\u01df\u0192"+
		"\3\2\2\2\u01df\u0193\3\2\2\2\u01df\u0194\3\2\2\2\u01df\u0195\3\2\2\2\u01df"+
		"\u0196\3\2\2\2\u01df\u0197\3\2\2\2\u01df\u0198\3\2\2\2\u01df\u0199\3\2"+
		"\2\2\u01df\u019a\3\2\2\2\u01df\u019b\3\2\2\2\u01df\u019c\3\2\2\2\u01df"+
		"\u019d\3\2\2\2\u01df\u019e\3\2\2\2\u01df\u019f\3\2\2\2\u01df\u01a0\3\2"+
		"\2\2\u01df\u01a1\3\2\2\2\u01df\u01a2\3\2\2\2\u01df\u01a3\3\2\2\2\u01df"+
		"\u01a4\3\2\2\2\u01df\u01a5\3\2\2\2\u01df\u01a6\3\2\2\2\u01df\u01a7\3\2"+
		"\2\2\u01df\u01a8\3\2\2\2\u01df\u01a9\3\2\2\2\u01df\u01aa\3\2\2\2\u01df"+
		"\u01ab\3\2\2\2\u01df\u01ac\3\2\2\2\u01df\u01ad\3\2\2\2\u01df\u01ae\3\2"+
		"\2\2\u01df\u01af\3\2\2\2\u01df\u01b0\3\2\2\2\u01df\u01b1\3\2\2\2\u01df"+
		"\u01b2\3\2\2\2\u01df\u01b3\3\2\2\2\u01df\u01b4\3\2\2\2\u01df\u01b5\3\2"+
		"\2\2\u01df\u01b6\3\2\2\2\u01df\u01b7\3\2\2\2\u01df\u01b8\3\2\2\2\u01df"+
		"\u01b9\3\2\2\2\u01df\u01ba\3\2\2\2\u01df\u01bb\3\2\2\2\u01df\u01bc\3\2"+
		"\2\2\u01df\u01bd\3\2\2\2\u01df\u01be\3\2\2\2\u01df\u01bf\3\2\2\2\u01df"+
		"\u01c0\3\2\2\2\u01df\u01c1\3\2\2\2\u01df\u01c2\3\2\2\2\u01df\u01c3\3\2"+
		"\2\2\u01df\u01c4\3\2\2\2\u01df\u01c5\3\2\2\2\u01df\u01c6\3\2\2\2\u01df"+
		"\u01c7\3\2\2\2\u01df\u01c8\3\2\2\2\u01df\u01c9\3\2\2\2\u01df\u01ca\3\2"+
		"\2\2\u01df\u01cb\3\2\2\2\u01df\u01cc\3\2\2\2\u01df\u01cd\3\2\2\2\u01df"+
		"\u01ce\3\2\2\2\u01df\u01cf\3\2\2\2\u01df\u01d0\3\2\2\2\u01df\u01d1\3\2"+
		"\2\2\u01df\u01d2\3\2\2\2\u01df\u01d3\3\2\2\2\u01df\u01d4\3\2\2\2\u01df"+
		"\u01d5\3\2\2\2\u01df\u01d6\3\2\2\2\u01df\u01d7\3\2\2\2\u01df\u01d8\3\2"+
		"\2\2\u01df\u01d9\3\2\2\2\u01df\u01da\3\2\2\2\u01df\u01db\3\2\2\2\u01df"+
		"\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0E\3\2\2\2"+
		"\u01e1\u01e2\7\u0088\2\2\u01e2\u01e3\5B\"\2\u01e3G\3\2\2\2\u01e4\u01e5"+
		"\7\u0089\2\2\u01e5\u01e6\5B\"\2\u01e6I\3\2\2\2\u01e7\u01f0\5B\"\2\u01e8"+
		"\u01e9\7z\2\2\u01e9\u01ef\5B\"\2\u01ea\u01eb\7{\2\2\u01eb\u01ef\5B\"\2"+
		"\u01ec\u01ed\7|\2\2\u01ed\u01ef\5B\"\2\u01ee\u01e8\3\2\2\2\u01ee\u01ea"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1K\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01fa\5J&\2\u01f4"+
		"\u01f5\7x\2\2\u01f5\u01f9\5J&\2\u01f6\u01f7\7y\2\2\u01f7\u01f9\5J&\2\u01f8"+
		"\u01f4\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fbM\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0205"+
		"\5L\'\2\u01fe\u01ff\7\u0099\2\2\u01ff\u0204\5L\'\2\u0200\u0201\5\u00b0"+
		"Y\2\u0201\u0202\5L\'\2\u0202\u0204\3\2\2\2\u0203\u01fe\3\2\2\2\u0203\u0200"+
		"\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"O\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0213\5N(\2\u0209\u020a\7\u0083\2"+
		"\2\u020a\u0212\5N(\2\u020b\u020c\7\u0084\2\2\u020c\u0212\5N(\2\u020d\u020e"+
		"\7\u008f\2\2\u020e\u0212\5N(\2\u020f\u0210\7\u0090\2\2\u0210\u0212\5N"+
		"(\2\u0211\u0209\3\2\2\2\u0211\u020b\3\2\2\2\u0211\u020d\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214Q\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\t\4\2\2\u0217S\3\2"+
		"\2\2\u0218\u0219\t\5\2\2\u0219U\3\2\2\2\u021a\u0221\5P)\2\u021b\u021c"+
		"\7\u008d\2\2\u021c\u0220\5P)\2\u021d\u021e\7\u008e\2\2\u021e\u0220\5P"+
		")\2\u021f\u021b\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222W\3\2\2\2\u0223\u0221\3\2\2\2"+
		"\u0224\u0229\5V,\2\u0225\u0226\7}\2\2\u0226\u0228\5V,\2\u0227\u0225\3"+
		"\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"Y\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0231\5X-\2\u022d\u022e\7\177\2\2"+
		"\u022e\u0230\5X-\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232[\3\2\2\2\u0233\u0231\3\2\2\2\u0234"+
		"\u0239\5Z.\2\u0235\u0236\7~\2\2\u0236\u0238\5Z.\2\u0237\u0235\3\2\2\2"+
		"\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a]\3"+
		"\2\2\2\u023b\u0239\3\2\2\2\u023c\u0241\5\\/\2\u023d\u023e\7\u008a\2\2"+
		"\u023e\u0240\5\\/\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242_\3\2\2\2\u0243\u0241\3\2\2\2\u0244"+
		"\u0249\5^\60\2\u0245\u0246\7\u008b\2\2\u0246\u0248\5^\60\2\u0247\u0245"+
		"\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"a\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024f\5`\61\2\u024d\u024e\7\u0087"+
		"\2\2\u024e\u0250\5b\62\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"c\3\2\2\2\u0251\u0257\5b\62\2\u0252\u0253\7\u0085\2\2\u0253\u0254\5j\66"+
		"\2\u0254\u0255\7v\2\2\u0255\u0256\5j\66\2\u0256\u0258\3\2\2\2\u0257\u0252"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258e\3\2\2\2\u0259\u025a\5B\"\2\u025a\u025b"+
		"\5h\65\2\u025b\u025c\5j\66\2\u025cg\3\2\2\2\u025d\u025e\t\6\2\2\u025e"+
		"i\3\2\2\2\u025f\u0262\5f\64\2\u0260\u0262\5l\67\2\u0261\u025f\3\2\2\2"+
		"\u0261\u0260\3\2\2\2\u0262k\3\2\2\2\u0263\u0264\5d\63\2\u0264m\3\2\2\2"+
		"\u0265\u0266\5j\66\2\u0266o\3\2\2\2\u0267\u0268\5j\66\2\u0268q\3\2\2\2"+
		"\u0269\u026e\5t;\2\u026a\u026b\7u\2\2\u026b\u026d\5t;\2\u026c\u026a\3"+
		"\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"s\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0277\5\4\3\2\u0272\u0273\5\4\3\2"+
		"\u0273\u0274\7\u0082\2\2\u0274\u0275\5v<\2\u0275\u0277\3\2\2\2\u0276\u0271"+
		"\3\2\2\2\u0276\u0272\3\2\2\2\u0277u\3\2\2\2\u0278\u027b\5j\66\2\u0279"+
		"\u027b\5~@\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027bw\3\2\2\2\u027c"+
		"\u027e\5z>\2\u027d\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2\2"+
		"\2\u027f\u0280\3\2\2\2\u0280y\3\2\2\2\u0281\u0283\7p\2\2\u0282\u0284\5"+
		"|?\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0286\7q\2\2\u0286{\3\2\2\2\u0287\u028b\7u\2\2\u0288\u028a\7u\2\2\u0289"+
		"\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c}\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u028f\7n\2\2\u028f\u0298"+
		"\7o\2\2\u0290\u0291\7n\2\2\u0291\u0293\5\u0080A\2\u0292\u0294\7u\2\2\u0293"+
		"\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7o"+
		"\2\2\u0296\u0298\3\2\2\2\u0297\u028e\3\2\2\2\u0297\u0290\3\2\2\2\u0298"+
		"\177\3\2\2\2\u0299\u029e\5v<\2\u029a\u029b\7u\2\2\u029b\u029d\5v<\2\u029c"+
		"\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u0081\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\7+\2\2\u02a2"+
		"\u0083\3\2\2\2\u02a3\u02a4\78\2\2\u02a4\u0085\3\2\2\2\u02a5\u02a6\7f\2"+
		"\2\u02a6\u0087\3\2\2\2\u02a7\u02a8\7\67\2\2\u02a8\u0089\3\2\2\2\u02a9"+
		"\u02aa\7?\2\2\u02aa\u008b\3\2\2\2\u02ab\u02ac\7!\2\2\u02ac\u008d\3\2\2"+
		"\2\u02ad\u02ae\7\65\2\2\u02ae\u008f\3\2\2\2\u02af\u02b0\7A\2\2\u02b0\u0091"+
		"\3\2\2\2\u02b1\u02b2\7\13\2\2\u02b2\u0093\3\2\2\2\u02b3\u02b4\7\33\2\2"+
		"\u02b4\u0095\3\2\2\2\u02b5\u02b6\7O\2\2\u02b6\u0097\3\2\2\2\u02b7\u02b8"+
		"\7.\2\2\u02b8\u0099\3\2\2\2\u02b9\u02ba\7\17\2\2\u02ba\u009b\3\2\2\2\u02bb"+
		"\u02bc\7E\2\2\u02bc\u009d\3\2\2\2\u02bd\u02be\7\b\2\2\u02be\u009f\3\2"+
		"\2\2\u02bf\u02c0\7h\2\2\u02c0\u00a1\3\2\2\2\u02c1\u02c2\7,\2\2\u02c2\u00a3"+
		"\3\2\2\2\u02c3\u02c4\7P\2\2\u02c4\u00a5\3\2\2\2\u02c5\u02c6\7\7\2\2\u02c6"+
		"\u00a7\3\2\2\2\u02c7\u02c8\7K\2\2\u02c8\u00a9\3\2\2\2\u02c9\u02ca\7\36"+
		"\2\2\u02ca\u00ab\3\2\2\2\u02cb\u02cc\7\t\2\2\u02cc\u00ad\3\2\2\2\u02cd"+
		"\u02ce\7\u0082\2\2\u02ce\u02cf\7\u0084\2\2\u02cf\u02d0\6X\2\3\u02d0\u00af"+
		"\3\2\2\2\u02d1\u02d2\7\u0084\2\2\u02d2\u02d3\7\u0084\2\2\u02d3\u02d4\6"+
		"Y\3\3\u02d4\u00b1\3\2\2\2\u02d5\u02d6\7\u0084\2\2\u02d6\u02d7\7\u0090"+
		"\2\2\u02d7\u02d8\6Z\4\3\u02d8\u00b3\3\2\2\2\u02d9\u02e0\5\u00b6\\\2\u02da"+
		"\u02e0\7j\2\2\u02db\u02e0\7k\2\2\u02dc\u02e0\7l\2\2\u02dd\u02e0\7m\2\2"+
		"\u02de\u02e0\7=\2\2\u02df\u02d9\3\2\2\2\u02df\u02da\3\2\2\2\u02df\u02db"+
		"\3\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0"+
		"\u00b5\3\2\2\2\u02e1\u02e2\t\7\2\2\u02e2\u00b7\3\2\2\2\u02e3\u02e4\t\b"+
		"\2\2\u02e4\u00b9\3\2\2\2\u02e5\u02e7\7r\2\2\u02e6\u02e8\5\n\6\2\u02e7"+
		"\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ec\7s"+
		"\2\2\u02ea\u02ec\5\24\13\2\u02eb\u02e5\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec"+
		"\u00bb\3\2\2\2\u02ed\u02ef\7r\2\2\u02ee\u02f0\5\n\6\2\u02ef\u02ee\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\7s\2\2\u02f2"+
		"\u02f4\5$\23\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u00bd\3\2"+
		"\2\2=\u00cd\u00d1\u00de\u00e6\u00eb\u00f0\u00fa\u0110\u0117\u011e\u0122"+
		"\u0129\u0132\u0137\u0140\u0148\u014f\u0157\u015b\u0160\u0162\u0167\u016b"+
		"\u0170\u0178\u0190\u01df\u01ee\u01f0\u01f8\u01fa\u0203\u0205\u0211\u0213"+
		"\u021f\u0221\u0229\u0231\u0239\u0241\u0249\u024f\u0257\u0261\u026e\u0276"+
		"\u027a\u027f\u0283\u028b\u0293\u0297\u029e\u02df\u02e7\u02eb\u02ef\u02f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}