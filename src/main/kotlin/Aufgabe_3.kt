// Musste erstmal googeln, was fibonacci bedeutet. Habe auch hier mit googel recherchieren müssen.
fun fibonacci(x: Int) {
    var n1 = 0
    var n2 = 1

    for (i in 1..x) {
        print("$n1 + ")

        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }
}