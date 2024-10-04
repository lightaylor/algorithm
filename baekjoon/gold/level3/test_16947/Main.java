package gold.level3.test_16947;

import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer>[] list;
    private static int[] check;
    private static int[] dist;

    private static int go(int x, int p) {
        // dist
        // -2: found cycle and not included
        // -1: not found cycle
        // 0~n-1: found cycle and start index
        if(check[x] == 1) {
            return x;
        }

        // check
        // 1: visited
        // 2: visited and included
        check[x] = 1;
        for (int y : list[x]) {
            if (y == p) continue;
            int res = go(y, x);
            if (res == -2) return -2;
            if (res >= 0) {
                check[x] = 2;
                if (x == res) return -2;
                else return res;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n];
        check = new int[n];
        dist = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            list[a].add(b);
            list[b].add(a);
        }
        go(0, -1);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (check[i] == 2) {
                dist[i] = 0;
                queue.add(i);
            } else {
                dist[i] = -1;
            }
        }

        while (!queue.isEmpty()) {
            int x = queue.remove();
            for (int y : list[x]) {
                if (dist[y] == -1) {
                    queue.add(y);
                    dist[y] = dist[x] + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(dist[i] + " ");
        }
        bw.close();
    }
}
