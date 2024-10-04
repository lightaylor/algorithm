package gold.level5.test_13023;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int m = arr[1];
        int answer = 0;
        boolean[][] a = new boolean[n][n]; // 인접 행렬
        List<Integer>[] list = (ArrayList<Integer>[]) new ArrayList[n]; // 인접 리스트
        List<int[]> edge = new ArrayList<>(); //간선 리스트

        for (int i=0; i<n; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int from = input[0];
            int to = input[1];

            a[from][to] = a[to][from] = true;
            list[from].add(to);
            list[to].add(from);
            edge.add(new int[]{from, to});
            edge.add(new int[]{to, from});
        }

        m *= 2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int A = edge.get(i)[0];
                int B = edge.get(i)[1];
                int C = edge.get(j)[0];
                int D = edge.get(j)[1];
                if (A == B || A == C || A == D || B == C || B == D || C == D) {
                    continue;
                }

                if (!a[B][C]) continue;
                for (int E : list[D]) {
                    if (A == E || B == E || C == E || D == E) continue;
                    answer = 1;
                    break;
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
