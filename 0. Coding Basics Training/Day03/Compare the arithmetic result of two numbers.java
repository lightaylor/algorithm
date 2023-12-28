class Solution {
    public int solution(int a, int b) {
        int first = Integer.valueOf(String.format("%s%s", a, b));
        int last = a * b * 2;
        int answer =  first > last ? first : last;
        return answer;
    }
}
