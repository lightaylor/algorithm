package bronze.level3.test_11586;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            8
            OOOOOOOO
            OKKOOEEO
            OKKOOEEO
            OOOSSOOO
            OOOSSOOO
            OAOOOOAO
            OOAAAAOO
            OOOOOOOO
            3
            """;
        String expectedOutput = """
            OOOOOOOO
            OOAAAAOO
            OAOOOOAO
            OOOSSOOO
            OOOSSOOO
            OKKOOEEO
            OKKOOEEO
            OOOOOOOO
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
