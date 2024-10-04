package bronze3.test_6768;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = ((n - 1) * (n - 2) * (n - 3)) / 6;

        bw.write(String.valueOf(sum));
        bw.close();
    }
}
