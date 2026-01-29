package baekjoon.silver.level4.test_10845;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                15
                push 1
                push 2
                front
                back
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
                front
                """;
        String expectedOutput = """
                1
                2
                2
                0
                1
                2
                -1
                0
                1
                -1
                0
                3
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
