package silver.level3.test_2108;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Arrays.sort(arr);
        bw.write(String.valueOf((int)Math.round((double) Arrays.stream(arr).sum() / n)));
        bw.newLine();
        bw.write(String.valueOf(arr[arr.length / 2]));
        bw.newLine();
        bw.write(findMode(map));
        bw.newLine();
        bw.write(String.valueOf(arr[n - 1] - arr[0]));
        bw.newLine();
        bw.close();
    }

    static String findMode (Map<Integer, Integer> map) {
        int max = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();

        for (int i : map.keySet()) {
            if (map.get(i) == max) {
                list.add(i);
            }
        }

        Object[] arr = list.toArray();
        Arrays.sort(arr);
        return String.valueOf(arr.length > 1 ? arr[1] : arr[0]);
    }
}
