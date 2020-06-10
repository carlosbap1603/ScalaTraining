object HeapSort {

  def main(args: Array[String]): Unit = {
    val x = Array(23,5,52,5,3,6,3,1,8,0)

    heapSort( x )

    x.foreach(println)
  }

  def heapSort( array: Array[Int] )={

    for( i <- (array.length/2)-1 to 0 by -1 ){
      heapify( array, array.length, i )
    }


    for( i <- array.length-1 to 0 by -1 ){


      val root = array(0)
      array(0) = array(i)
      array(i) = root

      heapify( array, i, 0 )
    }
  }

  def heapify( array: Array[Int], n: Int, end: Int ): Unit ={

    var largest = end
    val l = end*2+1
    val r  = end*2+2

    if( l < n && array(l) > array(largest) )
      largest = l

    if( r < n && array(r) > array(largest) )
      largest = r

    if( largest != end ) {
      swap(array, end, largest )
      heapify(array, n, largest )
    }

  }

  def swap( array: Array[Int], l:Int, r:Int)={
    val temp = array(l)
    array(l) = array(r)
    array(r) =  temp
  }

}
