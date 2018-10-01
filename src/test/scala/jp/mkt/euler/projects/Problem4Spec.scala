package jp.mkt.euler.projects

import org.scalatest._

class Problem4Spec extends FunSuite {

  test("9119 is palindrome") {
    Problem4.palindrome(9119)
  }

  test("1234 is not palindrome") {
    !Problem4.palindrome(1234)
  }
}
