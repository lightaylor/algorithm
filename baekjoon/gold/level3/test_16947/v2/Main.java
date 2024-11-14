package gold.level3.test_16947.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static boolean[] isCycle;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        graph = new ArrayList[N];
        visited = new boolean[N];
        isCycle = new boolean[N];
        distance = new int[N];

        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            graph[u].add(v);
            graph[v].add(u);
        }

        findCycle(0, -1, new ArrayList<>());
        calculateDistances();

        for (int i = 0; i < N; i++) {
            System.out.print(distance[i] + " ");
        }
    }

    static boolean findCycle(int node, int parent, ArrayList<Integer> path) {
        visited[node] = true;
        path.add(node);

        for (int next : graph[node]) {
            if (!visited[next]) {
                if (findCycle(next, node, path)) {
                    if (isCycle[node] || node == next) {
                        isCycle[node] = true;
                        return true;
                    }
                }
            } else if (next != parent) {
                int cycleStart = path.indexOf(next);
                for (int i = cycleStart; i < path.size(); i++) {
                    isCycle[path.get(i)] = true;
                }
                return true;
            }
        }

        path.remove(path.size() - 1);
        return false;
    }

    static void calculateDistances() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            if (isCycle[i]) {
                queue.add(i);
                distance[i] = 0;
            } else {
                distance[i] = -1;
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int next : graph[node]) {
                if (distance[next] == -1) {
                    distance[next] = distance[node] + 1;
                    queue.add(next);
                }
            }
        }
    }
}
