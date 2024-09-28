package bronze1.test_28702;

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
                Fizz
                Buzz
                11
                """;
        String expectedOutput = "Fizz";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                980803
                980804
                FizzBuzz
                """;
        String expectedOutput = "980806";

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
