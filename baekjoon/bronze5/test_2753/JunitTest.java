package bronze5.test_2753;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "2000";
        String expected = "1";

        assertEquals(expected, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "1999";
        String expected = "0";

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
