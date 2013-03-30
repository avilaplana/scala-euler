package euler.scala.exercise6

import org.specs2.mutable.Specification


class SquareCalculatorSpecs extends Specification {

  val squareCalculator = new SquareCalculator

  "calculator" should {
    "return 385 for the sum of squares of the first 10 terms" in {
      squareCalculator.sumOfSquares(10) must_== 385
    }

    "return 3025 for the square of the sum of the first 10 terms" in {
      squareCalculator.squareOfSums(10) must_== 3025
    }
  }
}