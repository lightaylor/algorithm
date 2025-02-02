package bronze.level2.test_1159.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            18
            babic
            keksic
            boric
            bukic
            sarmic
            balic
            kruzic
            hrenovkic
            beslic
            boksic
            krafnic
            pecivic
            klavirkovic
            kukumaric
            sunkic
            kolacic
            kovacic
            prijestolonasljednikovi
        """.trimIndent()
        val expectedOutput = "bk"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun test2() {
        val input = """
            6
            michael
            jordan
            lebron
            james
            kobe
            bryant
        """.trimIndent()
        val expectedOutput = "PREDAJA"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
