package bronze.level2.test_11098;

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
            10 Iversen
            1000000 Nannskog
            2000000 Ronaldinho
            2
            1000000 Maradona
            999999 Batistuta
            """;
        String expectedOutput = """
            Ronaldinho
            Maradona
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
