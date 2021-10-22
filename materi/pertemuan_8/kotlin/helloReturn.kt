fun main() {

    println(hello())

    val c: Double = tambah(2, 3)

    println(c)
}

private fun hello(): String {
    return "Hello world"
}

fun tambah(a: Int, b: Int): Double {
    return a + b.toDouble()
}
