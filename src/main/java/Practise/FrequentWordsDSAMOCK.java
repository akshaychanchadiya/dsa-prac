package Practise;

import java.util.*;

public class FrequentWordsDSAMOCK {
    public static Vector<String> frequentWords(Vector<String> vec,int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0; i < vec.size() ; i++) {
            map.put(vec.get(i), map.getOrDefault(vec.get(i),0) + 1 );
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);

        Vector<String> result = new Vector<>();

        for (int i = 0; i < k; i++) {

            String bestWord = null;

            for (String word : sortedMap.keySet()) {

                if (bestWord == null ||
                        sortedMap.get(word) > sortedMap.get(bestWord)) {

                    bestWord = word;
                }
            }
            result.add(bestWord);
            sortedMap.remove(bestWord);
        }
            return result;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vector<String> vec=new Vector<String>();
        for(int i=0;i<n;i++)
            vec.add(sc.next());
        int k=sc.nextInt();
        Vector<String> ans = frequentWords(vec, k);
        for(int i=0;i<k;i++)
            System.out.println(ans.get(i));
    }
}
