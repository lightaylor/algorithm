package programmers.practice_exercise.tower_of_hanoi;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 2;
        int[][] expected = {{1, 2}, {1, 3}, {2, 3}};

        TestSupport.assertSolution(
            expected,
            n,
            new Solution()::solution
        );
    }
}
