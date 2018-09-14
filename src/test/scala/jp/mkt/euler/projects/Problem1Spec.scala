package jp.mkt.euler.project

import jp.mkt.euler.project.Problem1
import org.scalatest._

class Problem1Spec extends FunSuite {

  test("Filtered List is shuold be 3 or 5 multiple list") {
    assert(Problem1.filterMultipleThreeOrFive((1 until 10).toList) == List(3, 5, 6, 9))
  }
}
