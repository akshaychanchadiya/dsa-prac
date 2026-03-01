package Mix;

public class ReverseString {

    public static void main (String[] args) {
        String a = "Different";

        StringBuilder sb = new StringBuilder(a);
        String rev = sb.reverse().toString();

        System.out.println(rev);
    }
}
