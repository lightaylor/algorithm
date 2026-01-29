package programmers._2021_dev_matching.best_and_worst_lottery_ranks;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] expected = {3, 5};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(lottos, win_nums),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] expected = {1, 6};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(lottos, win_nums),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() throws IOException {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] expected = {1, 1};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(lottos, win_nums),
            new Solution()::solution
        );
    }

}
