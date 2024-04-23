package _01_introduction_to_coding_tests.day04.sharing_pizza_3;

class Solution {
    public int solution(int slice, int n) {
        int answer = n % slice == 0 ? n / slice : n / slice + 1;
        return answer;
    }
}
