package august_29.task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bd");
        list.add("ba");
        list.add("c");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Sorted List");
        for(String str: list){
            System.out.println(str);
        }
    }
}
