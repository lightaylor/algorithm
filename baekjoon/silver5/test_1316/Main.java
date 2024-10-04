package silver5.test_1316;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = n;

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                int sum = str.length() - str.replaceAll(Character.toString(str.charAt(j)), "").length();
                String s = String.valueOf(str.charAt(j)).repeat(sum);
                if (!str.contains(s)) {
                    result -= 1;
                    break;
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
