package _00_coding_basics_training.day07.sequence_and_range_query_4;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();

        for(int[] i : queries) {
            for(int j = i[0]; j <= i[1]; j++) {
                answer[j] += j % i[2] == 0 ? 1 : 0;
            }
        }

        return answer;
    }
}
