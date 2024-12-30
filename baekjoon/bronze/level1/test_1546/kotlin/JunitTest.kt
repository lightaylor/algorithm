package bronze.level1.test_1546.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            3
            40 80 60
        """.trimIndent()
        val expectedOutput = "75.0"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            3
            10 20 30
        """.trimIndent()
        val expectedOutput = "66.66666666666667"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test3() {
        val input = """
            4
            1 100 100 100
        """.trimIndent()
        val expectedOutput = "75.25"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test4() {
        val input = """
            5
            1 2 4 8 16
        """.trimIndent()
        val expectedOutput = "38.75"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test5() {
        val input = """
            2
            3 10
        """.trimIndent()
        val expectedOutput = "65.0"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test6() {
        val input = """
            4
            10 20 0 100
        """.trimIndent()
        val expectedOutput = "32.5"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test7() {
        val input = """
            1
            50
        """.trimIndent()
        val expectedOutput = "100.0"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test8() {
        val input = """
            9
            10 20 30 40 50 60 70 80 90
        """.trimIndent()
        val expectedOutput = "55.55555555555556"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
