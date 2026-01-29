package baekjoon.bronze.level3.test_5597;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 28; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Arrays.sort(list.toArray());

        for(int i = 1; i <= 30; i++) {
            if (!list.contains(i)) bw.write( i + "\n");
        }

        bw.close();
    }
}
