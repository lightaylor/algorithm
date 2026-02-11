package programmers._2019_kakao_blind_recruitment.pathfinding_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    static class Node {
        int x, y, idx;
        Node left, right;

        Node(int x, int y, int idx) {
            this.x = x;
            this.y = y;
            this.idx = idx;
        }
    }

    public int[][] solution(int[][] nodeinfo) {
        Node[] nodes = new Node[nodeinfo.length];

        for (int i = 0; i < nodeinfo.length; i++)
            nodes[i] = new Node(nodeinfo[i][0], nodeinfo[i][1], i + 1);

        Arrays.sort(nodes, (a, b) -> b.y == a.y ? a.x - b.x : b.y - a.y);

        Node root = nodes[0];
        for (int i = 1; i < nodes.length; i++) insert(root, nodes[i]);

        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        preorder(root, pre);
        postorder(root, post);

        return new int[][]{pre.stream().mapToInt(i -> i).toArray(), post.stream().mapToInt(i -> i).toArray()};
    }

    private void insert(Node parent, Node child) {
        if (child.x < parent.x) {
            if (parent.left == null) parent.left = child;
            else insert(parent.left, child);
        } else {
            if (parent.right == null) parent.right = child;
            else insert(parent.right, child);
        }
    }

    private void preorder(Node node, List<Integer> list) {
        if (node == null) return;
        list.add(node.idx);
        preorder(node.left, list);
        preorder(node.right, list);
    }

    private void postorder(Node node, List<Integer> list) {
        if (node == null) return;
        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.idx);
    }
}
