package StringBuilder;

public class RemoveSpaces {

    public static void main (String[] args) {

        String a = "a b c d";
        StringBuilder sb = new StringBuilder();

        for (char c : a.toCharArray()) {

            if (c == ' ') {
                continue;
            }
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
