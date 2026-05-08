package Practise_04042026;

public class PrimeNo {

    public static void main(String[] args) {
        int a = 17;
        boolean b = true;

        for (int i=2;i<=a/2;i++) {
            if (a%2 == 0) {
                b = false;
                break;
            }
        }
        System.out.println(b ? "Prime":"Not Prime");
    }
}
