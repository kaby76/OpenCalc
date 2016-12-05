// Generated from calculator.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#expressionResult}.
	 * @param ctx the parse tree
	 */
	void enterExpressionResult(calculatorParser.ExpressionResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#expressionResult}.
	 * @param ctx the parse tree
	 */
	void exitExpressionResult(calculatorParser.ExpressionResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(calculatorParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(calculatorParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_argument_list_opt}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list_opt(calculatorParser.Type_argument_list_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_argument_list_opt}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list_opt(calculatorParser.Type_argument_list_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void enterVariable_reference(calculatorParser.Variable_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void exitVariable_reference(calculatorParser.Variable_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(calculatorParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(calculatorParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(calculatorParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(calculatorParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#argument_name}.
	 * @param ctx the parse tree
	 */
	void enterArgument_name(calculatorParser.Argument_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#argument_name}.
	 * @param ctx the parse tree
	 */
	void exitArgument_name(calculatorParser.Argument_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#argument_value}.
	 * @param ctx the parse tree
	 */
	void enterArgument_value(calculatorParser.Argument_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#argument_value}.
	 * @param ctx the parse tree
	 */
	void exitArgument_value(calculatorParser.Argument_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(calculatorParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(calculatorParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression_start(calculatorParser.Primary_expression_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression_start(calculatorParser.Primary_expression_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(calculatorParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(calculatorParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(calculatorParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(calculatorParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(calculatorParser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(calculatorParser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMember_access(calculatorParser.Member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMember_access(calculatorParser.Member_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(calculatorParser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(calculatorParser.Predefined_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(calculatorParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(calculatorParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#this_access}.
	 * @param ctx the parse tree
	 */
	void enterThis_access(calculatorParser.This_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#this_access}.
	 * @param ctx the parse tree
	 */
	void exitThis_access(calculatorParser.This_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_or_collection_initializer(calculatorParser.Object_or_collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_or_collection_initializer(calculatorParser.Object_or_collection_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_initializer(calculatorParser.Object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_initializer(calculatorParser.Object_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer_list(calculatorParser.Member_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer_list(calculatorParser.Member_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer(calculatorParser.Member_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer(calculatorParser.Member_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_value(calculatorParser.Initializer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_value(calculatorParser.Initializer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCollection_initializer(calculatorParser.Collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCollection_initializer(calculatorParser.Collection_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#element_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterElement_initializer_list(calculatorParser.Element_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#element_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitElement_initializer_list(calculatorParser.Element_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void enterElement_initializer(calculatorParser.Element_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void exitElement_initializer(calculatorParser.Element_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator_list(calculatorParser.Member_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator_list(calculatorParser.Member_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator(calculatorParser.Member_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator(calculatorParser.Member_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void enterUnbound_type_name(calculatorParser.Unbound_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void exitUnbound_type_name(calculatorParser.Unbound_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_dimension_specifier(calculatorParser.Generic_dimension_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_dimension_specifier(calculatorParser.Generic_dimension_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#commas}.
	 * @param ctx the parse tree
	 */
	void enterCommas(calculatorParser.CommasContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#commas}.
	 * @param ctx the parse tree
	 */
	void exitCommas(calculatorParser.CommasContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#checked_expression}.
	 * @param ctx the parse tree
	 */
	void enterChecked_expression(calculatorParser.Checked_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#checked_expression}.
	 * @param ctx the parse tree
	 */
	void exitChecked_expression(calculatorParser.Checked_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unchecked_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnchecked_expression(calculatorParser.Unchecked_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unchecked_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnchecked_expression(calculatorParser.Unchecked_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(calculatorParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(calculatorParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#cast_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterCast_disambiguation_token(calculatorParser.Cast_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#cast_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitCast_disambiguation_token(calculatorParser.Cast_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#pre_increment_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_increment_expression(calculatorParser.Pre_increment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#pre_increment_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_increment_expression(calculatorParser.Pre_increment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_decrement_expression(calculatorParser.Pre_decrement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_decrement_expression(calculatorParser.Pre_decrement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(calculatorParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(calculatorParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(calculatorParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(calculatorParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(calculatorParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(calculatorParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(calculatorParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(calculatorParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#shift_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterShift_disambiguation_token(calculatorParser.Shift_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#shift_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitShift_disambiguation_token(calculatorParser.Shift_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#is_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterIs_disambiguation_token(calculatorParser.Is_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#is_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitIs_disambiguation_token(calculatorParser.Is_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(calculatorParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(calculatorParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(calculatorParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(calculatorParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(calculatorParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(calculatorParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(calculatorParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(calculatorParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_and_expression(calculatorParser.Conditional_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_and_expression(calculatorParser.Conditional_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_or_expression(calculatorParser.Conditional_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_or_expression(calculatorParser.Conditional_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_coalescing_expression(calculatorParser.Null_coalescing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_coalescing_expression(calculatorParser.Null_coalescing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(calculatorParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(calculatorParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(calculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(calculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(calculatorParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(calculatorParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(calculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(calculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterNon_assignment_expression(calculatorParser.Non_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitNon_assignment_expression(calculatorParser.Non_assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(calculatorParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(calculatorParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(calculatorParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(calculatorParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarators(calculatorParser.Variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarators(calculatorParser.Variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarator(calculatorParser.Variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarator(calculatorParser.Variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer(calculatorParser.Variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer(calculatorParser.Variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#rank_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifiers(calculatorParser.Rank_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#rank_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifiers(calculatorParser.Rank_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifier(calculatorParser.Rank_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifier(calculatorParser.Rank_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#dim_separators}.
	 * @param ctx the parse tree
	 */
	void enterDim_separators(calculatorParser.Dim_separatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#dim_separators}.
	 * @param ctx the parse tree
	 */
	void exitDim_separators(calculatorParser.Dim_separatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(calculatorParser.Array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(calculatorParser.Array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variable_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer_list(calculatorParser.Variable_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variable_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer_list(calculatorParser.Variable_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#from_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterFrom_contextual_keyword(calculatorParser.From_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#from_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitFrom_contextual_keyword(calculatorParser.From_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#let_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterLet_contextual_keyword(calculatorParser.Let_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#let_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitLet_contextual_keyword(calculatorParser.Let_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#where_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWhere_contextual_keyword(calculatorParser.Where_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#where_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWhere_contextual_keyword(calculatorParser.Where_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#join_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterJoin_contextual_keyword(calculatorParser.Join_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#join_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitJoin_contextual_keyword(calculatorParser.Join_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#on_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOn_contextual_keyword(calculatorParser.On_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#on_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOn_contextual_keyword(calculatorParser.On_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#equals_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterEquals_contextual_keyword(calculatorParser.Equals_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#equals_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitEquals_contextual_keyword(calculatorParser.Equals_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#into_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterInto_contextual_keyword(calculatorParser.Into_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#into_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitInto_contextual_keyword(calculatorParser.Into_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#orderby_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_contextual_keyword(calculatorParser.Orderby_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#orderby_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_contextual_keyword(calculatorParser.Orderby_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#ascending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAscending_contextual_keyword(calculatorParser.Ascending_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#ascending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAscending_contextual_keyword(calculatorParser.Ascending_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#descending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDescending_contextual_keyword(calculatorParser.Descending_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#descending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDescending_contextual_keyword(calculatorParser.Descending_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#select_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSelect_contextual_keyword(calculatorParser.Select_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#select_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSelect_contextual_keyword(calculatorParser.Select_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#group_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterGroup_contextual_keyword(calculatorParser.Group_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#group_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitGroup_contextual_keyword(calculatorParser.Group_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#by_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterBy_contextual_keyword(calculatorParser.By_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#by_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitBy_contextual_keyword(calculatorParser.By_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterPartial_contextual_keyword(calculatorParser.Partial_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitPartial_contextual_keyword(calculatorParser.Partial_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#alias_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAlias_contextual_keyword(calculatorParser.Alias_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#alias_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAlias_contextual_keyword(calculatorParser.Alias_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterYield_contextual_keyword(calculatorParser.Yield_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitYield_contextual_keyword(calculatorParser.Yield_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#get_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterGet_contextual_keyword(calculatorParser.Get_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#get_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitGet_contextual_keyword(calculatorParser.Get_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#set_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSet_contextual_keyword(calculatorParser.Set_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#set_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSet_contextual_keyword(calculatorParser.Set_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#add_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAdd_contextual_keyword(calculatorParser.Add_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#add_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAdd_contextual_keyword(calculatorParser.Add_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#remove_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterRemove_contextual_keyword(calculatorParser.Remove_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#remove_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitRemove_contextual_keyword(calculatorParser.Remove_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_contextual_keyword(calculatorParser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_contextual_keyword(calculatorParser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(calculatorParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(calculatorParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void enterRight_arrow(calculatorParser.Right_arrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void exitRight_arrow(calculatorParser.Right_arrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift(calculatorParser.Right_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift(calculatorParser.Right_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift_assignment(calculatorParser.Right_shift_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift_assignment(calculatorParser.Right_shift_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(calculatorParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(calculatorParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(calculatorParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(calculatorParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(calculatorParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(calculatorParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_invocation2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invocation2(calculatorParser.Method_invocation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_invocation2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invocation2(calculatorParser.Method_invocation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#object_creation_expression2}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_expression2(calculatorParser.Object_creation_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#object_creation_expression2}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_expression2(calculatorParser.Object_creation_expression2Context ctx);
}