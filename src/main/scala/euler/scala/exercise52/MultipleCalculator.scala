package euler.scala.exercise52


class MultipleCalculator {

  def calculateList(term: Int, limit: Int): List[Int] = {
    val listOfProducts = for (multiple <- 2 to limit) yield term * multiple
    listOfProducts.toList
  }


}