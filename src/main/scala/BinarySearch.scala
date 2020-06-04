object BinarySearch {

  def main(args: Array[String]): Unit = {
    val x = Array(-1,0,3,5,9,12)
    print( search(x, 11) )
  }

  def search(nums: Array[Int], target: Int): Int = {
    binarySearch(nums, target, 0, nums.size-1)
  }

  def binarySearch(nums: Array[Int], target: Int, l: Int, h: Int) :Int ={

    if( l < h ){

      val middle = (l+(h-l)/2).toInt

      if( target == nums(middle) ){
        return middle
      }

      if( target < nums(middle) ){
        return binarySearch(nums, target, l, middle)
      }

      if( target > nums(middle) ){
        return binarySearch(nums, target, middle+1, h)
      }

    }

    -1
  }
}