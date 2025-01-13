package bronze.level1.test_9093.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            2
            I am happy today
            We want to win the first prize
        """.trimIndent()
        val expectedOutput = """
            I ma yppah yadot
            eW tnaw ot niw eht tsrif ezirp
            
        """.trimIndent()

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
