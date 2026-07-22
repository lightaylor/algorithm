package programmers.learn.courses30.lessons468379;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int m = 4;
        int n = 5;
        int h = 2;
        int w = 2;
        int[][] drops = {{0, 0}, {3, 1}, {1, 3}, {2, 4}, {1, 1}, {2, 2}, {2, 3}, {0, 4}};
        int[] expected = {2, 2};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(m, n, h, w, drops),
            new programmers.learn.courses30.lessons468379.Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        int m = 3;
        int n = 3;
        int h = 1;
        int w = 1;
        int[][] drops = {{0, 0}, {0, 1}, {0, 2}, {1, 0}};
        int[] expected = {1, 1};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(m, n, h, w, drops),
            new programmers.learn.courses30.lessons468379.Solution()::solution
        );
    }

    @Test
    public void test_3() throws IOException {
        int m = 4;
        int n = 6;
        int h = 3;
        int w = 4;
        int[][] drops = {{1, 2}};
        int[] expected = {0, 0};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(m, n, h, w, drops),
            new programmers.learn.courses30.lessons468379.Solution()::solution
        );
    }

    @Test
    public void test_4() throws IOException {
        int m = 4;
        int n = 6;
        int h = 1;
        int w = 2;
        int[][] drops = {{0, 1}, {0, 3}, {0, 5}, {1, 1}, {1, 3}, {1, 5}, {2, 1}, {2, 3}, {2, 5}, {3, 1}, {3, 3}, {3, 5}};
        int[] expected = {3, 4};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(m, n, h, w, drops),
            new programmers.learn.courses30.lessons468379.Solution()::solution
        );
    }

    @Test
    public void test_5() throws IOException {
        int m = 2;
        int n = 2;
        int h = 2;
        int w = 2;
        int[][] drops = {{0, 0}, {0, 1}, {1, 1}, {1, 0}};
        int[] expected = {0, 0};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(m, n, h, w, drops),
            new programmers.learn.courses30.lessons468379.Solution()::solution
        );
    }

    @Test
    public void test_6() throws IOException {
        int m = 4;
        int n = 4;
        int h = 3;
        int w = 1;
        int[][] drops = {{2, 0}, {1, 3}, {3, 2}, {0, 1}};
        int[] expected = {0, 2};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(m, n, h, w, drops),
            new programmers.learn.courses30.lessons468379.Solution()::solution
        );
    }
}
