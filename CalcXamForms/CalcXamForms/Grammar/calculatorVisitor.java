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
	 * Visit a parse tree produced by {@link calculatorParser#namespace_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_name(calculatorParser.Namespace_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(calculatorParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(calculatorParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_or_type_name(calculatorParser.Namespace_or_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_argument_list_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_argument_list_opt(calculatorParser.Type_argument_list_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(calculatorParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(calculatorParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(calculatorParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type(calculatorParser.Numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#integral_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral_type(calculatorParser.Integral_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#floating_point_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point_type(calculatorParser.Floating_point_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#nullable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullable_type(calculatorParser.Nullable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#non_nullable_value_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_nullable_value_type(calculatorParser.Non_nullable_value_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#reference_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_type(calculatorParser.Reference_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(calculatorParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_type(calculatorParser.Interface_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#delegate_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_type(calculatorParser.Delegate_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_argument_list(calculatorParser.Type_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_arguments(calculatorParser.Type_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_argument(calculatorParser.Type_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_void(calculatorParser.Type_voidContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#base_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_access(calculatorParser.Base_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#object_creation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_creation_expression(calculatorParser.Object_creation_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#array_creation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_creation_expression(calculatorParser.Array_creation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#delegate_creation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_creation_expression(calculatorParser.Delegate_creation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#anonymous_object_creation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_object_creation_expression(calculatorParser.Anonymous_object_creation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_object_initializer(calculatorParser.Anonymous_object_initializerContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#typeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeof_expression(calculatorParser.Typeof_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#default_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value_expression(calculatorParser.Default_value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(calculatorParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#scan_for_cast_generic_precedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_for_cast_generic_precedence(calculatorParser.Scan_for_cast_generic_precedenceContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(calculatorParser.Cast_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#scan_for_shift_generic_precedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_for_shift_generic_precedence(calculatorParser.Scan_for_shift_generic_precedenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#shift_disambiguation_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_disambiguation_token(calculatorParser.Shift_disambiguation_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#isType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsType(calculatorParser.IsTypeContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(calculatorParser.Lambda_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#anonymous_method_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_method_expression(calculatorParser.Anonymous_method_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_function_signature(calculatorParser.Anonymous_function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#explicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_anonymous_function_signature(calculatorParser.Explicit_anonymous_function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_anonymous_function_parameter_list(calculatorParser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_anonymous_function_parameter(calculatorParser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#anonymous_function_parameter_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_function_parameter_modifier(calculatorParser.Anonymous_function_parameter_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#implicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_anonymous_function_signature(calculatorParser.Implicit_anonymous_function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_anonymous_function_parameter_list(calculatorParser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#implicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_anonymous_function_parameter(calculatorParser.Implicit_anonymous_function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#anonymous_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_function_body(calculatorParser.Anonymous_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(calculatorParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(calculatorParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#query_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_body(calculatorParser.Query_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#query_body_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_body_clauses(calculatorParser.Query_body_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#query_body_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_body_clause(calculatorParser.Query_body_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#let_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_clause(calculatorParser.Let_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(calculatorParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(calculatorParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#join_into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_into_clause(calculatorParser.Join_into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#combined_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombined_join_clause(calculatorParser.Combined_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(calculatorParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#orderings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderings(calculatorParser.OrderingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#ordering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering(calculatorParser.OrderingContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#ordering_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_direction(calculatorParser.Ordering_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_group_clause(calculatorParser.Select_or_group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(calculatorParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_clause(calculatorParser.Group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#query_continuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_continuation(calculatorParser.Query_continuationContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(calculatorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#embedded_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_statement(calculatorParser.Embedded_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_embedded_statement(calculatorParser.Simple_embedded_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(calculatorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(calculatorParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#empty_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(calculatorParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(calculatorParser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(calculatorParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declaration(calculatorParser.Local_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#local_variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_type(calculatorParser.Local_variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#local_variable_declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declarators(calculatorParser.Local_variable_declaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declarator(calculatorParser.Local_variable_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_initializer(calculatorParser.Local_variable_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#local_constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_constant_declaration(calculatorParser.Local_constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(calculatorParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#statement_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expression(calculatorParser.Statement_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(calculatorParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link calculatorParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBodyBlock(calculatorParser.IfBodyBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link calculatorParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBodySingle(calculatorParser.IfBodySingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(calculatorParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(calculatorParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#switch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_block(calculatorParser.Switch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#switch_sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_sections(calculatorParser.Switch_sectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#switch_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(calculatorParser.Switch_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#switch_labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_labels(calculatorParser.Switch_labelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#switch_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_label(calculatorParser.Switch_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(calculatorParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(calculatorParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(calculatorParser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(calculatorParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#for_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_initializer(calculatorParser.For_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#for_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_condition(calculatorParser.For_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#for_iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_iterator(calculatorParser.For_iteratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#statement_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expression_list(calculatorParser.Statement_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#foreach_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_statement(calculatorParser.Foreach_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(calculatorParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(calculatorParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(calculatorParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(calculatorParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(calculatorParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(calculatorParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(calculatorParser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#catch_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clauses(calculatorParser.Catch_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#specific_catch_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecific_catch_clauses(calculatorParser.Specific_catch_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#specific_catch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecific_catch_clause(calculatorParser.Specific_catch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#general_catch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_catch_clause(calculatorParser.General_catch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#finally_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_clause(calculatorParser.Finally_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#checked_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecked_statement(calculatorParser.Checked_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unchecked_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnchecked_statement(calculatorParser.Unchecked_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#lock_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_statement(calculatorParser.Lock_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#using_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_statement(calculatorParser.Using_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#resource_acquisition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_acquisition(calculatorParser.Resource_acquisitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#yield_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_statement(calculatorParser.Yield_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(calculatorParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#namespace_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_declaration(calculatorParser.Namespace_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#qualified_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_identifier(calculatorParser.Qualified_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#namespace_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_body(calculatorParser.Namespace_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#extern_alias_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_alias_directives(calculatorParser.Extern_alias_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#extern_alias_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_alias_directive(calculatorParser.Extern_alias_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#using_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_directives(calculatorParser.Using_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#using_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_directive(calculatorParser.Using_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#using_alias_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_alias_directive(calculatorParser.Using_alias_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#using_namespace_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_namespace_directive(calculatorParser.Using_namespace_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_member_declarations(calculatorParser.Namespace_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_member_declaration(calculatorParser.Namespace_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(calculatorParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#qualified_alias_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_alias_member(calculatorParser.Qualified_alias_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(calculatorParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_modifiers(calculatorParser.Class_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_modifier(calculatorParser.Class_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_list(calculatorParser.Type_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameters(calculatorParser.Type_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter(calculatorParser.Type_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_base(calculatorParser.Class_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_type_list(calculatorParser.Interface_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_constraints_clauses(calculatorParser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_constraints_clause(calculatorParser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_constraints(calculatorParser.Type_parameter_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#primary_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_constraint(calculatorParser.Primary_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#secondary_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondary_constraints(calculatorParser.Secondary_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_constraint(calculatorParser.Constructor_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(calculatorParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member_declarations(calculatorParser.Class_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member_declaration(calculatorParser.Class_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_member_modifiers(calculatorParser.All_member_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#all_member_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_member_modifier(calculatorParser.All_member_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#common_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_member_declaration(calculatorParser.Common_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#typed_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_member_declaration(calculatorParser.Typed_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constant_declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declarators(calculatorParser.Constant_declaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constant_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declarator(calculatorParser.Constant_declaratorContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(calculatorParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_header(calculatorParser.Method_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_modifiers(calculatorParser.Method_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_modifier(calculatorParser.Method_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(calculatorParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#member_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_name(calculatorParser.Member_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(calculatorParser.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameter_list(calculatorParser.Formal_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_parameters(calculatorParser.Fixed_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_parameter(calculatorParser.Fixed_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#default_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument(calculatorParser.Default_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#parameter_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_modifier(calculatorParser.Parameter_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#parameter_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_array(calculatorParser.Parameter_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(calculatorParser.Property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#property_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_modifiers(calculatorParser.Property_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#property_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_modifier(calculatorParser.Property_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#accessor_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessor_declarations(calculatorParser.Accessor_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_accessor_declaration(calculatorParser.Get_accessor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_accessor_declaration(calculatorParser.Set_accessor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#accessor_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessor_modifier(calculatorParser.Accessor_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#accessor_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessor_body(calculatorParser.Accessor_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#event_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_declaration(calculatorParser.Event_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#event_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_modifiers(calculatorParser.Event_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#event_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_modifier(calculatorParser.Event_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_accessor_declarations(calculatorParser.Event_accessor_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_accessor_declaration(calculatorParser.Add_accessor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove_accessor_declaration(calculatorParser.Remove_accessor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#indexer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_declaration(calculatorParser.Indexer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#indexer_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_modifiers(calculatorParser.Indexer_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#indexer_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_modifier(calculatorParser.Indexer_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#indexer_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_declarator(calculatorParser.Indexer_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(calculatorParser.Operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#operator_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_modifiers(calculatorParser.Operator_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#operator_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_modifier(calculatorParser.Operator_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#operator_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declarator(calculatorParser.Operator_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unary_operator_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_declarator(calculatorParser.Unary_operator_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#overloadable_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverloadable_unary_operator(calculatorParser.Overloadable_unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#binary_operator_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_declarator(calculatorParser.Binary_operator_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#overloadable_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverloadable_binary_operator(calculatorParser.Overloadable_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#overloadable_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverloadable_operator(calculatorParser.Overloadable_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion_operator_declarator(calculatorParser.Conversion_operator_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#operator_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_body(calculatorParser.Operator_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(calculatorParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_modifiers(calculatorParser.Constructor_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_modifier(calculatorParser.Constructor_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declarator(calculatorParser.Constructor_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_initializer(calculatorParser.Constructor_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_body(calculatorParser.Constructor_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#static_constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_constructor_declaration(calculatorParser.Static_constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#static_constructor_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_constructor_modifiers(calculatorParser.Static_constructor_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#static_constructor_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_constructor_body(calculatorParser.Static_constructor_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#destructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructor_declaration(calculatorParser.Destructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#destructor_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructor_body(calculatorParser.Destructor_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(calculatorParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(calculatorParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_modifiers(calculatorParser.Struct_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_modifier(calculatorParser.Struct_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_interfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_interfaces(calculatorParser.Struct_interfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(calculatorParser.Struct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member_declarations(calculatorParser.Struct_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member_declaration(calculatorParser.Struct_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(calculatorParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#non_array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_array_type(calculatorParser.Non_array_typeContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#interface_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(calculatorParser.Interface_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_modifiers(calculatorParser.Interface_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_modifier(calculatorParser.Interface_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant_type_parameter_list(calculatorParser.Variant_type_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variant_type_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant_type_parameters(calculatorParser.Variant_type_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variance_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariance_annotation(calculatorParser.Variance_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_base(calculatorParser.Interface_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_body(calculatorParser.Interface_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_member_declarations(calculatorParser.Interface_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_member_declaration(calculatorParser.Interface_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_method_declaration(calculatorParser.Interface_method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_property_declaration(calculatorParser.Interface_property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_accessors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_accessors(calculatorParser.Interface_accessorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_event_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_event_declaration(calculatorParser.Interface_event_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_indexer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_indexer_declaration(calculatorParser.Interface_indexer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(calculatorParser.Enum_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#enum_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_base(calculatorParser.Enum_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#enum_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_body(calculatorParser.Enum_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#enum_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_modifiers(calculatorParser.Enum_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#enum_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_modifier(calculatorParser.Enum_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#enum_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_member_declarations(calculatorParser.Enum_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#enum_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_member_declaration(calculatorParser.Enum_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#delegate_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_declaration(calculatorParser.Delegate_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#delegate_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_modifiers(calculatorParser.Delegate_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#delegate_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_modifier(calculatorParser.Delegate_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#global_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attributes(calculatorParser.Global_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#global_attribute_sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attribute_sections(calculatorParser.Global_attribute_sectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#global_attribute_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attribute_section(calculatorParser.Global_attribute_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#global_attribute_target_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attribute_target_specifier(calculatorParser.Global_attribute_target_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#global_attribute_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attribute_target(calculatorParser.Global_attribute_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(calculatorParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute_sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_sections(calculatorParser.Attribute_sectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_section(calculatorParser.Attribute_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_target_specifier(calculatorParser.Attribute_target_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_target(calculatorParser.Attribute_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(calculatorParser.Attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(calculatorParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(calculatorParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_arguments(calculatorParser.Attribute_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#positional_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositional_argument_list(calculatorParser.Positional_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#positional_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositional_argument(calculatorParser.Positional_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#named_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_argument_list(calculatorParser.Named_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#named_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_argument(calculatorParser.Named_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#attribute_argument_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_argument_expression(calculatorParser.Attribute_argument_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#class_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_modifier_unsafe(calculatorParser.Class_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_modifier_unsafe(calculatorParser.Struct_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_modifier_unsafe(calculatorParser.Interface_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#delegate_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_modifier_unsafe(calculatorParser.Delegate_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#field_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_modifier_unsafe(calculatorParser.Field_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_modifier_unsafe(calculatorParser.Method_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#property_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_modifier_unsafe(calculatorParser.Property_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#event_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_modifier_unsafe(calculatorParser.Event_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#indexer_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_modifier_unsafe(calculatorParser.Indexer_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#operator_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_modifier_unsafe(calculatorParser.Operator_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_modifier_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_modifier_unsafe(calculatorParser.Constructor_modifier_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#destructor_declaration_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructor_declaration_unsafe(calculatorParser.Destructor_declaration_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#static_constructor_modifiers_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_constructor_modifiers_unsafe(calculatorParser.Static_constructor_modifiers_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#embedded_statement_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_statement_unsafe(calculatorParser.Embedded_statement_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unsafe_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsafe_statement(calculatorParser.Unsafe_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#type_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_unsafe(calculatorParser.Type_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#pointer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_type(calculatorParser.Pointer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unmanaged_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnmanaged_type(calculatorParser.Unmanaged_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#primary_no_array_creation_expression_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_no_array_creation_expression_unsafe(calculatorParser.Primary_no_array_creation_expression_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unary_expression_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression_unsafe(calculatorParser.Unary_expression_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#pointer_indirection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_indirection_expression(calculatorParser.Pointer_indirection_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#addressof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressof_expression(calculatorParser.Addressof_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#sizeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(calculatorParser.Sizeof_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_statement(calculatorParser.Fixed_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_pointer_declarators(calculatorParser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_pointer_declarator(calculatorParser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_pointer_initializer(calculatorParser.Fixed_pointer_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_member_declaration_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member_declaration_unsafe(calculatorParser.Struct_member_declaration_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_size_buffer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_declaration(calculatorParser.Fixed_size_buffer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_size_buffer_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_modifiers(calculatorParser.Fixed_size_buffer_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_size_buffer_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_modifier(calculatorParser.Fixed_size_buffer_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#buffer_element_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuffer_element_type(calculatorParser.Buffer_element_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_size_buffer_declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_declarators(calculatorParser.Fixed_size_buffer_declaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_declarator(calculatorParser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_initializer_unsafe(calculatorParser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackalloc_initializer(calculatorParser.Stackalloc_initializerContext ctx);
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
	 * Visit a parse tree produced by {@link calculatorParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(calculatorParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#struct_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_definition(calculatorParser.Struct_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_definition(calculatorParser.Interface_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#enum_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_definition(calculatorParser.Enum_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#delegate_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_definition(calculatorParser.Delegate_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#event_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_declaration2(calculatorParser.Event_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#field_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration2(calculatorParser.Field_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#property_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration2(calculatorParser.Property_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constant_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration2(calculatorParser.Constant_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#indexer_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_declaration2(calculatorParser.Indexer_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#destructor_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructor_definition(calculatorParser.Destructor_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constructor_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration2(calculatorParser.Constructor_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration2(calculatorParser.Method_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_member_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_member_name(calculatorParser.Method_member_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#method_member_name2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_member_name2(calculatorParser.Method_member_name2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#operator_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration2(calculatorParser.Operator_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_method_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_method_declaration2(calculatorParser.Interface_method_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_property_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_property_declaration2(calculatorParser.Interface_property_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_event_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_event_declaration2(calculatorParser.Interface_event_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#interface_indexer_declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_indexer_declaration2(calculatorParser.Interface_indexer_declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#member_access2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_access2(calculatorParser.Member_access2Context ctx);
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