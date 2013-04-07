package euler.scala.exercise12

class TriangleNumberCalculator {

  def calculate(term: Int): Int = {
    term * (term + 1)/2
  }

  def isTriangle(number: Int): Boolean = {

    var found = false
    var index = 1
    var partialResult = 0
    while (partialResult < number && !found) {
      partialResult = calculate(index)
      if (partialResult == number) found = true
      else index = index + 1
    }
    return found
  }
}
