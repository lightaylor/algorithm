package bronze.level3.test_2566;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "3 23 85 34 17 74 25 52 65\n" +
                "10 7 39 42 88 52 14 72 63\n" +
                "87 42 18 78 53 45 18 84 53\n" +
                "34 28 64 85 12 16 75 36 55\n" +
                "21 77 45 35 28 75 90 76 1\n" +
                "25 87 65 15 28 11 37 28 74\n" +
                "65 27 75 41 7 89 78 64 39\n" +
                "47 47 70 45 23 65 3 41 44\n" +
                "87 13 82 38 31 12 29 29 80";
        String expected = "90\n5 7";

        assertEquals(expected, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input =
                "9 9 9 9 9 9 9 9 9\n" +
                "9 9 9 9 9 9 9 9 9\n" +
                "9 9 9 9 9 9 9 9 9\n" +
                "9 9 9 9 9 9 9 9 9\n" +
                "9 9 9 9 9 9 9 9 9\n" +
                "9 9 9 9 9 9 9 9 9\n" +
                "9 9 9 9 9 9 9 9 9\n" +
                "9 9 9 9 9 9 9 9 9\n" +
                "9 9 9 9 9 9 9 9 10";
        String expected = "10\n9 9";

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
