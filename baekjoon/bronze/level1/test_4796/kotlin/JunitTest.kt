package bronze.level1.test_4796.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            5 8 20
            5 8 17
            0 0 0
        """.trimIndent()
        val expectedOutput = """
            Case 1: 14
            Case 2: 11
            
        """.trimIndent()

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
