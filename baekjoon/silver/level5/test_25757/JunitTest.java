package silver.level5.test_25757;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            7 Y
            lms0806
            lms0806
            exponentiale
            lms0806
            jthis
            lms0806
            leo020630
            """;
        String expectedOutput = "4";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            12 F
            lms0806
            powergee
            skeep194
            lms0806
            tony9402
            lms0806
            wider93
            lms0806
            mageek2guanaah
            lms0806
            jthis
            lms0806
            """;
        String expectedOutput = "3";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            12 O
            lms0806
            mageek2guanaah
            jthis
            lms0806
            exponentiale
            lms0806
            leo020630
            lms0806
            powergee
            lms0806
            skeep194
            lms0806
            """;
        String expectedOutput = "2";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
