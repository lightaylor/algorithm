package bronze.level1.test_10989.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            10
            5
            2
            3
            1
            4
            2
            3
            5
            1
            7
        """.trimIndent()
        val expectedOutput = """
            1
            1
            2
            2
            3
            3
            4
            5
            5
            7
            
        """.trimIndent()

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
