import java.security.KeyStore.TrustedCertificateEntry

def print_list(start: Int = 1, stop: Int = 10): Unit ={
  val list = start.to(stop)
  println(list)
  list foreach println
}


def add(num1: Int, num2: Int): Int = {
  num1 + num2
}

print_list(3, 5)

add(3, 5)

