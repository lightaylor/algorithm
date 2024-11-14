package gold.level2.test_2250.v2;

import java.util.*;

public class Main {
    private static final Map<Integer, Node> tree = new HashMap<>();
    private static int[] levelMin, levelMax;
    private static int index = 1;
    private static int maxLevel = 0;

    static class Node {
        int left, right;

        Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Set<Integer> allNodes = new HashSet<>();
        Set<Integer> childNodes = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int mid = scanner.nextInt();
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            tree.put(mid, new Node(left, right));
            allNodes.add(mid);
            if (left != -1) childNodes.add(left);
            if (right != -1) childNodes.add(right);
        }

        int root = -1;
        for (int node : allNodes) {
            if (!childNodes.contains(node)) {
                root = node;
                break;
            }
        }

        levelMin = new int[n + 1];
        levelMax = new int[n + 1];
        Arrays.fill(levelMin, Integer.MAX_VALUE);
        Arrays.fill(levelMax, Integer.MIN_VALUE);

        inorder(root, 1);

        int level = 0;
        int distance = 0;
        for (int i = 1; i <= maxLevel; i++) {
            int width = levelMax[i] - levelMin[i] + 1;
            if (width > distance) {
                distance = width;
                level = i;
            }
        }

        System.out.print(level + " " + distance);
    }

    static void inorder(int node, int level) {
        if (node == -1) return;

        maxLevel = Math.max(maxLevel, level);

        Node current = tree.get(node);
        inorder(current.left, level + 1);
        levelMin[level] = Math.min(levelMin[level], index);
        levelMax[level] = Math.max(levelMax[level], index);
        index++;
        inorder(current.right, level + 1);
    }
}
