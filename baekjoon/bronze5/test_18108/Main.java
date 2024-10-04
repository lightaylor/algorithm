package bronze5.test_18108;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

         bw.write(String.valueOf(Integer.valueOf(br.readLine()) - 543));
         bw.close();
    }
}
