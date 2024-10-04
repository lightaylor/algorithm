package silver.level3.test_9375;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                2
                3
                hat headgear
                sunglasses eyewear
                turban headgear
                3
                mask face
                sunglasses face
                makeup face
                """;
        String expectedOutput = """
                5
                3
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
