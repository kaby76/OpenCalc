grammar calculator;



expressionResult
   : expression ASSIGNMENT EOF
   ;


//B.2 Syntactic grammar

//B.2.1 Basic concepts
//namespace_name 
//	: namespace_or_type_name
//	;
//type_name 
//	: namespace_or_type_name
//	;

identifier:
     IDENTIFIER 
    | FROM
    | LET 
    | WHERE 
    | JOIN 
    | ON 
    | EQUALS 
    | INTO
    | ORDERBY
    | ASCENDING
    | DESCENDING
    | SELECT
    | GROUP
    | BY
    | PARTIAL
    | ALIAS
    | YIELD
    | GET
    | SET
    | ADD
    | REMOVE
    | DYNAMIC
    | ARGLIST
    ;

//namespace_or_type_name 
//  : ( identifier type_argument_list_opt
//    | qualified_alias_member
//    ) (DOT identifier type_argument_list_opt )*
//  ;

///** represents type_argument_list? */
type_argument_list_opt
//  : type_argument_list
//  | /* empty */
  : /* empty */
  ;

//B.2.2 Types
//type 
//  : base_type (INTERR | rank_specifier | STAR)*
//  ;
// added by chw
//base_type
//  : simple_type
//  | class_type  // represents types: enum, class, interface, delegate, type_parameter
//  | VOID STAR
//  ;

///** primitive types */
//simple_type 
//	: numeric_type
//	| BOOL
//	;
//numeric_type 
//	: integral_type
//	| floating_point_type
//	| DECIMAL
//	;
//integral_type 
//	: SBYTE
//	| BYTE
//	| SHORT
//	| USHORT
//	| INT
//	| UINT
//	| LONG
//	| ULONG
//	| CHAR
//	;
//floating_point_type 
//	: FLOAT
//	| DOUBLE
//	;
//nullable_type 
//	: non_nullable_value_type INTERR
//	;

// type without INTERR; undocumented but VS checks for this constraint
//non_nullable_value_type 
//	: base_type
//    ( rank_specifier
//    | STAR
//    )*
//	;

//reference_type 
//  : simple_type ((STAR | INTERR)* rank_specifier)* (STAR | INTERR)* rank_specifier 
//  | class_type ((STAR | INTERR)* rank_specifier)*
//  | VOID STAR ((STAR | INTERR)* rank_specifier)* (STAR | INTERR)* rank_specifier
//  ;
///** type_name, OBJECT, STRING */
//class_type 
//	: type_name
//	| OBJECT
//	| dynamic_contextual_keyword
//	| STRING
//	;
///** type_name */
//interface_type 
//	: type_name
//	;
///** type_name */
//delegate_type 
//	: type_name
//	;
//type_argument_list 
//	: LT type_arguments GT
//	;
//type_arguments 
//	: type_argument ( COMMA type_argument)*
//	;
//type_argument 
//	: type
//	;
// added by chw
//type_void
//  : VOID
//  ;

//B.2.3 Variables
///** expression */
variable_reference 
	: expression
	;

//B.2.4 Expressions
argument_list 
	: argument ( COMMA argument)*
	;
argument
	: argument_name? argument_value
	;
argument_name 
	: identifier COLON
	;
argument_value 
	: expression
//	| REF variable_reference
//	| OUT variable_reference
	;
primary_expression 
  : pe=primary_expression_start  bracket_expression* (
//        ( member_access2
//		    | method_invocation2
        ( method_invocation2
		    | OP_INC
		    | OP_DEC
		    | OP_PTR identifier 
		    )
		    bracket_expression*
		)*
  ;
primary_expression_start
  : literal
  | simple_name
  | parenthesized_expression
  | predefined_type // member_access
//  | qualified_alias_member  // member_access
  | this_access
//  | base_access
//  | NEW ( type ( object_creation_expression2
//               | object_or_collection_initializer
//               | OPEN_BRACKET expression_list CLOSE_BRACKET rank_specifiers? array_initializer?
//               | rank_specifiers array_initializer
//               )
//        | anonymous_object_initializer
//        | rank_specifier array_initializer
//        )
//  | typeof_expression
  | checked_expression
  | unchecked_expression
//  | default_value_expression
//  | anonymous_method_expression
//  | sizeof_expression
  ;
bracket_expression
  : OPEN_BRACKET expression_list CLOSE_BRACKET
  ;
///** identifier type_argument_list? */
simple_name 
	: identifier type_argument_list_opt
	;
///** OPEN_PARENS expression CLOSE_PARENS */
parenthesized_expression 
	: OPEN_PARENS expression CLOSE_PARENS
	;
///** primary_expression */
member_access 
  : primary_expression
  ;
predefined_type 
	: BOOL
	| BYTE
	| CHAR
	| DECIMAL
	| DOUBLE
	| FLOAT
	| INT
	| LONG
	| OBJECT
	| SBYTE
	| SHORT
	| STRING
	| UINT
	| ULONG
	| USHORT
	;

expression_list 
	: expression ( COMMA expression)*
	;
this_access 
	: THIS
	;
///** BASE and more */
//base_access
//	: BASE DOT identifier type_argument_list_opt
//	| BASE OPEN_BRACKET expression_list CLOSE_BRACKET
//	;
///** NEW type (OPEN_PARENS ... | OPEN_BRACE ...) */
//object_creation_expression 
//  : NEW type ( OPEN_PARENS argument_list? CLOSE_PARENS object_or_collection_initializer?
//             | object_or_collection_initializer
//             )
//  ;
///** starts with OPEN_BRACE */
object_or_collection_initializer 
	: object_initializer
	| collection_initializer
	;

///** starts with OPEN_BRACE */
object_initializer 
  : OPEN_BRACE CLOSE_BRACE
  | OPEN_BRACE member_initializer_list COMMA? CLOSE_BRACE
  ;
member_initializer_list 
	: member_initializer ( COMMA member_initializer)*
	;
member_initializer 
	: identifier ASSIGNMENT initializer_value
	;
initializer_value 
	: expression
	| object_or_collection_initializer
	;
///** starts with OPEN_BRACE */
collection_initializer 
  : OPEN_BRACE element_initializer_list COMMA? CLOSE_BRACE
  ;
element_initializer_list 
	: element_initializer ( COMMA element_initializer)*
	;
element_initializer 
	: non_assignment_expression
	| OPEN_BRACE expression_list CLOSE_BRACE
	;
//array_creation_expression 
//  : NEW ( array_type array_initializer
//        | non_array_type OPEN_BRACKET expression_list CLOSE_BRACKET rank_specifiers? array_initializer?
//        | rank_specifier array_initializer
//        )
//  ;
///** NEW delegate_type OPEN_PARENS expression CLOSE_PARENS */
//delegate_creation_expression 
//	: NEW delegate_type OPEN_PARENS expression CLOSE_PARENS
//	;
///** starts with NEW OPEN_BRACE */
//anonymous_object_creation_expression 
//	: NEW anonymous_object_initializer
//	;
///** starts with OPEN_BRACE */
//anonymous_object_initializer 
//  : OPEN_BRACE CLOSE_BRACE
//  | OPEN_BRACE member_declarator_list COMMA? CLOSE_BRACE
//  ;
member_declarator_list 
	: member_declarator ( COMMA member_declarator)*
	;
member_declarator 
  : primary_expression
  | identifier ASSIGNMENT expression
  ;
//typeof_expression 
//	: TYPEOF OPEN_PARENS
//	  ( unbound_type_name CLOSE_PARENS
//	  | type CLOSE_PARENS
//	  | VOID CLOSE_PARENS
//	  )
//	;
unbound_type_name 
  : identifier ( generic_dimension_specifier?
               | DOUBLE_COLON identifier generic_dimension_specifier?
               )
    (DOT identifier generic_dimension_specifier?)*
  ;
generic_dimension_specifier 
	: LT commas? GT
	;
commas 
	: COMMA ( COMMA )*
	;
checked_expression 
	: CHECKED OPEN_PARENS expression CLOSE_PARENS
	;
unchecked_expression 
	: UNCHECKED OPEN_PARENS expression CLOSE_PARENS
	;
//default_value_expression 
//	: DEFAULT OPEN_PARENS type CLOSE_PARENS
//	;

unary_expression 
//	: cast_expression
//	| primary_expression
	: primary_expression
	| PLUS unary_expression
	| MINUS unary_expression
	| BANG unary_expression
	| TILDE unary_expression
	| pre_increment_expression
	| pre_decrement_expression
//	| unary_expression_unsafe
	;
// The sequence of tokens is correct grammar for a type, and the token immediately
// following the closing parentheses is the token TILDE, the token BANG, the token OPEN_PARENS,
// an identifier, a literal, or any keyword except AS and IS.
//scan_for_cast_generic_precedence
//  : OPEN_PARENS type CLOSE_PARENS cast_disambiguation_token
//  ;

// One of these tokens must follow a valid cast in an expression, in order to
// eliminate a grammar ambiguity.
cast_disambiguation_token
  : (TILDE | BANG | OPEN_PARENS | identifier | literal | ABSTRACT | BASE | BOOL | BREAK | BYTE | CASE | CATCH
    | CHAR | CHECKED | CLASS | CONST | CONTINUE | DECIMAL | DEFAULT | DELEGATE | DO | DOUBLE | ELSE | ENUM
    | EVENT | EXPLICIT | EXTERN | FINALLY | FIXED | FLOAT | FOR | FOREACH | GOTO | IF | IMPLICIT | IN | INT
    | INTERFACE | INTERNAL | LOCK | LONG | NAMESPACE | NEW | OBJECT | OPERATOR | OUT | OVERRIDE | PARAMS
    | PRIVATE | PROTECTED | PUBLIC | READONLY | REF | RETURN | SBYTE | SEALED | SHORT | SIZEOF | STACKALLOC
    | STATIC | STRING | STRUCT | SWITCH | THIS | THROW | TRY | TYPEOF | UINT | ULONG | UNCHECKED | UNSAFE
    | USHORT | USING | VIRTUAL | VOID | VOLATILE | WHILE
    )
  ;

pre_increment_expression 
	: OP_INC unary_expression
	;
pre_decrement_expression 
	: OP_DEC unary_expression
	;
//cast_expression 
//	: OPEN_PARENS type CLOSE_PARENS unary_expression
//	;
multiplicative_expression 
	: unary_expression ( ( STAR  unary_expression ) | ( DIV  unary_expression ) | ( PERCENT  unary_expression ) )*
	;
additive_expression 
	: multiplicative_expression ( ( PLUS  multiplicative_expression ) | ( MINUS  multiplicative_expression ) )*
	;
shift_expression 
	: additive_expression ( ( OP_LEFT_SHIFT  additive_expression ) | ( right_shift  additive_expression ) )*
	;
relational_expression
  : /* shift_expression
	|*/ shift_expression ( LT shift_expression
                     | GT shift_expression
                     | OP_LE shift_expression
                     | OP_GE shift_expression
//                     | IS isType
//                     | AS type
	                   )*
	;
// Syntactic predicate rule to disambiguate  "a<b,c>d" and a<b,c>(0)"
// added by chw
//scan_for_shift_generic_precedence
//  : identifier LT type (COMMA type)* GT shift_disambiguation_token
//  ;
// One of these tokens must follow a valid generic in an expression, in order to
// eliminate a grammar ambiguity.
// added by chw
shift_disambiguation_token
  : OPEN_PARENS | CLOSE_PARENS | CLOSE_BRACKET | COLON | SEMICOLON | COMMA | DOT | INTERR | OP_EQ | OP_NE | GT
  ;
// added by chw
//isType
//  : non_nullable_value_type ( INTERR)?
//  ;
is_disambiguation_token
  : CLOSE_PARENS | OP_AND | OP_OR| INTERR
  ;
equality_expression 
	: relational_expression ( ( OP_EQ  relational_expression ) | ( OP_NE  relational_expression ) )*
	;
and_expression 
	: equality_expression ( AMP equality_expression)*
	;
exclusive_or_expression 
	: and_expression ( CARET and_expression)*
	;
inclusive_or_expression 
	: exclusive_or_expression ( BITWISE_OR exclusive_or_expression)*
	;
conditional_and_expression 
	: inclusive_or_expression ( OP_AND inclusive_or_expression)*
	;
conditional_or_expression 
	: conditional_and_expression ( OP_OR conditional_and_expression)*
	;
null_coalescing_expression 
  : conditional_or_expression (OP_COALESCING null_coalescing_expression)?
  ;
///** starts with unary_expression */
conditional_expression 
  : null_coalescing_expression (INTERR expression COLON expression)?
  ;
///** starts with OPEN_PARENS or identifier */
//lambda_expression 
//	: anonymous_function_signature right_arrow anonymous_function_body
//	;
///** starts with DELEGATE */
//anonymous_method_expression 
//	: DELEGATE explicit_anonymous_function_signature? block
//	;
///** starts with OPEN_PARENS or identifier */
//anonymous_function_signature 
//  : OPEN_PARENS CLOSE_PARENS
//  | OPEN_PARENS explicit_anonymous_function_parameter_list CLOSE_PARENS
//  | OPEN_PARENS implicit_anonymous_function_parameter_list CLOSE_PARENS
//  | implicit_anonymous_function_parameter
//  ;
//explicit_anonymous_function_signature 
//	: OPEN_PARENS explicit_anonymous_function_parameter_list? CLOSE_PARENS
//	;
//explicit_anonymous_function_parameter_list 
//	: explicit_anonymous_function_parameter ( COMMA explicit_anonymous_function_parameter)*
//	;
//explicit_anonymous_function_parameter 
//	: anonymous_function_parameter_modifier? type identifier
//	;
//anonymous_function_parameter_modifier 
//	: REF
//	| OUT
//	;
//implicit_anonymous_function_signature 
//	: OPEN_PARENS implicit_anonymous_function_parameter_list? CLOSE_PARENS
//	| implicit_anonymous_function_parameter
//	;
//implicit_anonymous_function_parameter_list 
//	: implicit_anonymous_function_parameter ( COMMA implicit_anonymous_function_parameter)*
//	;
///** identifier */
//implicit_anonymous_function_parameter 
//	: identifier
//	;
//anonymous_function_body 
//	: expression
//	| block
//	;
///** starts with from_contextual_keyword */
//query_expression 
//	: from_clause query_body
//	;
//from_clause 
//	: from_contextual_keyword type? identifier IN expression
//	;
//query_body 
//  : query_body_clauses? select_or_group_clause query_continuation?
//  ;
//query_body_clauses 
//	: query_body_clause ( query_body_clause )*
//	;
//query_body_clause 
//  : from_clause
//  | let_clause
//  | where_clause
//  | combined_join_clause
//  | orderby_clause
//  ;
//let_clause 
//	: let_contextual_keyword identifier ASSIGNMENT expression
//	;
//where_clause 
//	: where_contextual_keyword boolean_expression
//	;
//join_clause 
//	: join_contextual_keyword type? identifier IN expression on_contextual_keyword expression equals_contextual_keyword expression
//	;
//join_into_clause 
//	: join_contextual_keyword type? identifier IN expression on_contextual_keyword expression equals_contextual_keyword expression into_contextual_keyword identifier
//	;
//// added by chw
//combined_join_clause
//  : join_contextual_keyword type? identifier IN expression on_contextual_keyword expression equals_contextual_keyword expression (into_contextual_keyword identifier)?
//  ;
//orderby_clause 
//	: orderby_contextual_keyword orderings
//	;
//orderings 
//	: ordering ( COMMA  ordering )*
//	;
//ordering 
//	: expression ordering_direction?
//	;
//ordering_direction 
//	: ascending_contextual_keyword
//	| descending_contextual_keyword
//	;
//select_or_group_clause 
//	: select_clause
//	| group_clause
//	;
//select_clause 
//	: select_contextual_keyword expression
//	;
//group_clause 
//	: group_contextual_keyword expression by_contextual_keyword expression
//	;
///** starts with into_contextual_keyword */
//query_continuation 
//	: into_contextual_keyword identifier query_body
//	;

///** starts with unary_expression */
assignment 
	: unary_expression assignment_operator expression
	;
assignment_operator 
	: ASSIGNMENT
	| OP_ADD_ASSIGNMENT
	| OP_SUB_ASSIGNMENT
	| OP_MULT_ASSIGNMENT
	| OP_DIV_ASSIGNMENT
	| OP_MOD_ASSIGNMENT
	| OP_AND_ASSIGNMENT
	| OP_OR_ASSIGNMENT
	| OP_XOR_ASSIGNMENT
	| OP_LEFT_SHIFT_ASSIGNMENT
//	| right_shift_assignment
	;
expression 
	: assignment
	| non_assignment_expression
	;
non_assignment_expression
//	: lambda_expression
//	| query_expression
//	| conditional_expression
	: conditional_expression
	;
constant_expression 
	: expression
	;
boolean_expression 
	: expression
	;

//B.2.5 Statements
///** starts with identifier */
variable_declarators
	: variable_declarator ( COMMA  variable_declarator )*
	;
variable_declarator 
	: identifier
	| identifier ASSIGNMENT variable_initializer
	;
variable_initializer 
	: expression
	| array_initializer
	;

//B.2.9 Arrays
///** non_array_type rank_specifiers */
//array_type 
//	: base_type ((STAR | INTERR)* rank_specifier)+
//	;
///** type */
//non_array_type 
//	: base_type (rank_specifier | INTERR | STAR)*
//	;
///** starts with OPEN_BRACKET */
rank_specifiers 
  : rank_specifier+
  ;
///** OPEN_BRACKET dim_separators? CLOSE_BRACKET */
rank_specifier 
	: OPEN_BRACKET dim_separators? CLOSE_BRACKET
	;
dim_separators 
	: COMMA ( COMMA )*
	;
///** starts with OPEN_BRACE */
array_initializer 
  : OPEN_BRACE CLOSE_BRACE
  | OPEN_BRACE variable_initializer_list COMMA? CLOSE_BRACE
  ;
variable_initializer_list 
	: variable_initializer ( COMMA  variable_initializer )*
	;

//B.3 Grammar extensions for unsafe code


from_contextual_keyword: FROM;
let_contextual_keyword: LET;
where_contextual_keyword: WHERE;
join_contextual_keyword: JOIN;
on_contextual_keyword: ON;
equals_contextual_keyword: EQUALS;
into_contextual_keyword: INTO;
orderby_contextual_keyword: ORDERBY;
ascending_contextual_keyword: ASCENDING;
descending_contextual_keyword: DESCENDING;
select_contextual_keyword: SELECT;
group_contextual_keyword: GROUP;
by_contextual_keyword: BY;
partial_contextual_keyword: PARTIAL;
alias_contextual_keyword: ALIAS;
yield_contextual_keyword: YIELD;
get_contextual_keyword: GET;
set_contextual_keyword: SET;
add_contextual_keyword: ADD;
remove_contextual_keyword: REMOVE;
dynamic_contextual_keyword: DYNAMIC;
arglist: ARGLIST;
right_arrow
  : first=ASSIGNMENT second=GT {$first.index + 1 == $second.index}? // Nothing between the tokens?
  ;
right_shift
  : first=GT second=GT {$first.index + 1 == $second.index}? // Nothing between the tokens?
  ;
right_shift_assignment
  : first=GT second=OP_GE {$first.index + 1 == $second.index}? // Nothing between the tokens?
  ;
literal
  : boolean_literal
  | INTEGER_LITERAL
  | REAL_LITERAL
  | CHARACTER_LITERAL
  | STRING_LITERAL
  | NULL
  ;
boolean_literal
  : TRUE
  | FALSE
  ;

//B.1.7 Keywords
keyword
  : ABSTRACT
  | AS
  | BASE
  | BOOL
  | BREAK
  | BYTE
  | CASE
  | CATCH
  | CHAR
  | CHECKED
  | CLASS
  | CONST
  | CONTINUE
  | DECIMAL
  | DEFAULT
  | DELEGATE
  | DO
  | DOUBLE
  | ELSE
  | ENUM
  | EVENT
  | EXPLICIT
  | EXTERN
  | FALSE
  | FINALLY
  | FIXED
  | FLOAT
  | FOR
  | FOREACH
  | GOTO
  | IF
  | IMPLICIT
  | IN
  | INT
  | INTERFACE
  | INTERNAL
  | IS
  | LOCK
  | LONG
  | NAMESPACE
  | NEW
  | NULL
  | OBJECT
  | OPERATOR
  | OUT
  | OVERRIDE
  | PARAMS
  | PRIVATE
  | PROTECTED
  | PUBLIC
  | READONLY
  | REF
  | RETURN
  | SBYTE
  | SEALED
  | SHORT
  | SIZEOF
  | STACKALLOC
  | STATIC
  | STRING
  | STRUCT
  | SWITCH
  | THIS
  | THROW
  | TRUE
  | TRY
  | TYPEOF
  | UINT
  | ULONG
  | UNCHECKED
  | UNSAFE
  | USHORT
  | USING
  | VIRTUAL
  | VOID
  | VOLATILE
  | WHILE
  ;
// -------------------- extra rules for modularization --------------------------------

//class_definition
//  : CLASS identifier type_parameter_list? class_base? type_parameter_constraints_clauses?
//      class_body SEMICOLON?
//  ;
//struct_definition
//  : STRUCT identifier type_parameter_list? struct_interfaces? type_parameter_constraints_clauses?
//      struct_body SEMICOLON?
//  ;
//interface_definition
//  : INTERFACE identifier variant_type_parameter_list? interface_base?
//      type_parameter_constraints_clauses? interface_body SEMICOLON?
//  ;
//enum_definition
//  : ENUM identifier enum_base? enum_body SEMICOLON?
//  ;
//delegate_definition
//  : DELEGATE return_type identifier variant_type_parameter_list? OPEN_PARENS
//      formal_parameter_list? CLOSE_PARENS type_parameter_constraints_clauses? SEMICOLON
//  ;
//event_declaration2
//  : EVENT type 
//      ( variable_declarators SEMICOLON
//      | member_name OPEN_BRACE event_accessor_declarations CLOSE_BRACE
//      )
//  ;
//field_declaration2
//  : variable_declarators SEMICOLON
//  ;
//property_declaration2
//  : member_name OPEN_BRACE accessor_declarations CLOSE_BRACE
//  ;
//constant_declaration2
//  : CONST type constant_declarators SEMICOLON
//  ;
//indexer_declaration2
//  : THIS OPEN_BRACKET formal_parameter_list CLOSE_BRACKET
//      OPEN_BRACE accessor_declarations CLOSE_BRACE
//  ;
//destructor_definition
//  : TILDE identifier OPEN_PARENS CLOSE_PARENS destructor_body
//  ;
//constructor_declaration2
//  : identifier OPEN_PARENS formal_parameter_list? CLOSE_PARENS constructor_initializer? body
//  ;
//method_declaration2
//  : method_member_name type_parameter_list? OPEN_PARENS formal_parameter_list? CLOSE_PARENS
//      type_parameter_constraints_clauses? method_body
//  ;

// added by chw to allow detection of type parameters for methods
//method_member_name
//  : method_member_name2
//  ;
//method_member_name2
//  : ( identifier
//    | identifier DOUBLE_COLON identifier
//    ) (type_argument_list_opt DOT identifier)*
//  ;
//operator_declaration2
//  : OPERATOR overloadable_operator OPEN_PARENS type identifier
//         (COMMA type identifier)? CLOSE_PARENS operator_body
//  ;
//interface_method_declaration2
//  : identifier type_parameter_list? OPEN_PARENS formal_parameter_list? CLOSE_PARENS type_parameter_constraints_clauses? SEMICOLON
//  ;
//interface_property_declaration2
//  : identifier OPEN_BRACE interface_accessors CLOSE_BRACE
//  ;
//interface_event_declaration2
//  : EVENT type identifier SEMICOLON
//  ;
//interface_indexer_declaration2
//  : THIS OPEN_BRACKET formal_parameter_list CLOSE_BRACKET OPEN_BRACE interface_accessors CLOSE_BRACE
//  ;
///** starts with DOT identifier */
//member_access2
//  : DOT identifier type_argument_list_opt
//  ;
method_invocation2
  : OPEN_PARENS argument_list? CLOSE_PARENS
  | primary_expression_start
  ;
object_creation_expression2
  : OPEN_PARENS argument_list? CLOSE_PARENS object_or_collection_initializer?
  ;

//=========================
// LEXER
//=========================


BYTE_ORDER_MARK: '\u00EF\u00BB\u00BF';

//// A.1. Documentation Comments
//SINGLE_LINE_DOC_COMMENT 
//  : ('///' Input_character*) -> channel(HIDDEN)
//  ;
//DELIMITED_DOC_COMMENT 
//  : ('/**' Delimited_comment_section* Asterisks '/') -> channel(HIDDEN) 
//  ;

//B.1.1 Line Terminators
NEW_LINE 
  : ('\u000D' //'<Carriage Return Character (U+000D)>'
  | '\u000A' //'<Line Feed Character (U+000A)>'
  | '\u000D' '\u000A' //'<Carriage Return Character (U+000D) Followed By Line Feed Character (U+000A)>'
  | '\u0085' //<Next Line Character (U+0085)>'
  | '\u2028' //'<Line Separator Character (U+2028)>'
  | '\u2029' //'<Paragraph Separator Character (U+2029)>'
  ) -> channel(HIDDEN)
  ;

////B.1.2 Comments
//SINGLE_LINE_COMMENT 
//  : ('//' Input_character*) -> channel(HIDDEN)
//  ;

fragment Input_characters
  : Input_character+
  ;
fragment Input_character 
  : ~([\u000D\u000A\u0085\u2028\u2029]) //'<Any Unicode Character Except A NEW_LINE_CHARACTER>'
  ;
fragment NEW_LINE_CHARACTER 
  : '\u000D' //'<Carriage Return Character (U+000D)>'
  | '\u000A' //'<Line Feed Character (U+000A)>'
  | '\u0085' //'<Next Line Character (U+0085)>'
  | '\u2028' //'<Line Separator Character (U+2028)>'
  | '\u2029' //'<Paragraph Separator Character (U+2029)>'
  ;

//DELIMITED_COMMENT 
//  : ('/*' Delimited_comment_section* Asterisks '/') -> channel(HIDDEN)
//  ;

fragment Delimited_comment_section 
  : '/'
  | Asterisks? Not_slash_or_asterisk
  ;
fragment Asterisks 
  : '*'+
  ;
//'<Any Unicode Character Except / Or *>'
fragment Not_slash_or_asterisk 
  : ~( '/' | '*' )
  ;

//B.1.3 White Space
WHITESPACE 
  : (Whitespace_characters) -> channel(HIDDEN)
  ;

fragment Whitespace_characters 
  : Whitespace_character+
  ;

fragment Whitespace_character 
  : UNICODE_CLASS_ZS //'<Any Character With Unicode Class Zs>'
  | '\u0009' //'<Horizontal Tab Character (U+0009)>'
  | '\u000B' //'<Vertical Tab Character (U+000B)>'
  | '\u000C' //'<Form Feed Character (U+000C)>'
  ;

//B.1.5 Unicode Character Escape Sequences
fragment Unicode_escape_sequence 
  : '\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
  | '\\U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
  ;

//B.1.7 Keywords
ABSTRACT : 'abstract';
ADD: 'add';
ALIAS: 'alias';
ARGLIST: '__arglist';
AS : 'as';
ASCENDING: 'ascending';
BASE : 'base';
BOOL : 'bool';
BREAK : 'break';
BY: 'by';
BYTE : 'byte';
CASE : 'case';
CATCH : 'catch';
CHAR : 'char';
CHECKED : 'checked';
CLASS : 'class';
CONST : 'const';
CONTINUE : 'continue';
DECIMAL : 'decimal';
DEFAULT : 'default';
DELEGATE : 'delegate';
DESCENDING: 'descending';
DO : 'do';
DOUBLE : 'double';
DYNAMIC: 'dynamic';
ELSE : 'else';
ENUM : 'enum';
EQUALS: 'equals';
EVENT : 'event';
EXPLICIT : 'explicit';
EXTERN : 'extern';
FALSE : 'false';
FINALLY : 'finally';
FIXED : 'fixed';
FLOAT : 'float';
FOR : 'for';
FOREACH : 'foreach';
FROM: 'from';
GET: 'get';
GOTO : 'goto';
GROUP: 'group';
IF : 'if';
IMPLICIT : 'implicit';
IN : 'in';
INT : 'int';
INTERFACE : 'interface';
INTERNAL : 'internal';
INTO : 'into';
IS : 'is';
JOIN: 'join';
LET: 'let';
LOCK : 'lock';
LONG : 'long';
NAMESPACE : 'namespace';
NEW : 'new';
NULL : 'null';
OBJECT : 'object';
ON: 'on';
OPERATOR : 'operator';
ORDERBY: 'orderby';
OUT : 'out';
OVERRIDE : 'override';
PARAMS : 'params';
PARTIAL: 'partial';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
READONLY : 'readonly';
REF : 'ref';
REMOVE: 'remove';
RETURN : 'return';
SBYTE : 'sbyte';
SEALED : 'sealed';
SELECT: 'select';
SET: 'set';
SHORT : 'short';
SIZEOF : 'sizeof';
STACKALLOC : 'stackalloc';
STATIC : 'static';
STRING : 'string';
STRUCT : 'struct';
SWITCH : 'switch';
THIS : 'this';
THROW : 'throw';
TRUE : 'true';
TRY : 'try';
TYPEOF : 'typeof';
UINT : 'uint';
ULONG : 'ulong';
UNCHECKED : 'unchecked';
UNSAFE : 'unsafe';
USHORT : 'ushort';
USING : 'using';
VIRTUAL : 'virtual';
VOID : 'void';
VOLATILE : 'volatile';
WHERE : 'where';
WHILE : 'while';
YIELD: 'yield';

//B.1.6 Identifiers
// must be defined after all keywords so the first branch (Available_identifier) does not match keywords 
IDENTIFIER
  : Available_identifier
  | '@' Identifier_or_keyword
  ;
//'<An Identifier_or_keyword That Is Not A Keyword>'
// WARNING: ignores exclusion
fragment Available_identifier 
  : Identifier_or_keyword
  ;
fragment Identifier_or_keyword 
  : Identifier_start_character Identifier_part_character*
  ;
fragment Identifier_start_character 
  : Letter_character
  | '_'
  ;
fragment Identifier_part_character 
  : Letter_character
  | Decimal_digit_character
  | Connecting_character
  | Combining_character
  | Formatting_character
  ;
//'<A Unicode Character Of Classes Lu, Ll, Lt, Lm, Lo, Or Nl>'
// WARNING: ignores Unicode_escape_sequence
fragment Letter_character 
  : UNICODE_CLASS_LU
  | UNICODE_CLASS_LL
  | UNICODE_CLASS_LT
  | UNICODE_CLASS_LM
  | UNICODE_CLASS_LO
  | UNICODE_CLASS_NL
//  | '<A Unicode_escape_sequence Representing A Character Of Classes Lu, Ll, Lt, Lm, Lo, Or Nl>'
  ;
//'<A Unicode Character Of Classes Mn Or Mc>'
// WARNING: ignores Unicode_escape_sequence
fragment Combining_character 
  : UNICODE_CLASS_MN
  | UNICODE_CLASS_MC
//  | '<A Unicode_escape_sequence Representing A Character Of Classes Mn Or Mc>'
  ;
//'<A Unicode Character Of The Class Nd>'
// WARNING: ignores Unicode_escape_sequence
fragment Decimal_digit_character 
  : UNICODE_CLASS_ND
//  | '<A Unicode_escape_sequence Representing A Character Of The Class Nd>'
  ;
//'<A Unicode Character Of The Class Pc>'
// WARNING: ignores Unicode_escape_sequence
fragment Connecting_character 
  : UNICODE_CLASS_PC
//  | '<A Unicode_escape_sequence Representing A Character Of The Class Pc>'
  ;
//'<A Unicode Character Of The Class Cf>'
// WARNING: ignores Unicode_escape_sequence
fragment Formatting_character 
  : UNICODE_CLASS_CF
//  | '<A Unicode_escape_sequence Representing A Character Of The Class Cf>'
  ;

//B.1.8 Literals

INTEGER_LITERAL 
  : Decimal_integer_literal
  | Hexadecimal_integer_literal
  ;
fragment Decimal_integer_literal 
  : Decimal_digits Integer_type_suffix?
  ;
fragment Decimal_digits 
  : DECIMAL_DIGIT+
  ;
fragment DECIMAL_DIGIT 
  : '0'..'9'
  ;
fragment Integer_type_suffix 
  : 'U'
  | 'u'
  | 'L'
  | 'l'
  | 'UL'
  | 'Ul'
  | 'uL'
  | 'ul'
  | 'LU'
  | 'Lu'
  | 'lU'
  | 'lu'
  ;
fragment Hexadecimal_integer_literal 
  : ('0x' | '0X') Hex_digits Integer_type_suffix?
  ;
fragment Hex_digits 
  : HEX_DIGIT+
  ;
fragment HEX_DIGIT 
  : '0'..'9'
  | 'A'..'F'
  | 'a'..'f'
  ;
// added by chw
// For the rare case where 0.ToString() etc is used.
// Explanation: 0.Equals() would be parsed as an invalid real (1. branch) causing a lexer error
//
// KED KED KED DO NOT USE IN SIMPLE CALCULATOR.
//LiteralAccess
//  : INTEGER_LITERAL   
//    DOT               
//    IDENTIFIER       
//  ;

REAL_LITERAL 
  : Decimal_digits DOT Decimal_digits Exponent_part? Real_type_suffix?
  | Decimal_digits DOT Exponent_part? Real_type_suffix?
  | DOT Decimal_digits Exponent_part? Real_type_suffix?
  | Decimal_digits Exponent_part Real_type_suffix?
  | Decimal_digits Real_type_suffix
  ;
fragment Exponent_part 
  : ('e' | 'E') Sign? Decimal_digits
  ;
fragment Sign 
  : '+'
  | '-'
  ;
fragment Real_type_suffix 
  : 'F'
  | 'f'
  | 'D'
  | 'd'
  | 'M'
  | 'm'
  ;
CHARACTER_LITERAL 
  : QUOTE Character QUOTE
  ;
fragment Character 
  : Single_character
  | Simple_escape_sequence
  | Hexadecimal_escape_sequence
  | Unicode_escape_sequence
  ;
fragment Single_character 
  : ~(['\\\u000D\u000A\u000D\u0085\u2028\u2029]) //'<Any Character Except \' (U+0027), \\ (U+005C), And NEW_LINE_CHARACTER>'
  ;
fragment Simple_escape_sequence 
  : '\\\''
  | '\\"'
  | DOUBLE_BACK_SLASH
  | '\\0'
  | '\\a'
  | '\\b'
  | '\\f'
  | '\\n'
  | '\\r'
  | '\\t'
  | '\\v'
  ;
fragment Hexadecimal_escape_sequence 
  : '\\x' HEX_DIGIT
  | '\\x' HEX_DIGIT HEX_DIGIT
  | '\\x' HEX_DIGIT HEX_DIGIT HEX_DIGIT
  | '\\x' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
  ;
STRING_LITERAL 
  : Regular_string_literal
  | Verbatim_string_literal
  ;
fragment Regular_string_literal 
  : DOUBLE_QUOTE Regular_string_literal_character* DOUBLE_QUOTE
  ;
fragment Regular_string_literal_character 
  : Single_regular_string_literal_character
  | Simple_escape_sequence
  | Hexadecimal_escape_sequence
  | Unicode_escape_sequence
  ;
//'<Any Character Except " (U+0022), \\ (U+005C), And NEW_LINE_CHARACTER>'
fragment Single_regular_string_literal_character 
  : ~(["\\\u000D\u000A\u000D\u0085\u2028\u2029])
  ;
fragment Verbatim_string_literal 
  : '@' DOUBLE_QUOTE Verbatim_string_literal_character* DOUBLE_QUOTE
  ;
fragment Verbatim_string_literal_character 
  : Single_verbatim_string_literal_character
  | Quote_escape_sequence
  ;
fragment Single_verbatim_string_literal_character 
  : ~(["]) //<any Character Except ">
  ;
fragment Quote_escape_sequence 
  : DOUBLE_QUOTE DOUBLE_QUOTE
  ;

//B.1.9 Operators And Punctuators
OPEN_BRACE : '{';
CLOSE_BRACE : '}';
OPEN_BRACKET : '[';
CLOSE_BRACKET : ']';
OPEN_PARENS : '(';
CLOSE_PARENS : ')';
DOT : '.';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
PLUS : '+';
MINUS : '-';
STAR : '*';
DIV : '/';
PERCENT : '%';
AMP : '&';
BITWISE_OR : '|';
CARET : '^';
BANG : '!';
TILDE : '~';
ASSIGNMENT : '=';
LT : '<';
GT : '>';
INTERR : '?';
DOUBLE_COLON : '::';
OP_COALESCING : '??';
OP_INC : '++';
OP_DEC : '--';
OP_AND : '&&';
OP_OR : '||';
OP_PTR : '->';
OP_EQ : '==';
OP_NE : '!=';
OP_LE : '<=';
OP_GE : '>=';
OP_ADD_ASSIGNMENT : '+=';
OP_SUB_ASSIGNMENT : '-=';
OP_MULT_ASSIGNMENT : '*=';
OP_DIV_ASSIGNMENT : '/=';
OP_MOD_ASSIGNMENT : '%=';
OP_AND_ASSIGNMENT : '&=';
OP_OR_ASSIGNMENT : '|=';
OP_XOR_ASSIGNMENT : '^=';
OP_LEFT_SHIFT : '<<';
OP_LEFT_SHIFT_ASSIGNMENT : '<<=';

//B.1.10 Pre_processing Directives
// see above

// Custome Lexer rules
QUOTE :             '\'';
DOUBLE_QUOTE :      '"';
BACK_SLASH :        '\\';
DOUBLE_BACK_SLASH : '\\\\';
SHARP :             '#';


//// Unicode character classes
fragment UNICODE_CLASS_ZS
  : '\u0020' // SPACE
  | '\u00A0' // NO_BREAK SPACE
  | '\u1680' // OGHAM SPACE MARK
  | '\u180E' // MONGOLIAN VOWEL SEPARATOR
  | '\u2000' // EN QUAD
  | '\u2001' // EM QUAD
  | '\u2002' // EN SPACE
  | '\u2003' // EM SPACE
  | '\u2004' // THREE_PER_EM SPACE
  | '\u2005' // FOUR_PER_EM SPACE
  | '\u2006' // SIX_PER_EM SPACE
  | '\u2008' // PUNCTUATION SPACE
  | '\u2009' // THIN SPACE
  | '\u200A' // HAIR SPACE
  | '\u202F' // NARROW NO_BREAK SPACE
  | '\u3000' // IDEOGRAPHIC SPACE
  | '\u205F' // MEDIUM MATHEMATICAL SPACE
  ;

fragment UNICODE_CLASS_LU
  : '\u0041'..'\u005A' // LATIN CAPITAL LETTER A_Z
  | '\u00C0'..'\u00DE' // ACCENTED CAPITAL LETTERS
//  | { isUnicodeClass_Lu($text) }?
  ;

fragment UNICODE_CLASS_LL
  : '\u0061'..'\u007A' // LATIN SMALL LETTER a_z
  ;

fragment UNICODE_CLASS_LT
  : '\u01C5' // LATIN CAPITAL LETTER D WITH SMALL LETTER Z WITH CARON
  | '\u01C8' // LATIN CAPITAL LETTER L WITH SMALL LETTER J
  | '\u01CB' // LATIN CAPITAL LETTER N WITH SMALL LETTER J
  | '\u01F2' // LATIN CAPITAL LETTER D WITH SMALL LETTER Z
  ;

fragment UNICODE_CLASS_LM
  : '\u02B0'..'\u02EE' // MODIFIER LETTERS
  ;

fragment UNICODE_CLASS_LO
  : '\u01BB' // LATIN LETTER TWO WITH STROKE
  | '\u01C0' // LATIN LETTER DENTAL CLICK
  | '\u01C1' // LATIN LETTER LATERAL CLICK
  | '\u01C2' // LATIN LETTER ALVEOLAR CLICK
  | '\u01C3' // LATIN LETTER RETROFLEX CLICK
  | '\u0294' // LATIN LETTER GLOTTAL STOP
  ;

fragment UNICODE_CLASS_NL
  : '\u16EE' // RUNIC ARLAUG SYMBOL
  | '\u16EF' // RUNIC TVIMADUR SYMBOL
  | '\u16F0' // RUNIC BELGTHOR SYMBOL
  | '\u2160' // ROMAN NUMERAL ONE
  | '\u2161' // ROMAN NUMERAL TWO
  | '\u2162' // ROMAN NUMERAL THREE
  | '\u2163' // ROMAN NUMERAL FOUR
  | '\u2164' // ROMAN NUMERAL FIVE
  | '\u2165' // ROMAN NUMERAL SIX
  | '\u2166' // ROMAN NUMERAL SEVEN
  | '\u2167' // ROMAN NUMERAL EIGHT
  | '\u2168' // ROMAN NUMERAL NINE
  | '\u2169' // ROMAN NUMERAL TEN
  | '\u216A' // ROMAN NUMERAL ELEVEN
  | '\u216B' // ROMAN NUMERAL TWELVE
  | '\u216C' // ROMAN NUMERAL FIFTY
  | '\u216D' // ROMAN NUMERAL ONE HUNDRED
  | '\u216E' // ROMAN NUMERAL FIVE HUNDRED
  | '\u216F' // ROMAN NUMERAL ONE THOUSAND
  ;

fragment UNICODE_CLASS_MN
  : '\u0300' // COMBINING GRAVE ACCENT
  | '\u0301' // COMBINING ACUTE ACCENT
  | '\u0302' // COMBINING CIRCUMFLEX ACCENT
  | '\u0303' // COMBINING TILDE
  | '\u0304' // COMBINING MACRON
  | '\u0305' // COMBINING OVERLINE
  | '\u0306' // COMBINING BREVE
  | '\u0307' // COMBINING DOT ABOVE
  | '\u0308' // COMBINING DIAERESIS
  | '\u0309' // COMBINING HOOK ABOVE
  | '\u030A' // COMBINING RING ABOVE
  | '\u030B' // COMBINING DOUBLE ACUTE ACCENT
  | '\u030C' // COMBINING CARON
  | '\u030D' // COMBINING VERTICAL LINE ABOVE
  | '\u030E' // COMBINING DOUBLE VERTICAL LINE ABOVE
  | '\u030F' // COMBINING DOUBLE GRAVE ACCENT
  | '\u0310' // COMBINING CANDRABINDU
  ;

fragment UNICODE_CLASS_MC
  : '\u0903' // DEVANAGARI SIGN VISARGA
  | '\u093E' // DEVANAGARI VOWEL SIGN AA
  | '\u093F' // DEVANAGARI VOWEL SIGN I
  | '\u0940' // DEVANAGARI VOWEL SIGN II
  | '\u0949' // DEVANAGARI VOWEL SIGN CANDRA O
  | '\u094A' // DEVANAGARI VOWEL SIGN SHORT O
  | '\u094B' // DEVANAGARI VOWEL SIGN O
  | '\u094C' // DEVANAGARI VOWEL SIGN AU
  ;

fragment UNICODE_CLASS_CF
  : '\u00AD' // SOFT HYPHEN
  | '\u0600' // ARABIC NUMBER SIGN
  | '\u0601' // ARABIC SIGN SANAH
  | '\u0602' // ARABIC FOOTNOTE MARKER
  | '\u0603' // ARABIC SIGN SAFHA
  | '\u06DD' // ARABIC END OF AYAH
  ;

fragment UNICODE_CLASS_PC
  : '\u005F' // LOW LINE
  | '\u203F' // UNDERTIE
  | '\u2040' // CHARACTER TIE
  | '\u2054' // INVERTED UNDERTIE
  | '\uFE33' // PRESENTATION FORM FOR VERTICAL LOW LINE
  | '\uFE34' // PRESENTATION FORM FOR VERTICAL WAVY LOW LINE
  | '\uFE4D' // DASHED LOW LINE
  | '\uFE4E' // CENTRELINE LOW LINE
  | '\uFE4F' // WAVY LOW LINE
  | '\uFF3F' // FULLWIDTH LOW LINE
  ;

fragment UNICODE_CLASS_ND
  : '\u0030' // DIGIT ZERO
  | '\u0031' // DIGIT ONE
  | '\u0032' // DIGIT TWO
  | '\u0033' // DIGIT THREE
  | '\u0034' // DIGIT FOUR
  | '\u0035' // DIGIT FIVE
  | '\u0036' // DIGIT SIX
  | '\u0037' // DIGIT SEVEN
  | '\u0038' // DIGIT EIGHT
  | '\u0039' // DIGIT NINE
  ;

//fragment UNICODE_CLASS_LU: {}? c=.;
//UNICODE_CLASS_LL
//UNICODE_CLASS_LT
//UNICODE_CLASS_LM
//fragment UNICODE_CLASS_LO: { isUnicodeClass_Lo($c.getText()) }? c=.;
//UNICODE_CLASS_NL
//UNICODE_CLASS_MN
//UNICODE_CLASS_MC
//UNICODE_CLASS_ND
//UNICODE_CLASS_PC
//UNICODE_CLASS_CF
