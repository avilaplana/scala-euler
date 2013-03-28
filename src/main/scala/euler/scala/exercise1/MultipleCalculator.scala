package euler.scala.exercise1


class MultipleCalculator {

  def calculate(max : Int, numbers : Int*) = {
    val multiples = for (i <- 1 until max if numbers.exists(i % _ == 0)) yield i
    multiples
  }

}