package practice_exercise.our_secret_code;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String expected = "happy";

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input3<>(s, skip, index),
            new Solution()::solution
        );
    }
}
