package euler.scala.exercise4


class PalindromeDetector {

  def detect(candidate: String): Boolean = {

    val firstPart = candidate.substring(0, candidate.length / 2)
    if (candidate.length % 2 == 0) checkEquality(firstPart, candidate.substring(candidate.length / 2, candidate.length))
    else checkEquality(firstPart, candidate.substring(candidate.length / 2 + 1, candidate.length))
  }

  private def checkEquality(first: String, second: => String): Boolean = {
    first.equals(second.reverse)
  }
}