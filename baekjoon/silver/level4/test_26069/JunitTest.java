package silver.level4.test_26069;

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
                12
                bnb2011 chansol
                chansol chogahui05
                chogahui05 jthis
                jthis ChongChong
                jthis jyheo98
                jyheo98 lms0806
                lms0806 pichulia
                pichulia pjshwa
                pjshwa r4pidstart
                r4pidstart swoon
                swoon tony9402
                tony9402 bnb2011
                """;
        String expectedOutput = "10";

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
