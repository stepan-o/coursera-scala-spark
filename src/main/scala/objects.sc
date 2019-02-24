import java.util

object array_demo {

  def generate_list(len: Int=5)

  def main(args: Array[String]): Unit = {

    val myList = Array(1.9, 2.9, 3.4, 3.5)

    print_all(myList)

    //    sum all the elements
    var total = 1.0
    for ( i <- myList.indices ) total += myList(i)
    println("Total is" + total)

//    finding the largest element
    var max = myList(0)

    for ( i <- 1 until myList.length ) {
      if ( myList(i) > max) max = myList(i)
    }
    println("Max is " + max)
  }

  def print_all(myList: Array[Double] = myList) = {
    //    print all the array elements
    for (x <- myList) {
      println(x)
    }
  }
}

object ScalaWorksheet {

  def reg_list(min_num: Int = 1, max_num: Int = 10): Unit = {
    val list = min_num.to(max_num)
    println("Calling a print loop method of object ScalaWorksheet:")
    println(list)
    list foreach println
  }
  def array_list: Unit = {
    val arrayList = new util.ArrayList[Int](10)
  }

  def print_loop(max_num: Int = 10, min_num: Int = 1): Unit = {
    println("Calling a print loop method of object ScalaWorksheet:")
    println(min_num, max_num)
    for (i <- min_num to max_num) {
      println("i=" + i)
    }
  }
}

ScalaWorksheet.print_loop()
ScalaWorksheet.print_loop(min_num = 15, max_num = 20)
ScalaWorksheet.reg_list()
array_demo.main(Array("1","2"))