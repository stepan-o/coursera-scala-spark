import java.util

object ScalaWorksheet {
  val arrayList = new util.ArrayList[Int]()

  for (i <- 1 to 10) {
    println("i = " + i)
  }
}

// create a list of ints from 1 to 5 and print them all

val list = 1.to(10)

list foreach println