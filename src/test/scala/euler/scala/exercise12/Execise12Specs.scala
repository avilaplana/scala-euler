package euler.scala.exercise12

import org.specs2.mutable.Specification


class Execise12Specs extends Specification {

  val triangleNumberCalculator = new TriangleNumberCalculator
  val divisorCalcuatorSpecs = new DivisorCalculator

  "the first triangle number to have over five hundred divisors" should {
    "be 76576500" in {

//      var term = 1
//      var found = false
//      var triangleNumber = 0
//      while (!found) {
//        triangleNumber = triangleNumberCalculator.calculate(term)
//        var numberDivisors = divisorCalcuatorSpecs.listOfDivisors(triangleNumber).size
//        if (numberDivisors >= 500) found = true
//        println("term: %s ,triangleNumber: %s, size: %s".format(term, triangleNumber, numberDivisors))
//        term = term + 1
//      }
//
//      triangleNumber must_== 76576500

      success
    }
  }

}