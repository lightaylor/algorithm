package programmers.practice_exercise.the_weapon_of_a_knight.java;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;

        for (int i = 2; i <= number; i++) {
            int count = getDivisorCount(i);
            answer += count > limit ? power : count;
        }

        return answer;
    }

    public int getDivisorCount (int n) {
        int count = 2;

        for(int i = 2; i <= n/2; i++) {
            count += n % i == 0 ? 1 : 0;
        }

        return count;
    }
}
