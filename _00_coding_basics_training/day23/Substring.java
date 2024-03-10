class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        while(str2.contains(str1)) {
            answer += 1;
            str2 = str2.replace(str1, "");
        }

        return answer;
    }
}
