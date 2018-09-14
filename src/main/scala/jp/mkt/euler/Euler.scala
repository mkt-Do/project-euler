package jp.mkt.euler

import jp.mkt.euler.project._

object Euler {
  def main(args: Array[String]): Unit = {
    // problem 1
    val problem1List = Problem1.filterMultipleThreeOrFive((1 until 1000).toList)
    println(problem1List.sum)
  }
}
