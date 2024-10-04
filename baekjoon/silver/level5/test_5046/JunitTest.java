package silver.level5.test_5046;

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
                3 1000 2 3
                200
                0 2 2
                300
                27 3 20
                """;
        String expected = "900";

        assertEquals(expected, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                5 2000 2 4
                300
                4 3 0 4
                450
                7 8 0 13
                """;
        String expected = "stay home";

        assertEquals(expected, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                3 1000 1 3
                250
                1 2 3
                """;
        String expected = "750";

        assertEquals(expected, test(input));
    }

    public String test(String input) throws IOException {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(System.out);

        return output.toString();
    }
}
