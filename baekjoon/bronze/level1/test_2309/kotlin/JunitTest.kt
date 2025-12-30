package bronze.level1.test_2309.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            20
            7
            23
            19
            10
            15
            25
            8
            13
        """.trimIndent()
        val expectedOutput = """
            7
            8
            10
            13
            19
            20
            23
            
        """.trimIndent()

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
