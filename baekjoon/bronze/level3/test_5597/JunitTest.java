package bronze.level3.test_5597;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input =
                "3\n" +
                "1\n" +
                "4\n" +
                "5\n" +
                "7\n" +
                "9\n" +
                "6\n" +
                "10\n" +
                "11\n" +
                "12\n" +
                "13\n" +
                "14\n" +
                "15\n" +
                "16\n" +
                "17\n" +
                "18\n" +
                "19\n" +
                "20\n" +
                "21\n" +
                "22\n" +
                "23\n" +
                "24\n" +
                "25\n" +
                "26\n" +
                "27\n" +
                "28\n" +
                "29\n" +
                "30";
        String expectedOutput = "2\n8\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input =
                "9\n" +
                "30\n" +
                "6\n" +
                "12\n" +
                "10\n" +
                "20\n" +
                "21\n" +
                "11\n" +
                "7\n" +
                "5\n" +
                "28\n" +
                "4\n" +
                "18\n" +
                "29\n" +
                "17\n" +
                "19\n" +
                "27\n" +
                "13\n" +
                "16\n" +
                "26\n" +
                "14\n" +
                "23\n" +
                "22\n" +
                "15\n" +
                "3\n" +
                "1\n" +
                "24\n" +
                "25";
        String expectedOutput = "2\n8\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input =
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "11\n" +
                "12\n" +
                "13\n" +
                "14\n" +
                "15\n" +
                "16\n" +
                "17\n" +
                "18\n" +
                "19\n" +
                "20\n" +
                "21\n" +
                "22\n" +
                "23\n" +
                "24\n" +
                "25\n" +
                "26\n" +
                "27\n" +
                "28";
        String expectedOutput = "29\n30\n";

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
