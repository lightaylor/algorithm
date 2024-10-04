package bronze.level3.test_2738;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input =
                "3 3\n" +
                "1 1 1\n" +
                "2 2 2\n" +
                "0 1 0\n" +
                "3 3 3\n" +
                "4 4 4\n" +
                "5 5 100";
        String expectedOutput =
                "4 4 4 \n" +
                "6 6 6 \n" +
                "5 6 100 \n";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
