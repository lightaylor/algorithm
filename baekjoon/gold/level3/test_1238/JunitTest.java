package gold.level3.test_1238;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            4 8 2
            1 2 4
            1 3 2
            1 4 7
            2 1 1
            2 3 5
            3 1 2
            3 4 4
            4 2 3
            """;
        String expectedOutput = "10";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
