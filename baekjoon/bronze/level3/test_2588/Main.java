package bronze.level3.test_2588;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        bw.write(a * (b % 10) + "\n");
        bw.write(a * ((b % 100) - (b % 10)) / 10 + "\n");
        bw.write(a * ((b % 1000) - (b % 100)) / 100 + "\n");
        bw.write(String.valueOf(a * b));

        bw.close();
    }
}
