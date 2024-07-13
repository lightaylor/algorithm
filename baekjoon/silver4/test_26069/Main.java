package silver4.test_26069;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        set.add("ChongChong");
        for (int i = 0; i <n; i++) {
            String[] input = br.readLine().split(" ");

            if (set.contains(input[0]) || set.contains(input[1])) {
                set.add(input[1]);
                set.add(input[0]);
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.close();
    }
}
