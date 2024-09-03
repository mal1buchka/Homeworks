package september_03.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(10, 10, 1001).boxed().collect(Collectors.toCollection(ArrayList::new));
        list.forEach(System.out::println);
        int counter = (int) list.stream().filter(l -> l % 2 !=0).count();
        System.out.println(counter);
    }
}
