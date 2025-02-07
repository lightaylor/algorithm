package bronze.level1.test_2693;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            4
            1 2 3 4 5 6 7 8 9 1000
            338 304 619 95 343 496 489 116 98 127
            931 240 986 894 826 640 965 833 136 138
            940 955 364 188 133 254 501 122 768 408
            """;
        String expectedOutput = """
            8
            489
            931
            768
            """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
