package org.example.test2;

import java.util.ArrayList;
import java.util.List;

public class ques3 {
    public static int removeEvensInRange(List<Integer> list, int start, int end) {
        int count=0;
        for(int i=start;i<end;i++){
            int num = list.get(i);
            if(num%2==0){
                count++;
                list.remove(i);
                i++;
                end--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-1);
        list.add(0);
        list.add(2);
        list.add(5);
        list.add(-10);
        list.add(8);

        int c = removeEvensInRange(list, 1, 5);
        System.out.println("Removed:" + c);
        System.out.println(list);
    }

}
