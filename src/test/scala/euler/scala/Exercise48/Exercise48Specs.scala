package euler.scala.Exercise48

import org.specs2.mutable.Specification
import euler.scala.exercise16._
import com.sun.xml.internal.stream.buffer.MutableXMLStreamBuffer


class Exercise48Specs extends Specification {

  val squareCalculator = new SquareCalculator

  "last ten digits of the series, 1 power 1 + 2 power 2 + 3 power 3 + ... + 1000 power 1000" should {
    "be 9110846700" in {

      val elements = for (term <- 1 to 1000) yield squareCalculator.square(term, term)
      val series = elements.sum.toString()
      (series.size >= 10) must beTrue
      series.substring(series.length - 10, series.length) must_== "9110846700"


    }
  }

}