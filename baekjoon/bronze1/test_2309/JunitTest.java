package bronze1.test_2309;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                20
                7
                23
                19
                10
                15
                25
                8
                13
                """;
        String expectedOutput = """
                7
                8
                10
                13
                19
                20
                23
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                40
                40
                10
                10
                10
                10
                10
                10
                10
                """;
        String expectedOutput = """
                10
                10
                10
                10
                10
                10
                40
                """;

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        setIn(in);
        setOut(new PrintStream(out));

        return stdout.toString();
    }
}
