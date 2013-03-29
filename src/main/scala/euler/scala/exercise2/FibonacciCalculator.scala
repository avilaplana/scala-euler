package euler.scala.exercise2


class FibonacciCalculator {

  def calculateSequenceImperatively(numerOfTerms: Int): Seq[Int] = {
    var listOfTerms = scala.collection.mutable.LinkedList[Int]()

    for (term <- 1 to numerOfTerms) {
      if (term == 1) listOfTerms = listOfTerms :+ 1
      else if (term == 2) listOfTerms = listOfTerms :+ 2
      else listOfTerms = listOfTerms :+ (listOfTerms((term - 1) - 2) + listOfTerms((term - 1) - 1))
    }
    listOfTerms
  }

  def calculateSequenceImperativelyWithLimit(limit: Int): Seq[Int] = {
    var listOfTerms = scala.collection.mutable.LinkedList[Int]()

    var current = 0
    var term = 0;
    while (current <= limit) {
      if (term == 0) listOfTerms = listOfTerms :+ 1
      else if (term == 1) listOfTerms = listOfTerms :+ 2
      else listOfTerms = listOfTerms :+ (listOfTerms(term - 2) + listOfTerms(term - 1))

      current = listOfTerms(term)
      term = term + 1
    }

    listOfTerms
  }

}