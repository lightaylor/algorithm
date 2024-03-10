class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int a = i; a <= j; a++) {
            String str = String.valueOf(a);
            answer += (int)str.chars().filter(c -> c == (char)(k+'0')).count();
        }
        return answer;
    }
}
