package gold.level3.test_16947.v3;

import java.util.*;

public class Main {

    private static boolean[] visited;
    private static List<Integer>[] map;
    private static boolean[] isCycle;
    private static int[] distance;
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        isCycle = new boolean[N + 1];
        visited = new boolean[N + 1];
        distance = new int[N + 1];
        map = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a].add(b);
            map[b].add(a);
        }

        findCycle(1, -1, new ArrayList<>());
        calculateDistance();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(distance[i]).append(" ");
        }
        System.out.print(sb.toString().trim());
    }

    static boolean findCycle(int node, int parent, ArrayList<Integer> path) {
        visited[node] = true;
        path.add(node);

        for (int next : map[node]) {
            if (!visited[next]) {
                if (findCycle(next, node, path))
                    if (isCycle[node] || node == next) {
                        isCycle[node] = true;
                        return true;
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

    static void calculateDistance() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (isCycle[i]) {
                queue.add(i);
                distance[i] = 0;
            } else {
                distance[i] = -1;
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int next : map[node]) {
                if (distance[next] == -1) {
                    distance[next] = distance[node] + 1;
                    queue.add(next);
                }
            }
        }
    }
}
