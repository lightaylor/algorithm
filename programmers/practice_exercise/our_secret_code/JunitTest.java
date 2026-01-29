package programmers.practice_exercise.our_secret_code;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String expected = "happy";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(s, skip, index),
            new Solution()::solution
        );
    }
}
