package bronze.level2.test_2750;

import bronze.level2.test_2581.Main;
import common.TestUtil;
import org.junit.Test;

import java.io.*;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                5
                2
                3
                4
                1
                """;
        String expectedOutput = """
                1
                2
                3
                4
                5
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
