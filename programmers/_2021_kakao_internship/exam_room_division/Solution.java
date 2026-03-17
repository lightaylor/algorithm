package programmers._2021_kakao_internship.exam_room_division;

class Solution {
    private int[] num;
    private int[][] links;
    private int groups;

    public int solution(int k, int[] num, int[][] links) {
        this.num = num;
        this.links = links;

        int n = num.length;
        boolean[] hasParent = new boolean[n];
        for (int[] link : links) {
            if (link[0] != -1) hasParent[link[0]] = true;
            if (link[1] != -1) hasParent[link[1]] = true;
        }

        int root = -1;
        for (int i = 0; i < n; i++) {
            if (!hasParent[i]) {
                root = i;
                break;
            }
        }

        int lo = 0;
        int hi = 0;
        for (int x : num) {
            lo = Math.max(lo, x);
            hi += x;
        }

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            groups = 0;
            int remain = dfs(root, mid);

            if (remain != -1 && groups + 1 <= k) hi = mid;
            else lo = mid + 1;
        }

        return lo;
    }

    private int dfs(int node, int limit) {
        int left = links[node][0];
        int right = links[node][1];

        int leftSum = 0;
        int rightSum = 0;

        if (left != -1) {
            leftSum = dfs(left, limit);
            if (leftSum == -1) return -1;
        }

        if (right != -1) {
            rightSum = dfs(right, limit);
            if (rightSum == -1) return -1;
        }

        int cur = num[node];

        if (cur + leftSum + rightSum <= limit) {
            return cur + leftSum + rightSum;
        }

        if (cur + Math.min(leftSum, rightSum) <= limit) {
            groups++;
            return cur + Math.min(leftSum, rightSum);
        }

        if (cur <= limit) {
            groups += 2;
            return cur;
        }

        return -1;
    }
}
