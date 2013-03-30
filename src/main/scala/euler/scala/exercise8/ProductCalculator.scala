package euler.scala.exercise8

class ProductCalculator {

  def calculateAllProducts(digit: String, consecutive: Int) = {

    require(digit.length > consecutive)

    val listOfProducts = for (index <- 0 to digit.length - consecutive)
    yield digit.substring(index, index + consecutive).map(_.asDigit).reduce[Int](_ * _)
    listOfProducts
  }

}