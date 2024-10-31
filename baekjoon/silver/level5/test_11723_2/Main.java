package silver.level5.test_11723_2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int S = 0;
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            if (input[0].equals("add")) {
                S |= (1 << Integer.parseInt(input[1]));
            } else if (input[0].equals("remove")) {
                S &= ~(1 << Integer.parseInt(input[1]));
            } else if (input[0].equals("check")) {
                if ((S & (1 << Integer.parseInt(input[1]))) == (1 << Integer.parseInt(input[1]))) {
                    bw.write("1");
                } else {
                    bw.write("0");
                }
                bw.newLine();
            } else if (input[0].equals("toggle")) {
                S ^= (1 << Integer.parseInt(input[1]));
            } else if (input[0].equals("all")) {
                S = (1 << 21) - 1;
            } else if (input[0].equals("empty")) {
                S = 0;
            }
        }
        bw.close();
    }
}
