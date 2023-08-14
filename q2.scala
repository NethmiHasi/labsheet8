package Tutorial8
import scala.io.StdIn

object q2 {

  val patternMatching: Int => String = number => {
     if (number<=0){
       "Negative/Zero is input"
     }
    else if(number%2 ==0) {
       "Even number is given"
     }
    else{
       "Odd number is given"
     }
  }

  def main(args: Array[String]): Unit = {
    println("Enter any number : ")
    val num = StdIn.readInt()
    println(patternMatching(num))
  }


}
