package programmers._01_introduction_to_coding_tests.day15.swap_indices;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] ch = my_string.toCharArray();
        char n1 = ch[num1];
        ch[num1] = ch[num2];
        ch[num2] = n1;
        answer = String.valueOf(ch);

        return answer;
    }
}
