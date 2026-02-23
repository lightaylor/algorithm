package programmers._2022_kakao_bline_recruitment.count_prime_numbers_in_base_k;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 437674;
        int k = 3;
        int expected = 3;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, k),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 110011;
        int k = 10;
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, k),
            new Solution()::solution
        );
    }
}
