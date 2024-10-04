package silver.level4.test_1764;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Map<String, Integer> map = new HashMap<>();
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), i);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (map.containsKey(str)) {
                resultList.add(str);
            }
        }

        Collections.sort(resultList);
        bw.write(String.valueOf(resultList.size()));
        bw.newLine();
        for (String str : resultList) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
