package euler.scala.exercise22

import org.specs2.mutable.Specification


class StringScorerSpecs extends Specification {
  val scorer =  new StringScorer

  "the string COLIN" should {
    "have a score of 53" in {
      scorer.calculateScore("COLIN") must_== 53
    }
  }

}