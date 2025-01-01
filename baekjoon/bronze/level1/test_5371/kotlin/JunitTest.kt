package bronze.level1.test_5371.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            2
            3
            15 -10
            16 40
            17 41
            1
            15 -10
            1
            100 100
            3
            90 90
            100 110
            -500 -400
        """.trimIndent()
        val expectedOutput = """
            2
            1
            
        """.trimIndent()

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
