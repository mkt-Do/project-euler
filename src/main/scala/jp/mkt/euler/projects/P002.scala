package jp.mkt.euler.projects

import jp.mkt.euler.utils.Util.even

object P002 {

  def sumEvenItem(list: List[Int]): Int = list.filter(even)
      .foldRight(0)((v, acc) => acc + v)

  def fibonacci(a: Int,b: Int): Stream[Int] = a #:: fibonacci(b, a + b)

  def createFibonacciList(n: Int, a: Int, b: Int): List[Int] = n match {
    case m if m <= 0 => Nil
    case _ if a <= 0 || b <= 0 => Nil
    case m => fibonacci(a, b).takeWhile(x => x <= m).toList
  }
}
