package bronze.level2.test_2577.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            150
            266
            427
        """.trimIndent()
        val expectedOutput = """
            3
            1
            0
            2
            0
            0
            0
            2
            0
            0
            
        """.trimIndent()

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
