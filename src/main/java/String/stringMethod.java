package String;

public class stringMethod {

        public static String braveAndMice(String animal) {

            if(animal.toLowerCase().equals("mouse")) {
                return "Hide";
            }
            else {
                return "Walk";
            }
        }

        public static void main(String[] args) {
            System.out.println(braveAndMice("Dogs"));
            System.out.println(braveAndMice("Mouse"));
        }
    }
