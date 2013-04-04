package euler.scala.exercise36

import org.specs2.mutable.Specification
import euler.scala.exercise4.PalindromeDetector
import collection.mutable.BitSet
import runtime.RichInt


class Exercise36 extends Specification {

  val palindromeDetector = new PalindromeDetector


  "sum of all numbers, less than one million, which are palindromic in base 10 and base 2" should {
    "be 872187" in {

      val palindromicBothSides = for (term <- 1 until 1000000
                                      if (palindromeDetector.detect(term.toString) &&
                                        palindromeDetector.detect(new RichInt(term).toBinaryString))) yield term

      palindromicBothSides.sum must_== 872187
    }
  }


}