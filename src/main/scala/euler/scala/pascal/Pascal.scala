package euler.scala.pascal

//Exercise 1: Pascal’s Triangle
//The following pattern of numbers is called Pascal’s triangle.
//
//    1
//   1 1
//  1 2 1   (1,2) = (0,1) , (1,1)
// 1 3 3 1  (2,3) = (1,2) , (2,2)
//1 4 6 4 1
//   ...
//The numbers at the edge of the triangle are all 1, and each number inside the triangle is the sum of the two numbers above it.
//Write a function that computes the elements of Pascal’s triangle by means of a recursive process.
//
//Do this exercise by implementing the pascal function in Main.scala, which takes a column c and a row r, counting from 0 and returns the number at that spot in the triangle. For example, pascal(0,2)=1, pascal(1,2)=2 and pascal(1,3)=3.
//
//def pascal(c: Int, r: Int): Int

object Pascal {

  def calculate(column: Int, row: Int): Int = {

      def calculatePositionsFotAncestors(column: Int, row: Int): List[(Int, Int)] = {
        List((column - 1, row - 1), (column, row - 1))
      }

      (column, row) match {
        case (x, y) if (x == y) => 1
        case (0, x) => 1
        case (x, y) if x > y => throw new IllegalArgumentException(s"The column $x does not exist in the row $y")
        case (x, y) => {
          var r: List[Int] = calculatePositionsFotAncestors(x, y).map {
            case (c, r) => calculate(c, r)
          }
          r.sum
        }
        case _ => throw new Exception("Not calculated")
      }
    }

}