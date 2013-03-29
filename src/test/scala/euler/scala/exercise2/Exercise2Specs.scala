package euler.scala.exercise2

import org.specs2.mutable._


class Exercise2Specs extends Specification {

  val fibonacciCalculator = new FibonacciCalculator

  "this exercise" should {
    "calculate the sum of the even elements of the Fibonacci's 4000 millions terms" in {
      val sequence = fibonacciCalculator.calculateSequenceImperativelyWithLimit(4000000).filter(_ % 2 == 0)
      sequence.sum must_== 4613732
    }
  }
}