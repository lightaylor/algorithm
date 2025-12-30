package silver.level4.test_9012;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
               6
               (())())
               (((()())()
               (()())((()))
               ((()()(()))(((())))()
               ()()()()(()()())()
               (()((())()(
               """;
        String expectedOutput = """
                NO
                NO
                YES
                NO
                YES
                NO
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
               3
               ((
               ))
               ())(()
               """;
        String expectedOutput = """
                NO
                NO
                NO
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
