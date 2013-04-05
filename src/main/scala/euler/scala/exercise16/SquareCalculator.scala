package euler.scala.exercise16


//todo refactor with exercise 6
class SquareCalculator {


  def square(term: Int, square : Int) : BigInt = {

    var product = BigInt(1)
    for (mult <- 1 to square) product = product * term
    product
  }

}