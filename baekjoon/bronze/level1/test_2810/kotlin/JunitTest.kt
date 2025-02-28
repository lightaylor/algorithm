package bronze.level1.test_2810.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            3
            SSS
        """.trimIndent()
        val expectedOutput = "3";

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            4
            SLLS
        """.trimIndent()
        val expectedOutput = "4";

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test3() {
        val input = """
            9
            SLLLLSSLL
        """.trimIndent()
        val expectedOutput = "7";

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
