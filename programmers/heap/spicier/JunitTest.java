package programmers.heap.spicier;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(scoville, K),
            new Solution()::solution
        );
    }
}
