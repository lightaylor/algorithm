package programmers._2018_kakao_blind_recruitement.round1_dartgame;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = "1S2D*3T";
        int expected = 37;
        TestSupport.assertSolution(expected, input, new Solution()::solution);
    }

    @Test
    public void test_2() throws IOException {
        String input = "1D2S#10S";
        int expected = 9;
        TestSupport.assertSolution(expected, input, new Solution()::solution);
    }

    @Test
    public void test_3() throws IOException {
        String input = "1D2S0T";
        int expected = 3;
        TestSupport.assertSolution(expected, input, new Solution()::solution);
    }

    @Test
    public void test_4() throws IOException {
        String input = "1S*2T*3S";
        int expected = 23;
        TestSupport.assertSolution(expected, input, new Solution()::solution);
    }

    @Test
    public void test_5() throws IOException {
        String input = "1D#2S*3S";
        int expected = 5;
        TestSupport.assertSolution(expected, input, new Solution()::solution);
    }

    @Test
    public void test_6() throws IOException {
        String input = "1T2D3D#";
        int expected = -4;
        TestSupport.assertSolution(expected, input, new Solution()::solution);
    }

    @Test
    public void test_7() throws IOException {
        String input = "1D2S3T*";
        int expected = 59;
        TestSupport.assertSolution(expected, input, new Solution()::solution);
    }

}
