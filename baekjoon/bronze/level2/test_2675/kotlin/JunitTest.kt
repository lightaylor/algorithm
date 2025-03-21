package bronze.level2.test_2675.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            2
            3 ABC
            5 /HTP
        """.trimIndent()
        val expectedOutput = """
            AAABBBCCC
            /////HHHHHTTTTTPPPPP
        """.trimIndent()

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
