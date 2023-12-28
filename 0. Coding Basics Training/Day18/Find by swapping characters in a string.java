class Solution {
    public int solution(String myString, String pat) {
        String answer = myString;
        answer = answer.replace('A', '-');
        answer = answer.replace('B', 'A');
        answer = answer.replace('-', 'B');

        return answer.contains(pat) ? 1 : 0;
    }
}
