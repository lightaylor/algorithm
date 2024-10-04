package bronze.level4.test_25828;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int total = arr[0] * arr[1] ;
        int group = (arr[1] * arr[2]) + arr[0];
        String answer = "0";

        if (total < group) {
            answer = "1";
        } else if (total > group) {
            answer = "2";
        }

        bw.write(answer);
        bw.close();
    }
}
