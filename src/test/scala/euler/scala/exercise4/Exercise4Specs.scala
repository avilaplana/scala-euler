package euler.scala.exercise4

import org.specs2.mutable.Specification


class Exercise4Specs extends Specification {

  val calculator = new HighestPalindromeCalculator
  "calculator " should {
    "calculate the highest palindrome for products of number with 3 digits" in {
      calculator.calculateHighestPalindrome() must_== 906609

    }
  }
}