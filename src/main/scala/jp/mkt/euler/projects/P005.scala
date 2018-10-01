package jp.mkt.euler.projects

import jp.mkt.euler.utils.Util.lcm

object P005 {
  def allLcm(nums: List[Int]): Int = nums match {
    case Nil => 1
    case x :: t => lcm(x, allLcm(t))
  }
}
