package euler.scala.exercise21

import collection.mutable
import org.specs2.mutable.Specification


class Exercise21Specs extends Specification {

  val amicableFinder = new AmicableFinder


  "sum of all the amicable numbers under 10000" should {
    "be 31626" in {

      val setOfAmicables : mutable.Set[Long] = new mutable.LinkedHashSet()
      for (term <- 1 until 10000 if (!setOfAmicables.contains(term))) {
        amicableFinder.findAmicable(term) match {
          case Some(amicable) if (amicable != term) => setOfAmicables.add(term); setOfAmicables.add(amicable)
          case _ =>
        }
      }
      setOfAmicables.sum must_== 31626
    }
  }
}