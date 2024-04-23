package _01_introduction_to_coding_tests.day23.login_successful;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for(String[] str : db) {
            if(str[0].equals(id_pw[0]) && str[1].equals(id_pw[1])) return "login";
            else if (str[0].equals(id_pw[0])) answer = "wrong pw";
        }
        answer = answer.length() == 0 ? "fail" : answer;

        return answer;
    }
}