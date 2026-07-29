package programmers.learn.courses30.lessons12971;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int[] sticker = {14, 6, 5, 11, 3, 9, 2, 10};
        int expected = 36;

        TestSupport.assertSolution(
            expected,
            sticker,
            new programmers.learn.courses30.lessons12971.Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        int[] sticker = {1, 3, 2, 5, 4};
        int expected = 8;

        TestSupport.assertSolution(
            expected,
            sticker,
            new programmers.learn.courses30.lessons12971.Solution()::solution
        );
    }
}
