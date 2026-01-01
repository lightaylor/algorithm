package bronze.level2.test_1100.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            .F.F...F
            F...F.F.
            ...F.F.F
            F.F...F.
            .F...F..
            F...F.F.
            .F.F.F.F
            ..FF..F.
            """.trimIndent()
        val expectedOutput = "1"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            ........
            ........
            ........
            ........
            ........
            ........
            ........
            ........
            """.trimIndent()
        val expectedOutput = "0"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test3() {
        val input = """
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            """.trimIndent()
        val expectedOutput = "32"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test4() {
        val input = """
            ........
            ..F.....
            .....F..
            .....F..
            ........
            ........
            .......F
            .F......
            """.trimIndent()
        val expectedOutput = "2"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
