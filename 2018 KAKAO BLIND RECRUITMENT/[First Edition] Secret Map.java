class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);
            String temp = "";

            str1 = seatArr(n, str1);
            str2 = seatArr(n, str2);

            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') temp += "#";
                else temp += " ";
            }

            answer[i] = temp;
        }

        return answer;
    }

    private String seatArr(int n, String str) {
        String temp = str;

        for(int k = 0; k < n - str.length(); k++) {
            temp = "0" + temp;
        }

        return temp;
    }
}