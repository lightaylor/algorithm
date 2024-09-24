package silver2.test_1260;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    private static ArrayList<Integer>[] list;
    private static int n;
    private static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = input[0];
        int m = input[1];
        int v = input[2];
        list = (ArrayList<Integer>[]) new ArrayList[n+1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int[] temp = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list[temp[0]].add(temp[1]);
            list[temp[1]].add(temp[0]);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }


        check = new boolean[n+1];
        DFS(v);
        System.out.println();
        check = new boolean[n+1];
        BFS(v);
    }

    static public void DFS(int x) {
        if (check[x]) return;
        check[x] = true;

        System.out.print(x + " ");
        for (int i : list[x]) {
            if (!check[i]) {
                DFS(i);
            }
        }
    }

    static public void BFS(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        check[x] = true;

        while(!queue.isEmpty()) {
            int y = queue.remove();
            System.out.print(y + " ");
            for (int i : list[y]) {
                if (!check[i]) {
                    check[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
