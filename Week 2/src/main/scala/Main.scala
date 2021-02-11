object Hello extends App {

  def ex1(): Unit ={
    val x =  1
    var y = 1
    y = y + 1

    println(x)
    println(y)
    println("Hello, world")
  }

  def ex2(a:Int, b:Int): Int ={
    a + b
  }

  def ex3(a:Int, b:Int): Int ={
    val x = if (a < b) a else b
    x
  }

  def ex4(i:Int): String ={
//    val result = i match {
//      case 1 => "one"
//      case 2 => "two"
//      case _ => "not 1 or 2"
//    }
//    result

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
  //ex1()
  //print(ex2(2,3))
  //  print(ex3(1, 3))
  //  print(ex4(1))
  ex5()
}