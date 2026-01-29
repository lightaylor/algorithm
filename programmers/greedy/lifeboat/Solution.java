package programmers.greedy.lifeboat;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 1;
        int temp = 0;
        int count = 0;
        int j = 0;
        int i = people.length - 1;

        Arrays.sort(people);

        while (i >= j) {
            if (count < 2 && temp + people[i] <= limit) {
                temp += people[i--];
                count++;
            } else if (count < 2 && temp + people[j] <= limit) {
                temp += people[j++];
                count++;
            } else {
                answer++;
                temp = 0;
                count = 0;
            }
        }
        return answer;
    }
}
