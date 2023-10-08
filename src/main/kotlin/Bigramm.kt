import utils.InputLoop


const val RU = "АБВГДЕЖ3ИКЛМНОПРСТУФXЦЧШЩЪЫЬЭЮЯ"
const val EN = "abcdefghijklmopqrstuvwxyz"
var alphabet: Map<String, Map<String, String>> = mapOf()

fun main() {
    InputLoop.start(error = "Неверный ввод") {
        print("Введите слово, которое хотите зашифровать: ")
        run(readln())
    }
}

private fun run(word: String) {
    val (alphabet, last) = when {
        word.all { RU.contains(it, ignoreCase = true) } -> Pair(RU, RU.last())
        word.all { EN.contains(it, ignoreCase = true) } -> Pair(EN, EN.last())
        else -> throw RuntimeException()
    }
    initMap(alphabet)
    bigramm(word, last)
}

private fun bigramm(word: String, last: Char) {
    val w = when (word.length.mod(2) == 0) {
        true -> word
        else -> word.plus(last)
    }
    var result = ""
    var (i, j) = Pair(0, 1)
    do {
        val (f, s) = Pair(w[i], w[j])
        result += alphabet[f.uppercase()]!![s.uppercase()]!!
        result += " "
        i += 2
        j += 2
    } while (i < w.length)
    println(result)
}

private fun initMap(a: String) {
    var i = 1
    val result = mutableMapOf<String, Map<String, String>>()
    for (symbol in a) {
        val innerMap = mutableMapOf<String, String>()
        for (secondSymbol in a) {
            innerMap["$secondSymbol"] = when (i) {
                in 0 ..< 10 -> "00$i"
                in 10 ..< 100 -> "0$i"
                else -> "$i"
            }
            i++
        }
        result["$symbol"] = innerMap
    }
    alphabet = result
}