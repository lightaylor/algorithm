package programmers._00_coding_basics_training.day06.manipulating_numbers_2;

class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for(int i = 1; i < numLog.length; i++) {
            answer += numLog[i] - numLog[i-1] == 1 ? "w" : "";
            answer += numLog[i] - numLog[i-1] == -1 ? "s" : "";
            answer += numLog[i] - numLog[i-1] == 10 ? "d" : "";
            answer += numLog[i] - numLog[i-1] == -10 ? "a" : "";
        }
        return answer;
    }
}
