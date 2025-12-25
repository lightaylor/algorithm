package silver.level3.test_22233;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            5 2
            map
            set
            dijkstra
            floyd
            os
            map,dijkstra
            map,floyd
            """;
        String expectedOutput = """
            3
            2
            """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            2 2
            gt26cw
            1211train
            kiwoom,lottegiant
            kbo
            """;
        String expectedOutput = """
            2
            2
            """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
