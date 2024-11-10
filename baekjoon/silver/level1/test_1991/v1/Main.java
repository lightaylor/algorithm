package silver.level1.test_1991.v1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Node> map;

    public static class Node {
        String mid;
        String left;
        String right;

        public Node (String mid) {
            this.mid = mid;
            this.left = "";
            this.right = "";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            Node node;

            if (map.get(arr[0]) == null) {
                node = new Node(arr[0]);
                map.put(arr[0], node);
            } else {
                node = map.get(arr[0]);
            }

            if (!arr[1].equals(".")) {
                node.left = arr[1];
            }
            if (!arr[2].equals(".")) {
                node.right = arr[2];
            }
        }

        Node root = map.get("A");

        bw.write(preOrder(root));
        bw.newLine();

        bw.write(inOrder(root));
        bw.newLine();

        bw.write(postOrder(root));
        bw.newLine();

        bw.close();
    }

    public static String preOrder(Node node) {
        StringBuilder answer = new StringBuilder(node.mid);

        if (map.get(node.left) != null) {
            answer.append(preOrder(map.get(node.left)));
        }
        if (map.get(node.right) != null) {
            answer.append(preOrder(map.get(node.right)));
        }

        return answer.toString();
    }

    public static String inOrder(Node node) {
        StringBuilder answer = new StringBuilder();

        if (map.get(node.left) != null) {
            answer.append(inOrder(map.get(node.left)));
        }
        answer.append(node.mid);
        if (map.get(node.right) != null) {
            answer.append(inOrder(map.get(node.right)));
        }

        return answer.toString();
    }

    public static String postOrder(Node node) {
        StringBuilder answer = new StringBuilder();

        if (map.get(node.left) != null) {
            answer.append(postOrder(map.get(node.left)));
        }
        if (map.get(node.right) != null) {
            answer.append(postOrder(map.get(node.right)));
        }
        answer.append(node.mid);

        return answer.toString();
    }
}
