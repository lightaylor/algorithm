package monthly_code_challenge_season_1.count_after_quad_compression;

import org.junit.Test;
import util.TestUtil;

public class JunitTest {

    @Test
    public void test_1() {
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        int[] expected = {4, 9};

        TestUtil.assertSolution(
            expected,
            arr,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int[][] arr = {{1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};
        int[] expected = {10, 15};

        TestUtil.assertSolution(
            expected,
            arr,
            new Solution()::solution
        );
    }
}
