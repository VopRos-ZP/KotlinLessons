package sixExercises

import java.util.*

fun main() {
    Scanner(System.`in`).nextLine().groupingBy { it }.eachCount().toSortedMap().forEach { (c, i) -> println("$c - $i") }
}