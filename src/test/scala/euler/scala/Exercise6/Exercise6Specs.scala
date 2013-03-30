package euler.scala.exercise6

import org.specs2.mutable.Specification


class Exercise6Specs extends Specification {

  val squareCalculator = new SquareCalculator
  "difference between the square of the sum and the sum of the squares" should {
    "be 2640 for the first 10 terms" in {
      squareCalculator.squareOfSums(10) - squareCalculator.sumOfSquares(10) must_== 2640
    }

    "be 25164150 for the first 100 terms" in {
          squareCalculator.squareOfSums(100) - squareCalculator.sumOfSquares(100) must_== 25164150
        }
  }
}