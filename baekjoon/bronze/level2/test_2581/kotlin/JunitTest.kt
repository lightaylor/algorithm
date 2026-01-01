package bronze.level2.test_2581.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            60
            100
        """.trimIndent()
        val expectedOutput = """
            620
            61
        """.trimIndent()

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            64
            65
        """.trimIndent()
        val expectedOutput = """
            -1
        """.trimIndent()

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
