package euler.scala.exercise4


class PalindromeDetector {

  def detect(candidate : String ) : Boolean = {
      val first = candidate.substring(0, candidate.length/2)
      val second = candidate.substring(candidate.length/2, candidate.length)

      first.equals(second.reverse)
  }
}