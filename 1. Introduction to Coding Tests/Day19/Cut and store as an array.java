class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1];
        int j = 0;

        for(int i = 0; i < my_str.length(); i += n) {
            int max = i + n > my_str.length() ? my_str.length() : i + n;
            answer[j++] = my_str.substring(i, max);
        }

        return answer;
    }
}
