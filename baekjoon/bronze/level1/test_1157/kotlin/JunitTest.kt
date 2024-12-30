package bronze.level1.test_1157.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = "Mississipi"
        val expectedOutput = "?"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = "zZa"
        val expectedOutput = "Z"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test3() {
        val input = "z"
        val expectedOutput = "Z"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test4() {
        val input = "baaa"
        val expectedOutput = "A"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
