package DiamondPrinting;

import java.util.Scanner;

public class DiagonalSumDSAMOCK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        int result = diagonalSum(n, a);
        System.out.println(result);
    }

    // TODO: Implement this method
    static int diagonalSum(int n, int[][] a) {
        int mainDiagonal = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonal += a[i][i];
        }
        return mainDiagonal;
    }
}
