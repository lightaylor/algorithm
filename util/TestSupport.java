package util;

import org.junit.Assert;

import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TestSupport {
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
    public record Input5<A, B, C, D, E>(A a, B b, C c, D d, E e) {

    }
    @FunctionalInterface
    public interface TriFunction<A, B, C, O> {

        O apply(A a, B b, C c);
    }
    @FunctionalInterface
    public interface PentaFunction<A, B, C, D, E, O> {

        O apply(A a, B b, C c, D d, E e);
    }

    public static <I> void assertSolution(
        int expected,
        I input,
        Function<I, Integer> solution
    ) {
        int actual = solution.apply(input);
        Assert.assertEquals(expected, actual);
    }

    public static <I, O> void assertSolution(
        O expected,
        I input,
        Function<I, O> solution
    ) {
        O actual = solution.apply(input);

        switch (expected) {
            case int[] ints -> Assert.assertArrayEquals(ints, (int[]) actual);
            case long[] longs ->
                Assert.assertArrayEquals(longs, (long[]) actual);
            case Object[] objects ->
                Assert.assertArrayEquals(objects, (Object[]) actual);
            case null, default -> Assert.assertEquals(expected, actual);
        }
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
        } else if (expected instanceof Object[]) {
            Assert.assertArrayEquals((Object[]) expected, (Object[]) actual);
        } else {
            Assert.assertEquals(expected, actual);
        }
    }

    public static <A, B, C, D, E, O> void assertSolution(
        O expected,
        Input5<A, B, C, D, E> input,
        PentaFunction<A, B, C, D, E, O> solution
    ) {
        O actual = solution.apply(input.a(), input.b(), input.c(), input.d(), input.e());

        if (expected instanceof int[]) {
            Assert.assertArrayEquals((int[]) expected, (int[]) actual);
        } else if (expected instanceof Object[]) {
            Assert.assertArrayEquals((Object[]) expected, (Object[]) actual);
        } else {
            Assert.assertEquals(expected, actual);
        }
    }
}
