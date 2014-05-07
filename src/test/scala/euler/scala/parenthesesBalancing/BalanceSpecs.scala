package euler.scala.parenthesesBalancing

import org.specs2.mutable.Specification


class BalanceSpecs extends Specification {

  "balance in (if (zero? x) max (/ 1 x))" should {
    "be true" in {
      Balancing.balance("(if (zero? x) max (/ 1 x))".toList) must_== (true)
    }
  }

  "balance in I told him (that it’s not (yet) done). (But he wasn’t listening)" should {
    "be true" in {
      Balancing.balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList) must_== (true)
    }
  }

  "balance in :-)" should {
    "be true" in {
      Balancing.balance(":-)".toList) must_== (false)
    }
  }

  "balance in ())(" should {
      "be true" in {
        Balancing.balance("())(".toList) must_== (false)
      }
    }

}