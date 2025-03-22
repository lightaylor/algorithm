package silver.level3.test_9996;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            3
            a*d
            abcd
            anestonestod
            facebook
            """;
        String expectedOutput = """
            DA
            DA
            NE
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            6
            h*n
            huhovdjestvarnomozedocisvastan
            honijezakon
            atila
            je
            bio
            hun
            """;
        String expectedOutput = """
            DA
            DA
            NE
            NE
            NE
            DA
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
