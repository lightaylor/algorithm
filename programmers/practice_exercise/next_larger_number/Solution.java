package programmers.practice_exercise.next_larger_number;

class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        int oneCount = binary.length() - binary.replace("1", "").length();
        int answerCount = 0;

        while (oneCount != answerCount) {
            n++;
            binary = Integer.toBinaryString(n);
            answerCount = binary.length() - binary.replace("1", "").length();
        }

        return n;
    }
}
