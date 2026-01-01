package util;

import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Function;

public class TestUtil {
    public static String runAndCapture(String input, Runnable mainMethod) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        mainMethod.run();

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        return stdout.toString();
    }

    public static <I, O> void assertSolution(O expected, I input, Function<I, O> solutionMethod) {
        O actual = solutionMethod.apply(input);
        Assert.assertEquals(expected, actual);
    }
}
