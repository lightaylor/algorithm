package baekjoon.silver.level3.test_9375;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
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
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
