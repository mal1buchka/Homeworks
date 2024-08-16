package august_17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //First task
        int[] test = {1,2,3,4,5,6,7,8,9};
        System.out.println(averageArifmetic(test));

        //Second task
        String[] malik = {"malik", "malibuchka", "malibu","mailik"};
        System.out.println(Arrays.toString(reverse(malik)));

        //Third task
        System.out.println(returingValue(test,8));
    }
    public static double averageArifmetic(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }
    public static String[] reverse(String[] s) {
        String box;
        for (int i = 0; i < s.length/2; i++) {
            box = s[i];
            s[i]=s[s.length - 1 - i];
            s[s.length - 1 - i] = box;
        }
        return s;
    }
    public static int returingValue(int[] arr, int index) {
        if(index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out of array's bounds)))");
        }else {
            return arr[index];
        }

    }
}
