package org.hogwarts.collection;

import java.util.ArrayList;
import java.util.List;

public class Transformer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                List.of("", "a", "b", "ab", "ba", "z", "h", "", "heh", "")
        );

        // нужно получить [aa, bb, ab, ba, zz, hh, heh]
        System.out.println(transform(list));
    }

    public static List<String> transform(List<String> words) {
       words.removeIf(String::isEmpty);
       return words;
    }
}