package baekjoon.gold.level1.test_9328;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            3
            5 17
            *****************
            .............**$*
            *B*A*P*C**X*Y*.X.
            *y*x*a*p**$*$**$*
            *****************
            cz
            5 11
            *.*********
            *...*...*x*
            *X*.*.*.*.*
            *$*...*...*
            ***********
            0
            7 7
            *ABCDE*
            X.....F
            W.$$$.G
            V.$$$.H
            U.$$$.J
            T.....K
            *SQPML*
            irony
            """;

        String expectedOutput = """
            3
            1
            0
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
