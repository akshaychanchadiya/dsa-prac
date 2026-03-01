package Mix;

public class RemoveDigits {

    public static void main (String[] args) {
        String a = "a1b2c3";

        StringBuilder sb = new StringBuilder();

        for (char c : a.toCharArray()) {
            if(!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
