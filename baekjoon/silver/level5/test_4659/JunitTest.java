package silver.level5.test_4659;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            a
            tv
            ptoui
            bontres
            zoggax
            wiinq
            eep
            houctuh
            end
            """;
        String expectedOutput = """
            <a> is acceptable.
            <tv> is not acceptable.
            <ptoui> is not acceptable.
            <bontres> is not acceptable.
            <zoggax> is not acceptable.
            <wiinq> is not acceptable.
            <eep> is acceptable.
            <houctuh> is acceptable.
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
