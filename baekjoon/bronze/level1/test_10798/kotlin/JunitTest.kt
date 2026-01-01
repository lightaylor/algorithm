package bronze.level1.test_10798.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            ABCDE
            abcde
            01234
            FGHIJ
            fghij
        """.trimIndent()
        val expectedOutput = "Aa0FfBb1GgCc2HhDd3IiEe4Jj"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            AABCDD
            afzz
            09121
            a8EWg6
            P5h3kx
        """.trimIndent()
        val expectedOutput = "Aa0aPAf985Bz1EhCz2W3D1gkD6x"

        val actualOutput = util.TestUtil.runAndCapture(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
