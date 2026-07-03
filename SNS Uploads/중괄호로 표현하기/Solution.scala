sealed trait Expr
case class NatE(value: BigInt) extends Expr
case class TupleE(first: Expr, right: Expr) extends Expr
case class SetE(elts: Set[Expr]) extends Expr

object ExprPrinter {
  def toBrace(expr: Expr): String =
    expr match {
      case NatE(n) =>
        if (n < 0)
          throw new IllegalArgumentException("Negative numbers are not allowed")
        else natToBrace(n)

      case TupleE(a, b) =>
        toBrace(
          SetE(
            Set(
              SetE(Set(a)),
              SetE(Set(a, b))
            )
          )
        )

      case SetE(elts) =>
        elts.map(toBrace).mkString("{", ",", "}")
    }

  private def natToBrace(n: BigInt): String = {
    def build(k: BigInt): Expr =
      if (k == 0)
        SetE(Set())
      else
        SetE((0 until k.toInt).map(i => build(i)).toSet)
    toBrace(build(n))
  }
}

object BraceChecker {
  def countBrace(s: String): Unit = {
    var depth = 0
    var pairs = 0
    var error: Option[String] = None

    for ((ch, idx) <- s.zipWithIndex if error.isEmpty) {
      ch match {
        case '{' =>
          depth += 1
          pairs += 1
        case '}' =>
          depth -= 1
          if (depth < 0) error = Some(s"Invalid: position $idx")
        case ',' | ' ' | '\n' | '\r' | '\t' => ()
        case _ => error = Some(s"Invalid character: $ch")
      }
    }

    error match {
      case Some(msg) =>
        println(msg)
      case None =>
        if (depth == 0)
          println(s"Valid, $pairs pairs of braces")
        else
          println("Invalid: missing }")
    }
  }
}


@main def run(): Unit = {
  // cyclic group of order 2: 90 pairs of braces
  val cyclic2 =
    TupleE(SetE(Set(NatE(0), NatE(1))), // underlying set {0,1}
      SetE(Set( // group law
          TupleE(TupleE(NatE(0), NatE(0)), NatE(0)), // 0 + 0 = 0
          TupleE(TupleE(NatE(0), NatE(1)), NatE(1)), // 0 + 1 = 1
          TupleE(TupleE(NatE(1), NatE(0)), NatE(1)), // 1 + 0 = 1
          TupleE(TupleE(NatE(1), NatE(1)), NatE(0)) // 1 + 1 = 0
        )
      )
    )
  
  // cyclic group of order 3: 248 pairs of braces
  val cyclic3 =
    TupleE(SetE(Set(NatE(0), NatE(1), NatE(2))), // underlying set {0,1,2}
      SetE(Set( // group law
          TupleE(TupleE(NatE(0), NatE(0)), NatE(0)), // 0 + 0 = 0
          TupleE(TupleE(NatE(0), NatE(1)), NatE(1)), // 0 + 1 = 1
          TupleE(TupleE(NatE(0), NatE(2)), NatE(2)), // 0 + 2 = 2
          TupleE(TupleE(NatE(1), NatE(0)), NatE(1)), // 1 + 0 = 1
          TupleE(TupleE(NatE(1), NatE(1)), NatE(2)), // 1 + 1 = 2
          TupleE(TupleE(NatE(1), NatE(2)), NatE(0)), // 1 + 2 = 0
          TupleE(TupleE(NatE(2), NatE(0)), NatE(2)), // 2 + 0 = 2
          TupleE(TupleE(NatE(2), NatE(1)), NatE(0)), // 2 + 1 = 0
          TupleE(TupleE(NatE(2), NatE(2)), NatE(1)) // 2 + 2 = 1
        )
      )
    )

  println(ExprPrinter.toBrace(cyclic2))
  BraceChecker.countBrace(ExprPrinter.toBrace(cyclic2))

  println(ExprPrinter.toBrace(cyclic3))
  BraceChecker.countBrace(ExprPrinter.toBrace(cyclic3))
}