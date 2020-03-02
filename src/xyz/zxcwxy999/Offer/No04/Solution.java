package xyz.zxcwxy999.Offer.No04;

public class Solution {
    //有点问题
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)return false;
        if (target == matrix[0][0]) return true;
        for (int i = 0; i < matrix[0].length - 1; i++) {
            if (target == matrix[0][i + 1]) return true;
            if (target > matrix[0][i] && target < matrix[0][i + 1]) {
                for (int j = 0; j < matrix.length; j++) {
                    if (target == matrix[j][i]) return true;
                }
                return false;
            }
        }
        return false;
    }


    public static void main(String[] args) {
/**
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 *
 */
        Solution solution = new Solution();
        int [][]a=new int[1][2];
        int [][]b=new int[0][0];
        a[0][0]=5;
        a[0][1]=6;

        System.out.println(solution.findNumberIn2DArray(a,6));

    }
}