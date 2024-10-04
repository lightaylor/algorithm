package bronze.level2.test_2745;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split( " ");
        String str = input[0];
        int n = Integer.parseInt(input[1]);

        bw.write(String.valueOf(Integer.parseInt(str, n)));
        bw.close();
    }
}
