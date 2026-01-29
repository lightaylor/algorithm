package baekjoon.silver.level5.test_4446;

import java.io.*;

public class Main {
    private static String CONSONANTS = "bkxznhdcwgpvjqtsrlmf";
    private static String VOWELS = "aiyeou";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        while (input != null) {
            StringBuilder answer = new StringBuilder();
            for (char c : input.toCharArray()) {
                answer.append(translateChar(c));
            }
            bw.write(answer.toString());
            bw.newLine();
            input = br.readLine();
        }
        bw.close();
    }

    private static char translateChar(char c) {
        boolean isUpperCase = Character.isUpperCase(c);
        c = Character.toLowerCase(c);

        if (VOWELS.indexOf(c) > -1) {
            int n = VOWELS.indexOf(c) + 3;
            c = VOWELS.charAt(n >= VOWELS.length() ? n - VOWELS.length() : n);
        } else if (CONSONANTS.indexOf(c) > -1) {
            int n = CONSONANTS.indexOf(c) + 10;
            c = CONSONANTS.charAt(n >= CONSONANTS.length() ? n - CONSONANTS.length() : n);
        }

        if (isUpperCase) {
            return Character.toUpperCase(c);
        }
        return c;
    }
}
