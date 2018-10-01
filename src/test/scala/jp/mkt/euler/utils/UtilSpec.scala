package jp.mkt.euler.utils

import org.scalatest._

class UtilSpec extends FunSuite {

  test("Filter even num") {
    assert(Util.filterEven(10))
  }

  test("Filter odd num") {
    assert(Util.filterOdd(11))
  }
}
