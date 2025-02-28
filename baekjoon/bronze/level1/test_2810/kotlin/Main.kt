package bronze.level1.test_2810.kotlin

fun main() {
    val n = readln().toInt()
    val seats = readln().toCharArray()

    var cupCount = 1;
    var personCount = 0;

    var i = 0
    while (i < n) {
        if (seats[i] == 'S') {
            cupCount++
            personCount++
        } else {
            cupCount++
            personCount += 2
            i++
        }
        i++
    }
    print(cupCount.coerceAtMost(personCount))
}
