package bronze.level1.test_1373.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = "11001100"
        val expectedOutput = "314"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
