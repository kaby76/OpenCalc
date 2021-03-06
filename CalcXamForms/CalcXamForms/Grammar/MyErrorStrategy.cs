﻿using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

namespace CalcXamForms
{

    public class MyErrorStrategy : Antlr4.Runtime.DefaultErrorStrategy
    {
        public Dictionary<RecognitionException, IntervalSet> LASet = new Dictionary<RecognitionException, IntervalSet>();

        public override void ReportError(Antlr4.Runtime.Parser recognizer, RecognitionException e)
        {
            IntervalSet x = recognizer.GetExpectedTokens();
            LASet[e] = Filter(x);
            base.ReportError(recognizer, e);
        }

        public List<int> _not_used =
            new List<int>()
            {
                calculatorParser.BYTE_ORDER_MARK,
                calculatorParser.ABSTRACT,
                calculatorParser.ADD,
                calculatorParser.ALIAS,
                calculatorParser.ARGLIST,
                calculatorParser.AS,
                calculatorParser.ASCENDING,
                calculatorParser.BASE,
                calculatorParser.BOOL,
                calculatorParser.BREAK,
                calculatorParser.BY,
                calculatorParser.BYTE,
                calculatorParser.CASE,
                calculatorParser.CATCH,
                calculatorParser.CHAR,
                calculatorParser.CHECKED,
                calculatorParser.CLASS,
                calculatorParser.CONST,
                calculatorParser.CONTINUE,
                calculatorParser.DECIMAL,
                calculatorParser.DEFAULT,
                calculatorParser.DELEGATE,
                calculatorParser.DESCENDING,
                calculatorParser.DO,
                calculatorParser.DOUBLE,
                calculatorParser.DYNAMIC,
                calculatorParser.ELSE,
                calculatorParser.ENUM,
                calculatorParser.EQUALS,
                calculatorParser.EVENT,
                calculatorParser.EXPLICIT,
                calculatorParser.EXTERN,
                //calculatorParser.FALSE,
                calculatorParser.FINALLY,
                calculatorParser.FIXED,
                calculatorParser.FLOAT,
                calculatorParser.FOR,
                calculatorParser.FOREACH,
                calculatorParser.FROM,
                calculatorParser.GET,
                calculatorParser.GOTO,
                calculatorParser.GROUP,
                calculatorParser.IF,
                calculatorParser.IMPLICIT,
                calculatorParser.IN,
                calculatorParser.INT,
                calculatorParser.INTERFACE,
                calculatorParser.INTERNAL,
                calculatorParser.INTO,
                calculatorParser.IS,
                calculatorParser.JOIN,
                calculatorParser.LET,
                calculatorParser.LOCK,
                calculatorParser.LONG,
                calculatorParser.NAMESPACE,
                calculatorParser.NEW,
                calculatorParser.NULL,
                calculatorParser.OBJECT,
                calculatorParser.ON,
                calculatorParser.OPERATOR,
                calculatorParser.ORDERBY,
                calculatorParser.OUT,
                calculatorParser.OVERRIDE,
                calculatorParser.PARAMS,
                calculatorParser.PARTIAL,
                calculatorParser.PRIVATE,
                calculatorParser.PROTECTED,
                calculatorParser.PUBLIC,
                calculatorParser.READONLY,
                calculatorParser.REF,
                calculatorParser.REMOVE,
                calculatorParser.RETURN,
                calculatorParser.SBYTE,
                calculatorParser.SEALED,
                calculatorParser.SELECT,
                calculatorParser.SET,
                calculatorParser.SHORT,
                calculatorParser.SIZEOF,
                calculatorParser.STACKALLOC,
                calculatorParser.STATIC,
                calculatorParser.STRING,
                calculatorParser.STRUCT,
                calculatorParser.SWITCH,
                calculatorParser.THIS,
                calculatorParser.THROW,
                //calculatorParser.TRUE,
                calculatorParser.TRY,
                calculatorParser.TYPEOF,
                calculatorParser.UINT,
                calculatorParser.ULONG,
                calculatorParser.UNCHECKED,
                calculatorParser.UNSAFE,
                calculatorParser.USHORT,
                calculatorParser.USING,
                calculatorParser.VIRTUAL,
                calculatorParser.VOID,
                calculatorParser.VOLATILE,
                calculatorParser.WHERE,
                calculatorParser.WHILE,
                calculatorParser.YIELD,
                calculatorParser.IDENTIFIER,
                //calculatorParser.INTEGER_LITERAL,
                //calculatorParser.REAL_LITERAL,
                calculatorParser.CHARACTER_LITERAL,
                calculatorParser.STRING_LITERAL,
                calculatorParser.OPEN_BRACE,
                calculatorParser.CLOSE_BRACE,
                calculatorParser.OPEN_BRACKET,
                calculatorParser.CLOSE_BRACKET,
                //calculatorParser.OPEN_PARENS,
                //calculatorParser.CLOSE_PARENS,
                calculatorParser.DOT,
                //calculatorParser.COMMA,
                calculatorParser.COLON,
                calculatorParser.SEMICOLON,
                //calculatorParser.PLUS,
                //calculatorParser.MINUS,
                //calculatorParser.STAR,
                //calculatorParser.DIV,
                //calculatorParser.PERCENT,
                //calculatorParser.AMP,
                //calculatorParser.BITWISE_OR,
                //calculatorParser.CARET,
                //calculatorParser.BANG,
                //calculatorParser.TILDE,
                //calculatorParser.ASSIGNMENT,
                //calculatorParser.LT,
                //calculatorParser.GT,
                calculatorParser.INTERR,
                calculatorParser.DOUBLE_COLON,
                calculatorParser.OP_COALESCING,
                calculatorParser.OP_INC,
                calculatorParser.OP_DEC,
                //calculatorParser.OP_AND,
                //calculatorParser.OP_OR,
                calculatorParser.OP_PTR,
                //calculatorParser.OP_EQ,
                //calculatorParser.OP_NE,
                //calculatorParser.OP_LE,
                //calculatorParser.OP_GE,
                calculatorParser.OP_ADD_ASSIGNMENT,
                calculatorParser.OP_SUB_ASSIGNMENT,
                calculatorParser.OP_MULT_ASSIGNMENT,
                calculatorParser.OP_DIV_ASSIGNMENT,
                calculatorParser.OP_MOD_ASSIGNMENT,
                calculatorParser.OP_AND_ASSIGNMENT,
                calculatorParser.OP_OR_ASSIGNMENT,
                calculatorParser.OP_XOR_ASSIGNMENT,
                //calculatorParser.OP_LEFT_SHIFT,
                calculatorParser.OP_LEFT_SHIFT_ASSIGNMENT,
                calculatorParser.QUOTE,
                calculatorParser.DOUBLE_QUOTE,
                calculatorParser.BACK_SLASH,
                calculatorParser.DOUBLE_BACK_SLASH,
                calculatorParser.SHARP
            };

        private IntervalSet Filter(IntervalSet original)
        {
            IntervalSet result = new IntervalSet();
            foreach (Interval i in original.GetIntervals())
            {
                for (int j = i.a; j <= i.b; ++j)
                    if (!_not_used.Contains(j))
                        result.Add(j);
            }
            return result;
        }

        [return: Nullable]
        protected override IToken SingleTokenDeletion(Parser recognizer)
        {
            IToken res = base.SingleTokenDeletion(recognizer);
            return res;
        }

        protected override bool SingleTokenInsertion(Parser recognizer)
        {
            var res = base.SingleTokenInsertion(recognizer);
            return res;
        }

        protected override void ReportUnwantedToken(Parser recognizer)
        {
            base.ReportUnwantedToken(recognizer);
        }

        protected override void ReportMissingToken(Parser recognizer)
        {
            base.ReportMissingToken(recognizer);
        }

        protected override void ReportInputMismatch(Parser recognizer, InputMismatchException e)
        {
            base.ReportInputMismatch(recognizer, e);
        }

        protected override void ReportFailedPredicate(Parser recognizer, FailedPredicateException e)
        {
            base.ReportFailedPredicate(recognizer, e);
        }

        public override void ReportMatch(Parser recognizer)
        {
            base.ReportMatch(recognizer);
        }

        protected override void ReportNoViableAlternative(Parser recognizer, NoViableAltException e)
        {
            base.ReportNoViableAlternative(recognizer, e);
        }
    }
}
