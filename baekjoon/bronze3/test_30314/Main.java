package bronze3.test_30314;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] first = br.readLine().toCharArray();
        char[] last = br.readLine().toCharArray();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int temp = Math.abs(last[i] - first[i]);
            answer += Math.min(Math.abs(temp - 26), temp);
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
