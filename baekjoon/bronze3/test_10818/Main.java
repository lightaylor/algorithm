package bronze3.test_10818;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int[] arr = new int[count];

        for(int i = 0; i < count; i++) {
            arr[i] = Integer.valueOf(data[i]);
        }

        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[count -1]);
        bw.close();
    }
}
