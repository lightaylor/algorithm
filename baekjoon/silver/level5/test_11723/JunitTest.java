package silver.level5.test_11723;

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
                26
                add 1
                add 2
                check 1
                check 2
                check 3
                remove 2
                check 1
                check 2
                toggle 3
                check 1
                check 2
                check 3
                check 4
                all
                check 10
                check 20
                toggle 10
                remove 20
                check 10
                check 20
                empty
                check 1
                toggle 1
                check 1
                toggle 1
                check 1
                """;
        String expectedOutput = """
                1
                1
                0
                1
                0
                1
                0
                1
                0
                1
                1
                0
                0
                0
                1
                0
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
