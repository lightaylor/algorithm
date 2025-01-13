package bronze.level4.test_1264;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    
    @Test
    public void test_1() throws IOException {
        String input = """
            How are you today?
            Quite well, thank you, how about yourself?
            I live at number twenty four.
            #
            """;
        String expectedOutput = """
            7
            14
            9
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
