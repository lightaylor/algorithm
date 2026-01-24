package greedy.joystick;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int n = name.length();

        for (char c : name.toCharArray()) {
            int up = c - 'A';
            int down = 26 - up;
            answer += Math.min(up, down);
        }

        int move = n - 1;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n && name.charAt(j) == 'A') j++;
            move = Math.min(move, Math.min(i * 2 + n - j, i + (n - j) * 2));
        }

        return answer + move;
    }
}
