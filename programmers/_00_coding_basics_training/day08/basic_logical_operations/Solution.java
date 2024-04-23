package _00_coding_basics_training.day08.basic_logical_operations;

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);
        return answer;
    }
}
