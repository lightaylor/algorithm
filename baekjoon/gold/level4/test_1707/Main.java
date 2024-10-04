package gold.level4.test_1707;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int[] check;
    private static List<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list = (List<Integer>[]) new List[v + 1];
            check = new int[v + 1];
            boolean answer = true;

            for (int t = 0; t < list.length; t++) {
                list[t] = new ArrayList<>();
            }

            for (int f = 0; f < e; f++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list[a].add(b);
                list[b].add(a);
            }

            for (int j = 1; j <= v; j++) {
                if(!DFS(j, check[j])) {
                    answer = false;
                    break;
                }
            }
            bw.write(answer ? "YES" : "NO");
            bw.newLine();
        }
        bw.close();
    }

    private static boolean DFS(int start, int num) {
        check[start] = num;
        for (int i : list[start]) {
            if (check[i] == 0) {
                if (!DFS(i, 3 - num)) {
                    return false;
                }
            } else if (check[i] == check[start]) {
                return false;
            }
        }
        return true;
    }
}
