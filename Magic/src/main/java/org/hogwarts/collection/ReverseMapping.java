package org.hogwarts.collection;

import java.util.HashMap;
import java.util.Map;

public class ReverseMapping {
    public static void main(String[] args) {
        HashMap<String, String> capitalCountryMap = new HashMap<>();
        capitalCountryMap.put("Paris", "France");
        capitalCountryMap.put("Berlin", "Germany");
        capitalCountryMap.put("Rome", "Italy");

        HashMap<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("Italy","Rome");
        for (Map.Entry<String, String > entry : countryCapitalMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
