package bronze.level3.test_5073;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "7 7 7\n" +
                "6 5 4\n" +
                "3 2 5\n" +
                "6 2 6\n" +
                "0 0 0";
        String expectedOutput = "Equilateral\n" +
                "Scalene\n" +
                "Invalid\n" +
                "Isosceles\n";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
