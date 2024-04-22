import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree.ParseTreeWalker

@main
def main(): Unit =
  println("Hello world!")
  val input = "3 + 4 * 5 - 2"

  val lexer = InfixMathLexer(CharStreams.fromString(input))
  val tokens = CommonTokenStream(lexer)
  val parser = InfixMathParser(tokens)

  val listener = InfixMathListenerImpl()
  val tree = parser.mainExpr()

  val walker = ParseTreeWalker()

  walker.walk(listener, tree)

  println(listener.result)
