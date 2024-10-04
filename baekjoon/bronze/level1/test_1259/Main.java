package bronze.level1.test_1259;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        while (!input.equals("0")) {
            String answer = "yes";
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    answer = "no";
                    break;
                }
            }
            input = br.readLine();
            bw.write(answer);
            bw.newLine();
        }
        bw.close();
    }
}
