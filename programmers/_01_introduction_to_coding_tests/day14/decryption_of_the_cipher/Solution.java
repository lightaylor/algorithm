package _01_introduction_to_coding_tests.day14.decryption_of_the_cipher;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for(int i = code-1; i < cipher.length(); i += code ) {
            answer += cipher.charAt(i);
        }

        return answer;
    }
}
