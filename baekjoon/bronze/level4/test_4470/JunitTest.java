package bronze.level4.test_4470;

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
            Lionel Cosgrove
            Alice
            Columbus and Tallahassee
            Shaun and Ed
            Fido
            """;
        String expectedOutput = """
            1. Lionel Cosgrove
            2. Alice
            3. Columbus and Tallahassee
            4. Shaun and Ed
            5. Fido
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
