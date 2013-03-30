package euler.scala.exercise6


class SquareCalculator {

  def sumOfSquares(terms: Int): Long = {
    val listSquares = for (term <- 1 to terms) yield term * term
    listSquares.sum
  }

  def squareOfSums(terms: Int): Long = {
    val listTerms = for (term <- 1 to terms) yield term
    val sumOfTerms = listTerms.sum
    sumOfTerms * sumOfTerms
  }

}