package test_10952;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        while(!(input[0] + input[1]).equals("00")) {
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            bw.write(a + b + "\n");
            input = br.readLine().split(" ");
        }

        bw.close();
    }
}
