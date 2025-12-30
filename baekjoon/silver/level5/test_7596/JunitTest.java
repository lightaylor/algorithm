package silver.level5.test_7596;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                10
                Forever
                Take A Bow
                Always On My Mind
                Lollipop
                Love In This Club
                No Air
                Sweet About Me
                Party People
                Mercy
                American Boy
                8
                Partita
                Air on a 'G' string
                Sinfonia in D
                Jesu, joy of man's desiring
                Arioso
                Violin Concerto in A Minor
                Brandenburg Concerto 2
                Concerto for 2 violins
                0
                """;
        String expectedOutput = """
                1
                Always On My Mind
                American Boy
                Forever
                Lollipop
                Love In This Club
                Mercy
                No Air
                Party People
                Sweet About Me
                Take A Bow
                2
                Air on a 'G' string
                Arioso
                Brandenburg Concerto 2
                Concerto for 2 violins
                Jesu, joy of man's desiring
                Partita
                Sinfonia in D
                Violin Concerto in A Minor
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
