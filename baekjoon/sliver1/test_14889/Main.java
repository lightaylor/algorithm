package sliver1.test_14889;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    private static int n;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        List<Integer> start = new ArrayList<>();
        List<Integer> link = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        bw.write(String.valueOf(go(0, start, link)));
        bw.close();
    }

    private static int go (int index, List<Integer> start, List<Integer> link) {
        if (index == n) {
            if (start.size() != n/2) return -1;
            if (link.size() != n/2) return -1;
            int t1 = 0;
            int t2 = 0;
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n/2; j++) {
                    if (i != j) {
                        t1 += arr[start.get(i)][start.get(j)];
                        t2 += arr[link.get(i)][link.get(j)];
                    }
                }
            }
            return Math.abs(t1 - t2);
        }
        if (start.size() > n/2) return -1;
        if (link.size() > n/2) return -1;
        start.add(index);
        int t1 = go(index + 1, start, link);
        int answer = t1;
        start.remove(start.size() - 1);
        link.add(index);
        int t2 = go(index + 1, start, link);
        if (answer == -1 || (t2 != -1 && answer > t2)) {
            answer = t2;
        }
        link.remove(link.size() - 1);
        return answer;
    }
}
