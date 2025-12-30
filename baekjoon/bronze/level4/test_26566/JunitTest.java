package bronze.level4.test_26566;

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
            8 4
            7 9
            9 2
            4 7
            841 108
            8 606
            """;
        String expectedOutput = """
            Whole pizza
            Whole pizza
            Slice of pizza
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
