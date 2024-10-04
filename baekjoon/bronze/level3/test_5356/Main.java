package bronze.level3.test_5356;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            char b = input[1].charAt(0);

            for (int j = 0; j < a; j++) {
                for (int k = 0; k <= j; k++) {
                    if (b == 'Z' + 1) {
                        b = 'A';
                    }
                    bw.write(b);
                }
                b = (char) (b + 1);
                bw.newLine();
            }
            bw.newLine();
        }
        bw.close();
    }
}
