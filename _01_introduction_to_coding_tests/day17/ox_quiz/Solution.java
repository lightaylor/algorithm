package _01_introduction_to_coding_tests.day17.ox_quiz;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] c = quiz[i].split(" ");
            int j = 0;
            if(c[1].equals("-")) {
                j = Integer.parseInt(c[0]) - Integer.parseInt(c[2]);
            } else {
                j = Integer.parseInt(c[0]) + Integer.parseInt(c[2]);
            }
            answer[i] = j==Integer.parseInt(c[4]) ? "O" : "X";
        }
        return answer;
    }
}
