package CrackingCodingInterview.ArraysAndStrings;

import java.util.Arrays;

public class InvertImage {

    public static int[][] invertImage(int arr[][], int m, int n){

        int temp[][] = new int[n][m];

        for(int r = 0; r < m ; r++){
            for(int c=0; c < n; c++){
                temp[c][m-r-1] = arr[r][c];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println("Orignal "+ Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(invertImage(arr, 3,3)));
    }
}
