package silver.level4.test_10828;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                14
                push 1
                push 2
                top
                size
                empty
                pop
                pop
                pop
                size
                empty
                pop
                push 3
                empty
                top
                """;
        String expectedOutput = """
                2
                2
                0
                2
                1
                -1
                0
                1
                -1
                0
                3
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                7
                pop
                top
                push 123
                top
                pop
                top
                pop
                """;
        String expectedOutput = """
                -1
                -1
                123
                123
                -1
                -1
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
