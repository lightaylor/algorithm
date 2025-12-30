package silver.level1.test_1991.v3;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            7
            A B C
            B D .
            C E F
            E . .
            F . G
            D . .
            G . .
            """;
        String expectedOutput = """
            ABDCEFG
            DBAECFG
            DBEGFCA
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
