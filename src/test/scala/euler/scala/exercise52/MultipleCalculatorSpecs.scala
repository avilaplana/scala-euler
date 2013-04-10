package euler.scala.exercise52

import org.specs2.mutable.Specification

class MultipleCalculatorSpecs extends Specification {

  val multipleCalcularor  = new MultipleCalculator

  "Positive integer, 125874, such that 2x" should {
    "be 251748" in {
      val listMultiple  = multipleCalcularor.calculateList(125874, 2)
      listMultiple.size must_== 1
      listMultiple must_== List(251748)
    }
  }

  "Positive integer, 125874, such that 2x" should {
      "be 251748" in {
        val listMultiple  = multipleCalcularor.calculateList(125874, 3)
        listMultiple.size must_== 2
        listMultiple must_== List(251748, 377622)
      }
    }


}