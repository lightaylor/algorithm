package practice_exercise.brute_force_search.fatigue;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        int expected = 3;

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(k, dungeons),
            new Solution()::solution
        );
    }
}
