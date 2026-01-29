package baekjoon.gold.level5.test_1759.v2;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            4 6
            a t c i s w
            """;
        String expectedOutput = """
            acis
            acit
            aciw
            acst
            acsw
            actw
            aist
            aisw
            aitw
            astw
            cist
            cisw
            citw
            istw
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3 5
            a e i o u
            """;

        String expectedOutput = "";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
