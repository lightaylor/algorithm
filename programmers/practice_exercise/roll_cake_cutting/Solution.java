package programmers.practice_exercise.roll_cake_cutting;

class Solution {
    public int solution(int[] topping) {
        int[] right = new int[10001];
        boolean[] left = new boolean[10001];

        int rightCount = 0;
        for (int t : topping) if (right[t]++ == 0) rightCount++;

        int leftCount = 0;
        int answer = 0;

        for (int i = 0; i < topping.length - 1; i++) {
            int t = topping[i];

            if (!left[t]) {
                left[t] = true;
                leftCount++;
            }

            if (--right[t] == 0) rightCount--;
            if (leftCount == rightCount) answer++;
        }

        return answer;
    }
}
