package programmers.practice_exercise.magic_elevator;

class Solution {
    public int solution(int storey) {
        int count = 0;
        while (storey > 0) {
            int digit = storey % 10;
            if (digit < 5) {
                count += digit;
                storey /= 10;
            } else if (digit > 5) {
                count += 10 - digit;
                storey = storey / 10 + 1;
            } else {
                count += 5;
                if ((storey / 10) % 10 >= 5) {
                    storey = storey / 10 + 1;
                } else {
                    storey /= 10;
                }
            }
        }
        return count;
    }
}