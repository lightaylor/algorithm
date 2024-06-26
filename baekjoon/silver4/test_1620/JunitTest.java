package silver4.test_1620;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                26 5
                Bulbasaur
                Ivysaur
                Venusaur
                Charmander
                Charmeleon
                Charizard
                Squirtle
                Wartortle
                Blastoise
                Caterpie
                Metapod
                Butterfree
                Weedle
                Kakuna
                Beedrill
                Pidgey
                Pidgeotto
                Pidgeot
                Rattata
                Raticate
                Spearow
                Fearow
                Ekans
                Arbok
                Pikachu
                Raichu
                25
                Raichu
                3
                Pidgey
                Kakuna
                """;
        String expectedOutput = """
                Pikachu
                26
                Venusaur
                16
                14
                """;
        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        return stdout.toString();
    }
}
