package bronze.level3.test_2720;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input =
                "3\n" +
                "124\n" +
                "25\n" +
                "194";
        String expectedOutput =
                "4 2 0 4\n" +
                "1 0 0 0\n" +
                "7 1 1 4\n";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input =
                "5\n" +
                "500\n" +
                "499\n" +
                "498\n" +
                "497\n" +
                "496";
        String expectedOutput =
                "20 0 0 0\n" +
                "19 2 0 4\n" +
                "19 2 0 3\n" +
                "19 2 0 2\n" +
                "19 2 0 1\n";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input =
                "2\n" +
                "15\n" +
                "35";
        String expectedOutput =
                "0 1 1 0\n" +
                "1 1 0 0\n";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
