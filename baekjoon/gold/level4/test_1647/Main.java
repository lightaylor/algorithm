package gold.level4.test_1647;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new Edge(a, b, cost));
        }

        Collections.sort(edges);

        int components = n;
        long answer = 0;
        DSU dsu = new DSU(n);
        for (Edge e : edges) {
            if (components == 2) break;
            if (dsu.union(e.a, e.b)) {
                answer += e.cost;
                --components;
            }
        }

        System.out.print(answer);
    }

    static class Edge implements Comparable<Edge> {
        int a;
        int b;
        int cost;

        Edge(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }

        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    private static class DSU {

        private int[] p, r;

        DSU(int n) {
            p = new int[n + 1];
            r = new int[n + 1];
            for (int i = 1; i <= n; i++) p[i] = i;
        }

        int find(int x) {
            return p[x] == x ? x : (p[x] = find(p[x]));
        }

        boolean union(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) return false;
            if (r[a] < r[b]) {
                int t = a;
                a = b;
                b = t;
            }
            p[b] = a;
            if (r[a] == r[b]) r[a]++;
            return true;
        }
    }
}

