package programmers._2018_kakao_blind_recruitement.friends_four_block;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int m = 4;
        int n = 5;
        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        int expected = 14;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(m, n, board),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int m = 6;
        int n = 6;
        String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        int expected = 15;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(m, n, board),
            new Solution()::solution
        );
    }
}
