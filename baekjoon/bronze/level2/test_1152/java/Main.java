package baekjoon.bronze.level2.test_1152.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim();

        if (input.isEmpty()) {
            bw.write("0");
        } else {
            String[] n = input.split("\\s+");
            bw.write(String.valueOf(n.length));
        }
        bw.close();
    }
}
