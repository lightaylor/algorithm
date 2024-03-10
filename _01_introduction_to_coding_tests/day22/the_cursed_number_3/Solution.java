package _01_introduction_to_coding_tests.day22.the_cursed_number_3;

class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i = 1; i <= n; i++) {
            answer = checkValue(answer) + 1;
        }
        return answer - 1;
    }

    public int checkValue(int i) {
        while(Integer.toString(i).contains("3") || i % 3 == 0) {
            i += 1;
        }
        return i;
    }
}
