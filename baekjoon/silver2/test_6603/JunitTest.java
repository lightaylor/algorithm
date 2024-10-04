package silver2.test_6603;

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
                7 1 2 3 4 5 6 7
                8 1 2 3 5 8 13 21 34
                0
                """;
        String expectedOutput = """
                1 2 3 4 5 6\s
                1 2 3 4 5 7\s
                1 2 3 4 6 7\s
                1 2 3 5 6 7\s
                1 2 4 5 6 7\s
                1 3 4 5 6 7\s
                2 3 4 5 6 7\s
                                
                1 2 3 5 8 13\s
                1 2 3 5 8 21\s
                1 2 3 5 8 34\s
                1 2 3 5 13 21\s
                1 2 3 5 13 34\s
                1 2 3 5 21 34\s
                1 2 3 8 13 21\s
                1 2 3 8 13 34\s
                1 2 3 8 21 34\s
                1 2 3 13 21 34\s
                1 2 5 8 13 21\s
                1 2 5 8 13 34\s
                1 2 5 8 21 34\s
                1 2 5 13 21 34\s
                1 2 8 13 21 34\s
                1 3 5 8 13 21\s
                1 3 5 8 13 34\s
                1 3 5 8 21 34\s
                1 3 5 13 21 34\s
                1 3 8 13 21 34\s
                1 5 8 13 21 34\s
                2 3 5 8 13 21\s
                2 3 5 8 13 34\s
                2 3 5 8 21 34\s
                2 3 5 13 21 34\s
                2 3 8 13 21 34\s
                2 5 8 13 21 34\s
                3 5 8 13 21 34\s
                
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
