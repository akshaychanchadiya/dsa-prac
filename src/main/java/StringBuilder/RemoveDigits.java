package StringBuilder;

public class RemoveDigits {

    public static void main (String[] args) {

        String s = "a1b2c3";

        StringBuilder sb = new StringBuilder();

        char[] ch = s.toCharArray();

        for (int i=0;i<ch.length;i++) {

            if (!Character.isDigit(ch[i])) {
                sb.append(ch[i]);
            }
        }
        System.out.println(sb.toString());

    }
}
