package baekjoon.silver.level3.test_1431;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5
            ABCD
            145C
            A
            A910
            Z321
            """;
        String expectedOutput = """
            A
            ABCD
            Z321
            145C
            A910
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            2
            Z19
            Z20
            """;
        String expectedOutput = """
            Z20
            Z19
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            4
            34H2BJS6N
            PIM12MD7RCOLWW09
            PYF1J14TF
            FIPJOTEA5
            """;
        String expectedOutput = """
            FIPJOTEA5
            PYF1J14TF
            34H2BJS6N
            PIM12MD7RCOLWW09
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            5
            ABCDE
            BCDEF
            ABCDA
            BAAAA
            ACAAA
            """;
        String expectedOutput = """
            ABCDA
            ABCDE
            ACAAA
            BAAAA
            BCDEF
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));

        assertEquals(expectedOutput, actualOutput);
    }

}
