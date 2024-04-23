package _01_introduction_to_coding_tests.day21.hidden_number_addition_2;

class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split("[a-z, A-Z]");
        int answer = 0;

        for(String s : str) {
            if(s.length() > 0) answer += Integer.valueOf(s);
        }
        return answer;
    }
}
