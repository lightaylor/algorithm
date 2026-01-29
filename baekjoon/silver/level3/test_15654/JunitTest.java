package baekjoon.silver.level3.test_15654;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                3 1
                4 5 2
                """;
        String expectedOutput = """
                2
                4
                5
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                4 2
                9 8 7 1
                """;
        String expectedOutput = """
                1 7
                1 8
                1 9
                7 1
                7 8
                7 9
                8 1
                8 7
                8 9
                9 1
                9 7
                9 8
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                4 4
                1231 1232 1233 1234
                """;
        String expectedOutput = """
                1231 1232 1233 1234
                1231 1232 1234 1233
                1231 1233 1232 1234
                1231 1233 1234 1232
                1231 1234 1232 1233
                1231 1234 1233 1232
                1232 1231 1233 1234
                1232 1231 1234 1233
                1232 1233 1231 1234
                1232 1233 1234 1231
                1232 1234 1231 1233
                1232 1234 1233 1231
                1233 1231 1232 1234
                1233 1231 1234 1232
                1233 1232 1231 1234
                1233 1232 1234 1231
                1233 1234 1231 1232
                1233 1234 1232 1231
                1234 1231 1232 1233
                1234 1231 1233 1232
                1234 1232 1231 1233
                1234 1232 1233 1231
                1234 1233 1231 1232
                1234 1233 1232 1231
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
