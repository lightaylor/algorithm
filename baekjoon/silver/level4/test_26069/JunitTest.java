package baekjoon.silver.level4.test_26069;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
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
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
