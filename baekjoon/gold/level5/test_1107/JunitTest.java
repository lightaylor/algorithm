package gold.level5.test_1107;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5457
                3
                6 7 8
                """;
        String expectedOutput = "6";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                100
                5
                0 1 2 3 4
                """;
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                500000
                8
                0 2 3 4 6 7 8 9
                """;
        String expectedOutput = "11117";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                100
                3
                1 0 5
                """;
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }


    @Test
    public void test_5() throws IOException {
        String input = """
                14124
                0
                """;
        String expectedOutput = "5";

        assertEquals(expectedOutput, test(input));
    }


    @Test
    public void test_6() throws IOException {
        String input = """
                1
                9
                1 2 3 4 5 6 7 8 9
                """;
        String expectedOutput = "2";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_7() throws IOException {
        String input = """
                1
                9
                1 2 3 4 5 6 7 8 9
                """;
        String expectedOutput = "2";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_8() throws IOException {
        String input = """
                109900
                8
                2 3 4 5 6 7 8 9
                """;
        String expectedOutput = "106";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_9() throws IOException {
        String input = """
                1555
                3
                0 1 9
                """;
        String expectedOutput = "670";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_10() throws IOException {
        String input = """
                101
                0
                """;
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        return stdout.toString();
    }
}
