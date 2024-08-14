package silver5.test_1543;

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
                ababababa
                aba
                """;
        String expected = "2";

        assertEquals(expected, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                a a a a a
                a a
                """;
        String expected = "2";

        assertEquals(expected, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                ababababa
                ababa
                """;
        String expected = "1";

        assertEquals(expected, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                aaaaaaa
                aa
                """;
        String expected = "3";

        assertEquals(expected, test(input));
    }

    @Test
    public void test_5() throws IOException {
        String input = """
                aabb
                ab
                """;
        String expected = "1";

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
