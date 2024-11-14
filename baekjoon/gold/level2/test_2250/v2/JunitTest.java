package gold.level2.test_2250.v2;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            19
            1 2 3
            2 4 5
            3 6 7
            4 8 -1
            5 9 10
            6 11 12
            7 13 -1
            8 -1 -1
            9 14 15
            10 -1 -1
            11 16 -1
            12 -1 -1
            13 17 -1
            14 -1 -1
            15 18 -1
            16 -1 -1
            17 -1 19
            18 -1 -1
            19 -1 -1
            """;
        String expectedOutput = "3 18";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
