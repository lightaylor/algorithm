package util;

import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.BiFunction;
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

    public record Input<A, B>(A a, B b) {
    }

    public static <A, B, O> void assertSolution(
        O expected,
        Input<A, B> input,
        BiFunction<A, B, O> solution
    ) {
        O actual = solution.apply(input.a(), input.b());

        if (expected instanceof int[]) {
            Assert.assertArrayEquals((int[]) expected, (int[]) actual);
        } else {
            Assert.assertEquals(expected, actual);
        }
    }

    public static <I, O> void assertSolution(
        O expected,
        I input,
        Function<I, O> solution
    ) {
        O actual = solution.apply(input);
        Assert.assertEquals(expected, actual);
    }

}
