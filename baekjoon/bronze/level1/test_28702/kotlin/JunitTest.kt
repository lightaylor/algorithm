package bronze.level1.test_28702.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            Fizz
            Buzz
            11
        """.trimIndent()
        val expectedOutput = "Fizz"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            980803
            980804
            FizzBuzz
        """.trimIndent()
        val expectedOutput = "980806"

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
