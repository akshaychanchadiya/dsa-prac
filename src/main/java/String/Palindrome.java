    package String;

    public class Palindrome {

        public static void main (String[] args) {
            String s = "madam";

            String s1 = "";

            char[] ch = s.toCharArray();
            for(int i=ch.length-1;i>=0;i--) {

                s1 += ch[i];
            }

            if (s.equals(s1)) {
                System.out.println("given string is Palindrome");
            }
            else {
                System.out.println("given string is not Palindrome");
            }
        }
    }
