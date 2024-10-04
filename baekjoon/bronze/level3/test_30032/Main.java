package bronze.level3.test_30032;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n[0]; i++) {
            char[] arr = br.readLine().toCharArray();
            for (char c : arr) {
                switch (n[1]) {
                    case 1:
                        if (c == 'd') {
                            bw.write('q');
                        } else if (c == 'b') {
                            bw.write('p');
                        } else if (c == 'q') {
                            bw.write('d');
                        } else {
                            bw.write('b');
                        }
                        break;
                    case 2:
                        if (c == 'd') {
                            bw.write('b');
                        } else if (c == 'b') {
                            bw.write('d');
                        } else if (c == 'q') {
                            bw.write('p');
                        } else {
                            bw.write('q');
                        }
                        break;
                }
            }
            bw.newLine();
        }
        bw.close();
    }
}
