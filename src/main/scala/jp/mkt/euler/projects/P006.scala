package jp.mkt.euler.projects

import scala.math.pow

object P006 {
  implicit def convertIntToDouble(x: Int): Double = x.toDouble
  implicit def convertDoubleToInt(x: Double): Int = x.toInt

  def sumPow(nums: Seq[Int]): Int = nums.map(pow(_, 2)).sum
  def powSum(nums: Seq[Int]): Int = pow(nums.sum, 2)
}
