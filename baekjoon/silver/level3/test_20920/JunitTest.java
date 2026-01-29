package baekjoon.silver.level3.test_20920;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
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
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
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
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
