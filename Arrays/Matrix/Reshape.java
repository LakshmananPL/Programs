package com.codes.Arrays.Matrix;
import java.util.Arrays;

public class Reshape {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] ans = matrixReshape(arr, r, c);
        for (int[] a : ans) {
            System.out.println(Arrays.toString(a));
        }
    }

    public  static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int oldmat = m*n;
        int newmat = r*c;
        int start = 0, end = 0, count = 0;
        int[][] ans = new int[r][c];
        if(oldmat == newmat)
        {
            for (int i = 0; i < r; i++) {

                for (int j = 0; j < c; j++) {
                    if(count == n) {
                        start++;
                        end = 0;
                        count = 0;
                    }
                    ans[i][j] = mat[start][end];
                    end++;
                    count++;
                }
            }
        }
        else
            ans = mat.clone();
        return ans;
    }
}
