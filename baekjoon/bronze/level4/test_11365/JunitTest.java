package bronze.level4.test_11365;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            !edoc doog a tahW
            noitacitsufbo
            erafraw enirambus detcirtsernu yraurbeF fo tsrif eht no nigeb ot dnetni eW
            lla sees rodroM fo drol eht ,ssertrof sih nihtiw delaecnoC
            END
            """;
        String expectedOutput = """
            What a good code!
            obfustication
            We intend to begin on the first of February unrestricted submarine warfare
            Concealed within his fortress, the lord of Mordor sees all
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
