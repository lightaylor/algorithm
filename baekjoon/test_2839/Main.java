package test_2839;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int output = -1;

        for(int i = input / 5;  i > 0; i--) {
            if ((input - (i * 5)) % 3 == 0) {
                output = i + ((input - (i * 5)) / 3);
                break;
            }
        }

        output = output == -1 && input % 3 == 0 ? input / 3 : output;
        bw.write(Integer.toString(output));
        bw.close();
    }
}
