package Mix;

public class RemoveDigits {

    public static void main (String[] args) {
        String a = "a1k2s3h4a5y6";

        StringBuilder sb = new StringBuilder();

        for (char c : a.toCharArray()) {
            if(!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
