package august_20.task_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates());
        /*
        Input
        1, 2, 3, 4, 4, 5, 10,11
        Output
        11,1, 2, 3, 4, 5, 10
         */
    }
    static  String removeDuplicates(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(",");
        Set<String> unique = new HashSet<>(Arrays.asList(arr));
        return String.join(",", unique);
    }
}
