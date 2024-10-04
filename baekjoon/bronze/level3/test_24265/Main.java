package bronze.level3.test_24265;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine()) - 1;

        for (long i = n - 1; i > 0; i--) {
            n += i;
        }

        bw.write(n + "\n2");
        bw.close();
    }
}
