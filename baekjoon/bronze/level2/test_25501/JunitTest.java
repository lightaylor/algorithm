package bronze.level2.test_25501;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                AAA
                ABBA
                ABABA
                ABCA
                PALINDROME
                """;
        String expectedOutput = """
                1 2
                1 3
                1 3
                0 2
                0 1
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
