package silver.level5.test_2751;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long[] arr = new long[count];

        for(int i = 0; i < count; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0; i < count; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.close();
    }
}
