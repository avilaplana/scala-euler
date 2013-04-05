package euler.scala.exercise42

import org.specs2.mutable.Specification
import euler.scala.exercise12.TriangleNumberCalculator
import euler.scala.exercise22.StringScorer
import collection.mutable


class Exercise42Specs extends Specification {

  private val path = "/Users/alvarovilaplanagarcia/java/personal/scala-euler/src/test/resources/euler/scala/exercise42/words.txt"
  val triangleNumberCalculator = new TriangleNumberCalculator
  val stringScorer = new StringScorer

  "the number of triangles for this 16k text file containing two-thousand common English words" should {
    "be 162" in {

      var triangles = new mutable.LinkedHashSet[Int]
      val lines = scala.io.Source.fromFile(path).getLines.toList.flatMap(_.split(","))
      val scores = lines.map(stringScorer.calculateScore(_))
      val filterScores = scores.filter {
        score =>
          if (triangles.contains(score)) true
          else if (triangleNumberCalculator.isTriangle(score)) {
            triangles.add(score)
            true
          } else false
      }
      filterScores.size must_== 162
    }
  }

}