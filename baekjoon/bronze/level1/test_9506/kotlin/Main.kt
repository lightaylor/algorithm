package bronze.level1.test_9506.kotlin

fun main() {
    var n = readln().toInt()

    val list = mutableListOf<Int>()
    while (n != -1) {
        var sum = 0
        for (i in 1..<n) {
            if (n % i == 0) {
                sum += i
                list.add(i)
            }
        }

        val answer = StringBuilder()
        if (sum == n) {
            answer.append("$n =")
            list.forEachIndexed { index, s ->
                if (index == list.size - 1) {
                    answer.append(" $s")
                } else {
                    answer.append(" $s +")
                }
            }
        } else {
            answer.append("$n is NOT perfect.")
        }
        list.clear()
        println(answer)
        n = readln().toInt()
    }
}
