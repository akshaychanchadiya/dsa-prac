package Practise_04042026;

public class PasswordDSAUNIQ {
    public static void main(String args[]){
        int size=10;
        String str= "aabbbbaaca";
        System.out.println(password(size,str));
    }

    static int password(int size, String str ){

        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));

        for (int i=1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1)) {
                sb.append(str.charAt(i));
            }
        }

        return sb.length();
    }
}
