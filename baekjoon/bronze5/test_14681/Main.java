package bronze5.test_14681;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a > 0 && b > 0) bw.write("1");
        else if (a > 0 && b < 0) bw.write("4");
        else if (a < 0 && b > 0) bw.write("2");
        else bw.write("3");

        bw.close();
    }
}
