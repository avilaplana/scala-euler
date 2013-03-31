package euler.scala.exercise12


class DivisorCalculator {

  def listOfDivisors(term: Int) = {
    val divisors = for (divisor <- 1 to term if term % divisor == 0) yield divisor
    divisors
  }
}