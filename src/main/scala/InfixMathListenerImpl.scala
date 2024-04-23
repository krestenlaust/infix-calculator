class InfixMathListenerImpl extends InfixMathBaseListener:
  var result: Int = 0

  override def exitExpr(ctx: InfixMathParser.ExprContext): Unit =
    result = evalExpr(ctx)

  private def evalExpr(ctx: InfixMathParser.ExprContext): Int =
    if (ctx.getChildCount == 1) // Only contains 1 term = Number
      ctx.getChild(0).getText.toInt
    else if (ctx.OBRACE() != null) // Has opening bracket = Parenthesis expression
      evalExpr(ctx.expr(0))
    else
      val operator = ctx.getChild(1).getText
      val leftOperand = evalExpr(ctx.expr(0))
      val rightOperand = evalExpr(ctx.expr(1))

      operator match {
        case "+" => leftOperand + rightOperand
        case "-" => leftOperand - rightOperand
        case "*" => leftOperand * rightOperand
        case "/" => leftOperand / rightOperand
      }
