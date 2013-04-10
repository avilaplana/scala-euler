package euler.scala.exercise52

import org.specs2.mutable.Specification


class Exercise52Specs extends Specification {

  val multipleCalcularor = new MultipleCalculator

  "Smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits" should {
    "be 142857" in {

            var found = false
            var smallest = 1
            while (!found && smallest <= Int.MaxValue) {
              val listOfProducts = multipleCalcularor.calculateList(smallest, 6)
              if (listOfProducts.forall(product => containsSameDigits(smallest.toString.sortWith((a,b) => a > b), product.toString.sortWith((a,b) => a > b)))) found = true
              else smallest = smallest + 1
            }
            smallest must_== 142857
    }
  }

  private def containsSameDigits(term: String, term2: String): Boolean = {
    var equals = false
    if (term.size == term2.size) {
      val listOfOccurrences = for (index <- 0 until term.size if (term.charAt(index).equals(term2.charAt(index)))) yield true
      equals = term.length == listOfOccurrences.size
    }

    equals
  }
}