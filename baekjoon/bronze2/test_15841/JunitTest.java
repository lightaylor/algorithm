package bronze2.test_15841;

import org.junit.Test;

import java.io.*;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "1\n4\n6\n11\n-1";
        String expectedOutput = "Hour 1: 1 cow(s) affected\nHour 4: 3 cow(s) affected\nHour 6: 8 cow(s) affected\nHour 11: 89 cow(s) affected\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "2\n3\n5\n6\n-1";
        String expectedOutput = "Hour 2: 1 cow(s) affected\nHour 3: 2 cow(s) affected\nHour 5: 5 cow(s) affected\nHour 6: 8 cow(s) affected\n";

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
