package org.example.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ques4 {
    private static String mostPopularHobby(Map<String, Set<String>> m) {
        String mostPopular="";
        int mostCount=0;
        Map<String,Integer> hobbyFreq= new HashMap<>();
        for (Map.Entry<String, Set<String>> entry : m.entrySet()) {
            for (String hobby : entry.getValue()) {
                hobbyFreq.put(hobby,hobbyFreq.getOrDefault(hobby,0)+1);
                if (hobbyFreq.get(hobby)>mostCount){
                    mostPopular=hobby;
                    mostCount=hobbyFreq.get(hobby);
                }
            }
        }
        return mostPopular;
    }
    public static void main(String[] args) {
        Map<String,Set<String>>m=Map.of(
                "Atharva",Set.of("board games", "comedy shows", "hiking", "video gaming"),
                "Chaafen",Set.of("Formula 1", "reading", "traveling", "video gaming"),
                "Jaylyn",Set.of("hiking", "traveling", "video gaming"),
                "Shivani",Set.of("cafes", "music shows")
        );
        System.out.println(mostPopularHobby(m));
    }


}
