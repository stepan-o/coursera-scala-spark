import java.util

object ScalaWorksheet {

  def reg_list(min_num: Int = 1, max_num: Int = 10) = {
    val list = min_num.to(max_num)
    println("Calling a print loop method of object ScalaWorksheet:")
    println(list)
    list foreach println
  }
  def array_list = {
    val arrayList = new util.ArrayList[Int](10)
  }

  def print_loop(max_num: Int = 10, min_num: Int = 1) = {
    println("Calling a print loop method of object ScalaWorksheet:")
    println(min_num, max_num)
    for (i <- min_num to max_num) {
      println("i=" + i)
    }
  }
}

// calling a method with default arguments

ScalaWorksheet.print_loop()

// calling a method with custom arguments

ScalaWorksheet.print_loop(min_num = 5, max_num = 20)

ScalaWorksheet.reg_list()