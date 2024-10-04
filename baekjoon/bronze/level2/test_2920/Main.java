package bronze.level2.test_2920;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ascending = 1;
        int descending = 8;
        boolean ascendingCheck = true;
        boolean descendingCheck = true;

        for (int i = 0; i < 8; i++) {
            if (ascendingCheck && ascending != input[i]) {
                ascendingCheck = false;
            }
            if (descendingCheck && descending != input[i]) {
                descendingCheck = false;
            }
            ascending += 1;
            descending -= 1;
        }

        if (ascendingCheck) {
            bw.write("ascending");
        } else if (descendingCheck) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }
        bw.close();
    }
}
