package baekjoon.bronze.level3.test_2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String str = " ".repeat(n - i - 1) + "*".repeat(i * 2 + 1);
            bw.write(str + "\n");
        }

        for(int j = n - 2; j >= 0; j--) {
            String str = " ".repeat(n - j - 1) + "*".repeat(j * 2 + 1);
            bw.write(str + "\n");
        }

        bw.close();
    }
}
