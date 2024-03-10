class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sign = num_list.length > 10 ? 1 : 0;
        for(int i = 0; i < num_list.length; i++) {
            answer = sign == 1 ? answer + num_list[i] : (answer == 0 ? 1 : answer) * num_list[i];
        }

        return answer;
    }
}
