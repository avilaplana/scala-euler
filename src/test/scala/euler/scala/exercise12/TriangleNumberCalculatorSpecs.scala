package euler.scala.exercise12

import org.specs2.mutable.Specification


class TriangleNumberCalculatorSpecs extends Specification {

  val triangleNumberCalculator = new TriangleNumberCalculator


  "calculate the triangle number for 7" should {
    "be 29" in {
      triangleNumberCalculator.calculate(7) must_== 28
    }
  }

}