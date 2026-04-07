package Practise_04042026;

import java.util.*;

public class ListIntersection {

    public static void main(String[] args) {
       List<Integer> list1 = Arrays.asList(1,2,3,4);
       List<Integer> list2 = Arrays.asList(3,4,5,6);

//       List<Integer> com = new ArrayList<>();
//
//       for (int i = 0; i < list1.size();i++) {
//           for (int j = 0; j < list2.size();j++) {
//               if (list1.get(i).equals(list2.get(j))) {
//                   com.add(list1.get(i));
//               }
//           }
//      }
//        System.out.println(com);

        Set<Integer> set = new HashSet<>(list2);
        List<Integer> com = new ArrayList<>();

        for (int n : list1) {
            if (set.contains(n)) {
                com.add(n);
            }
        }

        System.out.println(com);

    }
}
