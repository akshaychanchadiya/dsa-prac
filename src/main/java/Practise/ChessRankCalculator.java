package Practise;

import java.util.Arrays;

public class ChessRankCalculator {
    static String chessGrandmaster(String[] x) {

        int winCount= 0;

        for (int i=0;i<x.length;i++) {

            if(x[i]=="Win") {
                winCount++;
            }
        }
        if (winCount>=5) {
            return "Grand Master";
        }
        else if (winCount>0) {
            return "International Master";
        }
        else if (winCount==0) {
            return "Master";
        }
        return null;
    }

    public static void main(String[] args) {

        String[] a = {"Loss", "Loss", "Loss"};
        String[] b = {"Win", "Win", "Win"};
        String[] c = {"Win", "Win", "Win", "Win", "Win"};

        System.out.println(chessGrandmaster(a));
        System.out.println(chessGrandmaster(b));
        System.out.println(chessGrandmaster(c));



    }
}
