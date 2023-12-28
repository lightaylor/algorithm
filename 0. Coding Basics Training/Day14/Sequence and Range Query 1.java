class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for(int[] i : queries) {
            for(int j = i[0]; j <= i[1]; j++) {
                answer[j] += 1;
            }
        }

        return answer;
    }
}
