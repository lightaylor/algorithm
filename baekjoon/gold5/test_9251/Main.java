package gold5.test_9251;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int n = a.length;
        int m = b.length;
        int[][] lcs = new int[n + 1][m + 1];

        for (int j = 1; j <= m; j++) {
            for (int i = 1; i <= n; i++) {
                if (a[i - 1] == b[j - 1]) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i][j - 1], lcs[i - 1][j]);
                }
            }
        }

        bw.write(String.valueOf(lcs[n][m]));
        bw.close();
    }
}
