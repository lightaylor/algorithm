package programmers.pcce.data_analysis;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        int[][] expected = {{3, 20300401, 10, 8}, {1, 20300104, 100, 80}};

        TestSupport.assertSolution(expected, new TestSupport.Input4<>(data, ext, val_ext, sort_by), new Solution()::solution);
    }
}
