package programmers._2018_kakao_blind_recruitement.sort_file_names;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] expected = {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"};

        TestSupport.assertSolution(
            expected,
            files,
            new Solution()::solution
        );
    }
}
