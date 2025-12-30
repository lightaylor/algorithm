package bronze.level1.test_11557.java;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            2
            3
            Yonsei 10
            Korea 10000000
            Ewha 20
            2
            Yonsei 1
            Korea 10000000
            """;
        String expectedOutput = """
            Korea
            Korea
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
