package silver.level5.test_1475;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] n = br.readLine().toCharArray();
        int[] number = new int[9];
        int result = 0;

        for (char c : n) {
            if ('9' == c) {
                number[6] += 1;
            } else {
                number[Character.getNumericValue(c)] += 1;
            }
        }
        number[6] = Math.round((float) number[6] / 2);

        for (int i : number) {
            result = Math.max(i, result);
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
