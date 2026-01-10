package _2022_kakao_bline_recruitment.receive_the_result_of_the_report;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] expected = {2,1,1,0};

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input3<>(id_list, report, k),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] expected = {0,0};

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input3<>(id_list, report, k),
            new Solution()::solution
        );
    }

}
