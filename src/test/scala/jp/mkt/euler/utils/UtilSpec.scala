package jp.mkt.euler.utils

import org.scalatest._

class UtilSpec extends FunSuite {

  test("Filter even num") {
    assert(Util.filterEven(10))
  }

  test("Filter odd num") {
    assert(Util.filterOdd(11))
  }

  test("gcd of 1071 and 1029 is 21") {
    assert(Util.gcd(1071, 1029) == 21)
  }

  test("lcm of 4 and 6 is 12") {
    assert(Util.lcm(4, 6) == 12)
  }
}
