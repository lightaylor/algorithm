package silver.level3.test_20291;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            8
            sbrus.txt
            spc.spc
            acm.icpc
            korea.icpc
            sample.txt
            hello.world
            sogang.spc
            example.txt
            """;
        String expectedOutput = """
            icpc 2
            spc 2
            txt 3
            world 1
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
