package bronze.level2.test_1371.java;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            english is a west germanic
            language originating in england
            and is the first language for
            most people in the united
            kingdom the united states
            canada australia new zealand
            ireland and the anglophone
            caribbean it is used
            extensively as a second
            language and as an official
            language throughout the world
            especially in common wealth
            countries and in many
            international organizations
            """;
        String expectedOutput = "a";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = "baekjoon online judge";
        String expectedOutput = "eno";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = "abc a";
        String expectedOutput = "a";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            abc
            ab
            """;
        String expectedOutput = "ab";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            amanda forsaken bloomer meditated gauging knolls
            betas neurons integrative expender commonalities
            latins antidotes crutched bandwidths begetting
            prompting dog association athenians christian ires
            pompousness percolating figured bagatelles bursted
            ninth boyfriends longingly muddlers prudence puns
            groove deliberators charter collectively yorks
            daringly antithesis inaptness aerosol carolinas
            payoffs chumps chirps gentler inexpressive morales
            """;
        String expectedOutput = "e";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
