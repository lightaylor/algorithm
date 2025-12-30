package bronze.level1.test_9506.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            6
            12
            28
            -1
        """.trimIndent()
        val expectedOutput = """
            6 = 1 + 2 + 3
            12 is NOT perfect.
            28 = 1 + 2 + 4 + 7 + 14
            
        """.trimIndent()

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
