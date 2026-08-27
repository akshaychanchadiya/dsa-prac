package DiamondPrinting;

import java.util.Scanner;

public class PyramidPrintingDSAMOCK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pattern = pyramidPrinting(n);

        for (int i = 0; i < n; i++)
            System.out.println(pattern[i]);

    }

    // TODO: Implement this method
    //Note:- It is mandatory to return the array in the below function. Printing the answer in console won't work
    static String[] pyramidPrinting(int n) {
        String[] result = new String[n];

       // for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = 1; j <= i; j++) {
                row += "* ";
            }

            result[i - 1] = row;
        }
        return result;
    }

}
