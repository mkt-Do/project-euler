package jp.mkt.euler.projects

import org.scalatest._

class P003Spec extends FunSuite {

  test("factors of 18 should be Seq(1, 2, 3, 6, 9, 18)") {
    assert(P003.factors(18) == Seq(1, 2, 3, 6, 9, 18))
  }

  test("Prime factor of 18 should be Seq(2, 3, 3)") {
    assert(P003.factorize(18) == Seq(2, 3, 3))
  }
}
