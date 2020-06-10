class Node[T]( var value: T, var next: Node[T] )

class LinkedList[T] {

  var root: Node[T] = null

  def push( data: T ): Unit ={
    root = push(root, data)
  }

  private def push( root:Node[T],  data: T ):Node[T] ={
    if( root == null ){
      return new Node[T](data, null)
    }

    root.next = push( root.next, data )

    return root
  }

  def print():Unit={
    print( root )
  }

  private def print( root:Node[T] ):Unit={

    if( root != null ) {
      println( root.value )
      print( root.next )
    }

  }

  def reverse():Unit={
    root = reverse(root, null)
  }

  private def reverse( root:Node[T], prev:Node[T] ):Node[T] ={

    if( root ==  null )
      return prev

    val next = root.next
    root.next = prev

    return reverse( next, root )

  }

}

object LinkedList{

  def main(args: Array[String])={
    val list = new LinkedList[Int]

    list.push( 10)
    list.push( 5)
    list.push(3)

    list.print()

    list.reverse()

    println()
    list.print()

  }


}