import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
public class Test {
    public static void main(String[] args) throws IOException {
	ANTLRInputStream input = new ANTLRFileStream("test.in");
	calculatorLexer lexer = new calculatorLexer(input);
	CommonTokenStream tokes = new CommonTokenStream(lexer);
	calculatorParser parser = new calculatorParser(tokes);
	ParseTree tree = parser.expression();
	String str = tree.toStringTree(parser);
	System.out.println(str);
    }
}
