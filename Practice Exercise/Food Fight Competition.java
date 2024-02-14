class Solution {
    public String solution(int[] food) {
        String answer = "";
        String reverse = "";

        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                answer += i;
            }
        }

        StringBuffer sb = new StringBuffer(answer);
        return answer + "0" + sb.reverse().toString();
    }
}
