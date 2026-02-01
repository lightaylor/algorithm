package programmers._2018_kakao_blind_recruitement.triple_compression;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String msg = "KAKAO";
        int[] expected = {11, 1, 27, 15};

        TestSupport.assertSolution(
            expected,
            msg,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String msg = "TOBEORNOTTOBEORTOBEORNOT";
        int[] expected = {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34};

        TestSupport.assertSolution(
            expected,
            msg,
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        String msg = "ABABABABABABABAB";
        int[] expected = {1, 2, 27, 29, 28, 31, 30};

        TestSupport.assertSolution(
            expected,
            msg,
            new Solution()::solution
        );
    }
}
