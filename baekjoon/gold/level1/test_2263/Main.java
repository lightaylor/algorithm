package baekjoon.gold.level1.test_2263;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Integer> inOrderIndex;
    private static StringBuilder sb;
    private static int[] inOrder;
    private static int[] postOrder;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        inOrder = new int[n];
        postOrder = new int[n];
        inOrderIndex = new HashMap<>();
        sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            inOrder[i] = sc.nextInt();
            inOrderIndex.put(inOrder[i], i);
        }
        for (int i = 0; i < n; i++) postOrder[i] = sc.nextInt();

        findPreOrder(0, n - 1, 0, n - 1);

        System.out.print(sb.toString().trim());
    }

    private static void findPreOrder(int inStart, int inEnd, int postStart, int postEnd
    ) {
        if (inStart > inEnd || postStart > postEnd) return;
        int root = postOrder[postEnd];
        sb.append(root).append(" ");

        int rootIndex = inOrderIndex.get(root);
        int leftTreeSize = rootIndex - inStart;

        findPreOrder(inStart, rootIndex - 1, postStart, postStart + leftTreeSize - 1);

        findPreOrder(rootIndex + 1, inEnd, postStart + leftTreeSize, postEnd - 1);
    }
}
