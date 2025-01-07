package bronze.level2.test_1100;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            .F.F...F
            F...F.F.
            ...F.F.F
            F.F...F.
            .F...F..
            F...F.F.
            .F.F.F.F
            ..FF..F.
            """;
        String expectedOutput = "1";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            ........
            ........
            ........
            ........
            ........
            ........
            ........
            ........
            """;
        String expectedOutput = "0";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            FFFFFFFF
            """;
        String expectedOutput = "32";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            ........
            ..F.....
            .....F..
            .....F..
            ........
            ........
            .......F
            .F......
            """;
        String expectedOutput = "2";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
