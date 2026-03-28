package programmers.practice_exercise.n_2_tiling;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int input = 4;
        int expected = 5;

        TestSupport.assertSolution(
            expected,
            input,
            new Solution()::solution
        );
    }
}
