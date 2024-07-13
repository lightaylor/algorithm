package bronze5.test_27433;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }


        bw.write(String.valueOf(result));
        bw.close();
    }
}
