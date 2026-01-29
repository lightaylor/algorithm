package baekjoon.bronze.level1.test_4796.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int i = 1;
        while(!input.equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(input);
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            int temp = (V / P * L) + Math.min(V % P, L);
            System.out.println("Case " + i++ + ": " + temp);
            input = br.readLine();
        }
    }
}
