package _01_introduction_to_coding_tests.day16.performing_calculations_on_strings;

class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.valueOf(str[0]);

        for(int i = 1; i < str.length; i+=2) {
            if(i % 2 > 0) {
                if(str[i].equals("+")) answer += Integer.valueOf(str[i+1]);
                else if(str[i].equals("-")) answer -= Integer.valueOf(str[i+1]);
            }
        }

        return answer;
    }
}
