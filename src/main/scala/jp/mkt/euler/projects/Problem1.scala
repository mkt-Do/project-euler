package jp.mkt.euler.project

object Problem1 {
  def filterMultipleThreeOrFive(nums: List[Int]): List[Int] = nums.filter(
    num => num % 3 == 0 || num % 5 == 0)
}
