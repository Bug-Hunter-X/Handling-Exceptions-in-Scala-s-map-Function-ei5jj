```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  //This will throw an exception because the map function is not handling potential exceptions
  val doubledList = list.map(x => try {
    10 / (x -3)
  } catch {
    case e: ArithmeticException => 0 //Handle the exception
  })
  println(doubledList)
}
```