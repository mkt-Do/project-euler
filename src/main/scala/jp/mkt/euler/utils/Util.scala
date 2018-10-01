package jp.mkt.euler.utils

import scala.math._

object Util {
  // judge even or odd
  def even(n: Int): Boolean = n % 2 == 0
  def odd(n: Int): Boolean = n % 2 == 1
  // greatest common divisor
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
  // least common multiple
  def lcm(a: Int, b: Int): Int = {
    val gn = gcd(a, b)
    (a / gn) * (b / gn) * gn
  }
  // difference
  def diff(x: Int, y: Int): Int = abs(x - y)
}
