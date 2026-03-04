package Mix;

public class Palindrome {
    public static void main(String[] args) {
        String s = Integer.toString(-121);

        String rev = "";

        for (int i = s.length()-1;i>=0;i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        }
        System.out.println(("Not Palindrome"));
    }
}
