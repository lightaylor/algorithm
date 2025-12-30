package gold.level1.test_13460;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5 5
            #####
            #..B#
            #.#.#
            #RO.#
            #####
            """;

        String expectedOutput = "1";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            7 7
            #######
            #...RB#
            #.#####
            #.....#
            #####.#
            #O....#
            #######
            """;

        String expectedOutput = "5";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            7 7
            #######
            #..R#B#
            #.#####
            #.....#
            #####.#
            #O....#
            #######
            """;

        String expectedOutput = "5";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            10 10
            ##########
            #R#...##B#
            #...#.##.#
            #####.##.#
            #......#.#
            #.######.#
            #.#....#.#
            #.#.#.#..#
            #...#.O#.#
            ##########
            """;

        String expectedOutput = "-1";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            3 7
            #######
            #R.O.B#
            #######
            """;

        String expectedOutput = "1";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_6() throws IOException {
        String input = """
            10 10
            ##########
            #R#...##B#
            #...#.##.#
            #####.##.#
            #......#.#
            #.######.#
            #.#....#.#
            #.#.##...#
            #O..#....#
            ##########
            """;

        String expectedOutput = "7";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_7() throws IOException {
        String input = """
            3 10
            ##########
            #.O....RB#
            ##########
            """;

        String expectedOutput = "-1";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
