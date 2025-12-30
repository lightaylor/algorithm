package gold.level5.test_17609;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            7
            abba
            summuus
            xabba
            xabbay
            comcom
            comwwmoc
            comwwtmoc
            """;
        String expectedOutput = """
            0
            1
            1
            2
            2
            0
            1
            """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
