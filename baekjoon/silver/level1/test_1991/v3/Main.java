package baekjoon.silver.level1.test_1991.v3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<String, Node> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] str = sc.nextLine().split(" ");
            map.put(str[0], new Node(str[1], str[2]));
        }

        StringBuilder sb = new StringBuilder();
        preorder("A", sb);
        System.out.println(sb);

        sb.setLength(0);
        inorder("A", sb);
        System.out.println(sb);

        sb.setLength(0);
        postorder("A", sb);
        System.out.println(sb);
    }

    private static void preorder(String root, StringBuilder sb) {
        Node node = map.get(root);
        sb.append(root);

        if (getValidate(node.left)) {
            preorder(node.left, sb);
        }
        if (getValidate(node.right)) {
            preorder(node.right, sb);
        }
    }

    private static void inorder(String root, StringBuilder sb) {
        Node node = map.get(root);

        if (getValidate(node.left)) {
            inorder(node.left, sb);
        }
        sb.append(root);
        if (getValidate(node.right)) {
            inorder(node.right, sb);
        }
    }

    private static void postorder(String root, StringBuilder sb) {
        Node node = map.get(root);

        if (getValidate(node.left)) {
            postorder(node.left, sb);
        }
        if (getValidate(node.right)) {
            postorder(node.right, sb);
        }
        sb.append(root);
    }

    private static boolean getValidate(String node) {
        return !node.equals(".");
    }

    static class Node {

        String left;
        String right;

        public Node(String left, String right) {
            this.left = left;
            this.right = right;
        }
    }
}
