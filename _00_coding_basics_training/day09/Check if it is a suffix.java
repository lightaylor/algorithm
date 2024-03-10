class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.length() >= is_suffix.length()) {
            String answer = my_string.substring(my_string.length() - is_suffix.length(), my_string.length());
            return answer.equals(is_suffix) ? 1 : 0;
        }
        return 0;
    }
}
