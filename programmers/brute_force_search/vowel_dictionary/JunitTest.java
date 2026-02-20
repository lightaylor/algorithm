package programmers.brute_force_search.vowel_dictionary;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String word = "AAAAE";
        int expected = 6;

        TestSupport.assertSolution(
            expected,
            word,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String word = "AAAE";
        int expected = 10;

        TestSupport.assertSolution(
            expected,
            word,
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        String word = "I";
        int expected = 1563;

        TestSupport.assertSolution(
            expected,
            word,
            new Solution()::solution
        );
    }

    @Test
    public void test_4() {
        String word = "EIO";
        int expected = 1189;

        TestSupport.assertSolution(
            expected,
            word,
            new Solution()::solution
        );
    }
}
