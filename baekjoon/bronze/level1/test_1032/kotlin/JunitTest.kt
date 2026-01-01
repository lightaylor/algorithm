package bronze.level1.test_1032.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            3
            config.sys
            config.inf
            configures
            """.trimIndent()
        val expectedOutput = "config????"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            2
            contest.txt
            context.txt
            """.trimIndent()
        val expectedOutput = "conte?t.txt"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test3() {
        val input = """
            3
            c.user.mike.programs
            c.user.nike.programs
            c.user.rice.programs
            """.trimIndent()
        val expectedOutput = "c.user.?i?e.programs"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test4() {
        val input = """
            4
            a
            a
            b
            b
            """.trimIndent()
        val expectedOutput = "?"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test5() {
        val input = """
            1
            onlyonefile
            """.trimIndent()
        val expectedOutput = "onlyonefile"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }
    
}
