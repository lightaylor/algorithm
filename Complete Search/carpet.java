class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        int temp = total;

        for(int i = 3; i < total; i++) {
            if (total % i == 0 &&  (total/i + i) < temp) {
                answer[0] = total/i > i ? total/i : i;
                answer[1] = total/i > i ? i : total/i;
                temp = total/i + i;
            }
        }

        return answer;
    }
}
