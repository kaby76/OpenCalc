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
	 * Enter a parse tree produced by {@link calculatorParser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_name(calculatorParser.Namespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_name(calculatorParser.Namespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(calculatorParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(calculatorParser.Type_nameContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_or_type_name(calculatorParser.Namespace_or_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_or_type_name(calculatorParser.Namespace_or_type_nameContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(calculatorParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(calculatorParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(calculatorParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(calculatorParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(calculatorParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(calculatorParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(calculatorParser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(calculatorParser.Numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_type(calculatorParser.Integral_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_type(calculatorParser.Integral_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_type(calculatorParser.Floating_point_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_type(calculatorParser.Floating_point_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#nullable_type}.
	 * @param ctx the parse tree
	 */
	void enterNullable_type(calculatorParser.Nullable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#nullable_type}.
	 * @param ctx the parse tree
	 */
	void exitNullable_type(calculatorParser.Nullable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#non_nullable_value_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_nullable_value_type(calculatorParser.Non_nullable_value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#non_nullable_value_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_nullable_value_type(calculatorParser.Non_nullable_value_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#reference_type}.
	 * @param ctx the parse tree
	 */
	void enterReference_type(calculatorParser.Reference_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#reference_type}.
	 * @param ctx the parse tree
	 */
	void exitReference_type(calculatorParser.Reference_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(calculatorParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(calculatorParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_type}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type(calculatorParser.Interface_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_type}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type(calculatorParser.Interface_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#delegate_type}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_type(calculatorParser.Delegate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#delegate_type}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_type(calculatorParser.Delegate_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list(calculatorParser.Type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list(calculatorParser.Type_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void enterType_arguments(calculatorParser.Type_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void exitType_arguments(calculatorParser.Type_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_argument}.
	 * @param ctx the parse tree
	 */
	void enterType_argument(calculatorParser.Type_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_argument}.
	 * @param ctx the parse tree
	 */
	void exitType_argument(calculatorParser.Type_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_void}.
	 * @param ctx the parse tree
	 */
	void enterType_void(calculatorParser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_void}.
	 * @param ctx the parse tree
	 */
	void exitType_void(calculatorParser.Type_voidContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#base_access}.
	 * @param ctx the parse tree
	 */
	void enterBase_access(calculatorParser.Base_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#base_access}.
	 * @param ctx the parse tree
	 */
	void exitBase_access(calculatorParser.Base_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_expression(calculatorParser.Object_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_expression(calculatorParser.Object_creation_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#array_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_creation_expression(calculatorParser.Array_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#array_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_creation_expression(calculatorParser.Array_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#delegate_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_creation_expression(calculatorParser.Delegate_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#delegate_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_creation_expression(calculatorParser.Delegate_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#anonymous_object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_object_creation_expression(calculatorParser.Anonymous_object_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#anonymous_object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_object_creation_expression(calculatorParser.Anonymous_object_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_object_initializer(calculatorParser.Anonymous_object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_object_initializer(calculatorParser.Anonymous_object_initializerContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#typeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeof_expression(calculatorParser.Typeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#typeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeof_expression(calculatorParser.Typeof_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#default_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_expression(calculatorParser.Default_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#default_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_expression(calculatorParser.Default_value_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#scan_for_cast_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void enterScan_for_cast_generic_precedence(calculatorParser.Scan_for_cast_generic_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#scan_for_cast_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void exitScan_for_cast_generic_precedence(calculatorParser.Scan_for_cast_generic_precedenceContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(calculatorParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(calculatorParser.Cast_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#scan_for_shift_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void enterScan_for_shift_generic_precedence(calculatorParser.Scan_for_shift_generic_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#scan_for_shift_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void exitScan_for_shift_generic_precedence(calculatorParser.Scan_for_shift_generic_precedenceContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#isType}.
	 * @param ctx the parse tree
	 */
	void enterIsType(calculatorParser.IsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#isType}.
	 * @param ctx the parse tree
	 */
	void exitIsType(calculatorParser.IsTypeContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(calculatorParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(calculatorParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#anonymous_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_method_expression(calculatorParser.Anonymous_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#anonymous_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_method_expression(calculatorParser.Anonymous_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_signature(calculatorParser.Anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_signature(calculatorParser.Anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#explicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_signature(calculatorParser.Explicit_anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#explicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_signature(calculatorParser.Explicit_anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter_list(calculatorParser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter_list(calculatorParser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter(calculatorParser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter(calculatorParser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#anonymous_function_parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_parameter_modifier(calculatorParser.Anonymous_function_parameter_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#anonymous_function_parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_parameter_modifier(calculatorParser.Anonymous_function_parameter_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#implicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_signature(calculatorParser.Implicit_anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#implicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_signature(calculatorParser.Implicit_anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_parameter_list(calculatorParser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_parameter_list(calculatorParser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#implicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_parameter(calculatorParser.Implicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#implicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_parameter(calculatorParser.Implicit_anonymous_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_body(calculatorParser.Anonymous_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_body(calculatorParser.Anonymous_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(calculatorParser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(calculatorParser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(calculatorParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(calculatorParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#query_body}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body(calculatorParser.Query_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#query_body}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body(calculatorParser.Query_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#query_body_clauses}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clauses(calculatorParser.Query_body_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#query_body_clauses}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clauses(calculatorParser.Query_body_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clause(calculatorParser.Query_body_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clause(calculatorParser.Query_body_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void enterLet_clause(calculatorParser.Let_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void exitLet_clause(calculatorParser.Let_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(calculatorParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(calculatorParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(calculatorParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(calculatorParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#join_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_into_clause(calculatorParser.Join_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#join_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_into_clause(calculatorParser.Join_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterCombined_join_clause(calculatorParser.Combined_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitCombined_join_clause(calculatorParser.Combined_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(calculatorParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(calculatorParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#orderings}.
	 * @param ctx the parse tree
	 */
	void enterOrderings(calculatorParser.OrderingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#orderings}.
	 * @param ctx the parse tree
	 */
	void exitOrderings(calculatorParser.OrderingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#ordering}.
	 * @param ctx the parse tree
	 */
	void enterOrdering(calculatorParser.OrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#ordering}.
	 * @param ctx the parse tree
	 */
	void exitOrdering(calculatorParser.OrderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#ordering_direction}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_direction(calculatorParser.Ordering_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#ordering_direction}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_direction(calculatorParser.Ordering_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_group_clause(calculatorParser.Select_or_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_group_clause(calculatorParser.Select_or_group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(calculatorParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(calculatorParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_clause(calculatorParser.Group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_clause(calculatorParser.Group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void enterQuery_continuation(calculatorParser.Query_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void exitQuery_continuation(calculatorParser.Query_continuationContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(calculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(calculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement(calculatorParser.Embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement(calculatorParser.Embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_embedded_statement(calculatorParser.Simple_embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_embedded_statement(calculatorParser.Simple_embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(calculatorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(calculatorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(calculatorParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(calculatorParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(calculatorParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(calculatorParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(calculatorParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(calculatorParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(calculatorParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(calculatorParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration(calculatorParser.Local_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration(calculatorParser.Local_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#local_variable_type}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_type(calculatorParser.Local_variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#local_variable_type}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_type(calculatorParser.Local_variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#local_variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarators(calculatorParser.Local_variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#local_variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarators(calculatorParser.Local_variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarator(calculatorParser.Local_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarator(calculatorParser.Local_variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer(calculatorParser.Local_variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer(calculatorParser.Local_variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_constant_declaration(calculatorParser.Local_constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_constant_declaration(calculatorParser.Local_constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(calculatorParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(calculatorParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#statement_expression}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression(calculatorParser.Statement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#statement_expression}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression(calculatorParser.Statement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(calculatorParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(calculatorParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link calculatorParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIfBodyBlock(calculatorParser.IfBodyBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link calculatorParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIfBodyBlock(calculatorParser.IfBodyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link calculatorParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIfBodySingle(calculatorParser.IfBodySingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link calculatorParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIfBodySingle(calculatorParser.IfBodySingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(calculatorParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(calculatorParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(calculatorParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(calculatorParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(calculatorParser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(calculatorParser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#switch_sections}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_sections(calculatorParser.Switch_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#switch_sections}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_sections(calculatorParser.Switch_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(calculatorParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(calculatorParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#switch_labels}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_labels(calculatorParser.Switch_labelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#switch_labels}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_labels(calculatorParser.Switch_labelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_label(calculatorParser.Switch_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_label(calculatorParser.Switch_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(calculatorParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(calculatorParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(calculatorParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(calculatorParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(calculatorParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(calculatorParser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(calculatorParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(calculatorParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFor_initializer(calculatorParser.For_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFor_initializer(calculatorParser.For_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(calculatorParser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(calculatorParser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void enterFor_iterator(calculatorParser.For_iteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void exitFor_iterator(calculatorParser.For_iteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(calculatorParser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(calculatorParser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void enterForeach_statement(calculatorParser.Foreach_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void exitForeach_statement(calculatorParser.Foreach_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(calculatorParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(calculatorParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(calculatorParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(calculatorParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(calculatorParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(calculatorParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(calculatorParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(calculatorParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(calculatorParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(calculatorParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(calculatorParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(calculatorParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(calculatorParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(calculatorParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(calculatorParser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(calculatorParser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#specific_catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_catch_clauses(calculatorParser.Specific_catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#specific_catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_catch_clauses(calculatorParser.Specific_catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_catch_clause(calculatorParser.Specific_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_catch_clause(calculatorParser.Specific_catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_catch_clause(calculatorParser.General_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_catch_clause(calculatorParser.General_catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(calculatorParser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(calculatorParser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#checked_statement}.
	 * @param ctx the parse tree
	 */
	void enterChecked_statement(calculatorParser.Checked_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#checked_statement}.
	 * @param ctx the parse tree
	 */
	void exitChecked_statement(calculatorParser.Checked_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unchecked_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnchecked_statement(calculatorParser.Unchecked_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unchecked_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnchecked_statement(calculatorParser.Unchecked_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#lock_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_statement(calculatorParser.Lock_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#lock_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_statement(calculatorParser.Lock_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#using_statement}.
	 * @param ctx the parse tree
	 */
	void enterUsing_statement(calculatorParser.Using_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#using_statement}.
	 * @param ctx the parse tree
	 */
	void exitUsing_statement(calculatorParser.Using_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void enterResource_acquisition(calculatorParser.Resource_acquisitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void exitResource_acquisition(calculatorParser.Resource_acquisitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#yield_statement}.
	 * @param ctx the parse tree
	 */
	void enterYield_statement(calculatorParser.Yield_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#yield_statement}.
	 * @param ctx the parse tree
	 */
	void exitYield_statement(calculatorParser.Yield_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(calculatorParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(calculatorParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_declaration(calculatorParser.Namespace_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_declaration(calculatorParser.Namespace_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void enterQualified_identifier(calculatorParser.Qualified_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void exitQualified_identifier(calculatorParser.Qualified_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_body(calculatorParser.Namespace_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_body(calculatorParser.Namespace_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directives(calculatorParser.Extern_alias_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directives(calculatorParser.Extern_alias_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directive(calculatorParser.Extern_alias_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directive(calculatorParser.Extern_alias_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#using_directives}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directives(calculatorParser.Using_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#using_directives}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directives(calculatorParser.Using_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directive(calculatorParser.Using_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directive(calculatorParser.Using_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#using_alias_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_alias_directive(calculatorParser.Using_alias_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#using_alias_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_alias_directive(calculatorParser.Using_alias_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#using_namespace_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_namespace_directive(calculatorParser.Using_namespace_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#using_namespace_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_namespace_directive(calculatorParser.Using_namespace_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declarations(calculatorParser.Namespace_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declarations(calculatorParser.Namespace_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declaration(calculatorParser.Namespace_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declaration(calculatorParser.Namespace_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(calculatorParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(calculatorParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void enterQualified_alias_member(calculatorParser.Qualified_alias_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void exitQualified_alias_member(calculatorParser.Qualified_alias_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(calculatorParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(calculatorParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifiers(calculatorParser.Class_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifiers(calculatorParser.Class_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_modifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifier(calculatorParser.Class_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_modifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifier(calculatorParser.Class_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_list(calculatorParser.Type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_list(calculatorParser.Type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterType_parameters(calculatorParser.Type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitType_parameters(calculatorParser.Type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter(calculatorParser.Type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter(calculatorParser.Type_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_base}.
	 * @param ctx the parse tree
	 */
	void enterClass_base(calculatorParser.Class_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_base}.
	 * @param ctx the parse tree
	 */
	void exitClass_base(calculatorParser.Class_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type_list(calculatorParser.Interface_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type_list(calculatorParser.Interface_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clauses(calculatorParser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clauses(calculatorParser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clause(calculatorParser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clause(calculatorParser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints(calculatorParser.Type_parameter_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints(calculatorParser.Type_parameter_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_constraint(calculatorParser.Primary_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_constraint(calculatorParser.Primary_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_constraints(calculatorParser.Secondary_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_constraints(calculatorParser.Secondary_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_constraint(calculatorParser.Constructor_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_constraint(calculatorParser.Constructor_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(calculatorParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(calculatorParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declarations(calculatorParser.Class_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declarations(calculatorParser.Class_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declaration(calculatorParser.Class_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declaration(calculatorParser.Class_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifiers(calculatorParser.All_member_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifiers(calculatorParser.All_member_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifier(calculatorParser.All_member_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifier(calculatorParser.All_member_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCommon_member_declaration(calculatorParser.Common_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCommon_member_declaration(calculatorParser.Common_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_member_declaration(calculatorParser.Typed_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_member_declaration(calculatorParser.Typed_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarators(calculatorParser.Constant_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarators(calculatorParser.Constant_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarator(calculatorParser.Constant_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarator(calculatorParser.Constant_declaratorContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(calculatorParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(calculatorParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_header}.
	 * @param ctx the parse tree
	 */
	void enterMethod_header(calculatorParser.Method_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_header}.
	 * @param ctx the parse tree
	 */
	void exitMethod_header(calculatorParser.Method_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifiers(calculatorParser.Method_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifiers(calculatorParser.Method_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_modifier}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifier(calculatorParser.Method_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_modifier}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifier(calculatorParser.Method_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(calculatorParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(calculatorParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#member_name}.
	 * @param ctx the parse tree
	 */
	void enterMember_name(calculatorParser.Member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#member_name}.
	 * @param ctx the parse tree
	 */
	void exitMember_name(calculatorParser.Member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(calculatorParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(calculatorParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(calculatorParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(calculatorParser.Formal_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameters(calculatorParser.Fixed_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameters(calculatorParser.Fixed_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameter(calculatorParser.Fixed_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameter(calculatorParser.Fixed_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#default_argument}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument(calculatorParser.Default_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#default_argument}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument(calculatorParser.Default_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_modifier(calculatorParser.Parameter_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_modifier(calculatorParser.Parameter_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void enterParameter_array(calculatorParser.Parameter_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void exitParameter_array(calculatorParser.Parameter_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(calculatorParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(calculatorParser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#property_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifiers(calculatorParser.Property_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#property_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifiers(calculatorParser.Property_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#property_modifier}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifier(calculatorParser.Property_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#property_modifier}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifier(calculatorParser.Property_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_declarations(calculatorParser.Accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_declarations(calculatorParser.Accessor_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGet_accessor_declaration(calculatorParser.Get_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGet_accessor_declaration(calculatorParser.Get_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSet_accessor_declaration(calculatorParser.Set_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSet_accessor_declaration(calculatorParser.Set_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_modifier(calculatorParser.Accessor_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_modifier(calculatorParser.Accessor_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_body(calculatorParser.Accessor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_body(calculatorParser.Accessor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration(calculatorParser.Event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration(calculatorParser.Event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#event_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifiers(calculatorParser.Event_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#event_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifiers(calculatorParser.Event_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#event_modifier}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifier(calculatorParser.Event_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#event_modifier}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifier(calculatorParser.Event_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEvent_accessor_declarations(calculatorParser.Event_accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEvent_accessor_declarations(calculatorParser.Event_accessor_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAdd_accessor_declaration(calculatorParser.Add_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAdd_accessor_declaration(calculatorParser.Add_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRemove_accessor_declaration(calculatorParser.Remove_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRemove_accessor_declaration(calculatorParser.Remove_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declaration(calculatorParser.Indexer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declaration(calculatorParser.Indexer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#indexer_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifiers(calculatorParser.Indexer_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#indexer_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifiers(calculatorParser.Indexer_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#indexer_modifier}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifier(calculatorParser.Indexer_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#indexer_modifier}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifier(calculatorParser.Indexer_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#indexer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declarator(calculatorParser.Indexer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#indexer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declarator(calculatorParser.Indexer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(calculatorParser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(calculatorParser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#operator_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifiers(calculatorParser.Operator_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#operator_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifiers(calculatorParser.Operator_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#operator_modifier}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifier(calculatorParser.Operator_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#operator_modifier}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifier(calculatorParser.Operator_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declarator(calculatorParser.Operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declarator(calculatorParser.Operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_declarator(calculatorParser.Unary_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_declarator(calculatorParser.Unary_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#overloadable_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_unary_operator(calculatorParser.Overloadable_unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#overloadable_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_unary_operator(calculatorParser.Overloadable_unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#binary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_declarator(calculatorParser.Binary_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#binary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_declarator(calculatorParser.Binary_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#overloadable_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_binary_operator(calculatorParser.Overloadable_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#overloadable_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_binary_operator(calculatorParser.Overloadable_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_operator(calculatorParser.Overloadable_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_operator(calculatorParser.Overloadable_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConversion_operator_declarator(calculatorParser.Conversion_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConversion_operator_declarator(calculatorParser.Conversion_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#operator_body}.
	 * @param ctx the parse tree
	 */
	void enterOperator_body(calculatorParser.Operator_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#operator_body}.
	 * @param ctx the parse tree
	 */
	void exitOperator_body(calculatorParser.Operator_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(calculatorParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(calculatorParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifiers(calculatorParser.Constructor_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifiers(calculatorParser.Constructor_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_modifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifier(calculatorParser.Constructor_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_modifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifier(calculatorParser.Constructor_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declarator(calculatorParser.Constructor_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declarator(calculatorParser.Constructor_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_initializer(calculatorParser.Constructor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_initializer(calculatorParser.Constructor_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_body(calculatorParser.Constructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_body(calculatorParser.Constructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#static_constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_declaration(calculatorParser.Static_constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#static_constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_declaration(calculatorParser.Static_constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#static_constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_modifiers(calculatorParser.Static_constructor_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#static_constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_modifiers(calculatorParser.Static_constructor_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#static_constructor_body}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_body(calculatorParser.Static_constructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#static_constructor_body}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_body(calculatorParser.Static_constructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#destructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_declaration(calculatorParser.Destructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#destructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_declaration(calculatorParser.Destructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#destructor_body}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_body(calculatorParser.Destructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#destructor_body}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_body(calculatorParser.Destructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(calculatorParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(calculatorParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(calculatorParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(calculatorParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifiers(calculatorParser.Struct_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifiers(calculatorParser.Struct_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_modifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifier(calculatorParser.Struct_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_modifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifier(calculatorParser.Struct_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void enterStruct_interfaces(calculatorParser.Struct_interfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void exitStruct_interfaces(calculatorParser.Struct_interfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(calculatorParser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(calculatorParser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declarations(calculatorParser.Struct_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declarations(calculatorParser.Struct_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration(calculatorParser.Struct_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration(calculatorParser.Struct_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(calculatorParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(calculatorParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#non_array_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_array_type(calculatorParser.Non_array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#non_array_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_array_type(calculatorParser.Non_array_typeContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(calculatorParser.Interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(calculatorParser.Interface_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifiers(calculatorParser.Interface_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifiers(calculatorParser.Interface_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_modifier}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifier(calculatorParser.Interface_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_modifier}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifier(calculatorParser.Interface_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameter_list(calculatorParser.Variant_type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameter_list(calculatorParser.Variant_type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variant_type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameters(calculatorParser.Variant_type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variant_type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameters(calculatorParser.Variant_type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void enterVariance_annotation(calculatorParser.Variance_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void exitVariance_annotation(calculatorParser.Variance_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_base}.
	 * @param ctx the parse tree
	 */
	void enterInterface_base(calculatorParser.Interface_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_base}.
	 * @param ctx the parse tree
	 */
	void exitInterface_base(calculatorParser.Interface_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(calculatorParser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(calculatorParser.Interface_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterInterface_member_declarations(calculatorParser.Interface_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitInterface_member_declarations(calculatorParser.Interface_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_member_declaration(calculatorParser.Interface_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_member_declaration(calculatorParser.Interface_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method_declaration(calculatorParser.Interface_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method_declaration(calculatorParser.Interface_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_property_declaration(calculatorParser.Interface_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_property_declaration(calculatorParser.Interface_property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void enterInterface_accessors(calculatorParser.Interface_accessorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void exitInterface_accessors(calculatorParser.Interface_accessorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_event_declaration(calculatorParser.Interface_event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_event_declaration(calculatorParser.Interface_event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_indexer_declaration(calculatorParser.Interface_indexer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_indexer_declaration(calculatorParser.Interface_indexer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(calculatorParser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(calculatorParser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#enum_base}.
	 * @param ctx the parse tree
	 */
	void enterEnum_base(calculatorParser.Enum_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#enum_base}.
	 * @param ctx the parse tree
	 */
	void exitEnum_base(calculatorParser.Enum_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void enterEnum_body(calculatorParser.Enum_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void exitEnum_body(calculatorParser.Enum_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#enum_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterEnum_modifiers(calculatorParser.Enum_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#enum_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitEnum_modifiers(calculatorParser.Enum_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#enum_modifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_modifier(calculatorParser.Enum_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#enum_modifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_modifier(calculatorParser.Enum_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#enum_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEnum_member_declarations(calculatorParser.Enum_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#enum_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEnum_member_declarations(calculatorParser.Enum_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_member_declaration(calculatorParser.Enum_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_member_declaration(calculatorParser.Enum_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#delegate_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_declaration(calculatorParser.Delegate_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#delegate_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_declaration(calculatorParser.Delegate_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#delegate_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifiers(calculatorParser.Delegate_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#delegate_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifiers(calculatorParser.Delegate_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#delegate_modifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifier(calculatorParser.Delegate_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#delegate_modifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifier(calculatorParser.Delegate_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#global_attributes}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attributes(calculatorParser.Global_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#global_attributes}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attributes(calculatorParser.Global_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#global_attribute_sections}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_sections(calculatorParser.Global_attribute_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#global_attribute_sections}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_sections(calculatorParser.Global_attribute_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_section(calculatorParser.Global_attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_section(calculatorParser.Global_attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#global_attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_target_specifier(calculatorParser.Global_attribute_target_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#global_attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_target_specifier(calculatorParser.Global_attribute_target_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_target(calculatorParser.Global_attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_target(calculatorParser.Global_attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(calculatorParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(calculatorParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute_sections}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_sections(calculatorParser.Attribute_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute_sections}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_sections(calculatorParser.Attribute_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_section(calculatorParser.Attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_section(calculatorParser.Attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target_specifier(calculatorParser.Attribute_target_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target_specifier(calculatorParser.Attribute_target_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target(calculatorParser.Attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target(calculatorParser.Attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(calculatorParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(calculatorParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(calculatorParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(calculatorParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(calculatorParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(calculatorParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute_arguments}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_arguments(calculatorParser.Attribute_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute_arguments}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_arguments(calculatorParser.Attribute_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#positional_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPositional_argument_list(calculatorParser.Positional_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#positional_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPositional_argument_list(calculatorParser.Positional_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#positional_argument}.
	 * @param ctx the parse tree
	 */
	void enterPositional_argument(calculatorParser.Positional_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#positional_argument}.
	 * @param ctx the parse tree
	 */
	void exitPositional_argument(calculatorParser.Positional_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument_list(calculatorParser.Named_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument_list(calculatorParser.Named_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument(calculatorParser.Named_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#named_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument(calculatorParser.Named_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#attribute_argument_expression}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_expression(calculatorParser.Attribute_argument_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#attribute_argument_expression}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_expression(calculatorParser.Attribute_argument_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#class_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifier_unsafe(calculatorParser.Class_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifier_unsafe(calculatorParser.Class_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifier_unsafe(calculatorParser.Struct_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifier_unsafe(calculatorParser.Struct_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifier_unsafe(calculatorParser.Interface_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifier_unsafe(calculatorParser.Interface_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#delegate_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifier_unsafe(calculatorParser.Delegate_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#delegate_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifier_unsafe(calculatorParser.Delegate_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#field_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterField_modifier_unsafe(calculatorParser.Field_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#field_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitField_modifier_unsafe(calculatorParser.Field_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifier_unsafe(calculatorParser.Method_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifier_unsafe(calculatorParser.Method_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#property_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifier_unsafe(calculatorParser.Property_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#property_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifier_unsafe(calculatorParser.Property_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#event_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifier_unsafe(calculatorParser.Event_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#event_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifier_unsafe(calculatorParser.Event_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#indexer_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifier_unsafe(calculatorParser.Indexer_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#indexer_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifier_unsafe(calculatorParser.Indexer_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#operator_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifier_unsafe(calculatorParser.Operator_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#operator_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifier_unsafe(calculatorParser.Operator_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifier_unsafe(calculatorParser.Constructor_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifier_unsafe(calculatorParser.Constructor_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#destructor_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_declaration_unsafe(calculatorParser.Destructor_declaration_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#destructor_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_declaration_unsafe(calculatorParser.Destructor_declaration_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#static_constructor_modifiers_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_modifiers_unsafe(calculatorParser.Static_constructor_modifiers_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#static_constructor_modifiers_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_modifiers_unsafe(calculatorParser.Static_constructor_modifiers_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#embedded_statement_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement_unsafe(calculatorParser.Embedded_statement_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#embedded_statement_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement_unsafe(calculatorParser.Embedded_statement_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unsafe_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsafe_statement(calculatorParser.Unsafe_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unsafe_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsafe_statement(calculatorParser.Unsafe_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#type_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterType_unsafe(calculatorParser.Type_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#type_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitType_unsafe(calculatorParser.Type_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void enterPointer_type(calculatorParser.Pointer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void exitPointer_type(calculatorParser.Pointer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unmanaged_type}.
	 * @param ctx the parse tree
	 */
	void enterUnmanaged_type(calculatorParser.Unmanaged_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unmanaged_type}.
	 * @param ctx the parse tree
	 */
	void exitUnmanaged_type(calculatorParser.Unmanaged_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#primary_no_array_creation_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_no_array_creation_expression_unsafe(calculatorParser.Primary_no_array_creation_expression_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#primary_no_array_creation_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_no_array_creation_expression_unsafe(calculatorParser.Primary_no_array_creation_expression_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unary_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression_unsafe(calculatorParser.Unary_expression_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unary_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression_unsafe(calculatorParser.Unary_expression_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#pointer_indirection_expression}.
	 * @param ctx the parse tree
	 */
	void enterPointer_indirection_expression(calculatorParser.Pointer_indirection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#pointer_indirection_expression}.
	 * @param ctx the parse tree
	 */
	void exitPointer_indirection_expression(calculatorParser.Pointer_indirection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#addressof_expression}.
	 * @param ctx the parse tree
	 */
	void enterAddressof_expression(calculatorParser.Addressof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#addressof_expression}.
	 * @param ctx the parse tree
	 */
	void exitAddressof_expression(calculatorParser.Addressof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(calculatorParser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(calculatorParser.Sizeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_statement}.
	 * @param ctx the parse tree
	 */
	void enterFixed_statement(calculatorParser.Fixed_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_statement}.
	 * @param ctx the parse tree
	 */
	void exitFixed_statement(calculatorParser.Fixed_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarators(calculatorParser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarators(calculatorParser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarator(calculatorParser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarator(calculatorParser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_initializer(calculatorParser.Fixed_pointer_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_initializer(calculatorParser.Fixed_pointer_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_member_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration_unsafe(calculatorParser.Struct_member_declaration_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_member_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration_unsafe(calculatorParser.Struct_member_declaration_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_size_buffer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declaration(calculatorParser.Fixed_size_buffer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_size_buffer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declaration(calculatorParser.Fixed_size_buffer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_size_buffer_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_modifiers(calculatorParser.Fixed_size_buffer_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_size_buffer_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_modifiers(calculatorParser.Fixed_size_buffer_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_size_buffer_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_modifier(calculatorParser.Fixed_size_buffer_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_size_buffer_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_modifier(calculatorParser.Fixed_size_buffer_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#buffer_element_type}.
	 * @param ctx the parse tree
	 */
	void enterBuffer_element_type(calculatorParser.Buffer_element_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#buffer_element_type}.
	 * @param ctx the parse tree
	 */
	void exitBuffer_element_type(calculatorParser.Buffer_element_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_size_buffer_declarators}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declarators(calculatorParser.Fixed_size_buffer_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_size_buffer_declarators}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declarators(calculatorParser.Fixed_size_buffer_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declarator(calculatorParser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declarator(calculatorParser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer_unsafe(calculatorParser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer_unsafe(calculatorParser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 */
	void enterStackalloc_initializer(calculatorParser.Stackalloc_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 */
	void exitStackalloc_initializer(calculatorParser.Stackalloc_initializerContext ctx);
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
	 * Enter a parse tree produced by {@link calculatorParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(calculatorParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(calculatorParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void enterStruct_definition(calculatorParser.Struct_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void exitStruct_definition(calculatorParser.Struct_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void enterInterface_definition(calculatorParser.Interface_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void exitInterface_definition(calculatorParser.Interface_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnum_definition(calculatorParser.Enum_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnum_definition(calculatorParser.Enum_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_definition(calculatorParser.Delegate_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_definition(calculatorParser.Delegate_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#event_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration2(calculatorParser.Event_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#event_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration2(calculatorParser.Event_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#field_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration2(calculatorParser.Field_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#field_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration2(calculatorParser.Field_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#property_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration2(calculatorParser.Property_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#property_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration2(calculatorParser.Property_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constant_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration2(calculatorParser.Constant_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constant_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration2(calculatorParser.Constant_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declaration2(calculatorParser.Indexer_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declaration2(calculatorParser.Indexer_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_definition(calculatorParser.Destructor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_definition(calculatorParser.Destructor_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constructor_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration2(calculatorParser.Constructor_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constructor_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration2(calculatorParser.Constructor_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration2(calculatorParser.Method_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration2(calculatorParser.Method_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name(calculatorParser.Method_member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name(calculatorParser.Method_member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#method_member_name2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name2(calculatorParser.Method_member_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#method_member_name2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name2(calculatorParser.Method_member_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#operator_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration2(calculatorParser.Operator_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#operator_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration2(calculatorParser.Operator_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_method_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method_declaration2(calculatorParser.Interface_method_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_method_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method_declaration2(calculatorParser.Interface_method_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_property_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_property_declaration2(calculatorParser.Interface_property_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_property_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_property_declaration2(calculatorParser.Interface_property_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_event_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_event_declaration2(calculatorParser.Interface_event_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_event_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_event_declaration2(calculatorParser.Interface_event_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#interface_indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_indexer_declaration2(calculatorParser.Interface_indexer_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#interface_indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_indexer_declaration2(calculatorParser.Interface_indexer_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#member_access2}.
	 * @param ctx the parse tree
	 */
	void enterMember_access2(calculatorParser.Member_access2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#member_access2}.
	 * @param ctx the parse tree
	 */
	void exitMember_access2(calculatorParser.Member_access2Context ctx);
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