package test_2675;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String result = "";
            String[] s = br.readLine().split(" ");
            int j = Integer.parseInt(s[0]);
            char[] c = s[1].toCharArray();

            for(int k = 0; k < c.length; k++) {
                result += Character.toString(c[k]).repeat(j);
            }
            bw.write(result + " \n");
        }

        bw.close();
    }
}
