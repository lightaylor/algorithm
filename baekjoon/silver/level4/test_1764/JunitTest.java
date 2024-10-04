package silver.level4.test_1764;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                3 4
                ohhenrie
                charlie
                baesangwook
                obama
                baesangwook
                ohhenrie
                clinton
                """;
        String expectedOutput = """
                2
                baesangwook
                ohhenrie
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
