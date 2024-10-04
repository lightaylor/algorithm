package silver.level4.test_14425;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5 11
                baekjoononlinejudge
                startlink
                codeplus
                sundaycoding
                codingsh
                baekjoon
                codeplus
                codeminus
                startlink
                starlink
                sundaycoding
                codingsh
                codinghs
                sondaycoding
                startrink
                icerink""";
        String expectedOutput = "4";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
