package euler.scala.exercise16

import org.specs2.mutable.Specification


class Exercise16Specs extends Specification{

  val squareCalculator = new SquareCalculator
  "sum of the digits of the number 2 square 1000" should {
    "be 1366" in {
      squareCalculator.square(2, 1000).toString().toArray.map(_.asDigit).sum must_== 1366
    }
  }

}