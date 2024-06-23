package silver5.test_1436;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int titleNum = 666;
        int count = 0;

        while (n != count) {
            if (String.valueOf(titleNum).contains("666")) count++;
            titleNum++;
        }

        bw.write(String.valueOf(titleNum - 1));
        bw.close();
    }
}
