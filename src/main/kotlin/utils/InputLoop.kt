package utils

class InputLoop {

    companion object {
        fun start(error: String, executable: () -> Unit) {
            while (true) {
                try {
                    executable()
                    return
                } catch (ex: InputLoopException) {
                    println(ex.message)
                    continue
                } catch (_: Exception) {
                    println(error)
                    continue
                }
            }
        }
    }

}