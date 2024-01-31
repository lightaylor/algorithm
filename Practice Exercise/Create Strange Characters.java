class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        int count = 1;
        String answer = Character.toUpperCase(c[0]) + "";

        for(int i = 1; i < c.length; i++) {
            if (c[i-1] == ' ') {
                answer += Character.toUpperCase(c[i]);
                count = 1;
            } else {
                answer += count % 2 == 0 ? Character.toUpperCase(c[i]) : Character.toLowerCase(c[i]);
                count++;
            }
        }

        return answer;
    }
}
