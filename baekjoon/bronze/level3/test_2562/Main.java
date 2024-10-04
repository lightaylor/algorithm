package bronze.level3.test_2562;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] arr = new Integer[9];

        for (int i = 0 ; i < 9 ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Integer[] arr2 = arr.clone();
        Arrays.sort(arr);

        bw.write(arr[8] + "\n" + (Arrays.asList(arr2).indexOf(arr[8]) + 1));
        bw.close();
    }
}
