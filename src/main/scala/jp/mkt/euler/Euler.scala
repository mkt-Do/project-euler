package jp.mkt.euler

import jp.mkt.euler.projects._
import scala.math._

object Euler {
  def main(args: Array[String]): Unit = {
    // problem 1
    val problem1List = P001.filterMultipleThreeOrFive((1 until 1000).toList)
    println(s"Problem 1 answer is ${problem1List.sum}")

    // problem 2
    val problem2List = P002.createFibonacciList(4000000, 1, 2).toList
    println(s"Problem 2 answer is ${P002.sumEvenItem(problem2List)}")

    // problem 3
    val problem3PrimeFactors = P003.factorize(600851475143l)
    println(s"Problem 3 answer is ${problem3PrimeFactors.max}")

    // problem 4
    val problem4PalindromeList = (for {
      a <- 100 until 1000
      b <- 100 until 1000
    } yield (a * b)).filter(P004.palindrome)
    println(s"Problem 4 answer is ${problem4PalindromeList.max}")

    // problem 5
    val problem5Result = P005.allLcm((1 to 20).toList)
    println(s"Problem 5 answer is ${problem5Result}")
  }
}
