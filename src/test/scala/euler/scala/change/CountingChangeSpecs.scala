package euler.scala.change

import org.specs2.mutable.Specification
import euler.scala.parenthesesBalancing.Balancing


class CountingChangeSpecs extends Specification {

  "number of change for 4" should {
    "be true" in {
      new CountingChange().countChange(4,List(1,2)) must_==(0)
    }
  }


}