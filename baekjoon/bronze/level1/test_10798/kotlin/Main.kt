package bronze.level1.test_10798.kotlin

fun main() {
    val arr = Array(5) { CharArray(15) }

    for (i in 0..4) {
        arr[i] = readln().toCharArray()
    }

    val answer = StringBuilder()
    for (i in 0..14) {
        for (j in 0..4) {
            if (i >= arr[j].size) {
                continue
            }
            answer.append(arr[j][i])
        }
    }
    print(answer)
}
