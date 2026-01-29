package programmers._01_introduction_to_coding_tests.day24.chicken_coupon;

class Solution {
    public int solution(int chicken) {
        int answer = chicken / 10;
        int coupon = chicken / 10 + chicken % 10;

        while(coupon >= 10) {
            answer += coupon / 10;
            coupon = coupon / 10 + coupon % 10;
        }

        return answer;
    }
}
