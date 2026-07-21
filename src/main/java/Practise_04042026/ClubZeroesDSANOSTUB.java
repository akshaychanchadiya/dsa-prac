package Practise_04042026;

import java.util.Scanner;

public class ClubZeroesDSANOSTUB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int zeroCount = 0;
        int oneCount = 0;

        for (char c : a.toCharArray()) {
            if (c=='0') {
                zeroCount++;
            }
            else {
                oneCount++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < zeroCount;i++) {
            sb.append(0);
        }
        for(int j = 0;j< oneCount;j++) {
            sb.append(1);
        }

        System.out.println(sb);


    }
}
