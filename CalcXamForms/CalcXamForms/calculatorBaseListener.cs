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
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IcalculatorListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5.3")]
[System.CLSCompliant(false)]
public partial class calculatorBaseListener : IcalculatorListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.expressionResult"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterExpressionResult([NotNull] calculatorParser.ExpressionResultContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.expressionResult"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitExpressionResult([NotNull] calculatorParser.ExpressionResultContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterExpression([NotNull] calculatorParser.ExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitExpression([NotNull] calculatorParser.ExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.multiplyingExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMultiplyingExpression([NotNull] calculatorParser.MultiplyingExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.multiplyingExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMultiplyingExpression([NotNull] calculatorParser.MultiplyingExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.powExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPowExpression([NotNull] calculatorParser.PowExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.powExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPowExpression([NotNull] calculatorParser.PowExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.atom"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAtom([NotNull] calculatorParser.AtomContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.atom"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAtom([NotNull] calculatorParser.AtomContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.scientific"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterScientific([NotNull] calculatorParser.ScientificContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.scientific"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitScientific([NotNull] calculatorParser.ScientificContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.func"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFunc([NotNull] calculatorParser.FuncContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.func"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFunc([NotNull] calculatorParser.FuncContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.funcname"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFuncname([NotNull] calculatorParser.FuncnameContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.funcname"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFuncname([NotNull] calculatorParser.FuncnameContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.relop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterRelop([NotNull] calculatorParser.RelopContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.relop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitRelop([NotNull] calculatorParser.RelopContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.number"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNumber([NotNull] calculatorParser.NumberContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.number"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNumber([NotNull] calculatorParser.NumberContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="calculatorParser.variable"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVariable([NotNull] calculatorParser.VariableContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="calculatorParser.variable"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVariable([NotNull] calculatorParser.VariableContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
