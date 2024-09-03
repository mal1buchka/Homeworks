package september_03.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new Random().ints(20,10,1001).boxed().collect(Collectors.toCollection(ArrayList::new));
        List<Integer> sortedList = list.stream().filter(l -> l>500).toList();

        sortedList.forEach(System.out::println);
    }

}
