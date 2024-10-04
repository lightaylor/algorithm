package silver.level5.test_3054;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "A";
        String expectedOutput = """
                ..#..
                .#.#.
                #.A.#
                .#.#.
                ..#..
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = "DOG";
        String expectedOutput = """
                ..#...#...*..
                .#.#.#.#.*.*.
                #.D.#.O.*.G.*
                .#.#.#.#.*.*.
                ..#...#...*..
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = "ABCD";
        String expectedOutput = """
                ..#...#...*...#..
                .#.#.#.#.*.*.#.#.
                #.A.#.B.*.C.*.D.#
                .#.#.#.#.*.*.#.#.
                ..#...#...*...#..
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
