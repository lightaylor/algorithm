package programmers.practice_exercise.brute_force_search.fatigue;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        int expected = 3;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(k, dungeons),
            new Solution()::solution
        );
    }
}
