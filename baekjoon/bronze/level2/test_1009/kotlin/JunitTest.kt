package bronze.level2.test_1009.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            6
            1 6
            3 7
            6 2
            7 100
            9 635
            4 4
            """.trimIndent()
        val expectedOutput = """
            1
            7
            6
            1
            9
            6
            
        """.trimIndent()

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
