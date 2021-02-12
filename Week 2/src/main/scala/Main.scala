import java.io.{FileNotFoundException, IOException}

object Hello extends App {
  // type inference
  def ex0(): Unit ={
    val a = 1
    val b = "a string"
    // val c = new Person("Regina")

    // val a: Int = 1
    // val b: String = "a string"
    // val c: Person = new Person("Regina")
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

  // match expressions
  def ex4(i:Int): String ={
    //  val result = i match {
    //    case 1 => "one"
    //    case 2 => "two"
    //    case _ => "not 1 or 2"
    //  }
    //  result

    // alternative way
    i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "not 1 or 2"
    }
  }

  // yield create for-expressions that yield a result
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

  // matching different types
  def getClassAsString(x: Any):String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    //case p: Person => "Person"
    case _ => "Unknown"
  }

  // try/catch exceptions
  def ex7(): Unit ={
    try {
      //writeToFile(text)
    } catch {
      case fnfe: FileNotFoundException => println(fnfe)
      case ioe: IOException => println(ioe)
    }
  }

  // for loops
  def ex8(): Unit ={
    for (arg <- args) println(arg)

    // "x to y" syntax
    for (i <- 0 to 5) println(i)

    // "x to y by" syntax
    for (i <- 0 to 10 by 2) println(i)
  }

  // yield and list of strings
  def ex9(): Unit ={
    val fruits = List("apple", "banana", "lime", "orange")
    val fruitLengths = for {
      f <- fruits
      if f.length > 4
    } yield f.length
    print(fruitLengths)
  }
  def ex10(): Unit ={
    var x = 1
    var y = 2
    // while loop
    while(x<10) {
      print(x + " ")
      x = x + 1
    }

    // do-while
    do {
      print(y + " ")
      y = y + 1
    }
    while(y<10)
  }

  // Scala class
  class Person(var firstName: String, var lastName: String) {
    def printFullName() = println(s"$firstName $lastName")
  }

  // complicated example
  //  class Pizza (
  //                var crustSize: CrustSize,
  //                var crustType: CrustType,
  //                val toppings: ArrayBuffer[Topping]
  //              ) {
  //    def addTopping(t: Topping): Unit = toppings += t
  //    def removeTopping(t: Topping): Unit = toppings -= t
  //    def removeAllToppings(): Unit = toppings.clear()
  //  }

  // Class usage
  val p = new Person("Julia", "Kern")
  println(p.firstName)
  p.lastName = "Manes"
  p.printFullName()

  // Scala methods
  def sum(a: Int, b: Int): Int = a + b
  def concatenate(s1: String, s2: String): String = s1 + s2

  val x = sum(1,2)
  val y = concatenate("foo", "bar")
  println(x, y)
  //print(ex2(2,3))
  //  print(ex3(1, 3))
  //  print(ex4(1))
  //  ex5()
}