package bronze2.test_24267;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long temp = 0;
        long sum = 0;

        for (long i = 1; i < n - 1; i++) {
            temp += i;
            sum += temp;
        }

        bw.write(sum + "\n3");
        bw.close();
    }
}
