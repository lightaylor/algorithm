package programmers.practice_exercise.a_walk_in_the_park;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        int[] expected = {2, 1};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(park, routes),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        int[] expected = {0, 1};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(park, routes),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() throws IOException {
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};
        int[] expected = {0, 0};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(park, routes),
            new Solution()::solution
        );
    }
}
