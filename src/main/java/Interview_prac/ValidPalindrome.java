package Interview_prac;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        if(s.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
