package programmers._00_coding_basics_training.day06.sequence_and_range_query_2;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            answer[i] = -1;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    answer[i] = answer[i] != -1 ? (answer[i] > arr[j] ? arr[j] : answer[i]) : arr[j];
                }
            }
        }
        return answer;
    }
}
