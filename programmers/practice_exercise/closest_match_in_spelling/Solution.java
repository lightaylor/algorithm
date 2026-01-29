package programmers.practice_exercise.closest_match_in_spelling;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            if (s.substring(0, i).contains(Character.toString(s.charAt(i)))) {
                answer[i] = 0;
                for(int j = i-1; j >= 0; j--) {
                    answer[i] += 1;
                    if (s.charAt(i) == s.charAt(j)) {
                        break;
                    }
                }
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
