package _00_coding_basics_training.day18.evaluate_a_simple_expression;

class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int answer = 0;
        int a = Integer.valueOf(str[0]);
        int b = Integer.valueOf(str[2]);

        if (str[1].equals("+")) return a + b;
        else if(str[1].equals("-")) return a - b;
        else if(str[1].equals("*")) return a * b;

        return answer;
    }
}
