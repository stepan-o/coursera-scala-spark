1

1 + ""

1 + 5

1 + "" + 2

100f / 9
100.toDouble / 9

5 > 3

val x: Array[Double] = Array(1.0, 0.1, 0.01, 0.001, 0.0001)
for ( e <- x ) yield Math.sin(e) / e
for ( e <- x ) println("sin(" + e + ") = " + Math.sin(e))
for ( e <- x if 1 - Math.sin(e) / e < 0.005) println("Getting close to 1")

x(0) + x(1)


println("------- Random generator -------")
var r = scala.util.Random
r.setSeed(111)
r.nextInt(10)
r.nextFloat()
r.nextBoolean()
r.nextPrintableChar()
println("---- printing from 0 to 20 random characters ----")
for ( i <- 0 to r.nextInt(20) ) yield r.nextPrintableChar()
Stream.continually(r.nextInt(100)).take(10) foreach println
//Math.sin(x) / x
println("---- Creating a random length range ----")
var range = 0 to r.nextInt(10)
range.toList
for ( i <- 0 to r.nextInt(10) ) yield Math.sin(i)