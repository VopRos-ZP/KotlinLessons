package sixExercises

import utils.InputLoop
import java.util.Scanner

fun main() {
    InputLoop.start(error = "Пожалуйста введите число!") {
        print("Введите десятичное число: ")
        println(toDoubleSystem(Scanner(System.`in`).nextInt()))
    }
}

private fun toDoubleSystem(n: Int): Int {
    var result = ""
    var num = n
    while (num > 0 && num != 1) {
        num = with (num) {
            result += mod(2)
            div(2)
        }
        if (num == 1) result += num
    }
    return result.reversed().toInt()
}