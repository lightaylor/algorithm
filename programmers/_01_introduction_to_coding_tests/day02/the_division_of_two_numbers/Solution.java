package _01_introduction_to_coding_tests.day02.the_division_of_two_numbers;

class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / (double)num2 * 1000;
        return (int)answer;
    }
}
