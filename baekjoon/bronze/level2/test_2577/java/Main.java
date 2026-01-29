package baekjoon.bronze.level2.test_2577.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String str = String.valueOf(a * b * c);

        for (int i = 0; i < 10; i++) {
            int l = str.length();
            str = str.replace(String.valueOf(i), "");
            bw.write(String.valueOf(l - str.length()));
            bw.newLine();
        }
        bw.close();
    }
}
