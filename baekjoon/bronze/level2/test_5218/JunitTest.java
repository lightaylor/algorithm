package bronze.level2.test_5218;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5
            AAAA ABCD
            ABCD AAAA
            DARK LOKI
            STRONG THANOS
            DEADLY ULTIMO
            """;
        String expectedOutput = """
            Distances: 0 1 2 3
            Distances: 0 25 24 23
            Distances: 8 14 19 24
            Distances: 1 14 9 25 1 12
            Distances: 17 7 19 5 1 16
            """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
