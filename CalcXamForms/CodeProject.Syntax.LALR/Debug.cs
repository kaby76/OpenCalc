using System;
using System.Collections.Generic;
using System.IO;

namespace CodeProject.Syntax.LALR
{
	public class Debug
	{
	    public static StreamWriter Console;
        private static MemoryStream mem = new MemoryStream();

        static Debug()
	    {
            Console = new StreamWriter(mem);
        }

	    public static string Output()
	    {
	        Console.Flush();
            String result = System.Text.Encoding.UTF8.GetString(mem.ToArray(), 0, (int)mem.Length);
            return result;
	    }

		/// <summary>
		/// Gets the name of a particular token
		/// </summary>
		/// <param name="parser">
		/// A Parser <see cref="ParserGenerator"/>
		/// </param>
		/// <param name="nTokenID">
		/// The token id <see cref="System.Int32"/>
		/// </param>
		/// <returns>
		/// The token name <see cref="System.String"/>
		/// </returns>
		public static string GetTokenName(ParserGenerator parser, int nTokenID)
		{
			if(nTokenID == -1)
			{
				return "$";
			}
			else
			{
				return parser.Grammar.Tokens[nTokenID];
			}
		}
		
		/// <summary>
		/// Outputs an LR0 Item
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>
		/// <param name="item">
		/// The LR0Item <see cref="LR0Item"/>
		/// </param>
		public static void DumpLR0Item(ParserGenerator parser, LR0Item item)
		{
			Console.Write(parser.Grammar.Tokens[parser.Productions[item.Production].Left]);
			Console.Write(" ->");
			int nPosition = 0;
			for(;;)
			{
				if(nPosition == item.Position)
				{
					Console.Write(" *");
				}
				if(nPosition >= parser.Productions[item.Production].Right.Length)
				{
					break;
				}
				int nToken = parser.Productions[item.Production].Right[nPosition];
				Console.Write(" " + parser.Grammar.Tokens[nToken]);
				
				nPosition++;
			}
			Console.WriteLine();
		}
		
		/// <summary>
		/// Outputs an LR0 State
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>
		/// <param name="state">
		/// A set of LR0 Item IDs <see cref="HashSet<System.Int32>"/>
		/// </param>
		public static void DumpLR0State(ParserGenerator parser, HashSet<int> state)
		{
			foreach(int nLR0Item in state)
			{
				DumpLR0Item(parser, parser.LR0Items[nLR0Item]);
			}
		}
		
		/// <summary>
		/// Outputs the entire set of LR0 Items
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpLR0Items(ParserGenerator parser)
		{
			Console.WriteLine("LR0Items:");
			foreach(LR0Item item in parser.LR0Items)
			{
				DumpLR0Item(parser, item);
			}
		}
		
		/// <summary>
		/// Outputs the entire set of LR0 States
		/// </summary>
		/// <param name="parser">
		/// The Parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpLR0States(ParserGenerator parser)
		{
			Console.WriteLine("LR0States:");
			int nState = 0;
			foreach(HashSet<int> state in parser.LR0States)
			{
				Console.WriteLine("State " + nState.ToString() + ":");
				DumpLR0State(parser, state);
				nState ++;
			}
		}
		
		/// <summary>
		/// Outputs the entire set of LR0 Kernels
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpLR0Kernels(ParserGenerator parser)
		{
			Console.WriteLine("LR0Kernels:");
			int nState = 0;
			foreach(HashSet<int> state in parser.LR0Kernels)
			{
				Console.WriteLine("Kernel " + nState.ToString() + ":");
				DumpLR0State(parser, state);
				nState ++;
			}
		}
		
		/// <summary>
		/// Outputs the first sets of each token
		/// </summary>
		/// <param name="parser">
		/// The Parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpFirstSets(ParserGenerator parser)
		{
			int nToken;
			for(nToken = 0; nToken < parser.Grammar.Tokens.Length; nToken++)
			{
				Console.Write("FIRST(" + parser.Grammar.Tokens[nToken] + ") = {");
				bool bFirstInList = true;
				foreach(int nTokenFirst in parser.FirstSets[nToken])
				{
					if(bFirstInList)
					{
						bFirstInList = false;
					}
					else
					{
						Console.Write(", ");
					}
					if(nTokenFirst == -1)
					{
						Console.Write("#");
					}
					else
					{
						Console.Write(parser.Grammar.Tokens[nTokenFirst]);
					}
				}
				
				Console.WriteLine("}");
			}
		}
		
		/// <summary>
		/// Outputs an LR1 State
		/// </summary>
		/// <param name="parser">
		/// The Parser <see cref="ParserGenerator"/>
		/// </param>
		/// <param name="lr1State">
		/// A List of LR1 Item IDs <see cref="HashSet<System.Int32>"/>
		/// </param>
		public static void DumpLR1State(ParserGenerator parser, HashSet<int> lr1State)
		{
			foreach(int nLR1Item in lr1State)
			{
				LR1Item lr1Item = parser.LR1Items[nLR1Item];
				DumpLR1Item(parser, lr1Item);
			}
		}
		
		/// <summary>
		/// Outputs all of the terminals in the grammar
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>	
		public static void DumpTerminals(ParserGenerator parser)
		{
			bool bFirst = true;
			Console.Write("TERMINALS = {");
			foreach(int nTerminal in parser.Terminals)
			{
				if(bFirst)
				{
					bFirst = false;
				}
				else
				{
					Console.Write(", ");
				}
				Console.Write(parser.Grammar.Tokens[nTerminal]);
			}
			Console.WriteLine("}");
		}
		
		/// <summary>
		/// Outputs all of the Non Terminals in the grammar
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpNonterminals(ParserGenerator parser)
		{
			bool bFirst = true;
			Console.Write("NONTERMINALS = {");
			foreach(int nNonterminal in parser.NonTerminals)
			{
				if(bFirst)
				{
					bFirst = false;
				}
				else
				{
					Console.Write(", ");
				}
				Console.Write(parser.Grammar.Tokens[nNonterminal]);
			}
			Console.WriteLine("}");
		}
		
		/// <summary>
		/// Outputs the LALR propogations for a particular state
		/// </summary>
		/// <param name="parser">
		/// The Parser <see cref="ParserGenerator"/>
		/// </param>
		/// <param name="nStateID">
		/// The state ID <see cref="System.Int32"/>
		/// </param>
		public static void DumpPropogationsForState(ParserGenerator parser, int nStateID)
		{
			if(nStateID < parser.LALRPropogations.Count)
			{
				Dictionary<int, List<LALRPropogation>> propogationsForState = parser.LALRPropogations[nStateID];
				Console.WriteLine("For State " + nStateID + ":");
				foreach(int nItem in propogationsForState.Keys)
				{
					LR0Item item = parser.LR0Items[nItem];
					DumpLR0Item(parser, item);
					Console.Write("-> {");
					List<LALRPropogation> propogations = propogationsForState[nItem];
					foreach(LALRPropogation propogation in propogations)
					{
						Console.Write(" state " + propogation.LR0TargetState + ":");
						DumpLR0Item(parser, parser.LR0Items[propogation.LR0TargetItem]);
					}
					Console.WriteLine("}");
	
				}	
			}
		}
		
		/// <summary>
		/// Outputs the propogation table for the grammar
		/// </summary>
		/// <param name="parser">
		/// The Parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpPropogationTable(ParserGenerator parser)
		{
			for(int nStateID = 0; nStateID < parser.LALRPropogations.Count; nStateID++)
			{
				DumpPropogationsForState(parser, nStateID);
			}
		}
		
		/// <summary>
		/// Outputs an LR1 Item
		/// </summary>
		/// <param name="parser">
		/// The Parser <see cref="ParserGenerator"/>
		/// </param>
		/// <param name="lr1Item">
		/// The LR1 Item <see cref="LR1Item"/>
		/// </param>
		public static void DumpLR1Item(ParserGenerator parser, LR1Item lr1Item)
		{
			
			LR0Item item = parser.LR0Items[lr1Item.LR0ItemID];
			Console.Write(parser.Grammar.Tokens[parser.Productions[item.Production].Left]);
			Console.Write(" ->");
			int nPosition = 0;
			for(;;)
			{
				if(nPosition == item.Position)
				{
					Console.Write(" *");
				}
				if(nPosition >= parser.Productions[item.Production].Right.Length)
				{
					break;
				}
				int nToken = parser.Productions[item.Production].Right[nPosition];
				Console.Write(" " + parser.Grammar.Tokens[nToken]);
				
				nPosition++;
			}
			if(lr1Item.LookAhead == -1)
			{
				Console.WriteLine(", $");
			}
			else
			{
				Console.WriteLine(", " + parser.Grammar.Tokens[lr1Item.LookAhead]);
			}
		}
		
		/// <summary>
		/// Outputs the LALR States for the parser
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpLALRStates(ParserGenerator parser)
		{
			int nStateID = 0;
			foreach(HashSet<int> lalrState in parser.LALRStates)
			{
				Console.WriteLine("State " + nStateID + ":");
				foreach(int nLR1Item in lalrState)
				{
					LR1Item lr1Item = parser.LR1Items[nLR1Item];
					DumpLR1Item(parser, lr1Item);
				}
				nStateID ++;
			}
		}
		
		/// <summary>
		/// Outputs the entire set of LR1 items constructed
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpLR1Items(ParserGenerator parser)
		{
			int nLR1Item = 0;
			foreach(LR1Item lr1Item in parser.LR1Items)
			{
				Console.Write("LR1Item " + nLR1Item + ":");
				DumpLR1Item(parser,lr1Item);
				nLR1Item ++;
			}
		}
		
		/// <summary>
		/// Outputs a formatted parse table
		/// </summary>
		/// <param name="parser">
		/// The parser <see cref="ParserGenerator"/>
		/// </param>
		public static void DumpParseTable(ParserGenerator parser)
		{
			int nStates = parser.ParseTable.Actions.GetLength(0);
			int nTokens = parser.ParseTable.Actions.GetLength(1);
			
			Console.Write("+");
			for(int nToken = 0; nToken < nTokens + 1; nToken++)
			{
				Console.Write("---+");
			}
			Console.WriteLine();
			Console.Write("|###|");
			for(int nToken = 0; nToken < nTokens; nToken++)
			{
				Console.Write("{0,2} |",GetTokenName(parser, nToken - 1));
			}
			Console.WriteLine();
			Console.Write("|");
			for(int nToken = 0; nToken < nTokens + 1; nToken++)
			{
				Console.Write("---+");
			}
			Console.WriteLine();
			for(int nState = 0; nState < nStates; nState++)
			{
				Console.Write("|{0, 3}|", nState);
				for(int nToken = 0; nToken < nTokens; nToken++)
				{
					Action action = parser.ParseTable.Actions[nState, nToken];
					string sAction = "";
					object oParm = "";
					if(action.ActionType == ActionType.Reduce)
					{
						sAction = "R";
						oParm = action.ActionParameter;
					}
					else if(action.ActionType == ActionType.Shift)
					{
						sAction = "S";
						oParm = action.ActionParameter;
					}
					Console.Write("{0,1}{1,2}|", sAction, oParm);
				}
				Console.WriteLine();
				Console.Write("+");
				for(int nToken = 0; nToken < nTokens + 1; nToken++)
				{
					Console.Write("---+");
				}
				Console.WriteLine();
			}
		}
	}
}

