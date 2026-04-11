package programmers.brute_force_search.find_prime_numbers;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String input = "17";
        int expected = 3;

        TestSupport.assertSolution(
            expected,
            input,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String input = "011";
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            input,
            new Solution()::solution
        );
    }
}
