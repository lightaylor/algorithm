package bronze.level1.test_5371.kotlin

fun main() {
    val tc = readln().toInt()

    for (i in 1..tc) {
        var answer = 0;

        val n = readln().toInt()
        val mosquitoes = mutableListOf<Point>()
        for (j in 1..n) {
            val input = readln().split(" ").map { it.toInt() }
            mosquitoes.add(Point(input[0], input[1]))
        }

        val visited = Array(n) { false }
        val m = readln().toInt()
        for (j in 1..m) {
            val swats = readln().split(" ").map { it.toInt() }

            for ((index, mosquito) in mosquitoes.withIndex()) {
                if (swats[0] - 50 <= mosquito.x && mosquito.x <= swats[0] + 50 && swats[1] - 50 <= mosquito.y && mosquito.y <= swats[1] + 50 && !visited[index]) {
                    answer++
                    visited[index] = true
                }
            }
        }

        println(answer)
    }
}

class Point(val x: Int, val y: Int)
