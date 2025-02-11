package bronze.level1.test_2693.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            4
            1 2 3 4 5 6 7 8 9 1000
            338 304 619 95 343 496 489 116 98 127
            931 240 986 894 826 640 965 833 136 138
            940 955 364 188 133 254 501 122 768 408
            """.trimIndent()
        val expectedOutput = """
            8
            489
            931
            768
            
            """.trimIndent()

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
