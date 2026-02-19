package programmers._2018_kakao_blind_recruitement._1_news_clustering;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String str1 = "FRANCE";
        String str2 = "french";
        int expected = 16384;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(str1, str2),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String str1 = "handshake";
        String str2 = "shake hands";
        int expected = 65536;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(str1, str2),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
        int expected = 43690;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(str1, str2),
            new Solution()::solution
        );
    }

    @Test
    public void test_4() {
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";
        int expected = 65536;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(str1, str2),
            new Solution()::solution
        );
    }
}
