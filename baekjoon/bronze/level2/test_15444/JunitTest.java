package bronze.level2.test_15444;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                ABCDE
                """;
        String expectedOutput = """
                ***************
                *.**.**..*.**..
                *******..*.****
                *.**.**..*.**..
                *.*************
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                10
                ECADBECADB
                """;
        String expectedOutput = """
                ******************************
                *..*..*.**.**.**..*..*.**.**.*
                ****..****.********..****.****
                *..*..*.**.**.**..*..*.**.**.*
                *******.**************.*******
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
