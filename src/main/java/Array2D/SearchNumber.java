package Array2D;

public class SearchNumber {

    public static void main (String[] args) {

        int[][] a = {{10,20,30}, {40,50,60}, {70,80,90}};

        int target = 60;

        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {

                if (a[i][j] == target) {
                    System.out.println("Found at row "+(i+1)+", column "+(j+1));
                }
            }
        }
    }
}
