package sixExercises

import java.util.*

fun main() {
    getCount(Scanner(System.`in`).nextLine()).print()
}

private fun getCount(input: String): Map<Char, Int> {
    return input.groupingBy { it }.eachCount().toSortedMap()
}

private fun Map<Char, Int>.print() = forEach { (c, i) -> println("$c - $i") }

