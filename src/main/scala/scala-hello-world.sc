// create a list of ints from 1 to 10 and print them all
println("[------ Create a list of numbers ------]")

val list = 1.to(10)

list foreach println

//Adding two values together
println("[------ Add two values ------]")

println("First value:")
val foo = 123
foo

println("Second value:")
val bar = 321
bar

println("Adding values to strings coverts them to strings")
val sum_strings = "foo + bar = " + foo + bar
sum_strings

println("foo + bar = ", foo + bar)

val baz = "foo"

val qux = "bar"

println(baz, qux)