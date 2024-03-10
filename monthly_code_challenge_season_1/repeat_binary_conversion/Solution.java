package monthly_code_challenge_season_1.repeat_binary_conversion;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int i = 0;
        int count = 0;
        String temp = s;

        while (temp.length() > 1) {
            i += temp.length() - temp.replace("0", "").length();
            temp = Long.toBinaryString(temp.replace("0", "").length());
            count++;
        }

        answer[0] = count;
        answer[1] = i;
        return answer;
    }
}