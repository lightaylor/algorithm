package bronze1.test_11038;

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
                5 2 4
                100
                90
                82
                70
                65
                5 2 4
                100
                90
                80
                75
                65
                3 1 2
                5000
                4000
                3000
                4 2 3
                10000
                10000
                8000
                8000
                4 2 3
                10000
                10000
                10000
                8000
                5 2 3
                100
                80
                68
                60
                45
                0 0 0
                """;
        String expectedOutput = """
                3
                4
                2
                2
                3
                2
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
