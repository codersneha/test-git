package org.example.day8.ques3;

import java.util.List;

public class RotateLeftAndNegateEvens {
    public static void rotateLeftAndNegateEvens (List<Integer> list, int steps) {
        if (steps < 0 || list.isEmpty()) {   // length() cannot be used its not a function of list
            throw new IllegalArgumentException ();
        }
        for (int i = 0; i < steps; i++) {
            int valFirst = list.remove (i);//it will be remove(0)
            if (valFirst % 2 == 0) {
                list.add(valFirst * -1);
            } else {
                list.add(valFirst);
            }
        }
    }
}
