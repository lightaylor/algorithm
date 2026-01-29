package baekjoon.bronze.level2.test_2292.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int temp = n;

        for (int i = 1; i <= n; i++ ) {
            if (temp <= 6 * i + 1) {
                bw.write(String.valueOf(n == 1 ? i : i + 1));
                break;
            }
            temp -= 6 * i;
        }
        bw.close();
    }
}
