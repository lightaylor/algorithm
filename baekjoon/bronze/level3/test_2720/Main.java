package bronze.level3.test_2720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int input = Integer.parseInt(br.readLine());
            int q = input / 25;
            int d = (input % 25) / 10;
            int n = (input % 25 % 10) / 5;
            int p = input % 25 % 10 % 5;

            bw.write(q + " " + d + " " + n + " " + p + "\n");
        }
        bw.close();
    }
}
