class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);

        for(char c : str.toCharArray()) {
            int i = (int)c-'0';
            if(i != 0 && i % 3 == 0) answer++;
        }

        return answer;
    }
}
