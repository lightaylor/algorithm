package gold.level4.test_10830;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            2 5
            1 2
            3 4
            """;
        String expectedOutput = """
            69 558
            337 406
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3 3
            1 2 3
            4 5 6
            7 8 9
            """;
        String expectedOutput = """
            468 576 684
            62 305 548
            656 34 412
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            5 10
            1 0 0 0 1
            1 0 0 0 1
            1 0 0 0 1
            1 0 0 0 1
            1 0 0 0 1
            """;
        String expectedOutput = """
            512 0 0 0 512
            512 0 0 0 512
            512 0 0 0 512
            512 0 0 0 512
            512 0 0 0 512
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
