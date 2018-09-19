package jp.mkt.euler.projects

import jp.mkt.euler.projects.Problem2
import org.scalatest._

class Project2Spec extends FunSuite {

  test("fibonacci n == 10 is 89") {
    assert(Problem2.fibonacci(1, 2).take(10)(9) == 89)
  }

  test("Fibonacci list (n == 89, a == 1, b == 2) is List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)") {
    assert(Problem2.createFibonacciList(89, 1, 2) == List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
  }

  test("Sum of fibonacci even list(n == 10) element is 44") {
    assert(Problem2.sumEvenItem(Problem2.fibonacci(1, 2).take(10).toList) == 44)
  }
}
