package jp.mkt.euler.projects

import scala.math._

object Problem3 {

  implicit def intToBigInt(n: Int) = BigInt(n)
  implicit def longToBigInt(n: Long) = BigInt(n)

  def factors(n: BigInt): Seq[BigInt] = enumerate(1).takeWhile(_ <= n).filter(n % _ == 0).toSeq
  def factorize(n: BigInt): Seq[BigInt] = n match {
    case m if m <= 0 => throw new IllegalArgumentException("Parameter should be over 0")
    case m if m == 1 => Nil
    case m => factors(m).filter(e => e != 1) match {
      case Nil => Nil
      case x +: xs => x +: factorize(m / x)
    }
  }

  private[this] def enumerate(n: BigInt): Stream[BigInt] = n #:: enumerate(n + 1)
}
