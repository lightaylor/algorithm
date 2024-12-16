package bronze.level1.test_11038;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5 2 4
                100
                90
                82
                70
                65
                5 2 4
                100
                90
                80
                75
                65
                3 1 2
                5000
                4000
                3000
                4 2 3
                10000
                10000
                8000
                8000
                4 2 3
                10000
                10000
                10000
                8000
                5 2 3
                100
                80
                68
                60
                45
                0 0 0
                """;
        String expectedOutput = """
                3
                4
                2
                2
                3
                2
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
