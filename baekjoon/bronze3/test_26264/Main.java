package bronze3.test_26264;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = str.length();

        str = str.replaceAll("security", "");
        int b = (a - str.length()) / "security".length();
        a = str.length();
        str = str.replaceAll("bigdata", "");
        int c = (a - str.length()) / "bigdata".length();

        if (b > c) {
            bw.write("security!");
        } else if (b < c) {
            bw.write("bigdata?");
        } else {
            bw.write("bigdata? security!");
        }
        bw.close();
    }
}
