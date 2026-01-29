package baekjoon.bronze.level5.test_10871;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] count = br.readLine().split(" ");
        String[] data = br.readLine().split(" ");

        for(int i = 0; i < Integer.parseInt(count[0]); i++) {
            if (Integer.parseInt(count[1]) > Integer.parseInt(data[i])) {
                bw.write(data[i] + " ");
            }
        }

        bw.close();
    }
}
