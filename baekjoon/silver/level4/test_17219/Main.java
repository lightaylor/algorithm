package silver.level4.test_17219;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = br.readLine().split(" ");
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < Integer.parseInt(n[0]); i++) {
            String[] str = br.readLine().split(" ");
            map.put(str[0], str[1]);
        }

        for (int i = 0; i < Integer.parseInt(n[1]); i++) {
            bw.write(map.get(br.readLine()));
            bw.newLine();
        }

        bw.close();
    }
}
