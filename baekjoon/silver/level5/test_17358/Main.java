package silver.level5.test_17358;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long answer = 1;

        for (int i = 4; i <= n; i += 2) {
            answer =  answer * (i - 1) % 1000000007;
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
