package programmers.dp.school_route;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int m = 4;
        int n = 3;
        int[][] puddles = {{2, 2}};
        int expected = 4;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(m, n, puddles),
            new Solution()::solution
        );
    }
}
