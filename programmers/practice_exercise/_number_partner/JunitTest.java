package practice_exercise._number_partner;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String park = "100";
        String routes = "2345";
        String expected = "-1";

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(park, routes),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        String park = "100";
        String routes = "203045";
        String expected = "0";

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(park, routes),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() throws IOException {
        String park = "100";
        String routes = "123450";
        String expected = "10";

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(park, routes),
            new Solution()::solution
        );
    }

    @Test
    public void test_4() throws IOException {
        String park = "12321";
        String routes = "42531";
        String expected = "321";

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(park, routes),
            new Solution()::solution
        );
    }

    @Test
    public void test_5() throws IOException {
        String park = "5525";
        String routes = "1255";
        String expected = "552";

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(park, routes),
            new Solution()::solution
        );
    }
}
