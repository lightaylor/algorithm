package bronze.level1.test_11005.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = "60466175 36"
        val expectedOutput = "ZZZZZ"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
