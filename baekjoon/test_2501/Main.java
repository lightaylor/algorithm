package test_2501;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= arr[0]; i++) {
            if(arr[0] % i == 0) {
                list.add(i);
            }
        }

        bw.write(list.size() + 1 - arr[1] > 0 ? String.valueOf(list.get(arr[1] - 1)) : "0");
        bw.close();
    }
}
