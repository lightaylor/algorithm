package bronze.level2.test_24770;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                3 5
                1 3
                3 5
                4 7
                3 2
                3 5
                1 3
                4 7
                3 2
                3 6
                1 2
                2 4
                1 3
                4 10
                0 0
                """;
        String expectedOutput = """
                Buy 3 tickets for $5
                Buy 1 tickets for $3
                Buy 2 tickets for $4
                No suitable tickets offered
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
