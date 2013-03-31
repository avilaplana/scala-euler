package euler.scala.exercise21

import org.specs2.mutable.Specification


class AmicableFinderSpecs extends Specification {

  val amicableFinder = new AmicableFinder
  "the amicable number of 220" should {
    "be 284" in {
      amicableFinder.findAmicable(220).get must_== 284
    }
  }


  "the amicable number of 221" should {
      "not be anything" in {
        amicableFinder.findAmicable(221).isDefined must beFalse
      }
    }

}