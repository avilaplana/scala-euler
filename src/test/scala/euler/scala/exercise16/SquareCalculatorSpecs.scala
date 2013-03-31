package euler.scala.exercise16

import org.specs2.mutable.Specification


class SquareCalculatorSpecs extends Specification {

  val calculator = new SquareCalculator
  "2 square to 15" should {
    "be 32768" in {
      calculator.square(2, 15) must_== 32768
    }
  }

}