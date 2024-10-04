package silver.level3.test_14501;

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
                7
                3 10
                5 20
                1 10
                1 20
                2 15
                4 40
                2 200
                """;
        String expectedOutput = "45";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                10
                1 1
                1 2
                1 3
                1 4
                1 5
                1 6
                1 7
                1 8
                1 9
                1 10
                """;
        String expectedOutput = "55";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                10
                5 10
                5 9
                5 8
                5 7
                5 6
                5 10
                5 9
                5 8
                5 7
                5 6
                """;
        String expectedOutput = "20";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                10
                5 50
                4 40
                3 30
                2 20
                1 10
                1 10
                2 20
                3 30
                4 40
                5 50
                """;
        String expectedOutput = "90";

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
