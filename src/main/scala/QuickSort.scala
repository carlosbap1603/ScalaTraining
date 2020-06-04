object QuickSort {


  def main(args: Array[String]): Unit = {
    val nums = Array(5,2,3,1)
    quickSort(nums, 0, nums.size-1)
    nums.foreach(println)
  }

  def quickSort(nums: Array[Int], l:Int, h:Int): Unit ={

    if( l < h ){
      val middle = partition(nums, l, h)

      quickSort(nums, l, middle-1 )
      quickSort(nums, middle+1, h )
    }
  }

  def partition(nums: Array[Int], l: Int, h: Int): Int ={

    val pivot = h
    var i = l-1

    for (j <- l until h ){
      if(nums(j) <= nums(pivot) ){
        i = i+1
        swap( nums, i, j)
      }
    }

    i = i+1
    swap( nums, i, pivot)

    i
  }

  def swap( nums:  Array[Int], l: Int, r: Int)={
    val temp = nums(l)
    nums(l) = nums(r)
    nums(r) = temp
  }
}
