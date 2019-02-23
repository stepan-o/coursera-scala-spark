def print_list(start: Int = 1, stop: Int = 10): Unit ={
  val list = start.to(stop)
  println(list)
  list foreach println
}

print_list(3, 5)