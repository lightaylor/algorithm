package baekjoon.silver.level4.test_25192;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                count += set.size();
                set = new HashSet<>();
            } else {
                set.add(input);
            }
        }

        bw.write(String.valueOf(count + set.size()));
        bw.close();
    }
}
