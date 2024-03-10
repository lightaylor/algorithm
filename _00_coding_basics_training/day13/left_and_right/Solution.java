package _00_coding_basics_training.day13.left_and_right;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int start = 0;
        int end = 0;

        for(int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                start = str_list[i].equals("l") ? 0 : i + 1;
                end = str_list[i].equals("l") ? i : str_list.length;
                break;
            }
        }

        answer = new String[end - start];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = str_list[start + i];
        }

        if(start == 0 && end == 0) answer = new String[0];

        return answer;
    }
}
