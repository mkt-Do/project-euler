package jp.mkt.euler.projects

import org.scalatest._

class P006Spec extends FunSuite {

  test("sum of power of num(1 to 10) is 385") {
    assert(P006.sumPow((1 to 10).toSeq) == 385)
  }

  test("power of sum of num(1 to 10) is 3025") {
    assert(P006.powSum((1 to 10).toSeq) == 3025)
  }
}
