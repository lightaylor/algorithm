package bronze1.test_11038;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        while (!input.equals("0 0 0")) {
            int[] condition = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arr = new int[condition[0]];
            int[] termArr = new int[condition[0]];
            int termIdx = 0;
            int maxIdx = 0;

            for (int i = 0; i < condition[0]; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                if (condition[1] <= i && i <= condition[2]) {
                    termArr[i] = arr[i - 1] - arr[i];
                }
            }

            for (int i = 0; i < termArr.length; i++) {
                maxIdx = termArr[maxIdx] <= termArr[i] ? i : maxIdx;
            }
            bw.write(String.valueOf(maxIdx ));
            bw.newLine();
            input = br.readLine();
        }

        bw.close();
    }
}
