package gold.level2.test_2250.v1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Node {
    int left;
    int right;
    public int order, depth;
    Node (int left, int right) {
        this.left = left;
        this.right = right;
    }
}

public class Main {
    private static Map<Integer, Node> map;
    private static int order = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[n + 1];
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            map.put(x, new Node(y, z));
            if (y != -1) cnt[y] += 1;
            if (z != -1) cnt[z] += 1;
        }
        int root = 0;
        for (int i = 1; i <= n; i++) {
            if (cnt[i] == 0) {
                root = i;
            }
        }
        inorder(root, 1);
        int maxDepth = 0;

        for (int i = 1; i <= n; i++) {
            Node node = map.get(i);
            int depth = node.depth;
            int order = node.order;

            if (left[depth] == 0) {
                left[depth] = order;
            } else {
                left[depth] = Math.min(left[depth], order);
            }
            right[depth] = Math.max(right[depth], order);
            maxDepth = Math.max(maxDepth, depth);
        }
        int answer = 0;
        int answerLevel = 0;
        for (int i = 1; i <= maxDepth; i++) {
            int temp = right[i] - left[i] + 1;
            if (answer < temp) {
                answer = temp;
                answerLevel = i;
            }
        }

        bw.write(answerLevel + " " + answer);
        bw.close();
    }

    private static void inorder(int node, int depth) {
        if (node == -1) return;
        Node n = map.get(node);
        inorder(n.left, depth + 1);
        n.order = ++order;
        n.depth = depth;
        inorder(n.right, depth + 1);
    }
}
