package euler.scala.exercise21

import euler.scala.exercise12.DivisorCalculator


class AmicableFinder {

  def findAmicable(sourceTerm: Int) : Option[Int] = {
    val sumOfDividends = new DivisorCalculator().listOfDivisorsWithOutTerm(sourceTerm).sum
    if (new DivisorCalculator().listOfDivisorsWithOutTerm(sumOfDividends).sum == sourceTerm) Some(sumOfDividends)
    else None
  }

}