package bronze.level1.test_1032.kotlin

fun main() {
    val n = readln().toInt()
    val arr = Array(n) { readln() }

    val answer = arr[0].toCharArray()
    for (i in 1..<n) {
        for (j in answer.indices) {
            val current = arr[i].toCharArray()
            if (answer[j] != current[j]) {
                answer[j] = '?'
            }
        }
    }
    print(String(answer))
}
