package bronze.level1.test_1157.kotlin

fun main() {
    val input = readln().toCharArray()
    val map = mutableMapOf<Char, Int>()

    var maxKey = ' '
    var maxCount = 0
    for (c in input) {
        val key = c.uppercaseChar()
        map[key] = map.getOrDefault(key, 0) + 1

        if (maxCount < map[key]!!) {
            maxKey = key
            maxCount = map[key]!!
        }
    }

    for (key in map.keys) {
        if (map[key]!! >= maxCount && key != maxKey) {
            maxKey = '?'
        }
    }

    print(maxKey)
}
