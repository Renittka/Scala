object Hello extends App {
  // type inference
def ex0(): Unit ={
  val a = 1
  val b = "a string"
  //val c = new Person("Regina")

  //val a: Int = 1
  //val b: String = "a string"
  //val c: Person = new Person("Regina")
}

  // Hello
  def ex1(): Unit ={
    // types of variables
    val x =  1 // immutable
    var y = 1 // mutable
    y = y + 1

    println(x)
    println(y)
    println("Hello, world")
  }

  // Int type of method
  def ex2(a:Int, b:Int): Int ={
    a + b
  }

  //  ternary operator
  def ex3(a:Int, b:Int): Int ={
    val x = if (a < b) a else b
    x
  }

  //match expressions
  def ex4(i:Int): String ={
//    val result = i match {
//      case 1 => "one"
//      case 2 => "two"
//      case _ => "not 1 or 2"
//    }
//    result

    // alternative way
    i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "not 1 or 2"
    }

  }

  def ex5(): Unit ={
    val x = for (i <- 1 to 5) yield i * 2
    println(x)
  }

  // boolean match expression
  def ex6(bool: Boolean): String ={
    val booleanAsString = bool match {
      case true => "true"
      case false => "false"
    }
    booleanAsString
  }
  
//matching different types
  def getClassAsString(x: Any):String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"
  }


  //ex1()
  //print(ex2(2,3))
  //  print(ex3(1, 3))
  //  print(ex4(1))
  ex5()
}