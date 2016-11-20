using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Tree;

namespace CalcXamForms
{
    class Visitor : ICSharp4Visitor<double>
    {
        public double Visit(IParseTree tree)
        {
            throw new NotImplementedException();
        }

        public double VisitChildren(IRuleNode node)
        {
            throw new NotImplementedException();
        }

        public double VisitTerminal(ITerminalNode node)
        {
            throw new NotImplementedException();
        }

        public double VisitErrorNode(IErrorNode node)
        {
            throw new NotImplementedException();
        }

        public double VisitNamespace_name(CSharp4Parser.Namespace_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_name(CSharp4Parser.Type_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIdentifier(CSharp4Parser.IdentifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNamespace_or_type_name(CSharp4Parser.Namespace_or_type_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_argument_list_opt(CSharp4Parser.Type_argument_list_optContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType(CSharp4Parser.TypeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBase_type(CSharp4Parser.Base_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSimple_type(CSharp4Parser.Simple_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNumeric_type(CSharp4Parser.Numeric_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIntegral_type(CSharp4Parser.Integral_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFloating_point_type(CSharp4Parser.Floating_point_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNullable_type(CSharp4Parser.Nullable_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNon_nullable_value_type(CSharp4Parser.Non_nullable_value_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitReference_type(CSharp4Parser.Reference_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_type(CSharp4Parser.Class_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_type(CSharp4Parser.Interface_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDelegate_type(CSharp4Parser.Delegate_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_argument_list(CSharp4Parser.Type_argument_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_arguments(CSharp4Parser.Type_argumentsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_argument(CSharp4Parser.Type_argumentContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_void(CSharp4Parser.Type_voidContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitVariable_reference(CSharp4Parser.Variable_referenceContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitArgument_list(CSharp4Parser.Argument_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitArgument(CSharp4Parser.ArgumentContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitArgument_name(CSharp4Parser.Argument_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitArgument_value(CSharp4Parser.Argument_valueContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPrimary_expression(CSharp4Parser.Primary_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPrimary_expression_start(CSharp4Parser.Primary_expression_startContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBracket_expression(CSharp4Parser.Bracket_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSimple_name(CSharp4Parser.Simple_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitParenthesized_expression(CSharp4Parser.Parenthesized_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMember_access(CSharp4Parser.Member_accessContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPredefined_type(CSharp4Parser.Predefined_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExpression_list(CSharp4Parser.Expression_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitThis_access(CSharp4Parser.This_accessContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBase_access(CSharp4Parser.Base_accessContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitObject_creation_expression(CSharp4Parser.Object_creation_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitObject_or_collection_initializer(CSharp4Parser.Object_or_collection_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitObject_initializer(CSharp4Parser.Object_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMember_initializer_list(CSharp4Parser.Member_initializer_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMember_initializer(CSharp4Parser.Member_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInitializer_value(CSharp4Parser.Initializer_valueContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitCollection_initializer(CSharp4Parser.Collection_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitElement_initializer_list(CSharp4Parser.Element_initializer_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitElement_initializer(CSharp4Parser.Element_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitArray_creation_expression(CSharp4Parser.Array_creation_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDelegate_creation_expression(CSharp4Parser.Delegate_creation_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAnonymous_object_creation_expression(CSharp4Parser.Anonymous_object_creation_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAnonymous_object_initializer(CSharp4Parser.Anonymous_object_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMember_declarator_list(CSharp4Parser.Member_declarator_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMember_declarator(CSharp4Parser.Member_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitTypeof_expression(CSharp4Parser.Typeof_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUnbound_type_name(CSharp4Parser.Unbound_type_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGeneric_dimension_specifier(CSharp4Parser.Generic_dimension_specifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitCommas(CSharp4Parser.CommasContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitChecked_expression(CSharp4Parser.Checked_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUnchecked_expression(CSharp4Parser.Unchecked_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDefault_value_expression(CSharp4Parser.Default_value_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUnary_expression(CSharp4Parser.Unary_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitScan_for_cast_generic_precedence(CSharp4Parser.Scan_for_cast_generic_precedenceContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitCast_disambiguation_token(CSharp4Parser.Cast_disambiguation_tokenContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPre_increment_expression(CSharp4Parser.Pre_increment_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPre_decrement_expression(CSharp4Parser.Pre_decrement_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitCast_expression(CSharp4Parser.Cast_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMultiplicative_expression(CSharp4Parser.Multiplicative_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAdditive_expression(CSharp4Parser.Additive_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitShift_expression(CSharp4Parser.Shift_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitRelational_expression(CSharp4Parser.Relational_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitScan_for_shift_generic_precedence(CSharp4Parser.Scan_for_shift_generic_precedenceContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitShift_disambiguation_token(CSharp4Parser.Shift_disambiguation_tokenContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIsType(CSharp4Parser.IsTypeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIs_disambiguation_token(CSharp4Parser.Is_disambiguation_tokenContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEquality_expression(CSharp4Parser.Equality_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAnd_expression(CSharp4Parser.And_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExclusive_or_expression(CSharp4Parser.Exclusive_or_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInclusive_or_expression(CSharp4Parser.Inclusive_or_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConditional_and_expression(CSharp4Parser.Conditional_and_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConditional_or_expression(CSharp4Parser.Conditional_or_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNull_coalescing_expression(CSharp4Parser.Null_coalescing_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConditional_expression(CSharp4Parser.Conditional_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLambda_expression(CSharp4Parser.Lambda_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAnonymous_method_expression(CSharp4Parser.Anonymous_method_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAnonymous_function_signature(CSharp4Parser.Anonymous_function_signatureContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExplicit_anonymous_function_signature(CSharp4Parser.Explicit_anonymous_function_signatureContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExplicit_anonymous_function_parameter_list(CSharp4Parser.Explicit_anonymous_function_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExplicit_anonymous_function_parameter(CSharp4Parser.Explicit_anonymous_function_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAnonymous_function_parameter_modifier(CSharp4Parser.Anonymous_function_parameter_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitImplicit_anonymous_function_signature(CSharp4Parser.Implicit_anonymous_function_signatureContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitImplicit_anonymous_function_parameter_list(CSharp4Parser.Implicit_anonymous_function_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitImplicit_anonymous_function_parameter(CSharp4Parser.Implicit_anonymous_function_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAnonymous_function_body(CSharp4Parser.Anonymous_function_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitQuery_expression(CSharp4Parser.Query_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFrom_clause(CSharp4Parser.From_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitQuery_body(CSharp4Parser.Query_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitQuery_body_clauses(CSharp4Parser.Query_body_clausesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitQuery_body_clause(CSharp4Parser.Query_body_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLet_clause(CSharp4Parser.Let_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitWhere_clause(CSharp4Parser.Where_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitJoin_clause(CSharp4Parser.Join_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitJoin_into_clause(CSharp4Parser.Join_into_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitCombined_join_clause(CSharp4Parser.Combined_join_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOrderby_clause(CSharp4Parser.Orderby_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOrderings(CSharp4Parser.OrderingsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOrdering(CSharp4Parser.OrderingContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOrdering_direction(CSharp4Parser.Ordering_directionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSelect_or_group_clause(CSharp4Parser.Select_or_group_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSelect_clause(CSharp4Parser.Select_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGroup_clause(CSharp4Parser.Group_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitQuery_continuation(CSharp4Parser.Query_continuationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAssignment(CSharp4Parser.AssignmentContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAssignment_operator(CSharp4Parser.Assignment_operatorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExpression(CSharp4Parser.ExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNon_assignment_expression(CSharp4Parser.Non_assignment_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstant_expression(CSharp4Parser.Constant_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBoolean_expression(CSharp4Parser.Boolean_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStatement(CSharp4Parser.StatementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEmbedded_statement(CSharp4Parser.Embedded_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSimple_embedded_statement(CSharp4Parser.Simple_embedded_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBlock(CSharp4Parser.BlockContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStatement_list(CSharp4Parser.Statement_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEmpty_statement(CSharp4Parser.Empty_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLabeled_statement(CSharp4Parser.Labeled_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDeclaration_statement(CSharp4Parser.Declaration_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLocal_variable_declaration(CSharp4Parser.Local_variable_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLocal_variable_type(CSharp4Parser.Local_variable_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLocal_variable_declarators(CSharp4Parser.Local_variable_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLocal_variable_declarator(CSharp4Parser.Local_variable_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLocal_variable_initializer(CSharp4Parser.Local_variable_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLocal_constant_declaration(CSharp4Parser.Local_constant_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExpression_statement(CSharp4Parser.Expression_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStatement_expression(CSharp4Parser.Statement_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSelection_statement(CSharp4Parser.Selection_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIfBodyBlock(CSharp4Parser.IfBodyBlockContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIfBodySingle(CSharp4Parser.IfBodySingleContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIf_statement(CSharp4Parser.If_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSwitch_statement(CSharp4Parser.Switch_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSwitch_block(CSharp4Parser.Switch_blockContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSwitch_sections(CSharp4Parser.Switch_sectionsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSwitch_section(CSharp4Parser.Switch_sectionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSwitch_labels(CSharp4Parser.Switch_labelsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSwitch_label(CSharp4Parser.Switch_labelContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIteration_statement(CSharp4Parser.Iteration_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitWhile_statement(CSharp4Parser.While_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDo_statement(CSharp4Parser.Do_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFor_statement(CSharp4Parser.For_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFor_initializer(CSharp4Parser.For_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFor_condition(CSharp4Parser.For_conditionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFor_iterator(CSharp4Parser.For_iteratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStatement_expression_list(CSharp4Parser.Statement_expression_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitForeach_statement(CSharp4Parser.Foreach_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitJump_statement(CSharp4Parser.Jump_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBreak_statement(CSharp4Parser.Break_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitContinue_statement(CSharp4Parser.Continue_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGoto_statement(CSharp4Parser.Goto_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitReturn_statement(CSharp4Parser.Return_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitThrow_statement(CSharp4Parser.Throw_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitTry_statement(CSharp4Parser.Try_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitCatch_clauses(CSharp4Parser.Catch_clausesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSpecific_catch_clauses(CSharp4Parser.Specific_catch_clausesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSpecific_catch_clause(CSharp4Parser.Specific_catch_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGeneral_catch_clause(CSharp4Parser.General_catch_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFinally_clause(CSharp4Parser.Finally_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitChecked_statement(CSharp4Parser.Checked_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUnchecked_statement(CSharp4Parser.Unchecked_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLock_statement(CSharp4Parser.Lock_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUsing_statement(CSharp4Parser.Using_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitResource_acquisition(CSharp4Parser.Resource_acquisitionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitYield_statement(CSharp4Parser.Yield_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitCompilation_unit(CSharp4Parser.Compilation_unitContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNamespace_declaration(CSharp4Parser.Namespace_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitQualified_identifier(CSharp4Parser.Qualified_identifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNamespace_body(CSharp4Parser.Namespace_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExtern_alias_directives(CSharp4Parser.Extern_alias_directivesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitExtern_alias_directive(CSharp4Parser.Extern_alias_directiveContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUsing_directives(CSharp4Parser.Using_directivesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUsing_directive(CSharp4Parser.Using_directiveContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUsing_alias_directive(CSharp4Parser.Using_alias_directiveContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUsing_namespace_directive(CSharp4Parser.Using_namespace_directiveContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNamespace_member_declarations(CSharp4Parser.Namespace_member_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNamespace_member_declaration(CSharp4Parser.Namespace_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_declaration(CSharp4Parser.Type_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitQualified_alias_member(CSharp4Parser.Qualified_alias_memberContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_declaration(CSharp4Parser.Class_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_modifiers(CSharp4Parser.Class_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_modifier(CSharp4Parser.Class_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_parameter_list(CSharp4Parser.Type_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_parameters(CSharp4Parser.Type_parametersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_parameter(CSharp4Parser.Type_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_base(CSharp4Parser.Class_baseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_type_list(CSharp4Parser.Interface_type_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_parameter_constraints_clauses(CSharp4Parser.Type_parameter_constraints_clausesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_parameter_constraints_clause(CSharp4Parser.Type_parameter_constraints_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_parameter_constraints(CSharp4Parser.Type_parameter_constraintsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPrimary_constraint(CSharp4Parser.Primary_constraintContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSecondary_constraints(CSharp4Parser.Secondary_constraintsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_constraint(CSharp4Parser.Constructor_constraintContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_body(CSharp4Parser.Class_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_member_declarations(CSharp4Parser.Class_member_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_member_declaration(CSharp4Parser.Class_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAll_member_modifiers(CSharp4Parser.All_member_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAll_member_modifier(CSharp4Parser.All_member_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitCommon_member_declaration(CSharp4Parser.Common_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitTyped_member_declaration(CSharp4Parser.Typed_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstant_declarators(CSharp4Parser.Constant_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstant_declarator(CSharp4Parser.Constant_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitVariable_declarators(CSharp4Parser.Variable_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitVariable_declarator(CSharp4Parser.Variable_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitVariable_initializer(CSharp4Parser.Variable_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_declaration(CSharp4Parser.Method_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_header(CSharp4Parser.Method_headerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_modifiers(CSharp4Parser.Method_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_modifier(CSharp4Parser.Method_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitReturn_type(CSharp4Parser.Return_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMember_name(CSharp4Parser.Member_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_body(CSharp4Parser.Method_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFormal_parameter_list(CSharp4Parser.Formal_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_parameters(CSharp4Parser.Fixed_parametersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_parameter(CSharp4Parser.Fixed_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDefault_argument(CSharp4Parser.Default_argumentContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitParameter_modifier(CSharp4Parser.Parameter_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitParameter_array(CSharp4Parser.Parameter_arrayContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitProperty_declaration(CSharp4Parser.Property_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitProperty_modifiers(CSharp4Parser.Property_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitProperty_modifier(CSharp4Parser.Property_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAccessor_declarations(CSharp4Parser.Accessor_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGet_accessor_declaration(CSharp4Parser.Get_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSet_accessor_declaration(CSharp4Parser.Set_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAccessor_modifier(CSharp4Parser.Accessor_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAccessor_body(CSharp4Parser.Accessor_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEvent_declaration(CSharp4Parser.Event_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEvent_modifiers(CSharp4Parser.Event_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEvent_modifier(CSharp4Parser.Event_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEvent_accessor_declarations(CSharp4Parser.Event_accessor_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAdd_accessor_declaration(CSharp4Parser.Add_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitRemove_accessor_declaration(CSharp4Parser.Remove_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIndexer_declaration(CSharp4Parser.Indexer_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIndexer_modifiers(CSharp4Parser.Indexer_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIndexer_modifier(CSharp4Parser.Indexer_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIndexer_declarator(CSharp4Parser.Indexer_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOperator_declaration(CSharp4Parser.Operator_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOperator_modifiers(CSharp4Parser.Operator_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOperator_modifier(CSharp4Parser.Operator_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOperator_declarator(CSharp4Parser.Operator_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUnary_operator_declarator(CSharp4Parser.Unary_operator_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOverloadable_unary_operator(CSharp4Parser.Overloadable_unary_operatorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBinary_operator_declarator(CSharp4Parser.Binary_operator_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOverloadable_binary_operator(CSharp4Parser.Overloadable_binary_operatorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOverloadable_operator(CSharp4Parser.Overloadable_operatorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConversion_operator_declarator(CSharp4Parser.Conversion_operator_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOperator_body(CSharp4Parser.Operator_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_declaration(CSharp4Parser.Constructor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_modifiers(CSharp4Parser.Constructor_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_modifier(CSharp4Parser.Constructor_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_declarator(CSharp4Parser.Constructor_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_initializer(CSharp4Parser.Constructor_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_body(CSharp4Parser.Constructor_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStatic_constructor_declaration(CSharp4Parser.Static_constructor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStatic_constructor_modifiers(CSharp4Parser.Static_constructor_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStatic_constructor_body(CSharp4Parser.Static_constructor_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDestructor_declaration(CSharp4Parser.Destructor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDestructor_body(CSharp4Parser.Destructor_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBody(CSharp4Parser.BodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_declaration(CSharp4Parser.Struct_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_modifiers(CSharp4Parser.Struct_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_modifier(CSharp4Parser.Struct_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_interfaces(CSharp4Parser.Struct_interfacesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_body(CSharp4Parser.Struct_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_member_declarations(CSharp4Parser.Struct_member_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_member_declaration(CSharp4Parser.Struct_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitArray_type(CSharp4Parser.Array_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNon_array_type(CSharp4Parser.Non_array_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitRank_specifiers(CSharp4Parser.Rank_specifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitRank_specifier(CSharp4Parser.Rank_specifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDim_separators(CSharp4Parser.Dim_separatorsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitArray_initializer(CSharp4Parser.Array_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitVariable_initializer_list(CSharp4Parser.Variable_initializer_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_declaration(CSharp4Parser.Interface_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_modifiers(CSharp4Parser.Interface_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_modifier(CSharp4Parser.Interface_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitVariant_type_parameter_list(CSharp4Parser.Variant_type_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitVariant_type_parameters(CSharp4Parser.Variant_type_parametersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitVariance_annotation(CSharp4Parser.Variance_annotationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_base(CSharp4Parser.Interface_baseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_body(CSharp4Parser.Interface_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_member_declarations(CSharp4Parser.Interface_member_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_member_declaration(CSharp4Parser.Interface_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_method_declaration(CSharp4Parser.Interface_method_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_property_declaration(CSharp4Parser.Interface_property_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_accessors(CSharp4Parser.Interface_accessorsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_event_declaration(CSharp4Parser.Interface_event_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_indexer_declaration(CSharp4Parser.Interface_indexer_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEnum_declaration(CSharp4Parser.Enum_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEnum_base(CSharp4Parser.Enum_baseContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEnum_body(CSharp4Parser.Enum_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEnum_modifiers(CSharp4Parser.Enum_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEnum_modifier(CSharp4Parser.Enum_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEnum_member_declarations(CSharp4Parser.Enum_member_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEnum_member_declaration(CSharp4Parser.Enum_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDelegate_declaration(CSharp4Parser.Delegate_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDelegate_modifiers(CSharp4Parser.Delegate_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDelegate_modifier(CSharp4Parser.Delegate_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGlobal_attributes(CSharp4Parser.Global_attributesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGlobal_attribute_sections(CSharp4Parser.Global_attribute_sectionsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGlobal_attribute_section(CSharp4Parser.Global_attribute_sectionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGlobal_attribute_target_specifier(CSharp4Parser.Global_attribute_target_specifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGlobal_attribute_target(CSharp4Parser.Global_attribute_targetContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttributes(CSharp4Parser.AttributesContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute_sections(CSharp4Parser.Attribute_sectionsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute_section(CSharp4Parser.Attribute_sectionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute_target_specifier(CSharp4Parser.Attribute_target_specifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute_target(CSharp4Parser.Attribute_targetContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute_list(CSharp4Parser.Attribute_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute(CSharp4Parser.AttributeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute_name(CSharp4Parser.Attribute_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute_arguments(CSharp4Parser.Attribute_argumentsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPositional_argument_list(CSharp4Parser.Positional_argument_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPositional_argument(CSharp4Parser.Positional_argumentContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNamed_argument_list(CSharp4Parser.Named_argument_listContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitNamed_argument(CSharp4Parser.Named_argumentContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAttribute_argument_expression(CSharp4Parser.Attribute_argument_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_modifier_unsafe(CSharp4Parser.Class_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_modifier_unsafe(CSharp4Parser.Struct_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_modifier_unsafe(CSharp4Parser.Interface_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDelegate_modifier_unsafe(CSharp4Parser.Delegate_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitField_modifier_unsafe(CSharp4Parser.Field_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_modifier_unsafe(CSharp4Parser.Method_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitProperty_modifier_unsafe(CSharp4Parser.Property_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEvent_modifier_unsafe(CSharp4Parser.Event_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitIndexer_modifier_unsafe(CSharp4Parser.Indexer_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOperator_modifier_unsafe(CSharp4Parser.Operator_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_modifier_unsafe(CSharp4Parser.Constructor_modifier_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDestructor_declaration_unsafe(CSharp4Parser.Destructor_declaration_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStatic_constructor_modifiers_unsafe(CSharp4Parser.Static_constructor_modifiers_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEmbedded_statement_unsafe(CSharp4Parser.Embedded_statement_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUnsafe_statement(CSharp4Parser.Unsafe_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitType_unsafe(CSharp4Parser.Type_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPointer_type(CSharp4Parser.Pointer_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUnmanaged_type(CSharp4Parser.Unmanaged_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPrimary_no_array_creation_expression_unsafe(CSharp4Parser.Primary_no_array_creation_expression_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitUnary_expression_unsafe(CSharp4Parser.Unary_expression_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPointer_indirection_expression(CSharp4Parser.Pointer_indirection_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAddressof_expression(CSharp4Parser.Addressof_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSizeof_expression(CSharp4Parser.Sizeof_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_statement(CSharp4Parser.Fixed_statementContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_pointer_declarators(CSharp4Parser.Fixed_pointer_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_pointer_declarator(CSharp4Parser.Fixed_pointer_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_pointer_initializer(CSharp4Parser.Fixed_pointer_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_member_declaration_unsafe(CSharp4Parser.Struct_member_declaration_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_size_buffer_declaration(CSharp4Parser.Fixed_size_buffer_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_size_buffer_modifiers(CSharp4Parser.Fixed_size_buffer_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_size_buffer_modifier(CSharp4Parser.Fixed_size_buffer_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBuffer_element_type(CSharp4Parser.Buffer_element_typeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_size_buffer_declarators(CSharp4Parser.Fixed_size_buffer_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFixed_size_buffer_declarator(CSharp4Parser.Fixed_size_buffer_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLocal_variable_initializer_unsafe(CSharp4Parser.Local_variable_initializer_unsafeContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStackalloc_initializer(CSharp4Parser.Stackalloc_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitFrom_contextual_keyword(CSharp4Parser.From_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLet_contextual_keyword(CSharp4Parser.Let_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitWhere_contextual_keyword(CSharp4Parser.Where_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitJoin_contextual_keyword(CSharp4Parser.Join_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOn_contextual_keyword(CSharp4Parser.On_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEquals_contextual_keyword(CSharp4Parser.Equals_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInto_contextual_keyword(CSharp4Parser.Into_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitOrderby_contextual_keyword(CSharp4Parser.Orderby_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAscending_contextual_keyword(CSharp4Parser.Ascending_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDescending_contextual_keyword(CSharp4Parser.Descending_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSelect_contextual_keyword(CSharp4Parser.Select_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGroup_contextual_keyword(CSharp4Parser.Group_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBy_contextual_keyword(CSharp4Parser.By_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitPartial_contextual_keyword(CSharp4Parser.Partial_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAlias_contextual_keyword(CSharp4Parser.Alias_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitYield_contextual_keyword(CSharp4Parser.Yield_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitGet_contextual_keyword(CSharp4Parser.Get_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitSet_contextual_keyword(CSharp4Parser.Set_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitAdd_contextual_keyword(CSharp4Parser.Add_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitRemove_contextual_keyword(CSharp4Parser.Remove_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDynamic_contextual_keyword(CSharp4Parser.Dynamic_contextual_keywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitArglist(CSharp4Parser.ArglistContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitRight_arrow(CSharp4Parser.Right_arrowContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitRight_shift(CSharp4Parser.Right_shiftContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitRight_shift_assignment(CSharp4Parser.Right_shift_assignmentContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitLiteral(CSharp4Parser.LiteralContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitBoolean_literal(CSharp4Parser.Boolean_literalContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitKeyword(CSharp4Parser.KeywordContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitClass_definition(CSharp4Parser.Class_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitStruct_definition(CSharp4Parser.Struct_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_definition(CSharp4Parser.Interface_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEnum_definition(CSharp4Parser.Enum_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitDelegate_definition(CSharp4Parser.Delegate_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitEvent_declaration2(CSharp4Parser.Event_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitField_declaration2(CSharp4Parser.Field_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitProperty_declaration2(CSharp4Parser.Property_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstant_declaration2(CSharp4Parser.Constant_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitIndexer_declaration2(CSharp4Parser.Indexer_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitDestructor_definition(CSharp4Parser.Destructor_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitConstructor_declaration2(CSharp4Parser.Constructor_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_declaration2(CSharp4Parser.Method_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_member_name(CSharp4Parser.Method_member_nameContext context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_member_name2(CSharp4Parser.Method_member_name2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitOperator_declaration2(CSharp4Parser.Operator_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_method_declaration2(CSharp4Parser.Interface_method_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_property_declaration2(CSharp4Parser.Interface_property_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_event_declaration2(CSharp4Parser.Interface_event_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitInterface_indexer_declaration2(CSharp4Parser.Interface_indexer_declaration2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitMember_access2(CSharp4Parser.Member_access2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitMethod_invocation2(CSharp4Parser.Method_invocation2Context context)
        {
            throw new NotImplementedException();
        }

        public double VisitObject_creation_expression2(CSharp4Parser.Object_creation_expression2Context context)
        {
            throw new NotImplementedException();
        }
    }
}
