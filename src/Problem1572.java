public class Problem1572 {
    //Problem Link: https://leetcode.com/problems/matrix-diagonal-sum/

    public static void main(String[] args) {
        int ans = Problem1572.matrixDiagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(ans);
    }

    static int matrixDiagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum = sum + (mat[i][i] + mat[i][mat.length - i - 1]);
        }

        if (mat.length % 2 != 0) {
            sum = sum - mat[mat.length / 2][mat.length / 2];
        }

        return sum;
    }
}
