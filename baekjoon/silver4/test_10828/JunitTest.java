package silver4.test_10828;

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
                14
                push 1
                push 2
                top
                size
                empty
                pop
                pop
                pop
                size
                empty
                pop
                push 3
                empty
                top
                """;
        String expectedOutput = """
                2
                2
                0
                2
                1
                -1
                0
                1
                -1
                0
                3
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                7
                pop
                top
                push 123
                top
                pop
                top
                pop
                """;
        String expectedOutput = """
                -1
                -1
                123
                123
                -1
                -1
                """;

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
