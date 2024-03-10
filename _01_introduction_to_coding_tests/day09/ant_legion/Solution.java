package _01_introduction_to_coding_tests.day09.ant_legion;

class Solution {
    public int solution(int hp) {
        int answer = hp;
        int rest = 0;

        answer = answer / 5;
        rest = hp % 5;

        answer += rest / 3;
        rest = rest % 3;

        return answer + rest;
    }
}
