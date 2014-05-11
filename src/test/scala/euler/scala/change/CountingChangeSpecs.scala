package euler.scala.change

import org.specs2.mutable.Specification
import euler.scala.parenthesesBalancing.Balancing


class CountingChangeSpecs extends Specification {

  "number of change for 4 with coins with denomination 1 and 2" should {
    "be 3" in {
      new CountingChange().countChange(4,List(1,2)) must_==(3)
    }
  }

  "number of change for 5 with coins with denomination 1 and 2" should {
      "be 3" in {
        new CountingChange().countChange(5,List(1,2)) must_==(3)
      }
    }

}