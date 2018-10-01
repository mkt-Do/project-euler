package jp.mkt.euler.projects

import org.scalatest._

class P005Spec extends FunSuite {

  test("1 to 10 all lcm is 2520") {
    assert(P005.allLcm((1 to 10).toList) == 2520)
  }
}
