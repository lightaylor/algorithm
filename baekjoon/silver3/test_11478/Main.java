package silver3.test_11478;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] arr = input.toCharArray();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                set.add(input.substring(i, j));
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.close();
    }
}
