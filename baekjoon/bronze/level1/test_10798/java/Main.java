package bronze.level1.test_10798.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] input = new char[5][15];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            str += " ".repeat(15 - str.length());
            input[i] = str.toCharArray();
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                result.append(input[j][i] != ' ' ? input[j][i] : "");
            }
        }

        bw.write(result.toString());
        bw.close();
    }
}
