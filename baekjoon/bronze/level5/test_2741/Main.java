package bronze.level5.test_2741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.valueOf(br.readLine());

        for(int i = 1; i <= count; i++) {
            bw.write(i + "\n");
        }

        bw.close();
    }
}
