package baekjoon.gold.level4.test_2239;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            103000509
            002109400
            000704000
            300502006
            060000050
            700803004
            000401000
            009205800
            804000107
            """;
        String expectedOutput = """
            143628579
            572139468
            986754231
            391542786
            468917352
            725863914
            237481695
            619275843
            854396127
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
