package _01_introduction_to_coding_tests.day07.yakitori;

class Solution {
    public int solution(int n, int k) {
        int answer = n * 12000 + (k - n / 10) * 2000;
        return answer;
    }
}
