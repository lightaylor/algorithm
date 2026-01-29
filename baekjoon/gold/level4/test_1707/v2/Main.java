package baekjoon.gold.level4.test_1707.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static List[] EDGE;
    private static int[] CHECK;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            CHECK = new int[n + 1];
            EDGE = new List[n + 1];
            for (int j = 1; j <= n; j++) {
                EDGE[j] = new ArrayList<>();
            }

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                EDGE[a].add(b);
                EDGE[b].add(a);
            }

            boolean answer = true;
            for (int j = 1; j <= n; j++) {
                if (CHECK[j] == 0 && !DFS(j, 1)) {
                    answer = false;
                    break;
                }
            }
            System.out.println(answer ? "YES" : "NO");
        }
    }

    private static boolean DFS(int start, int idx) {
        CHECK[start] = idx;

        for (int i : (List<Integer>) EDGE[start]) {
            if (CHECK[i] == 0) {
                if (!DFS(i, 3 - idx)) {
                    return false;
                }
            } else if (CHECK[i] == CHECK[start]) {
                return false;
            }
        }
        return true;
    }
}
