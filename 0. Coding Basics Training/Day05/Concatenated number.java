class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String e = "";
        String h = "";

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                e = e + num_list[i];
            } else {
                h = h + num_list[i];
            }
        }

        return Integer.valueOf(e) + Integer.valueOf(h);
    }
}
