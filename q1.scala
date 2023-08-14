package Tutorial8
import scala.io.StdIn

object q1 {

    val calculateInterest: Double => Double = depositAmount => {
      if (depositAmount <= 20000) {
        0.02 * depositAmount
      }
      else if (depositAmount <= 200000) {
        0.04 * depositAmount
      }
      else if (depositAmount <= 2000000) {
        0.035 * depositAmount
      }
      else {
        0.065 * depositAmount
      }

    }

  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount ")
    val deposit = StdIn.readDouble()
    val interest = calculateInterest(deposit)
    println("The total interest for the deposit amount : " + interest)

  }

}
