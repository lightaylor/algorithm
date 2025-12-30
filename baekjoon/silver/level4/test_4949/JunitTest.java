package silver.level4.test_4949;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
               So when I die (the [first] I will see in (heaven) is a score list).
               [ first in ] ( first out ).
               Half Moon tonight (At least it is better than no Moon at all].
               A rope may form )( a trail in a maze.
               Help( I[m being held prisoner in a fortune cookie factory)].
               ([ (([( [ ] ) ( ) (( ))] )) ]).
                .
               .
               """;
        String expectedOutput = """
                yes
                yes
                no
                no
                no
                yes
                yes
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
