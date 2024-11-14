package silver.level4.test_1748.v1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        int count = 1;
        for (int start = 1; start <= n; start*=10) {
            int end = Math.min(start * 10 - 1, n);
            answer += (end - start + 1) * count++;
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
