package baekjoon.bronze.level3.test_30802;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] crew = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int tCount = 0;

        for (int i : crew) {
            tCount += i / T;
            if (i % T > 0) {
                tCount += 1;
            }
        }

        bw.write(String.valueOf(tCount));
        bw.newLine();
        bw.write(n / P + " "  + n % P);
        bw.newLine();
        bw.close();
    }
}
