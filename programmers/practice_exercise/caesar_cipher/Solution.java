package programmers.practice_exercise.caesar_cipher;

class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        int temp;
        char[] c = s.toCharArray();

        for (char value : c) {
            if ((int) value == 32) {
                temp = value;
            } else {
                temp = (int) value + n;
            }

            if ((int) value < 91) {
                if (temp > 90) {
                    temp -= 26;
                    if (temp > 90) {
                        temp -= 26;
                    }
                }
            }

            if (temp > 122) {
                temp -= 26;
            }
            answer.append(temp);
        }

        return answer.toString();
    }
}
