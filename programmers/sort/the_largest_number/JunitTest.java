package programmers.sort.the_largest_number;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int[] numbers = {6, 10, 2};
        String expected = "6210";

        TestSupport.assertSolution(
            expected,
            numbers,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        int[] numbers = {3, 30, 34, 5, 9};
        String expected = "9534330";

        TestSupport.assertSolution(
            expected,
            numbers,
            new Solution()::solution
        );
    }
}
