package bronze.level4.test_25304;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input =
                "260000\n" +
                "4\n" +
                "20000 5\n" +
                "30000 2\n" +
                "10000 6\n" +
                "5000 8";
        String expectedOutput = "Yes";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input =
                "250000\n" +
                "4\n" +
                "20000 5\n" +
                "30000 2\n" +
                "10000 6\n" +
                "5000 8";
        String expectedOutput = "No";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
