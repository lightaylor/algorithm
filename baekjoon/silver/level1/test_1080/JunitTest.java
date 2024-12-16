package silver.level1.test_1080;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3 4
            0000
            0010
            0000
            1001
            1011
            1001
            """;
        String expectedOutput = "2";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3 3
            111
            111
            111
            000
            000
            000
            """;
        String expectedOutput = "1";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            1 1
            1
            0
            """;
        String expectedOutput = "-1";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            18 3
            001
            100
            100
            000
            011
            010
            100
            100
            010
            010
            010
            110
            101
            101
            000
            110
            000
            110
            001
            100
            011
            000
            100
            010
            011
            100
            101
            101
            010
            001
            010
            010
            111
            110
            111
            001
            """;
        String expectedOutput = "7";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
