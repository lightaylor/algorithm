package bronze5.test_2475;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "0 4 2 5 6";
        String expectedOutput = "1";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(System.out);

        assertEquals(expectedOutput, output.toString());
    }
}
