package baekjoon.bronze.level2.test_2587.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestSupport

class JunitTest {

    @Test
    fun test1() {
        val input = """
            10
            40
            30
            60
            30
        """.trimIndent()
        val expectedOutput = """
            34
            30
        """.trimIndent()

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
