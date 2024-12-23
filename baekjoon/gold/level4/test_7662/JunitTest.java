package gold.level4.test_7662;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            2
            7
            I 16
            I -5643
            D -1
            D 1
            D 1
            I 123
            D -1
            9
            I -45
            I 653
            D 1
            I -642
            I 45
            I 97
            D 1
            D -1
            I 333
            """;
        String expectedOutput = """
            EMPTY
            333 -45
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
