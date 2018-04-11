class Greeting(val word: String) {
    fun helloworld() {
        println(word)
    }
}

fun main(args: Array<String>) {
    val gree = Greeting("hello world")
    gree.helloworld()
}
