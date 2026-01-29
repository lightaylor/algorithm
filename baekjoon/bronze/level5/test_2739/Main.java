package baekjoon.bronze.level5.test_2739;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        for(int i = 1; i < 10; i++) {
            bw.write(n + " * " + i + " = " + i * n + "\n");
        }

        bw.close();
    }
}
