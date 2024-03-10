class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;

        for(int[] i : queries) {
            String reverse = "";
            String temp = answer.substring(i[0], i[1] + 1);
            for(int j = temp.length() - 1; j >= 0; j--) {
                reverse += temp.charAt(j);
            }
            answer = answer.substring(0, i[0]) + reverse + answer.substring(i[1] + 1);
        }

        return answer;
    }
}
