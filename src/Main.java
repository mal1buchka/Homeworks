import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(method(arr)));
    }
    public static int[] method(int[] arr){
        int three = 0;
        for(int element: arr){
            if(element%3 == 0){
                three++;
            }
        }
        int[] res = new int[three];
        int index = 0;
        for (int j : arr) {
            if (j % 3 == 0) {
                res[index] = j;
                index++;
            }
        }
        return res;
    }

}
