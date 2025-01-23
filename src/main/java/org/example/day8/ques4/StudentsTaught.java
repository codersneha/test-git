package org.example.day8.ques4;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StudentsTaught {

    public static Set<String> studentsTaught(Map<String,Map<Integer,String>> enrollmentHistory, String instructor){
        Set<String> studentSet = new TreeSet<>();
        for (Map.Entry<String,Map<Integer,String>> entry:enrollmentHistory.entrySet()){
            String student = entry.getKey();
            Map<Integer,String> classes = entry.getValue();
            if (classes.containsValue(instructor)) {
                studentSet.add(student);
            }
        }

        return studentSet;
    }

    public static void main(String[] args) {
        Map<String,Map<Integer,String>>enrollmentHistory= Map.of(
                "Colton", Map.of(163,"Kevin"),
                "Darel",Map.of(416, "Hunter", 373,"Kevin",143,"Kevin"),
                "Ben",Map.of(373, "Kevin",143,"Stuart"),
                "Atharva", Map.of(121,"Miya",122, "Hunter",123,"Brett")
        );
        Set<String>result1=studentsTaught(enrollmentHistory,"Kevin");
        System.out.println(result1);
    }
}
