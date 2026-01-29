package programmers.coding_basics_training.day03.merge_more_forcefully;

class Solution {
    public int solution(int a, int b) {
        String first = String.format("%s%s", a, b);
        String last = String.format("%s%s", b, a);
        int answer = Integer.valueOf(first) > Integer.valueOf(last) ? Integer.valueOf(first) : Integer.valueOf(last);
        return answer;
    }
}
