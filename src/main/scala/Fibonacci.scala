object Fibonacci {

  def main(args: Array[String]): Unit = {

    val n = 6
    val memo = new Array[Int](n+1)

    for( i <- 0 to n ){
      println( fib( i, memo ) )
    }
  }

  def fib( n:Int, memo:Array[Int]): Int ={
    if( n == 0 )  return 0
    if( n == 1 )  return 1

    if( memo(n) == 0 )
      memo(n) = fib( n-1, memo ) + fib( n-2, memo )

    memo(n)

  }

}
