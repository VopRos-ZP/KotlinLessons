package sixExercises

import java.util.Scanner
import java.util.regex.Pattern

fun main() {
    val scan = Scanner(System.`in`)
    println("Введите числа и операцию \n(Ex: 1 2 +)\nresult: 3\n$> ")
    val n1 = scan.nextDouble()
    val n2 = scan.nextDouble()
    val result = when (val op = scan.next(Pattern.compile("[+-/*]"))) {
        "+" -> n1 + n2
        "-" -> n1 - n2
        "*" -> n1 * n2
        "/" -> n1 / n2
        else -> "Unknown operation $op"
    }
    println(result)
}