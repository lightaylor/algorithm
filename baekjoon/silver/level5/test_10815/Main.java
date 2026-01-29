package baekjoon.silver.level5.test_10815;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] nCard = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] mCard = br.readLine().split(" ");
        Map<String, String> map = new HashMap<>();

        for (String card : nCard) {
            map.put(card, "0");
        }

        for (String card : mCard) {
            if (map.containsKey(card)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.close();
    }
}
