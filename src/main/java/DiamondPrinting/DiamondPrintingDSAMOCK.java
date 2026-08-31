package DiamondPrinting;

import java.util.Scanner;

public class DiamondPrintingDSAMOCK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = diamondPrinting(n);

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);
    }

    // TODO: Implement this method
    static String[] diamondPrinting(int n) {
        String[] pattern = new String[2 * n - 1];

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars;

            if (i <= n) {
                stars = i;
            } else {
                stars = 2 * n - i;
            }

            StringBuilder row = new StringBuilder();

            for (int j = 1; j <= stars; j++) {
                row.append("* ");
            }

            //pattern[i - 1] = row.toString();
        }

        return pattern;
    }
}
