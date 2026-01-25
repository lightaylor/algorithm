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

    public record Input3<A, B, C>(A a, B b, C c) {
    }

    public static <A, B, O> void assertSolution(
        O expected,
        Input<A, B> input,
        BiFunction<A, B, O> solution
    ) {
        O actual = solution.apply(input.a(), input.b());

        if (expected instanceof int[]) {
            Assert.assertArrayEquals((int[]) expected, (int[]) actual);
        } else if (expected instanceof Object[]) {
            Assert.assertArrayEquals((Object[]) expected, (Object[]) actual);
        } else {
            Assert.assertEquals(expected, actual);
        }
    }

    public static <A, B, C, O> void assertSolution(
        O expected,
        Input3<A, B, C> input,
        TriFunction<A, B, C, O> solution
    ) {
        O actual = solution.apply(input.a(), input.b(), input.c());

        if (expected instanceof int[]) {
            Assert.assertArrayEquals((int[]) expected, (int[]) actual);
        }  else if (expected instanceof Object[]) {
            Assert.assertArrayEquals((Object[]) expected, (Object[]) actual);
        } else {
            Assert.assertEquals(expected, actual);
        }
    }

    @FunctionalInterface
    public interface TriFunction<A, B, C, O> {
        O apply(A a, B b, C c);
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
