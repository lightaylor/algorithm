package bronze.level2.test_14720;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] store = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int status = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (store[i] == status) {
                count++;
                status = status + 1 > 2 ? 0 : status + 1;
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
