package complete_search.carpet;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        int temp = total;

        for(int i = 3; i < total-3; i++) {
            int min = total/i > i ? total/i : i;
            int max = total/i > i ? i : total/i;
            if (total % i == 0 && (total / i + i) < temp && (min-2)*(max-2) == yellow) {
                answer[0] = min;
                answer[1] = max;
                temp = total/i + i;
            }
        }

        return answer;
    }
}