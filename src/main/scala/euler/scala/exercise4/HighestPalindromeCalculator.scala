package euler.scala.exercise4


class HighestPalindromeCalculator {

  val palindromeDetector =  new PalindromeDetector
  def calculateHighestPalindrome() = {

    var highest = 0

    for (firstElement <- 100 to 999)
      for (secondElement <- 100 to 999 if (secondElement >= firstElement)) {
        val mult = firstElement * secondElement
        if (mult > highest && palindromeDetector.detect(mult.toString)) highest = mult
      }

    highest
  }

}