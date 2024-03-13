package brute_force_search.mock_exam;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] temp = {};
        int[][] arr = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        int[] count = {0,0,0};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < answers.length; i++) {
            count[0] += answers[i] == arr[0][i % arr[0].length] ? 1 : 0;
            count[1] += answers[i] == arr[1][i % arr[1].length] ? 1 : 0;
            count[2] += answers[i] == arr[2][i % arr[2].length] ? 1 : 0;
        }
        temp = Arrays.copyOf(count, 3);
        Arrays.sort(count);

        for (int j = 0; j < 3; j++) {
            if (temp[j] == count[2]) {
                list.add(j+1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}