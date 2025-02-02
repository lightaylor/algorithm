package bronze.level2.test_1212.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = "314"
        val expectedOutput = "11001100"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
