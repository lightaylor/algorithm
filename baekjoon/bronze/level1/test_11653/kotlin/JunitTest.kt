package baekjoon.bronze.level1.test_11653.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestSupport

class JunitTest {

    @Test
    fun test1() {
        val input = "72"
        val expectedOutput = """
            2
            2
            2
            3
            3
            
        """.trimIndent();

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = "3"
        val expectedOutput = """
            3
            
        """.trimIndent();

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test3() {
        val input = "6"
        val expectedOutput = """
            2
            3
            
        """.trimIndent();

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test4() {
        val input = "2"
        val expectedOutput = """
            2
            
        """.trimIndent();

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test5() {
        val input = "9991"
        val expectedOutput = """
            97
            103
            
        """.trimIndent();

        val actualOutput = TestSupport.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
