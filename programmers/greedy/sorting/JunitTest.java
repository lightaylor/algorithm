package greedy.sorting;

import org.junit.Test;
import util.TestUtil;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 5;
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        int expected = 2;

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(n, results),
            new Solution()::solution
        );
    }
}
