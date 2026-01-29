package baekjoon.bronze.level1.test_11038.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestSupport

class JunitTest {

    @Test
    fun test1() {
        val input = """
            5 2 4
            100
            90
            82
            70
            65
            5 2 4
            100
            90
            80
            75
            65
            3 1 2
            5000
            4000
            3000
            4 2 3
            10000
            10000
            8000
            8000
            4 2 3
            10000
            10000
            10000
            8000
            5 2 3
            100
            80
            68
            60
            45
            0 0 0
        """.trimIndent()
        val expectedOutput = """
            3
            4
            2
            2
            3
            2
            
        """.trimIndent()

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
