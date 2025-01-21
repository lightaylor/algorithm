package bronze.level1.test_11557.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            2
            3
            Yonsei 10
            Korea 10000000
            Ewha 20
            2
            Yonsei 1
            Korea 10000000
        """.trimIndent()
        val expectedOutput = """
            Korea
            Korea
            
        """.trimIndent();

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
