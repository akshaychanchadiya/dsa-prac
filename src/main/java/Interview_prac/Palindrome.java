package Interview_prac;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        String reversed = "";

        for(int i=s.length()-1;i>=0;i--) {
            reversed = reversed + s.charAt(i);
        }

        if(s.equals(reversed)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
