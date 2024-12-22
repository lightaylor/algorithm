package gold.level3.test_16947.v3;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            4
            1 3
            4 3
            4 2
            1 2
            """;
        String expectedOutput = "0 0 0 0";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            6
            1 2
            3 4
            6 4
            2 3
            1 3
            3 5
            """;
        String expectedOutput = "0 0 0 1 1 2";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            51
            1 2
            2 3
            3 4
            4 5
            5 6
            6 7
            7 8
            8 9
            9 10
            10 11
            11 12
            12 13
            13 14
            14 15
            15 16
            16 17
            17 18
            18 19
            19 20
            20 21
            21 22
            22 23
            23 24
            24 25
            25 26
            26 27
            27 28
            28 29
            29 30
            30 31
            31 32
            32 33
            33 34
            34 35
            35 36
            36 37
            37 38
            38 39
            39 40
            40 41
            41 42
            42 43
            43 1
            11 44
            44 45
            45 46
            46 47
            34 48
            48 49
            49 50
            50 51
            """;
        String expectedOutput = "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 2 3 4 1 2 3 4";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            38
            1 2
            2 3
            3 4
            4 5
            5 6
            6 1
            1 7
            7 8
            8 9
            9 10
            10 11
            11 12
            12 13
            13 14
            14 15
            15 16
            16 17
            17 18
            18 19
            19 20
            20 21
            21 22
            22 23
            23 24
            24 25
            25 26
            26 27
            27 28
            28 29
            29 30
            30 31
            31 32
            32 33
            33 34
            34 35
            35 36
            36 37
            37 38
            """;
        String expectedOutput = "0 0 0 0 0 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            12
            1 3
            3 4
            4 5
            5 6
            6 7
            7 8
            8 4
            2 3
            7 9
            9 12
            7 10
            10 11
            """;
        String expectedOutput = "2 2 1 0 0 0 0 0 1 1 2 2";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
