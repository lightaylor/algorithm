package silver.level1.test_1149;

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
                3
                26 40 83
                49 60 57
                13 89 99
                """;
        String expectedOutput = "96";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                3
                1 100 100
                100 1 100
                100 100 1
                """;
        String expectedOutput = "3";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                3
                1 100 100
                100 100 100
                1 100 100
                """;
        String expectedOutput = "102";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                6
                30 19 5
                64 77 64
                15 19 97
                4 71 57
                90 86 84
                93 32 91
                """;
        String expectedOutput = "208";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException {
        String input = """
                8
                71 39 44
                32 83 55
                51 37 63
                89 29 100
                83 58 11
                65 13 15
                47 25 29
                60 66 19
                """;
        String expectedOutput = "253";

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
