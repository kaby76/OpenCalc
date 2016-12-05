// Generated from calculator.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#expressionResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionResult(calculatorParser.ExpressionResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(calculatorParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_argument_list_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_argument_list_opt(calculatorParser.Type_argument_list_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variable_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_reference(calculatorParser.Variable_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(calculatorParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(calculatorParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#argument_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_name(calculatorParser.Argument_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#argument_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_value(calculatorParser.Argument_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(calculatorParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#primary_expression_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression_start(calculatorParser.Primary_expression_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#bracket_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(calculatorParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(calculatorParser.Simple_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(calculatorParser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#member_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_access(calculatorParser.Member_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#predefined_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_type(calculatorParser.Predefined_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(calculatorParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#this_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_access(calculatorParser.This_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_or_collection_initializer(calculatorParser.Object_or_collection_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#object_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_initializer(calculatorParser.Object_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#member_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_initializer_list(calculatorParser.Member_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#member_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_initializer(calculatorParser.Member_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#initializer_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_value(calculatorParser.Initializer_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#collection_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_initializer(calculatorParser.Collection_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#element_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_initializer_list(calculatorParser.Element_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#element_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_initializer(calculatorParser.Element_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#member_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_declarator_list(calculatorParser.Member_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#member_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_declarator(calculatorParser.Member_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unbound_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnbound_type_name(calculatorParser.Unbound_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_dimension_specifier(calculatorParser.Generic_dimension_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#commas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommas(calculatorParser.CommasContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#checked_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecked_expression(calculatorParser.Checked_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unchecked_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnchecked_expression(calculatorParser.Unchecked_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(calculatorParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#cast_disambiguation_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_disambiguation_token(calculatorParser.Cast_disambiguation_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#pre_increment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_increment_expression(calculatorParser.Pre_increment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_decrement_expression(calculatorParser.Pre_decrement_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(calculatorParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(calculatorParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(calculatorParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(calculatorParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#shift_disambiguation_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_disambiguation_token(calculatorParser.Shift_disambiguation_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#is_disambiguation_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_disambiguation_token(calculatorParser.Is_disambiguation_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(calculatorParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(calculatorParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(calculatorParser.Exclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(calculatorParser.Inclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_and_expression(calculatorParser.Conditional_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_or_expression(calculatorParser.Conditional_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_coalescing_expression(calculatorParser.Null_coalescing_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(calculatorParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(calculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(calculatorParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(calculatorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#non_assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_assignment_expression(calculatorParser.Non_assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(calculatorParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(calculatorParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variable_declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declarators(calculatorParser.Variable_declaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variable_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declarator(calculatorParser.Variable_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variable_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initializer(calculatorParser.Variable_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#rank_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRank_specifiers(calculatorParser.Rank_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#rank_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRank_specifier(calculatorParser.Rank_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#dim_separators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_separators(calculatorParser.Dim_separatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_initializer(calculatorParser.Array_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variable_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initializer_list(calculatorParser.Variable_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#from_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_contextual_keyword(calculatorParser.From_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#let_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_contextual_keyword(calculatorParser.Let_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#where_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_contextual_keyword(calculatorParser.Where_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#join_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_contextual_keyword(calculatorParser.Join_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#on_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_contextual_keyword(calculatorParser.On_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#equals_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals_contextual_keyword(calculatorParser.Equals_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#into_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_contextual_keyword(calculatorParser.Into_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#orderby_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_contextual_keyword(calculatorParser.Orderby_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#ascending_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscending_contextual_keyword(calculatorParser.Ascending_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#descending_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescending_contextual_keyword(calculatorParser.Descending_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#select_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_contextual_keyword(calculatorParser.Select_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#group_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_contextual_keyword(calculatorParser.Group_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#by_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_contextual_keyword(calculatorParser.By_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial_contextual_keyword(calculatorParser.Partial_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#alias_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_contextual_keyword(calculatorParser.Alias_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_contextual_keyword(calculatorParser.Yield_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#get_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_contextual_keyword(calculatorParser.Get_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#set_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_contextual_keyword(calculatorParser.Set_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#add_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_contextual_keyword(calculatorParser.Add_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#remove_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove_contextual_keyword(calculatorParser.Remove_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_contextual_keyword(calculatorParser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(calculatorParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#right_arrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_arrow(calculatorParser.Right_arrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#right_shift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_shift(calculatorParser.Right_shiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#right_shift_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_shift_assignment(calculatorParser.Right_shift_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(calculatorParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(calculatorParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(calculatorParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_invocation2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invocation2(calculatorParser.Method_invocation2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#object_creation_expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_creation_expression2(calculatorParser.Object_creation_expression2Context ctx);
}