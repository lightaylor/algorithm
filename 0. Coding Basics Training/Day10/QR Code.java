class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";

        for(int i = 0; i < code.length(); i+=q) {
            answer += i+r < code.length() ? code.charAt(i+r) : "";
        }

        return answer;
    }
}