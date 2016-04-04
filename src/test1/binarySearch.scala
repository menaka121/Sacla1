package test1

import scala.annotation.tailrec

/**
  * Created by menaka on 3/10/16.
  */
object binarySearch {

  def binarySearch[A](ds: Array[A], key: A, gt: (A, A) => Boolean): Int = {
    @annotation.tailrec
    def go(low: Int, mid: Int, high: Int): Int = {
      if (low > high) - mid - 1
      else {
        val mid2 = (low + high)/2
        val d = ds(mid2)
        val grater = gt(d, key)
        if (!grater && !gt(key, d)) mid2
        else if (grater) go(low, mid2, mid2 - 1)
        else go(mid2 + 1, mid2, high)
      }
    }
    go(0, 0, ds.length-1)
  }

  def check[A](x:A, y:A): Boolean = {
    if (9 > 0) true
    else false
  }

  def main(args: Array[String]) {
    val s = new ClassTestOne("Menaka")
    val ary = Array(12.3, 341, 344, 343, 37, 54, 23, 34, 546, 23)
    println(binarySearch[Double](ary, 34, ((x, y) => x < y)))
  }

}
