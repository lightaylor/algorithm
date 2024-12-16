package gold.level4.test_16929.v1;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3 4
            AAAA
            ABCA
            AAAA
            """;
        String expectedOutput = "Yes";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3 4
            AAAA
            ABCA
            AADA
            """;
        String expectedOutput = "No";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            4 4
            YYYR
            BYBY
            BBBY
            BBBY
            """;
        String expectedOutput = "Yes";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            7 6
            AAAAAB
            ABBBAB
            ABAAAB
            ABABBB
            ABAAAB
            ABBBAB
            AAAAAB
            """;
        String expectedOutput = "Yes";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            2 13
            ABCDEFGHIJKLM
            NOPQRSTUVWXYZ
            """;
        String expectedOutput = "No";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
    
}
