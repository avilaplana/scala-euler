package euler.scala.exercise8

import org.specs2.mutable.Specification

class Exercise8Specs extends Specification {

  val productCalculator = new ProductCalculator

  val digit = "73167176531330624919225119674426574742355349194934" +
    "96983520312774506326239578318016984801869478851843858615607891" +
    "1294949545950173795833195285320880551112540698747158523863050715" +
    "69329096329522744304355766896648950445244523161731856403098711121" +
    "7223831136222989342338030813533627661428280644448664523874930358" +
    "907296290491560440772390713810515859307960866701724271218839987979" +
    "0879227492190169972088809377665727333001053367881220235421809751254" +
    "540594752243525849077116705560136048395864467063244157221553975369" +
    "781797784617406495514929086256932197846862248283972241375657056057490" +
    "26140797296865241453510047482166370484403199890008895243450658541227588" +
    "6668811642717147992444292823086346567481391912316282458617866458359124" +
    "56652947654568284891288314260769004224219022671055626321111109370544217" +
    "506941658960408071984038509624554443629812309878799272442849091888458015616" +
    "60979191338754992005240636899125607176060588611646710940507754100225698315" +
    "520005593572972571636269561882670428252483600823257530420752963450"


  "greatest product of five consecutive digits in the 1000-digit number" should {
    "be 40824" in {
     val list = productCalculator.calculateAllProducts(digit, 5).sortWith((a, b) => a > b)
      list.head must_== 40824
    }
  }

}