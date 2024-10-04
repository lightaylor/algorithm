package silver3.test_20920;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < Integer.parseInt(n[0]); i++) {
            String input = br.readLine();

            if (input.length() >= Integer.parseInt(n[1])) {
                if (map.containsKey(input)) {
                    map.put(input, map.get(input) + 1);
                } else {
                    map.put(input, 0);
                }
            }
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        list.sort((s1, s2) -> (s2.length() - s1.length()));
        list.sort((o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
