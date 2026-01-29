package baekjoon.bronze.level2.test_1919.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestSupport

class JunitTest {

    @Test
    fun test1() {
        val input = """
            aabbcc
            xxyybb
        """.trimIndent()
        val expectedOutput = "8"

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
