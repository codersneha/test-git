package org.example.test2;

import java.util.Map;
import java.util.Set;

public class ques4 {
    private static String mostPopularHobby(Map<String, Set<String>> m) {
        String mostPopular="";
        int count=0;
        for(Set<String>hobby:m.values()){

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
