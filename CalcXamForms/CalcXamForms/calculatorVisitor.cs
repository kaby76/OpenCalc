//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.5.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from calculator.g4 by ANTLR 4.5.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="calculatorParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5.3")]
[System.CLSCompliant(false)]
public interface IcalculatorVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.expressionResult"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpressionResult([NotNull] calculatorParser.ExpressionResultContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.equation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitEquation([NotNull] calculatorParser.EquationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] calculatorParser.ExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.multiplyingExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMultiplyingExpression([NotNull] calculatorParser.MultiplyingExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.powExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPowExpression([NotNull] calculatorParser.PowExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.atom"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAtom([NotNull] calculatorParser.AtomContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.scientific"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitScientific([NotNull] calculatorParser.ScientificContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.relop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitRelop([NotNull] calculatorParser.RelopContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="calculatorParser.number"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumber([NotNull] calculatorParser.NumberContext context);
}