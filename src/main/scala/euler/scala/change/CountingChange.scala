package euler.scala.change

import collection.mutable.{LinkedHashSet, Set}

class CountingChange {

  val solutionsCombinations: LinkedHashSet[List[Int]] = new LinkedHashSet()

  def countChange(money: Int, coins: List[Int], partialSolution: List[Int] = List()): Int = {
    val result = coins.map {
      coin => (money - coin) match {
        case 0 => {
          println(s"solution ${partialSolution :+ coin}")
          isSolutionProcessed(solutionsCombinations, partialSolution :+ coin) match {
            case true => 0
            case false => solutionsCombinations.add(partialSolution :+ coin); 1
          }
        }
        case someNumber if (someNumber > 0) => countChange(someNumber, coins, partialSolution :+ coin)
        case someNumber if (someNumber < 0) => 0
      }
    }
    result.sum
  }

  private def isSolutionProcessed(solutions: Set[List[Int]], current: List[Int]) = {
    solutions.exists(_.sorted == current.sorted)
  }

}