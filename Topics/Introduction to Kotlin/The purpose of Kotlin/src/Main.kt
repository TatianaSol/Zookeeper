// You can experiment here, it won’t be checked

fun main() {
    val n = readLine()!!.toInt()
    var gradea = 0
    var gradeb = 0
    var gradec = 0
    var graded = 0
    repeat (n) {
        if (readLine()!!.toInt() == 5) { gradea += 1 }
        else if (readLine()!!.toInt() == 4) { gradeb += 1 }
        else if (readLine()!!.toInt() == 3) { gradec += 1 }
        else if (readLine()!!.toInt() == 2) { graded += 1 }
    }
    println("$graded $gradec $gradeb $gradea")
}
