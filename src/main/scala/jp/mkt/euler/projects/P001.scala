package jp.mkt.euler.projects

object P001 {
  def filterMultipleThreeOrFive(nums: List[Int]): List[Int] = nums.filter(
    num => num % 3 == 0 || num % 5 == 0)
}
