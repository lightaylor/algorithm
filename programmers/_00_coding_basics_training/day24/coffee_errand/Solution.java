package _00_coding_basics_training.day24.coffee_errand;

class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for(String str : order){
            if(str.contains("cafelatte")) answer += 5000;
            else answer += 4500;
        }

        return answer;
    }
}
