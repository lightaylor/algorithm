package coding_basics_training.day03.convert_a_list_of_characters_to_a_string;

class Solution {
    public String solution(String[] arr) {
        String answer = "";

        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
