package programmers.dfs_bfs.word_transformation;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean hasTarget = false;
        for (String w : words) {
            if (w.equals(target)) {
                hasTarget = true;
                break;
            }
        }
        if (!hasTarget) return 0;

        Queue<Node> q = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        q.add(new Node(begin, 0));

        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.word.equals(target)) return cur.depth;

            for (int i = 0; i < words.length; i++) {
                if (visited[i]) continue;
                if (isOneLetterDifferent(cur.word, words[i])) {
                    visited[i] = true;
                    q.add(new Node(words[i], cur.depth + 1));
                }
            }
        }

        return 0;
    }

    private boolean isOneLetterDifferent(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i) && ++diff > 1) return false;
        }
        return diff == 1;
    }

    private static class Node {
        String word;
        int depth;

        Node(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
}
