import java.util.StringJoiner

fun main(args: Array<String>) {
    isAnagram(maus = "maus", laus = "laus")

    fibonacci(10)

    val test = isPrime(5)
    println()
    println(test)
}

// Darauf bin ich gekommen, allerdings habe ich es gegooglet und Isack hat mir auch geolfen. Komplett alleine
// hätte ich es nicht hinbekommen.
fun isAnagram(maus: String, laus: String): Boolean {
    val sortedString1 = maus
    val sortedString2 = laus
    val sortedString3 = sortedString1.contentEquals(sortedString2)
    return sortedString3
}
// Das ist der Code von Isack den er mich gezeigt hat. (Viele Wege führen nach Rom:-))
fun main() {
    anagram("hello", "lelho")
    anagram("Hello", "raijka")
}
fun anagram(string1: String, string2: String) {
    val list1 = mutableListOf<Char>()
    val list2 = mutableListOf<Char>()

    string1.lowercase().forEach { list1.add(it) }
    string2.lowercase().forEach { list2.add(it) }

    if (list1.containsAll(list2)) {
        println("$string1 and $string2 is an anagram")
    } else {
        println("$string1 and $string2 is not an anagram")
    }
}

// Aufgabe 2





