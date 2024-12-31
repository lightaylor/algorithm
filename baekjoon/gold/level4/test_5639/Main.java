package gold.level4.test_5639;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Node> graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        graph = new HashMap<>();
        int root = sc.nextInt();
        graph.put(root, new Node());
        while (sc.hasNext()) {
            int key = sc.nextInt();
            preorder(root, key);
        }

        printPostorder(root);
    }

    private static void preorder(int root, int key) {
        Node node = graph.get(root);

        if (key < root) {
            if (node.left == 0) {
                node.left = key;
                graph.put(key, new Node());
            } else {
                preorder(node.left, key);
            }
        } else {
            if (node.right == 0) {
                node.right = key;
                graph.put(key, new Node());
            } else {
                preorder(node.right, key);
            }
        }
    }

    private static void printPostorder(int root) {
        Node node = graph.get(root);

        if (node.left > 0) {
            printPostorder(node.left);
        }

        if (node.right > 0) {
            printPostorder(node.right);
        }

        System.out.println(root);
    }

    static class Node {
        int left, right;

        public Node() {
        }
    }

}
