package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractNumbersDSAMOCK {

    public static List<Integer> extractNumbers(int N, List<String> arr) {

        List<Integer> numbers = new ArrayList<>();
        for (String a : arr) {
            try {
                numbers.add(Integer.valueOf(a));
            } catch (NumberFormatException e) {
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(scanner.next());
        }
        List<Integer> ans = extractNumbers(N, arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
