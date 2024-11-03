package august_29.task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("malik");
        list.add("kuki");
        list.add("beka");
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        System.out.println("Sorted list");
        for(String str: list){
            System.out.println(str);
        }
    }
}
