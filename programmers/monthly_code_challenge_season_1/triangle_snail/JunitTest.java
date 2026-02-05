package programmers.monthly_code_challenge_season_1.triangle_snail;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 4;
        int[] expected = {1, 2, 9, 3, 10, 8, 4, 5, 6, 7};

        TestSupport.assertSolution(
            expected,
            n,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 5;
        int[] expected = {1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9};

        TestSupport.assertSolution(
            expected,
            n,
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        int n = 6;
        int[] expected = {1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11};

        TestSupport.assertSolution(
            expected,
            n,
            new Solution()::solution
        );
    }
}
