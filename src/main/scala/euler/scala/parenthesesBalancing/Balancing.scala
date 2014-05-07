package euler.scala.parenthesesBalancing

//Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a
// List[Char] not a String. For example, the function should return true for the following strings:
//
//(if (zero? x) max (/ 1 x))
//I told him (that it’s not (yet) done). (But he wasn’t listening)
//The function should return false for the following strings:
//
//:-)
//())(
//The last example shows that it’s not enough to verify that a string contains the same number of opening and closing parentheses.

object Balancing {

  def balance(chars: List[Char]): Boolean = {
    val charsFiltered = chars.filter(char => char != '(' || char != ')')
    
    return true
  }
}
