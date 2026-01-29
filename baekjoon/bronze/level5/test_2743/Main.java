package baekjoon.bronze.level5.test_2743;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();
        bw.write(String.valueOf(text.length()));
        bw.close();
    }
}
