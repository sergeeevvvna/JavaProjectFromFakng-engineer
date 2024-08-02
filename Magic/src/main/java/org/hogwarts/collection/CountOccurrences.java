package org.hogwarts.collection;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 3, 4, 5, 1};
        // Напишите свой код здесь
     /*   Вам дан массив, напишите алгоритм, который посчитает
      количества уникальных чисел используя HashMap. В итоге должен
      получиться словарь [1->3, 2->2, 3->2, 4->2, 5]
      */
        Map<Integer, Integer> maps = new HashMap<>();
        for(int num : arr){
            if(maps.containsKey(num)){
                maps.put(num, maps.get(num) + 1);
            }else {
                maps.put(num,1);
            }
    }
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
        System.out.println(entry.getKey() + "->" + entry.getValue());

        }

    }
}
