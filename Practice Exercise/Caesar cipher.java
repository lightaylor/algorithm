class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int temp = 0;
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++) {
            if ((int)c[i] == 32) {
                temp = (int)c[i];
            } else {
                temp = (int)c[i] + n;
            }

            if ((int)c[i] < 91) {
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
            answer += new Character((char)temp).toString();
        }

        return answer;
    }
}
