package programmers._2021_kakao_internship.exam_room_division;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int k = 3;
        int[] num = {12, 30, 1, 8, 8, 6, 20, 7, 5, 10, 4, 1};
        int[][] links = {{-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {8, 5}, {2, 10}, {3, 0}, {6, 1}, {11, -1}, {7, 4}, {-1, -1}, {-1, -1}};
        int expected = 40;

        TestSupport.assertSolution(expected, new TestSupport.Input3<>(k, num, links), new Solution()::solution);
    }

    @Test
    public void test_2() {
        int k = 1;
        int[] num = {6, 9, 7, 5};
        int[][] links = {{-1, -1}, {-1, -1}, {-1, 0}, {2, 1}};
        int expected = 27;

        TestSupport.assertSolution(expected, new TestSupport.Input3<>(k, num, links), new Solution()::solution);
    }

    @Test
    public void test_3() {
        int k = 2;
        int[] num = {6, 9, 7, 5};
        int[][] links = {{-1, -1}, {-1, -1}, {-1, 0}, {2, 1}};
        int expected = 14;

        TestSupport.assertSolution(expected, new TestSupport.Input3<>(k, num, links), new Solution()::solution);
    }

    @Test
    public void test_4() {
        int k = 4;
        int[] num = {6, 9, 7, 5};
        int[][] links = {{-1, -1}, {-1, -1}, {-1, 0}, {2, 1}};
        int expected = 9;

        TestSupport.assertSolution(expected, new TestSupport.Input3<>(k, num, links), new Solution()::solution);
    }
}
