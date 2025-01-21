package bronze.level1.test_11557.kotlin

fun main() {
    var university = ""
    var count = 0

    val n = readln().toInt()
    for (i in 1..n) {
        val m = readln().toInt()
        for (j in 1..m) {
            val arr = readln().split(" ")

            if (count < arr[1].toInt()) {
                university = arr[0]
                count = arr[1].toInt()
            }
        }
        println(university)
    }
}
