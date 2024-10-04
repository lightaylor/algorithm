package bronze.level3.test_2903;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 2;

        for(int i = 1; i <= n; i++) {
            result = 2 * result - 1;
        }

        bw.write(String.valueOf(result * result));
        bw.close();
    }
}
