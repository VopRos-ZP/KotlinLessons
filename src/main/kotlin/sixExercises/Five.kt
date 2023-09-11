package sixExercises

import utils.InputLoop
import java.util.Scanner
import kotlin.math.pow

fun main() {
    InputLoop.start(error = "Неверный ввод") {
        with(Scanner(System.`in`)) {
            print("Введите целое число n: ")
            val num = nextInt()
            print("Введите целое основание степени x: ")
            val base = nextInt()
            for (i in 1..<num + 1) {
                if (i.toDouble().pow(base).toInt() == num) {
                    println("y = $i")
                    return@start
                }
            }
            println("Целочисленного показателя степени нет")
        }
    }
}