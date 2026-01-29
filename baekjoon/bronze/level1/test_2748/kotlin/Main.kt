package baekjoon.bronze.level1.test_2748.kotlin

fun main() {
    val n = readln().toInt()

    val dp = Array(n + 1) { 0L }
    if (n >= 1) {
        dp[1] = 1
    }

    for (i in 2..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    print(dp[n])
}
