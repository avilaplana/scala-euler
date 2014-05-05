package euler.scala.pascal

import org.specs2.mutable.Specification


class PascalSpecs extends Specification {

  "pascal number in the position 0,0 be 1" should {
    "be 1" in {
      Pascal.calculate(0, 0) must_== 1
    }
  }

  "pascal number in the position 0,1 be 1" should {
    "be 1" in {
      Pascal.calculate(0, 1) must_== 1
    }
  }

  "pascal number in the position 1,1 be 1" should {
    "be 1" in {
      Pascal.calculate(1, 1) must_== 1
    }
  }

  "pascal number in the position 0,2 be 1" should {
    "be 1" in {
      Pascal.calculate(0, 2) must_== 1
    }
  }

  "pascal number in the position 1,2 be 2" should {
    "be 1" in {
      Pascal.calculate(1, 2) must_== 2
    }
  }

  "pascal number in the position 2,2 be 1" should {
    "be 1" in {
      Pascal.calculate(2, 2) must_== 1
    }
  }

  "pascal number in the position 0,3 be 1" should {
    "be 1" in {
      Pascal.calculate(0, 3) must_== 1
    }
  }

  "pascal number in the position 1,3 be 3" should {
    "be 1" in {
      Pascal.calculate(1, 3) must_== 3
    }
  }

  "pascal number in the position 2,3 be 3" should {
    "be 1" in {
      Pascal.calculate(2, 3) must_== 3
    }
  }

  "pascal number in the position 3,3 be 1" should {
    "be 1" in {
      Pascal.calculate(3, 3) must_== 1
    }
  }

  "pascal number in the position 0,4 be 1" should {
      "be 1" in {
        Pascal.calculate(0, 4) must_== 1
      }
    }

  "pascal number in the position 1,4 be 4" should {
      "be 1" in {
        Pascal.calculate(1, 4) must_== 4
      }
    }

  "pascal number in the position 2,4 be 6" should {
      "be 1" in {
        Pascal.calculate(2, 4) must_== 6
      }
    }
  "pascal number in the position 3,4 be 4" should {
      "be 1" in {
        Pascal.calculate(3, 4) must_== 4
      }
    }

  "pascal number in the position 4,4 be 1" should {
        "be 1" in {
          Pascal.calculate(4, 4) must_== 1
        }
      }

}