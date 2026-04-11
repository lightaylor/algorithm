package programmers.brute_force_search.find_prime_numbers;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private static boolean[] visited;
    private Set<Integer> set;
    char[] words;

    public int solution(String numbers) {
        int answer = 0;

        words = numbers.toCharArray();
        set = new HashSet<>();
        visited = new boolean[words.length];
        dfs(new StringBuilder());
        for (int i : set) if (isPrime(i)) answer++;

        return answer;
    }

    private void dfs(StringBuilder sb) {
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            set.add(Integer.parseInt(sb.append(words[i]).toString()));
            dfs(sb);
            sb.deleteCharAt(sb.length() - 1);
            visited[i] = false;
        }
    }

    private boolean isPrime(int i) {
        if (i < 2) return false;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
