package baekjoon.bronze.level1.test_6996;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            3
            blather reblath
            maryland landam
            bizarre brazier
            """;
        String expectedOutput = """
            blather & reblath are anagrams.
            maryland & landam are NOT anagrams.
            bizarre & brazier are anagrams.
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
