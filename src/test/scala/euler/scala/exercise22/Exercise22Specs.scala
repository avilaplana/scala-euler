package euler.scala.exercise22

import org.specs2.mutable.Specification
import io.Source


class Exercise22Specs extends Specification{

  private val path =  "/Users/alvarovilaplanagarcia/java/personal/scala-euler/src/test/resources/euler/scala/exercise22/names.txt"
  val scorer = new StringScorer

  "total of all the name scores" should {
    "should be 871198282" in {
      val lines = scala.io.Source.fromFile(path).getLines.toList.flatMap(_.split(",")).sortWith((a, b) => a < b)
      lines.indexOf("\"COLIN\"") + 1 must_== 938
      lines.map(element => scorer.calculateScore(element)*(lines.indexOf(element) + 1)).sum must_== 871198282
    }
  }

}