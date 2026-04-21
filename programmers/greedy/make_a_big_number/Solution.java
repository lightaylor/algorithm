package programmers.greedy.make_a_big_number;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int removed = 0;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (removed < k && sb.length() > 0 && sb.charAt(sb.length() - 1) < c) {
                sb.deleteCharAt(sb.length() - 1);
                removed++;
            }
            sb.append(c);
        }

        return sb.substring(0, sb.length() - (k - removed));
    }
}
