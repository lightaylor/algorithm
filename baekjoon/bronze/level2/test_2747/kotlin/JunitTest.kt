package bronze.level2.test_2747.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = "10"
        val expectedOutput = "55"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
