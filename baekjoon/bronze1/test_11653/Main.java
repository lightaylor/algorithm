package bronze1.test_11653;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n > 1) {
            for(int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n /= i;
                    bw.write(i + "\n");
                    break;
                }
            }
        }
        bw.close();
    }
}
