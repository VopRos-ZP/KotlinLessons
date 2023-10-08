package sixExercises

import utils.InputLoop
import java.util.*

fun main() {
    InputLoop.start(error = "Неверный ввод") {
        with(Scanner(System.`in`)) {
            print("Введите целое число a: ")
            val a = nextInt()
            print("Введите целое число b: ")
            val b = nextInt()
            println(
                when {
                    isSumOdd(a, b) -> a * 10 + b
                    isSumOdd(b, a) -> b * 10 + a
                    else -> "Создать нечетное число невозможно"
                }
            )
        }
    }
}

private fun isSumOdd(a: Int, b: Int): Boolean = (a * 10 + b).mod(2) == 1