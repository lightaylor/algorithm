package test_24262;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.append("1\n");
        bw.append("0");
        bw.close();
    }
}
