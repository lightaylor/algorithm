package baekjoon.silver.level5.test_3054;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
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
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
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
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
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
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
