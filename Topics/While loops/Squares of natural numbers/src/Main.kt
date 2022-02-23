fun main() {
    val num = readLine()!!.toInt()
    var i = 1
    while (i * i <= num) {
        println(i * i)
        i++
    }
}
