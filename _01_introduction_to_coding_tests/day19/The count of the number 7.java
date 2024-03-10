class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int i : array) {
            String str = String.valueOf(i);
            answer += str.chars().filter(c -> c == '7').count();
        }

        return answer;
    }
}
