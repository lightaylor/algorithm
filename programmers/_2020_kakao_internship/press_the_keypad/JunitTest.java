package programmers._2020_kakao_internship.press_the_keypad;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String expected = "LRLLLRLLRRL";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(numbers, hand),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        String expected = "LRLLRRLLLRR";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(numbers, hand),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() throws IOException {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        String expected = "LLRLLRLLRL";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(numbers, hand),
            new Solution()::solution
        );
    }

}
