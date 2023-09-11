package sixExercises

import java.util.Scanner

fun main() {
    println(parseLine(Scanner(System.`in`).nextLine()))
}

private fun parseLine(input: String): String {
    input.toCharArray()
    val all = mutableListOf(Pair(input.first(), 0))
    for (char in input) {
        val current = all.last()
        when (current.first == char) {
            true -> all[all.lastIndex] = current.copy(second = current.second + 1)
            else -> all.add(Pair(char, 1))
        }
    }
    return all.joinToString("") { (char, count) -> "$char${if (count > 1) "$count" else ""}" }
}