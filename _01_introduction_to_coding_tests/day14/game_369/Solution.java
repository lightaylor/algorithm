package _01_introduction_to_coding_tests.day14.game_369;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);

        for(char c : str.toCharArray()) {
            int i = (int)c-'0';
            if(i != 0 && i % 3 == 0) answer++;
        }

        return answer;
    }
}
