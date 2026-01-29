package baekjoon.bronze.level2.test_2711.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestSupport

class JunitTest {

    @Test
    fun test1() {
        val input = """
            4
            4 MISSPELL
            1 PROGRAMMING
            7 CONTEST
            3 BALLOON
        """.trimIndent()
        val expectedOutput = """
            MISPELL
            ROGRAMMING
            CONTES
            BALOON
            
        """.trimIndent()

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
