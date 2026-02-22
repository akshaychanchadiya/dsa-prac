package StringBuilder;

public class Reverse {

    public static void main (String[] args) {

        StringBuilder sb = new StringBuilder("Akshay");

        String rev = sb.reverse().toString();

        System.out.println(rev);
    }
}
