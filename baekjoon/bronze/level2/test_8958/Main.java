package bronze.level2.test_8958;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            int sum = 0;
            int idx = 0;

            for (char c : arr) {
                if (c == 'O') {
                    idx += 1;
                } else {
                    idx = 0;
                }
                sum += idx;
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.close();
    }
}
