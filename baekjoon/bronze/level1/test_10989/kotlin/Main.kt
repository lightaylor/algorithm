package bronze.level1.test_10989.kotlin

fun main() {
    val n = readln().toInt()
    val arr = Array(n) { 0 }

    for (i in 0..<n) {
        arr[i] = readln().toInt();
    }

    arr.sort()
    for (i in arr) {
        println(i)
    }
}
