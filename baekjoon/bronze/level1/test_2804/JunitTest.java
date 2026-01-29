package baekjoon.bronze.level1.test_2804;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = "BANANA PIDZAMA";
        String expectedOutput = """
            .P....
            .I....
            .D....
            .Z....
            BANANA
            .M....
            .A....
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = "MAMA TATA";
        String expectedOutput = """
            .T..
            MAMA
            .T..
            .A..
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = "REPUBLIKA HRVATSKA";
        String expectedOutput = """
            H........
            REPUBLIKA
            V........
            A........
            T........
            S........
            K........
            A........
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
