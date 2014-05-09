package euler.scala.change


class CountingChange {

  def countChange(money: Int, coins: List[Int], partialSolution: List[Int] = List()): Int = {
    coins.map {
      coin => (money - coin) match {
        case 0 => println(s"solution ${partialSolution :+ coin}")
        case someNumber => if (someNumber > 0) countChange(someNumber, coins, partialSolution :+ coin)
        case someNumber => if (someNumber < 0) return 0
      }
    }
    return 0
  }

}