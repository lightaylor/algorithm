package baekjoon.gold.level4.test_20040;

import java.util.Scanner;

public class Main {
    private static int[] parent, rank;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pointCount = sc.nextInt();
        int N = sc.nextInt();
        int answer = 0;

        parent = new int[pointCount];
        rank = new int[pointCount];
        for (int i = 0; i < pointCount; i++) parent[i] = i;

        for (int i = 0; i < N; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            if (union(from, to)) {
                answer = i + 1;
                break;
            }
        }
        System.out.print(answer);
    }

    private static boolean union(int from, int to) {
        int fromParent = find(from);
        int toParent = find(to);

        if (fromParent == toParent) return true;
        if (rank[fromParent] < rank[toParent]) parent[fromParent] = toParent;
        else if (rank[fromParent] > rank[toParent])
            parent[toParent] = fromParent;
        else {
            parent[toParent] = fromParent;
            rank[fromParent]++;
        }

        return false;
    }

    private static int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }
}

