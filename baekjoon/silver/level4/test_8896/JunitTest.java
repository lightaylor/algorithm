package baekjoon.silver.level4.test_8896;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
               3
               5
               RPSSSPR
               SSRPRPS
               PRSSRSP
               RRRPSPP
               SSSSSRP
               4
               RPSPSPSPRPRPSR
               SPSSRRRSSRPRRR
               RSPRPPPPSSRPSR
               PRRSSSRRPRSRRR
               3
               SPPPSS
               SPRRRR
               SSSSPP
               """;
        String expectedOutput = """
                2
                0
                3
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
