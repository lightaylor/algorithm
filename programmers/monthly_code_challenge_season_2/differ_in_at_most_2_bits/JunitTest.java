package programmers.monthly_code_challenge_season_2.differ_in_at_most_2_bits;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        long[] input = {2, 7};
        long[] expected = {3, 11};

        TestSupport.assertSolution(
            expected,
            input,
            new Solution()::solution
        );
    }
}
