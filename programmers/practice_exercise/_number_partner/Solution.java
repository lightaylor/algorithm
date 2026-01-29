package programmers.practice_exercise._number_partner;

class Solution {
    public String solution(String X, String Y) {
        int[] xNum = new int[10];
        int[] yNum = new int[10];

        for (char c : X.toCharArray()) xNum[c - '0']++;
        for (char c : Y.toCharArray()) yNum[c - '0']++;

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(xNum[i], yNum[i]);
            if (count > 0) {
                sb.append(String.valueOf(i).repeat(Math.max(0, count)));
            }
        }

        if (sb.length() == 0) return "-1";
        else if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}
