package bronze.level1.test_20112.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean bool = true;
        char[][] arr = new char[n][];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    bool = false;
                    break;
                }
            }
        }

        if (bool) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.close();
    }
}
