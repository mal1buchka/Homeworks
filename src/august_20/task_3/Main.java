package august_20.task_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        replaceSecondElement(list, 12);
        System.out.println(list);
    }
    static <T> void  replaceSecondElement(ArrayList<T> list, T element) {
        if(list.size()>=2){
            list.set(1,element);
        }
    }
}
