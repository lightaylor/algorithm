package gold.level4.test_1197;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Tree[] tree = new Tree[m];
        for (int i = 0; i < m; i++) {
            tree[i] = new Tree(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(tree, Comparator.comparingInt(t -> t.distance));

        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;

        int sum = 0;
        for (Tree t : tree) {
            if (t.union(parent)) {
                sum += t.distance;
            }
        }

        System.out.print(sum);
    }

    static class Tree {
        int x;
        int y;
        int distance;

        Tree(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        boolean union(int[] parent) {
            int pa = find(parent, x);
            int pb = find(parent, y);
            if (pa == pb) return false;
            parent[pa] = pb;
            return true;
        }

        int find(int[] parent, int a) {
            if (parent[a] == a) return a;
            return parent[a] = find(parent, parent[a]);
        }
    }
}
