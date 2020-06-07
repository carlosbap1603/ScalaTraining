object Permutations {

  def main(args: Array[String]): Unit = {
    permutations("carlo", "")
  }

  def permutations( s:String, prefix:String): Unit ={

    if(s == "") {
        println(prefix)
    }

    for( i <- 0 until s.length ){
      permutations( s.substring(0,i)+s.substring(i+1), prefix+s.charAt(i))
    }

  }
}