package programmers._00_coding_basics_training.day06.sequence_and_range_query_3;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for(int i = 0; i < queries.length; i++) {
            int[] order = queries[i];
            int temp = answer[order[0]];
            answer[order[0]] = answer[order[1]];
            answer[order[1]] = temp;
        }

        return answer;
    }
}
