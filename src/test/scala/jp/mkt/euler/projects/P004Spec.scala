package jp.mkt.euler.projects

import org.scalatest._

class P004Spec extends FunSuite {

  test("9119 is palindrome") {
    assert(P004.palindrome(9119))
  }

  test("1234 is not palindrome") {
    assert(!P004.palindrome(1234))
  }
}
