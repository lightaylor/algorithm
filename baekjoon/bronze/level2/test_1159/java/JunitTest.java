package baekjoon.bronze.level2.test_1159.java;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
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
            """;
        String expectedOutput = "bk";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            6
            michael
            jordan
            lebron
            james
            kobe
            bryant
            """;
        String expectedOutput = "PREDAJA";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
