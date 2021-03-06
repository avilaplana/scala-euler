package euler.scala.exercise4

import org.specs2.mutable.Specification


class PalindromeDetectorSpecs extends Specification {

  val detector = new PalindromeDetector
  "call detect" should {
    "returns true for 90122109" in {
      detector.detect("90122109") must beTrue
    }

    "returns false for 9008" in {
      detector.detect("9008") must beFalse
    }


    "returns true for 901262109" in {
      detector.detect("901262109") must beTrue
    }

    "returns false for 90108" in {
      detector.detect("90108") must beFalse
    }
  }

}