package bronze.level3.test_24569;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            answer += (a * 5) - (b * 3) > 40 ? 1 : 0;
        }

        bw.write(answer + (answer == n ? "+" : ""));
        bw.close();
    }
}
