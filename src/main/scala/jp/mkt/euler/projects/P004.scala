package jp.mkt.euler.projects

object P004 {
  def palindrome(n: Int): Boolean = {
    val nStr = n.toString
    nStr == nStr.reverse
  }
}
