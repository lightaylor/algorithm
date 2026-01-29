package programmers._01_introduction_to_coding_tests.day15.i_dont_like_english;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] str_list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < str_list.length; i++) {
            numbers = numbers.replaceAll(str_list[i], String.valueOf(i));
        }
        answer = Long.valueOf(numbers);

        return answer;
    }
}
