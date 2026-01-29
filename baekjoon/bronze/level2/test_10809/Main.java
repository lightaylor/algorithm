package baekjoon.bronze.level2.test_10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] spell = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String text = br.readLine();

        for (String s : spell) {
            bw.write(text.contains(s) ? String.valueOf(text.indexOf(s)) + " " : "-1 ");
        }
        bw.close();
    }
}
