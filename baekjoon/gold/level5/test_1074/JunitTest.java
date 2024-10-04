package gold.level5.test_1074;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "2 3 1";
        String expectedOutput = "11";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "3 7 7";
        String expectedOutput = "63";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = "1 0 0";
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = "4 7 7";
        String expectedOutput = "63";

        assertEquals(expectedOutput, test(input));
    }


    @Test
    public void test_5() throws IOException {
        String input = "10 511 511";
        String expectedOutput = "262143";

        assertEquals(expectedOutput, test(input));
    }


    @Test
    public void test_6() throws IOException {
        String input = "10 512 512";
        String expectedOutput = "786432";

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
