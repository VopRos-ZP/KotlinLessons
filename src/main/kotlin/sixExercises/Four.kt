package sixExercises

import utils.InputLoop
import utils.InputLoopException
import java.util.Scanner
import java.util.regex.Pattern

fun main() {
    InputLoop.start("Неправильный ввод") {
        print("Введите числа и операцию \n(Ex: 1 2 +)\nresult: 3\n$> ")
        println(with(Scanner(System.`in`)) {
            val n1 = nextDouble()
            val n2 = nextDouble()
            when (val op = next(Pattern.compile("[+-/*]"))) {
                "+" -> n1 + n2
                "-" -> n1 - n2
                "*" -> n1 * n2
                "/" -> n1 / n2
                else -> throw InputLoopException("Неизвестная операция $op")
            }
        })
    }
}