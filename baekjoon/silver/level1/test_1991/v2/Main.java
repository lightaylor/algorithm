package silver.level1.test_1991.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Node> map;

    public static class Node {
        String mid;
        String left;
        String right;

        public Node(String mid) {
            this.mid = mid;
            this.left = "";
            this.right = "";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            Node node;

            if (map.containsKey(arr[0])) {
                node = map.get(arr[0]);
            } else {
                node = new Node(arr[0]);
                map.put(arr[0], node);
            }

            node.left = arr[1];
            node.right = arr[2];
        }

        Node root = map.get("A");
        System.out.println(preOrder(root));
        System.out.println(inOrder(root));
        System.out.println(postOrder(root));
    }

    private static String preOrder(Node node) {
        StringBuilder answer = new StringBuilder(node.mid);

        if (!node.left.equals(".")) {
            answer.append(preOrder(map.get(node.left)));
        }
        if (!node.right.equals(".")) {
            answer.append(preOrder(map.get(node.right)));
        }

        return answer.toString();
    }

    private static String inOrder(Node node) {
        StringBuilder answer = new StringBuilder();

        if (!node.left.equals(".")) {
            answer.append(inOrder(map.get(node.left)));
        }
        answer.append(node.mid);
        if (!node.right.equals(".")) {
            answer.append(inOrder(map.get(node.right)));
        }

        return answer.toString();
    }

    private static String postOrder(Node node) {
        StringBuilder answer = new StringBuilder();

        if (!node.left.equals(".")) {
            answer.append(postOrder(map.get(node.left)));
        }
        if (!node.right.equals(".")) {
            answer.append(postOrder(map.get(node.right)));
        }
        answer.append(node.mid);

        return answer.toString();
    }
}
