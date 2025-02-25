package bronze.level4.test_5524;

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
            WatanabE
            ITO
            YamaMoto
            """;
        String expectedOutput = """
            watanabe
            ito
            yamamoto
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            4
            SUZUKI
            tanaka
            tAkAhAshi
            SuZuKi
            """;
        String expectedOutput = """
            suzuki
            tanaka
            takahashi
            suzuki
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
