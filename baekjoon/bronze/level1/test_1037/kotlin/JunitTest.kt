package bronze.level1.test_1037.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            2
            4 2
            """.trimIndent()
        val expectedOutput = "8"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            1
            2
            """.trimIndent()
        val expectedOutput = "4"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test3() {
        val input = """
            6
            3 4 2 12 6 8
            """.trimIndent()
        val expectedOutput = "24"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test4() {
        val input = """
            14
            14 26456 2 28 13228 3307 7 23149 8 6614 46298 56 4 92596
            """.trimIndent()
        val expectedOutput = "185192"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
