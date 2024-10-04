package silver.level3.test_20920;

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
                7 4
                apple
                ant
                sand
                apple
                append
                sand
                sand
                """;
        String expectedOutput = """
                sand
                apple
                append
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                12 5
                appearance
                append
                attendance
                swim
                swift
                swift
                swift
                mouse
                wallet
                mouse
                ice
                age
                """;
        String expectedOutput = """
                swift
                mouse
                appearance
                attendance
                append
                wallet
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
