package silver.level5.test_1316;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "3\n" +
                "happy\n" +
                "new\n" +
                "year";
        String expectedOutput = "3";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = "4\n" +
                "aba\n" +
                "abab\n" +
                "abcabc\n" +
                "a";
        String expectedOutput = "1";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = "5\n" +
                "ab\n" +
                "aa\n" +
                "aca\n" +
                "ba\n" +
                "bb";
        String expectedOutput = "4";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = "1\n" +
                "z";
        String expectedOutput = "1";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = "9\n" +
                "aaa\n" +
                "aaazbz\n" +
                "babb\n" +
                "aazz\n" +
                "azbz\n" +
                "aabbaa\n" +
                "abacc\n" +
                "aba\n" +
                "zzaz";
        String expectedOutput = "2";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
