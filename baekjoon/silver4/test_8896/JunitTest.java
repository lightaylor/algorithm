package silver4.test_8896;

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
               3
               5
               RPSSSPR
               SSRPRPS
               PRSSRSP
               RRRPSPP
               SSSSSRP
               4
               RPSPSPSPRPRPSR
               SPSSRRRSSRPRRR
               RSPRPPPPSSRPSR
               PRRSSSRRPRSRRR
               3
               SPPPSS
               SPRRRR
               SSSSPP
               """;
        String expectedOutput = """
                2
                0
                3
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
