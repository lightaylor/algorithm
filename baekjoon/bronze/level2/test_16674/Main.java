package baekjoon.bronze.level2.test_16674;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        String[] number = {"2", "0", "1", "8"};
        int[] count = new int[number.length];
        int i = 0;

        for (String str : number) {
            String temp = n.replaceAll(str, "");
            count[i++] = n.length() - temp.length();
            n = temp;
        }

        if (n.isEmpty()) {
            if (Arrays.stream(count).allMatch(c -> c > 0)) {
                boolean check = true;
                for (int j = 1; j < count.length; j++) {
                    if (count[j - 1] != count[j]) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    bw.write("8");
                } else {
                    bw.write("2");
                }
            } else {
                bw.write("1");
            }
        } else {
            bw.write("0");
        }
        bw.close();
    }
}
