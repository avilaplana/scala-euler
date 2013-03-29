package euler.scala.exercise1

import org.specs2.mutable._


class Exercise1Specs extends Specification {

  val multipleCalculator = new MultipleCalculator

  "call add" should {

    "add all the multiples of 3 5 6 9 between 1 and 10" in {
      multipleCalculator.calculate(10, 3, 5, 6, 9).sum must_== 23
    }

    "add all the multiples of 3 5 between 1 and 1000" in {
      multipleCalculator.calculate(1000, 3, 5).sum must_== 233168
    }
  }
}