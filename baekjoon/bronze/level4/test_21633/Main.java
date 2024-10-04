package bronze.level4.test_21633;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double answer = (double) n / 100.0 + 25;

        if (answer < 100) {
            bw.write("100.00");
        } else if (answer > 2000) {
            bw.write("2000.00");
        } else {
            bw.write(String.format("%.2f", answer));
        }
        bw.close();
    }
}
