package _00_coding_basics_training.day10.qr_code;

class Solution {
    public String main(int q, int r, String code) {
        String answer = "";

        for(int i = 0; i < code.length(); i+=q) {
            answer += i+r < code.length() ? code.charAt(i+r) : "";
        }

        return answer;
    }
}