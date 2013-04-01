package euler.scala.exercise29

import org.specs2.mutable.Specification
import euler.scala.exercise16.SquareCalculator
import collection.mutable


class Exercise29Specs extends Specification {

  val squareCalculator = new SquareCalculator
  "istinct terms are in the sequence generated by a power b for 2 <= a <= 100 and 2 <= b <= 100?" should {
    "be 9183" in {

      val squares = new mutable.LinkedHashSet[BigInt]
      for (term <- 2 to 100; power <- 2 to 100) {
        val square = squareCalculator.square(term, power)
        squares.add(square)
      }

      squares.size must_== 9183
    }
  }

}