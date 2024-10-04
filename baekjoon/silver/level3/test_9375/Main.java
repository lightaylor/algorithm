package silver.level3.test_9375;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String[] input = br.readLine().split(" ");
                map.put(input[1], map.getOrDefault(input[1], 0) + 1);
            }

            int count = 1;
            for (String key : map.keySet()) {
                count *= map.get(key) + 1;
            }

            bw.write(String.valueOf(count - 1));
            bw.newLine();
        }
        bw.close();
    }
}
