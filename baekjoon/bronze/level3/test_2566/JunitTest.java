package bronze.level3.test_2566;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                3 23 85 34 17 74 25 52 65
                10 7 39 42 88 52 14 72 63
                87 42 18 78 53 45 18 84 53
                34 28 64 85 12 16 75 36 55
                21 77 45 35 28 75 90 76 1
                25 87 65 15 28 11 37 28 74
                65 27 75 41 7 89 78 64 39
                47 47 70 45 23 65 3 41 44
                87 13 82 38 31 12 29 29 80
                """;
        String expectedOutput = "90\n5 7";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                9 9 9 9 9 9 9 9 9
                9 9 9 9 9 9 9 9 9
                9 9 9 9 9 9 9 9 9
                9 9 9 9 9 9 9 9 9
                9 9 9 9 9 9 9 9 9
                9 9 9 9 9 9 9 9 9
                9 9 9 9 9 9 9 9 9
                9 9 9 9 9 9 9 9 9
                9 9 9 9 9 9 9 9 10
                """;
        String expectedOutput = "10\n9 9";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
