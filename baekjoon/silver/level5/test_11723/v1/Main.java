package baekjoon.silver.level5.test_11723.v1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "add":
                    map.put(input[1], true);
                    break;
                case "remove":
                    map.put(input[1], false);
                    break;
                case "check":
                    if (map.containsKey(input[1])) {
                        bw.write(map.get(input[1]) ? "1" : "0");
                    } else {
                        bw.write("0");
                    }
                    bw.newLine();
                    break;
                case "toggle":
                    if (map.containsKey(input[1])) {
                        map.put(input[1], false);
                    } else {
                        map.put(input[1], true);
                    }
                    break;
                case "all":
                    map = new HashMap<>();
                    for (int j = 1; j <= 20; j++) {
                        map.put(String.valueOf(j), true);
                    }
                    break;
                case "empty":
                    map = new HashMap<>();
                    break;
            }
        }
        bw.close();
    }
}
