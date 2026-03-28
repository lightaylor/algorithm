package util;

import org.junit.Assert;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestSupport {
    public static String runAndCapture(String input, Runnable mainMethod) throws UnsupportedEncodingException {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

            try (PrintStream ps = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
                System.setOut(ps);
                mainMethod.run();
            }

            return buffer.toString(StandardCharsets.UTF_8);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    public record Input<A, B>(A a, B b) {
    }

    public record Input3<A, B, C>(A a, B b, C c) {
    }

    public record Input4<A, B, C, D>(A a, B b, C c, D d) {
    }

    public record Input5<A, B, C, D, E>(A a, B b, C c, D d, E e) {
    }

    @FunctionalInterface
    public interface TriFunction<A, B, C, O> {
        O apply(A a, B b, C c);
    }

    @FunctionalInterface
    public interface QuadFunction<A, B, C, D, O> {
        O apply(A a, B b, C c, D d);
    }

    @FunctionalInterface
    public interface PentaFunction<A, B, C, D, E, O> {
        O apply(A a, B b, C c, D d, E e);
    }

    public static <I, O> void assertSolution(O expected, I input, Function<I, O> solution) {
        assertSolution(expected, () -> solution.apply(input));
    }

    public static <A, B, O> void assertSolution(O expected, Input<A, B> input, BiFunction<A, B, O> solution) {
        assertSolution(expected, () -> solution.apply(input.a(), input.b()));
    }

    public static <A, B, C, O> void assertSolution(O expected, Input3<A, B, C> input, TriFunction<A, B, C, O> solution) {
        assertSolution(expected, () -> solution.apply(input.a(), input.b(), input.c()));
    }

    public static <A, B, C, D, O> void assertSolution(O expected, Input4<A, B, C, D> input, QuadFunction<A, B, C, D, O> solution) {
        assertSolution(expected, () -> solution.apply(input.a(), input.b(), input.c(), input.d()));
    }

    public static <A, B, C, D, E, O> void assertSolution(O expected, Input5<A, B, C, D, E> input, PentaFunction<A, B, C, D, E, O> solution) {
        assertSolution(expected, () -> solution.apply(input.a(), input.b(), input.c(), input.d(), input.e()));
    }

    public static <O> void assertSolution(O expected, Supplier<O> actualSupplier) {
        O actual = actualSupplier.get();
        assertEqualsSmart(expected, actual);
    }

    private static void assertEqualsSmart(Object expected, Object actual) {
        if (expected == actual) return;
        if (expected == null || actual == null) {
            Assert.assertEquals(expected, actual);
            return;
        }

        switch (expected) {
            case int[] e when actual instanceof int[] a ->
                Assert.assertArrayEquals(e, a);
            case long[] e when actual instanceof long[] a ->
                Assert.assertArrayEquals(e, a);
            case short[] e when actual instanceof short[] a ->
                Assert.assertArrayEquals(e, a);
            case byte[] e when actual instanceof byte[] a ->
                Assert.assertArrayEquals(e, a);
            case char[] e when actual instanceof char[] a ->
                Assert.assertArrayEquals(e, a);
            case boolean[] e when actual instanceof boolean[] a ->
                Assert.assertArrayEquals(e, a);
            case float[] e when actual instanceof float[] a ->
                Assert.assertArrayEquals(e, a, 0.0f);
            case double[] e when actual instanceof double[] a ->
                Assert.assertArrayEquals(e, a, 0.0d);
            case Object[] e when actual instanceof Object[] a ->
                Assert.assertArrayEquals(e, a);
            default -> Assert.assertEquals(expected, actual);
        }
    }
}
