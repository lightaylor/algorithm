package baekjoon.bronze.level1.test_1934.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestSupport

class JunitTest {

    @Test
    fun test1() {
        val input = """
            3
            1 45000
            6 10
            13 17
        """.trimIndent()
        val expectedOutput = """
            45000
            30
            221
            
        """.trimIndent()

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
