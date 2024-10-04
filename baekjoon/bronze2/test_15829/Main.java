package bronze2.test_15829;

import java.io.*;

public class Main {
    private static final int M = 1234567891;
    private static final int r = 31;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        long answer = 0;
        long powwer = 1;


        for (int i = 0; i < n; i ++) {
            int num = arr[i] - 'a' + 1;
            answer = (answer + num * powwer) % M;
            powwer = (powwer * r) % M;
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
