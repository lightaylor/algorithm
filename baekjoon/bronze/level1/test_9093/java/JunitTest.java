package bronze.level1.test_9093.java;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            2
            I am happy today
            We want to win the first prize
            """;
        String expectedOutput = """
            I ma yppah yadot
            eW tnaw ot niw eht tsrif ezirp
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
