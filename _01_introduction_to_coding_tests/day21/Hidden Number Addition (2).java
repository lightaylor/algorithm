class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split("[a-z, A-Z]");
        int answer = 0;

        for(String s : str) {
            if(s.length() > 0) answer += Integer.valueOf(s);
        }
        return answer;
    }
}
