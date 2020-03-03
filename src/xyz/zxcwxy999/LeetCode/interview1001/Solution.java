package xyz.zxcwxy999.LeetCode.interview1001;

class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                ans[k++] = A[i++];
            } else {
                ans[k++] = B[j++];
            }
        }
        if (i == m) {
            while (j < n) {
                ans[k++] = B[j++];
            }
        } else {
            while (i < m) {
                ans[k++] = A[i++];
            }
        }
        for (int l = 0; l < m + n; l++) {
            A[l] = ans[l];
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 0, 0, 0, 0, 0};
        int[] b = {1, 2, 3, 5, 6};
        Solution solution = new Solution();
        solution.merge(a, 1, b, 5);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
