package baekjoon.silver.level5.test_5635;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5
            Mickey 1 10 1991
            Alice 30 12 1990
            Tom 15 8 1993
            Jerry 18 9 1990
            Garfield 20 9 1990
            """;
        String expectedOutput = """
            Tom
            Jerry
            """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
