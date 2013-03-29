package euler.scala.exercise1

import org.specs2.mutable.Specification


class MultipleCalculatorSpecs extends Specification{

  val calculator = new MultipleCalculator
  "call calculate " should {

  "should return the multiples of 3 and 5 between 1 and 10" in {
    val listOfMultiples = calculator.calculate(10, 3, 5)
    listOfMultiples must_== List(3,5,6,9)
  }

  }

}