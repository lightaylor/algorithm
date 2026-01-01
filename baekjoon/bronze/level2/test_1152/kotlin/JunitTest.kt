package bronze.level2.test_1152.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = "The Curious Case of Benjamin Button"
        val expectedOutput = "6"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = " The first character is a blank"
        val expectedOutput = "6"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test3() {
        val input = "The last character is a blank "
        val expectedOutput = "6"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
