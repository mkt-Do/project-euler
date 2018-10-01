package jp.mkt.euler.utils

object Util {
  def filterEven(n: Int): Boolean = n % 2 == 0
  def filterOdd(n: Int): Boolean = n % 2 == 1
  def gcd(a: Int, b: Int): Int = {
    if (a < b) {
      b % a match {
        case 0 => a
        case r => gcd(a, r)
      }
    } else {
      a % b match {
        case 0 => b
        case r => gcd(b, r)
      }
    }
  }
  def lcm(a: Int, b: Int): Int = {
    val gn = gcd(a, b)
    (a / gn) * (b / gn) * gn
  }
}
