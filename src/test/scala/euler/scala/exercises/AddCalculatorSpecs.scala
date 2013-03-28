package euler.scala.exercises

import org.specs2.mutable._
import euler.scala.exercise.AddCalculator


class AddCalculatorSpecs extends Specification {

  val calculator = new AddCalculator
  val multipleCalculator = new MultipleCalculator

  "call add" should {

    "add all the multiples of 3 5 6 9 between 1 and 10" in {
      calculator.add(multipleCalculator.calculate(10, 3, 5, 6, 9): _*) must_== 23
    }

    "add all the multiples of 3 5 between 1 and 1000" in {
      calculator.add(multipleCalculator.calculate(1000, 3, 5): _*) must_== 233168
    }
  }
}