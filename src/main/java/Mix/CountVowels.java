package Mix;

public class CountVowels {

    public static void main (String[] args) {

        String a = "Different";
        String b = a.toLowerCase();
        int count = 0;

        for (char c : b.toCharArray()) {

            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
