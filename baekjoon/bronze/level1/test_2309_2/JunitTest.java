package bronze.level1.test_2309_2;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                20
                7
                23
                19
                10
                15
                25
                8
                13
                """;
        String expectedOutput = """
                7
                8
                10
                13
                19
                20
                23
                """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                40
                40
                10
                10
                10
                10
                10
                10
                10
                """;
        String expectedOutput = """
                10
                10
                10
                10
                10
                10
                40
                """;
        
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
