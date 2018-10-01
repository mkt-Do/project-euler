package jp.mkt.euler

import jp.mkt.euler.projects._
import scala.math._

object Euler {
  def main(args: Array[String]): Unit = {
    // problem 1
    val problem1List = Problem1.filterMultipleThreeOrFive((1 until 1000).toList)
    println(s"Problem 1 answer is ${problem1List.sum}")

    // problem 2
    val problem2List = Problem2.createFibonacciList(4000000, 1, 2).toList
    println(s"Problem 2 answer is ${Problem2.sumEvenItem(problem2List)}")

    // problem 3
    val problem3PrimeFactors = Problem3.factorize(600851475143l)
    println(s"Problem 3 answer is ${problem3PrimeFactors.max}")

    // problem 4
    val problem4PalindromeList = (for {
      a <- 100 until 1000
      b <- 100 until 1000
    } yield (a * b)).filter(Problem4.palindrome)
    println(s"Problem 4 answer is ${problem4PalindromeList.max}")
  }
}
