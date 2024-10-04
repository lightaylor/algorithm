package gold.level5.test_1916;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                8
                1 2 2
                1 3 3
                1 4 1
                1 5 10
                2 4 2
                3 4 1
                3 5 1
                4 5 3
                1 5
                """;
        String expectedOutput = "4";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                3
                4
                1 2 10
                1 2 50
                2 3 1
                2 3 10
                1 3
                """;
        String expectedOutput = "11";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                5
                4
                1 2 1
                2 3 1
                1 4 1
                4 5 1
                1 5
                """;
        String expectedOutput = "2";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
