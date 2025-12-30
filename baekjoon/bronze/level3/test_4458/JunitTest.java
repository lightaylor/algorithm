package bronze.level3.test_4458;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5
            powdered Toast Man
            skeletor
            Electra Woman and Dyna Girl
            she-Ra Princess of Power
            darth Vader
            """;
        String expectedOutput = """
            Powdered Toast Man
            Skeletor
            Electra Woman and Dyna Girl
            She-Ra Princess of Power
            Darth Vader
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
