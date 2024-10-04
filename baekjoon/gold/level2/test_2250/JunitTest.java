package gold.level2.test_2250;

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
                19
                1 2 3
                2 4 5
                3 6 7
                4 8 -1
                5 9 10
                6 11 12
                7 13 -1
                8 -1 -1
                9 14 15
                10 -1 -1
                11 16 -1
                12 -1 -1
                13 17 -1
                14 -1 -1
                15 18 -1
                16 -1 -1
                17 -1 19
                18 -1 -1
                19 -1 -1
                """;
        String expectedOutput = "3 18";

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
