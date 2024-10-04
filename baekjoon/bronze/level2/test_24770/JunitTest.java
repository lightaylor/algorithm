package bronze.level2.test_24770;

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
                3 5
                1 3
                3 5
                4 7
                3 2
                3 5
                1 3
                4 7
                3 2
                3 6
                1 2
                2 4
                1 3
                4 10
                0 0
                """;
        String expectedOutput = """
                Buy 3 tickets for $5
                Buy 1 tickets for $3
                Buy 2 tickets for $4
                No suitable tickets offered
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
