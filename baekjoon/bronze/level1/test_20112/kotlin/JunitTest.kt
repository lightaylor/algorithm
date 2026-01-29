package baekjoon.bronze.level1.test_20112.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestSupport

class JunitTest {

    @Test
    fun test1() {
        val input = """
            3
            AAB
            ACD
            BDE
        """.trimIndent()
        val expectedOutput = "YES"

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            4
            APPL
            PPAP
            PADD
            LPOV
        """.trimIndent()
        val expectedOutput = "NO"

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
