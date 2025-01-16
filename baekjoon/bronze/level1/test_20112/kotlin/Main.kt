package bronze.level1.test_20112.kotlin

fun main() {
    val n = readln().toInt()

    val arr = Array(n) { CharArray(n) }
    for (i in 0..<n) {
        arr[i] = readln().toCharArray()
    }

    var answer = "YES"
    for (i in 0..<n) {
        for (j in 0..<n) {
            if(arr[i][j] != arr[j][i]) {
                answer = "NO"
                break
            }
        }
    }
    print(answer)
}
