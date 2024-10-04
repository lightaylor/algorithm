package bronze3.test_10992;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                answer.append(" ".repeat(n - 1)).append("*");
            } else if (i == n) {
                answer.append("*".repeat(n * 2 - 1));
            } else {
                answer.append(" ".repeat(n - i)).append("*").append(" ".repeat(2 * i - 3)).append("*");
            }
            answer.append("\n");
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
