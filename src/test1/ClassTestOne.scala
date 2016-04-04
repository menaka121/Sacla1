package test1

class ClassTestOne (n : String) {
  val name: String = n

  def greet: String = s"Hello from $name"

  override def toString = s"User($name)"

}
object hello {

  def factorial(n: Int): BigInt = {
    def go(n: Int, acc: BigInt): BigInt = {
      if (n<=0) acc
      else go (n-1, n*acc)
    }
    go(n, 1)
  }

  def fibb(n: Int): BigInt = {
    def go(x:Int, y: BigInt, acc: BigInt): BigInt = {
      if(x == n) {
        acc
      }
      else{
        println(acc)
        go(x+1, acc, acc + y)
      }
    }
    go(1, 0, 1)
  }

  def main(args: Array[String]) {
    val s = new ClassTestOne("Menaka")
    println(s.greet)

    println(fibb(45))
  }
}