package bronze.level2.test_2747.kotlin

fun main() {
    val n = readln().toInt()
    val dp = IntArray(n + 1)
    if (n > 0) dp[1] = 1
    for (i in 2..n) dp[i] = dp[i - 1] + dp[i - 2]
    print(dp[n])
}
