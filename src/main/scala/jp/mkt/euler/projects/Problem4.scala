package jp.mkt.euler.projects

object Problem4 {
  def palindrome(n: Int): Boolean = {
    val nStr = n.toString
    nStr == nStr.reverse
  }
}
