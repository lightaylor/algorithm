package bronze.level1.test_10798;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                ABCDE
                abcde
                01234
                FGHIJ
                fghij
                """;
        String expectedOutput = "Aa0FfBb1GgCc2HhDd3IiEe4Jj";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                AABCDD
                afzz
                09121
                a8EWg6
                P5h3kx
                """;
        String expectedOutput = "Aa0aPAf985Bz1EhCz2W3D1gkD6x";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
