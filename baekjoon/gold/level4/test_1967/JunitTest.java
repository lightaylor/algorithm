package gold.level4.test_1967;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            12
            1 2 3
            1 3 2
            2 4 5
            3 5 11
            3 6 9
            4 7 1
            4 8 7
            5 9 15
            5 10 4
            6 11 6
            6 12 10
            """;
        String expectedOutput = "45";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
