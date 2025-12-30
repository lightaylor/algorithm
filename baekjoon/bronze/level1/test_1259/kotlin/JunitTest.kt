package bronze.level1.test_1259.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            121
            1231
            12421
            0
        """.trimIndent()
        val expectedOutput = """
            yes
            no
            yes
            
        """.trimIndent()

        val actualOutput = TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
