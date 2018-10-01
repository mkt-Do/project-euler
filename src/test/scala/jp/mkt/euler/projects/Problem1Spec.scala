package jp.mkt.euler.projects

import org.scalatest._

class Problem1Spec extends FunSuite {

  test("Filtered List shuold be 3 or 5 multiple list (List(3, 5, 6, 9))") {
    assert(Problem1.filterMultipleThreeOrFive((1 until 10).toList) == List(3, 5, 6, 9))
  }
}
