package euler.scala.exercise21

import euler.scala.exercise12.DivisorCalculator


class AmicableFinder {

  def findAmicable(sourceTerm: Int) : Option[Long] = {
    val sumOfDividends = new DivisorCalculator().listOfDivisorsWithOutTerm(sourceTerm).sum
    if (new DivisorCalculator().listOfDivisorsWithOutTerm(sumOfDividends.toLong).sum == sourceTerm) Some(sumOfDividends)
    else None
  }

}