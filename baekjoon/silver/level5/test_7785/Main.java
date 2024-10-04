package silver.level5.test_7785;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            if (temp[1].equals("enter")) {
                map.put(temp[0], true);
            } else {
                map.put(temp[0], false);
            }
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, Collections.reverseOrder());
        for (String str : keySet) {
            if (map.get(str)) {
                bw.write(str);
                bw.newLine();
            }
        }

        bw.close();
    }
}
