package bronze.level1.test_2609.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = "24 18"
        val expectedOutput = """
            6
            72
        """.trimIndent()

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
