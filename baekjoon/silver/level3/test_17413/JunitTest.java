package silver.level3.test_17413;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "baekjoon online judge";
        String expectedOutput = "noojkeab enilno egduj";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = "<open>tag<close>";
        String expectedOutput = "<open>gat<close>";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = "<ab cd>ef gh<ij kl>";
        String expectedOutput = "<ab cd>fe hg<ij kl>";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = "one1 two2 three3 4fourr 5five 6six";
        String expectedOutput = "1eno 2owt 3eerht rruof4 evif5 xis6";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = "<int><max>2147483647<long long><max>9223372036854775807";
        String expectedOutput = "<int><max>7463847412<long long><max>7085774586302733229";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_6() throws IOException {
        String input = "<problem>17413<is hardest>problem ever<end>";
        String expectedOutput = "<problem>31471<is hardest>melborp reve<end>";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_7() throws IOException {
        String input = "<   space   >space space space<    spa   c e>";
        String expectedOutput = "<   space   >ecaps ecaps ecaps<    spa   c e>";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
