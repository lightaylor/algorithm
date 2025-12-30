package silver.level3.test_14501.v2;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            7
            3 10
            5 20
            1 10
            1 20
            2 15
            4 40
            2 200
            """;
        String expectedOutput = "45";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            10
            1 1
            1 2
            1 3
            1 4
            1 5
            1 6
            1 7
            1 8
            1 9
            1 10
            """;
        String expectedOutput = "55";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            10
            5 10
            5 9
            5 8
            5 7
            5 6
            5 10
            5 9
            5 8
            5 7
            5 6
            """;
        String expectedOutput = "20";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            10
            5 50
            4 40
            3 30
            2 20
            1 10
            1 10
            2 20
            3 30
            4 40
            5 50
            """;
        String expectedOutput = "90";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
