package baekjoon.silver.level5.test_1181;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                13
                but
                i
                wont
                hesitate
                no
                more
                no
                more
                it
                cannot
                wait
                im
                yours
                """;
        String expectedOutput = """
                i
                im
                it
                no
                but
                more
                wait
                wont
                yours
                cannot
                hesitate
                """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
