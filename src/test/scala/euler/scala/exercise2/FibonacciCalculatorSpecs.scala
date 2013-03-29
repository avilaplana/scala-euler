package euler.scala.exercise2

import org.specs2.mutable.Specification


class FibonacciCalculatorSpecs extends Specification {

  val calculator = new FibonacciCalculator

  "calcuate the Fibonacci sequence " should {
    "return the list of elements for the term number 10" in {
      calculator.calculateSequenceImperatively(10) must_== List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
    }
  }

}