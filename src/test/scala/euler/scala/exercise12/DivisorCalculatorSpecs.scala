package euler.scala.exercise12

import org.specs2.mutable.Specification


class DivisorCalculatorSpecs extends Specification {

  val divisorCalculator = new DivisorCalculator

  "The number of divisors for 28" should {
    "be 1,2,4,7,14,28" in {
      divisorCalculator.listOfDivisors(28) must_== List(28, 14, 7, 4, 2, 1)
    }

    "be 1,2,4,7,14" in {
          divisorCalculator.listOfDivisorsWithOutTerm(28) must_== List(14, 7, 4, 2, 1)
        }
  }
}