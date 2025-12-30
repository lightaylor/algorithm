package silver.level5.test_10814;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                3
                21 Junkyu
                21 Dohyun
                20 Sunyoung
                """;
        String expectedOutput = """
                20 Sunyoung
                21 Junkyu
                21 Dohyun
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                2
                9 a
                11 b
                """;
        String expectedOutput = """
                9 a
                11 b
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
