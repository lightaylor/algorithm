package bronze.level1.test_4344;

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
            5 50 50 70 80 100
            7 100 95 90 80 70 60 50
            3 70 90 80
            3 70 90 81
            9 100 99 98 97 96 95 94 93 91
            """;
        String expectedOutput = """
            40.000%
            57.143%
            33.333%
            66.667%
            55.556%
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
