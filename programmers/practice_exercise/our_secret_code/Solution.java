package practice_exercise.our_secret_code;

class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] skipped = new boolean[26];
        for (char c : skip.toCharArray()) {
            skipped[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int count = 0;

            while (count < index) {
                c++;
                if (c > 'z') c = 'a';
                if (skipped[c - 'a']) continue;
                count++;
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
