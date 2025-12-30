package bronze.level2.test_6502;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            38 40 60
            35 20 70
            50 60 80
            0
            """;
        String expectedOutput = """
            Pizza 1 fits on the table.
            Pizza 2 does not fit on the table.
            Pizza 3 fits on the table.
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
