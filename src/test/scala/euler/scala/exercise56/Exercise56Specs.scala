package euler.scala.exercise56

import org.specs2.mutable.Specification
import euler.scala.exercise16.SquareCalculator


class Exercise56Specs extends Specification{

  val square = new SquareCalculator

  "a power b, where a, b  100, the maximum digital sum" should {
    "be 972" in {
      val sums = for (term1 <- 1 to 100; term2 <- 1 to 100) yield square.square(term1, term2).toString.toCharArray.map(_.asDigit).sum
      sums.sortWith((a, b) => a > b).head must_== 972
    }
  }

}