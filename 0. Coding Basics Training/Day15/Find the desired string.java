class Solution {
    public int solution(String myString, String pat) {
        String answer = myString.toUpperCase();
        return answer.contains(pat.toUpperCase()) ? 1 : 0;
    }
}
