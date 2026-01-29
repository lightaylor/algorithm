package programmers._01_introduction_to_coding_tests.day19.a_person_taller_than_mersu;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i : array) {
            answer += height < i ? 1 : 0;
        }

        return answer;
    }
}
