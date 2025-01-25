package org.example.day7.Exercises;

import java.util.Map;
import java.util.HashMap;

/*
Write a method intersect that takes two Maps of strings to integers as parameters and that returns a new map whose contents are the intersection of the two. The intersection of two maps is defined here as the set of keys and values that exist in both maps. So if some key K maps to value V in both the first and second map, include it in your result. If K does not exist as a key in both maps, or if K does not map to the same value V in both maps, exclude that pair from your result. For example, consider the following two maps:

{Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95}
{Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}
Calling your method on the preceding maps would return the following new map (the order of the key/value pairs does not matter):

{Logan=62, Stefanie=80, Jeff=88, Kim=52}
 */

public class Intersect {
    public static void intersect(Map<String, Integer> map1, Map<String, Integer> map2, Map<String, Integer> intersection) {
        for (Map.Entry<String,Integer>entry :map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (map2.containsKey(key) && map2.get(key).equals(value)) {
                intersection.put(key, value);
            }
        }

        map1.equals(map2);

        //"Sneha" ->10       //"Sneha" -> 11

        // "Radib" -> 11

        //map.keySet() : returns the set of keys
        //map.values(): list of values

//        for(String key: map1.keySet()) {
//            Integer value= map1.get(key);
//        }

    }
    public static void main(String[] args) {
        Map<String,Integer> map1 =new HashMap<>();
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", 46);
        map1.put("Alyssa", 100);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 88);
        map1.put("Kim", 52);
        map1.put("Sylvia", 95);

        Map<String,Integer> map2 =new HashMap<>();
        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie", 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);

        Map<String,Integer>intersection =new HashMap<>();
        intersect(map1,map2,intersection);
        System.out.println(intersection);
    }
}
