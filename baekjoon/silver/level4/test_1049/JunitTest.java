package silver.level4.test_1049;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            4 2
            12 3
            15 4
            """;
        String expectedOutput = "12";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """ 
            10 3
            20 8
            40 7
            60 4
            """;
        String expectedOutput = "36";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            15 1
            100 40
            """;
        String expectedOutput = "300";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            17 1
            12 3
            """;
        String expectedOutput = "36";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void test_5() throws IOException {
        String input = """
            7 2
            10 3
            12 2
            """;
        String expectedOutput = "12";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void test_6() throws IOException {
        String input = """
            9 16
            21 25
            77 23
            23 88
            95 43
            96 19
            59 36
            80 13
            51 24
            15 8
            25 61
            21 22
            3 9
            68 68
            67 100
            83 98
            96 57
            """;
        String expectedOutput = "6";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
