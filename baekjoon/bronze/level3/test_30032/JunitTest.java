package bronze.level3.test_30032;

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
                2 1
                db
                qp
                """;
        String expectedOutput = """
                qp
                db
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                2 1
                qp
                db
                """;
        String expectedOutput = """
                db
                qp
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                3 2
                bdb
                dbd
                bdb
                """;
        String expectedOutput = """
                dbd
                bdb
                dbd
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                3 2
                ddd
                bbb
                ddd
                """;
        String expectedOutput = """
                bbb
                ddd
                bbb
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
