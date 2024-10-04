package silver4.test_4949;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.System.*;
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
        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        setIn(in);
        setOut(new PrintStream(out));

        return stdout.toString();
    }
}
