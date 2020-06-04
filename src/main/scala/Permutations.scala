object Permutations {

  def main(args: Array[String]): Unit = {
    permutations("abc").foreach(println)
  }

  def permutations( s: String ): Set[String] ={

    if( s == "" ){
      return Set[String]("")
    }

    val array = s.toCharArray
    var permSet = Set[String]()

    for( c <- 0 until array.length ){

      val nextPerms = permutations( array.subSequence(0,c).toString + array.subSequence(c+1,array.length).toString )

      nextPerms.foreach( p =>
        permSet = permSet + ( array(c)+p )
      )

    }

    permSet

  }
}