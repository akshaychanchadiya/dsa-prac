package StringBuilder;

public class InsertAfterWord {

    public static void main (String[] args) {
        String s = "Hello World";
        String result = "";

        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" ");

        for (int i = 0;i< words.length;i++){

            result += words[i]+ "!";

           if (i != words.length-1) {
               result += " ";
           }
        }
        System.out.println(result);
    }
}
