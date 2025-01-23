package org.example.day7;

import java.util.*;

public class SetAndMap {


    public static void main(String[] args) {

        //Set
        //Set is a data structure which is used to store unique elements
        // Set is used for look up, like hash
        //Set r look up complexity -> O(1), for list it is O(n)
        //Set r insertion complexity is also O(1), linkedlist O(1)

        //HashSet, TreeSet, LinkedHashSet
        //behaviour of Set

//        Set<Integer> myset = new HashSet<>();
//        myset.add(1);
//        myset.add(1);
//        System.out.println(myset);
//
//        myset.remove(1);
//        System.out.println(myset.isEmpty());
//
//        System.out.println(myset.contains(1));
//
//
//        //HashSet does not maintain any insertion order, it's not guaranteed what would be order there
//        //LinkedHashSet preserves the insertion order
//        //If you need the elements to be sorted, then you need TreeSet, by order ascending order
//
//        Set<Integer> hashSet = new HashSet<>();
//        hashSet.add(4);
//        hashSet.add(2);
//        hashSet.add(3);
//        hashSet.add(1);
//
//        System.out.println(hashSet);
//
//        Set<Integer> treeSet = new TreeSet<>();
//        treeSet.add(4);
//        treeSet.add(2);
//        treeSet.add(3);
//        treeSet.add(1);
//
//        System.out.println(treeSet);
//
//        Set<Integer> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add(4);
//        linkedHashSet.add(2);
//        linkedHashSet.add(3);
//        linkedHashSet.add(1);
//
//        System.out.println(linkedHashSet);
//
//        for(Integer num: hashSet) {
//            System.out.println(num);
//        }



        //Map
        //key -> value
        //key will always be unique
        //"I" -> 2, "Am" -> 2
        //HashMap, TreeMap, LinkedHashMap

        Map<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(3, 1); // write
        hashmap.put(2, 2);
        hashmap.put(1, 3);

        System.out.println(hashmap.getOrDefault(2, 0)); // retrive with default value

        /*mymap.containsKey(1); // to check whther key is present or not
        mymap.containsValue(2); // to check f the value exiost or not

        Set<Integer> keySet = mymap.keySet();
        Collection<Integer> valueList = mymap.values();

        //traversing a map
        for(Map.Entry<Integer, Integer> entry: mymap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

         */
        System.out.println(hashmap);

        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(3, 1); // write
        treeMap.put(2, 2);
        treeMap.put(1, 3);

        System.out.println(treeMap);

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, 1); // write
        linkedHashMap.put(2, 2);
        linkedHashMap.put(1, 3);

        System.out.println(linkedHashMap);

        /*

        time complexity of hasmap to insert is O(1), look up is O(1), but this complexities are amortized complexity
        on the other hand tree map time complexity for insert & retrive is O(logn)
         */

    }
}
