package baekjoon.bronze.level2.test_5585;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int changes = 1000 - Integer.parseInt(br.readLine());
        int[] yen = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int i = 0; i < yen.length; i++) {
            count += changes / yen[i];
            changes = changes % yen[i];
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
