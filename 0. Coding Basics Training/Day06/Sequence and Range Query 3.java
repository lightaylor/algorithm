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
