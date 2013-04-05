package euler.scala.exercise12

import collection.mutable


class DivisorCalculator {

  def listOfDivisors(term: Long) = {
    calculateDividends(term).toList
  }

  def listOfDivisorsWithOutTerm(term: Long) = {
    calculateDividends(term).drop(1).toList
  }

  private def calculateDividends(term: Long) = {

    var index = term
    var listOfDivisors = new mutable.LinkedList[Long]()
    while (index != 0) {
      if (term % index == 0) listOfDivisors = listOfDivisors :+ index
      if (index % 10000000 == 0) println(index)
      index = index - 1
    }
    listOfDivisors
  }
}